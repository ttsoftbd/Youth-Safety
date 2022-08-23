package com.tutorialspoint.myapplicationd.ui.cyberbullying;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is cyberbullying fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}