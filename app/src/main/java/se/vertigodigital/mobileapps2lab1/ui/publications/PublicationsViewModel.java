package se.vertigodigital.mobileapps2lab1.ui.publications;

import android.app.Application;
import android.app.DownloadManager;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class PublicationsViewModel extends AndroidViewModel {

    //declare observable livedata
    private final MutableLiveData<String> mText;
    private final MutableLiveData<String> mData;

    //other neccesary vars
    private final RequestQueue requestQueue;
    private final String apiUrl;


    //pass application reference through input params
    public PublicationsViewModel(Application app) {
        super(app);

        mText = new MutableLiveData<>();
        mText.setValue("This is the publications fragment");

        mData = new MutableLiveData<>();

        requestQueue = Volley.newRequestQueue(app);

        apiUrl = "http://api.sr.se/api/v2/lastpublished?format=json";

        fetchData();
    }

    public LiveData<String> getText() {
        return mText;
    }

    public LiveData<String> getData() {return mData;}

    public void fetchData(){

        // Using the defined url, create a request string. we define method, the url,
        // and two eventlisteners, one for success and error respectively.
        // the success listeners callback method handles string type.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, apiUrl, (Response.Listener<String>) response -> {
            // Update LiveData with the response
            mData.setValue(response);
        }, error -> {
            mData.setValue("Error");
        });

        //add request to queue
        requestQueue.add(stringRequest);
    }
}