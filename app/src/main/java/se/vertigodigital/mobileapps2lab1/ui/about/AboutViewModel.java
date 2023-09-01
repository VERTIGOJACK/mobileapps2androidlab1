package se.vertigodigital.mobileapps2lab1.ui.about;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AboutViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AboutViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This app displays the most recent publications on the platform 'Sveriges Radio', which is the national public radio broadcaster of Sweden. ");
    }

    public LiveData<String> getText() {
        return mText;
    }
}