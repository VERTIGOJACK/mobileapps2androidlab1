package se.vertigodigital.mobileapps2lab1.ui.publications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.io.IOException;

import se.vertigodigital.mobileapps2lab1.classes.latestupload.LatestUploads;
import se.vertigodigital.mobileapps2lab1.databinding.FragmentPublicationsBinding;
import se.vertigodigital.mobileapps2lab1.ui.home.HomeViewModel;

public class PublicationsFragment extends Fragment {

    private FragmentPublicationsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PublicationsViewModel publicationsViewModel =
                new ViewModelProvider(this).get(PublicationsViewModel.class);

        binding = FragmentPublicationsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Create the observer which updates the UI.
        final Observer<LatestUploads> dataObserver = uploads -> {

            //Update the UI, in this case, a TextView.
            //textView.setText(uploads.getCopyright());
            //this is where we attach our recyclerview
            mapResult(uploads);

        };

        //initiate observer
        publicationsViewModel.getData().observe(getViewLifecycleOwner(), dataObserver);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void mapResult(LatestUploads uploads){

        // get the recycler from the view
        final RecyclerView recyclerView = binding.uploadsRecycler;
        //create and set a layoutmanager for the recyclerview, set orientation to vertical also
        LinearLayoutManager layoutManager = new LinearLayoutManager(this.getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        // set an adapter for this view, TODO: implement adapter
        //feed uploads into recyclerview adapter.

        try {
            recyclerView.setAdapter(new PublicationsRecyclerViewAdapter(uploads.getShows()));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}