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

        final TextView textView = binding.textDashboard;

        // Create the observer which updates the UI.
        final Observer<String> dataObserver = stringData -> {

            //Update the UI, in this case, a TextView.
            textView.setText(stringData);
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
}