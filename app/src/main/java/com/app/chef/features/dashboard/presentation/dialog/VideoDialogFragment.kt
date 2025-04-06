package com.app.chef.features.dashboard.presentation.dialog


import android.app.Dialog
import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.view.ViewGroup
import android.view.Window
import android.view.WindowManager
import android.widget.MediaController
import android.widget.VideoView
import androidx.fragment.app.DialogFragment
import com.android.doctorapp.R


class VideoDialogFragment : DialogFragment() {

    companion object {
        private const val ARG_VIDEO_URI = "videoUri"

        fun newInstance(videoUri: String): VideoDialogFragment {
            val fragment = VideoDialogFragment()
            val args = Bundle()
            args.putString(ARG_VIDEO_URI, videoUri)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = Dialog(requireContext(), android.R.style.Theme_Black_NoTitleBar_Fullscreen)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(R.layout.dialog_full_screen_video)

        // Set the dialog window to full screen
        dialog.window?.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        )

        val videoView = dialog.findViewById<VideoView>(R.id.fullScreenVideoView)

        // Get video URI from arguments
        val videoUri = arguments?.getString(ARG_VIDEO_URI) ?: return dialog

        // Set up the VideoView
        videoView.setVideoURI(Uri.parse(videoUri))
        val mediaController = MediaController(context)
        videoView.setMediaController(mediaController)
        mediaController.setAnchorView(videoView)

        // Ensure that media controls are shown after the video is prepared
        videoView.setOnPreparedListener {
            mediaController.show()
            videoView.start()
        }

        return dialog
    }
}
