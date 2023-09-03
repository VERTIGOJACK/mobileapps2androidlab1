package se.vertigodigital.mobileapps2lab1.ui.publications;

import android.app.Application;
import android.app.DownloadManager;
import android.util.Log;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import se.vertigodigital.mobileapps2lab1.classes.latestupload.LatestUploads;

public class PublicationsViewModel extends AndroidViewModel {

    //declare observable livedata
    private final MutableLiveData<LatestUploads> mData;

    //other neccesary vars
    private final RequestQueue requestQueue;
    private final String apiUrl;


    //pass application reference through input params
    public PublicationsViewModel(Application app) {

        super(app);

        mData = new MutableLiveData<>();

        requestQueue = Volley.newRequestQueue(app);

        apiUrl = "http://api.sr.se/api/v2/lastpublished?format=json";

        fetchData();
    }


    public LiveData<LatestUploads> getData() {return mData;}

    public void fetchData(){
        // Using the defined url, create a request string. we define method, the url,
        // and two eventlisteners, one for success and error respectively.
        // the success listeners callback method handles string type.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, apiUrl, (Response.Listener<String>) response -> {
            Log.e("response", response);

            byte[] u = new byte[0];
            try {
                u = response.toString().getBytes("ISO-8859-1");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
            try {
                response = new String(u, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }

            // Update LiveData with the response
            mData.setValue(convertResponse(response));
        }, error -> {
            mData.setValue(new LatestUploads());
        });
        //add request to queue
        requestQueue.add(stringRequest);
    }

    //function for parsing the json response into an object
    //that we can return to the fragment for presentation
    private LatestUploads convertResponse(String response){

        //Jackson mapper to create objects
        ObjectMapper mapper= new ObjectMapper();

        //create new variable
        LatestUploads uploads = new LatestUploads();

        //try to map response to object
        try {
            uploads = mapper.readValue(response, new TypeReference<LatestUploads>(){});
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        //shouldnt result in error since empty object exists.
        return uploads;
    }

}
