package se.vertigodigital.mobileapps2lab1.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import org.json.JSONObject;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;
    private final MutableLiveData<Integer> mInt;

    public HomeViewModel() {

        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");

        mInt = new MutableLiveData<>();
        mInt.setValue(0);

    }

    public LiveData<String> getText() {
        return mText;
    }
    //
    public LiveData<Integer> getInt() {
        return mInt;
    }

    //increase the integer
    public void increaseNumber(){
        mInt.setValue(mInt.getValue()+1);
    }
}