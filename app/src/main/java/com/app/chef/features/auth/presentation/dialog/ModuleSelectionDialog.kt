package com.app.chef.features.auth.presentation.dialog

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.lifecycleScope
import com.android.doctorapp.core.helper.SharedPrefHelper
import com.android.doctorapp.core.utils.Constants.ConstantsDb.MODULE_BUSINESS
import com.android.doctorapp.core.utils.Constants.ConstantsDb.MODULE_COACH
import com.android.doctorapp.core.utils.Constants.ConstantsDb.MODULE_COUNSELOR
import com.android.doctorapp.core.utils.Constants.ConstantsDb.MODULE_EXPERT
import com.android.doctorapp.core.utils.Constants.ConstantsDb.MODULE_PERSON
import com.android.doctorapp.core.utils.Constants.ConstantsDb.MODULE_STUDENT
import com.android.doctorapp.core.utils.MyApp
import com.android.doctorapp.databinding.ModuleSelectionDialogBinding
import com.android.doctorapp.features.auth.data.AuthViewModel
import com.android.doctorapp.features.dashboard.presentation.MainActivity
import com.app.chef.features.auth.domain.model.AuthUserModel
import kotlinx.coroutines.launch


class ModuleSelectionDialog(
    private val viewModel: AuthViewModel,
    private val id: Int,
    private val userModel: AuthUserModel,
    private val pass: String
) : DialogFragment() {

    private lateinit var b: ModuleSelectionDialogBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        b = ModuleSelectionDialogBinding.inflate(layoutInflater, container, false)
        return b.root
    }

    var isProvider = true
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        b.apply {
            if (id == 0){
                opt1.text = "Field Person"
                opt2.text = "Business Man"
                opt3.text = "Student"
                isProvider = false
            }
            opt1.setOnClickListener {
                if (isProvider)updateModule(MODULE_EXPERT)else updateModule(MODULE_PERSON)
            }
            opt2.setOnClickListener {
                if (isProvider)updateModule(MODULE_COACH)else updateModule(MODULE_BUSINESS)
            }
            opt3.setOnClickListener {
                if (isProvider)updateModule(MODULE_COUNSELOR)else updateModule(MODULE_STUDENT)
            }
        }
    }

    private fun updateModule(module: String) {

        userModel.isProvider = if(id==0)false else true
        userModel.iModule = module
        viewModel.registerUser(userModel, pass)

        /*lifecycleScope.launch {
            val isModuleChanged = viewModel.changeModule(
                mapOf(
                    "iModule" to module
                ),
                viewModel.currentUserData.userId!!
            )

            if (isModuleChanged) {
                SharedPrefHelper(requireContext()).setLoginStatus(true)
                startActivity(Intent(context, MainActivity::class.java))
                activity?.finishAffinity()
                dismiss()
            } else {
                MyApp(requireContext()).showToast("Something went wrong!")
            }
        }*/
    }
}