package com.virgin.money.databinding;
import com.virgin.money.R;
import com.virgin.money.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPeopleDetailsBindingImpl extends FragmentPeopleDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPeopleDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentPeopleDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[2]
            );
        this.ivAvatar.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvEmail.setTag(null);
        this.tvJobTitle.setTag(null);
        this.tvName.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.viewModel == variableId) {
            setViewModel((com.virgin.money.ui.people.PeopleViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.virgin.money.ui.people.PeopleViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelPeople((androidx.lifecycle.MutableLiveData<com.virgin.money.data.models.People>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelPeople(androidx.lifecycle.MutableLiveData<com.virgin.money.data.models.People> ViewModelPeople, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        com.virgin.money.ui.people.PeopleViewModel viewModel = mViewModel;
        androidx.lifecycle.MutableLiveData<com.virgin.money.data.models.People> viewModelPeople = null;
        com.virgin.money.data.models.People viewModelPeopleGetValue = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.people
                    viewModelPeople = viewModel.getPeople();
                }
                updateLiveDataRegistration(0, viewModelPeople);


                if (viewModelPeople != null) {
                    // read viewModel.people.getValue()
                    viewModelPeopleGetValue = viewModelPeople.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.virgin.money.ui.utils.bindingadapters.PeopleBindingAdapter.bindPeopleAvatar(this.ivAvatar, viewModelPeopleGetValue);
            com.virgin.money.ui.utils.bindingadapters.PeopleBindingAdapter.bindPeopleEmail(this.tvEmail, viewModelPeopleGetValue);
            com.virgin.money.ui.utils.bindingadapters.PeopleBindingAdapter.bindPeopleJobTitle(this.tvJobTitle, viewModelPeopleGetValue);
            com.virgin.money.ui.utils.bindingadapters.PeopleBindingAdapter.bindPeopleName(this.tvName, viewModelPeopleGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.people
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}