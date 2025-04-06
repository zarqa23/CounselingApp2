package com.android.doctorapp.databinding;
import com.android.doctorapp.R;
import com.android.doctorapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutDoubleCardLayoutBindingImpl extends LayoutDoubleCardLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.otpArea, 2);
        sViewsWithIds.put(R.id.backImgView, 3);
        sViewsWithIds.put(R.id.titleTxt, 4);
        sViewsWithIds.put(R.id.sloganTxt, 5);
        sViewsWithIds.put(R.id.field1Area, 6);
        sViewsWithIds.put(R.id.field1, 7);
        sViewsWithIds.put(R.id.et_field1, 8);
        sViewsWithIds.put(R.id.field2Area, 9);
        sViewsWithIds.put(R.id.field2, 10);
        sViewsWithIds.put(R.id.et_field2, 11);
        sViewsWithIds.put(R.id.field3Area, 12);
        sViewsWithIds.put(R.id.field3, 13);
        sViewsWithIds.put(R.id.et_field3, 14);
        sViewsWithIds.put(R.id.field4Area, 15);
        sViewsWithIds.put(R.id.field4, 16);
        sViewsWithIds.put(R.id.et_field4, 17);
        sViewsWithIds.put(R.id.operationArea, 18);
        sViewsWithIds.put(R.id.checkboxUser, 19);
        sViewsWithIds.put(R.id.checkboxProvider, 20);
        sViewsWithIds.put(R.id.forgetPassTxt, 21);
        sViewsWithIds.put(R.id.tv_type1, 22);
        sViewsWithIds.put(R.id.signupOptnArea, 23);
        sViewsWithIds.put(R.id.gotoSignup, 24);
        sViewsWithIds.put(R.id.iv_facebookOptn, 25);
        sViewsWithIds.put(R.id.iv_twitterOptn, 26);
        sViewsWithIds.put(R.id.iv_googleOptn, 27);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutDoubleCardLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 28, sIncludes, sViewsWithIds));
    }
    private LayoutDoubleCardLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[3]
            , (android.widget.CheckBox) bindings[20]
            , (android.widget.CheckBox) bindings[19]
            , (android.widget.LinearLayout) bindings[1]
            , (android.widget.EditText) bindings[8]
            , (android.widget.EditText) bindings[11]
            , (android.widget.EditText) bindings[14]
            , (android.widget.EditText) bindings[17]
            , (android.widget.TextView) bindings[7]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.TextView) bindings[10]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.TextView) bindings[13]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.TextView) bindings[16]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[24]
            , (android.widget.ImageView) bindings[25]
            , (android.widget.ImageView) bindings[27]
            , (android.widget.ImageView) bindings[26]
            , (android.widget.LinearLayout) bindings[18]
            , (bindings[2] != null) ? com.android.doctorapp.databinding.LayoutOtpSixDigitsBinding.bind((android.view.View) bindings[2]) : null
            , (android.widget.LinearLayout) bindings[23]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[22]
            );
        this.contentArea.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}