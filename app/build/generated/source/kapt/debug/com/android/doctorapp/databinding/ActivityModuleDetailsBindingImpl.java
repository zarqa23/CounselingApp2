package com.android.doctorapp.databinding;
import com.android.doctorapp.R;
import com.android.doctorapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityModuleDetailsBindingImpl extends ActivityModuleDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.contentArea, 1);
        sViewsWithIds.put(R.id.backImgView, 2);
        sViewsWithIds.put(R.id.titleTxt, 3);
        sViewsWithIds.put(R.id.field1Area, 4);
        sViewsWithIds.put(R.id.field1, 5);
        sViewsWithIds.put(R.id.et_field1, 6);
        sViewsWithIds.put(R.id.field2Area, 7);
        sViewsWithIds.put(R.id.field2, 8);
        sViewsWithIds.put(R.id.et_field2, 9);
        sViewsWithIds.put(R.id.field3Area, 10);
        sViewsWithIds.put(R.id.field3, 11);
        sViewsWithIds.put(R.id.et_field3, 12);
        sViewsWithIds.put(R.id.field4Area, 13);
        sViewsWithIds.put(R.id.field4, 14);
        sViewsWithIds.put(R.id.et_field4, 15);
        sViewsWithIds.put(R.id.genderHTxt, 16);
        sViewsWithIds.put(R.id.operationArea, 17);
        sViewsWithIds.put(R.id.checkboxMale, 18);
        sViewsWithIds.put(R.id.checkboxFemale, 19);
        sViewsWithIds.put(R.id.tv_type1, 20);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityModuleDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private ActivityModuleDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[2]
            , (android.widget.CheckBox) bindings[19]
            , (android.widget.CheckBox) bindings[18]
            , (android.widget.LinearLayout) bindings[1]
            , (android.widget.EditText) bindings[6]
            , (android.widget.EditText) bindings[9]
            , (android.widget.EditText) bindings[12]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[5]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.TextView) bindings[8]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.TextView) bindings[11]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.TextView) bindings[14]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.TextView) bindings[16]
            , (android.widget.LinearLayout) bindings[17]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[20]
            );
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