package se.vertigodigital.mobileapps2lab1.ui.home;

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

import se.vertigodigital.mobileapps2lab1.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    //generated class for data binding
    private FragmentHomeBinding binding;

    // override of onCreateview
    // Android framework automatically passes valid layoutinflater viewgroup and savedinstance.
    //since fragments are meant to be used inside of different activities,
    // this kind of setup ensures that the fragment gets initialized with the proper context.
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // instantiate a viewmodel for the fragment, with the fragment as owner
        // pass a reference to the class object of HomviewModel inside of get method.
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        //get a new binding
        // this is where the inflater and container gets used
        //we also make a reference to the root view of the binding variable
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // a non changing reference to the textview of the binding variable
        // this seems to be a declaration of the initial value only
        final TextView textView = binding.textHome;
        final TextView textHomeCounter = binding.textHomeCounter;

        // reference to the viewmodel, getText is a method defined inside the viewmodel (it could be called anything);
        // then we declare that we want to observe for changes on the gettext, for the duration of the fragments lifecycle.
        //when a change is observed, settext will be called on the tewtview object.
        //textview recieves the new data from gettext implicitly.
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        // Create the observer which updates the UI.
        final Observer<Integer> intObserver = new Observer<Integer>() {
            @Override
            public void onChanged(@Nullable final Integer integValue) {
                // Update the UI, in this case, a TextView.
                textHomeCounter.setText(integValue.toString());
            }
        };

        homeViewModel.getInt().observe(getViewLifecycleOwner(), intObserver);


        //new clicklistener for home button
        binding.buttonHome.setOnClickListener(view ->{
            homeViewModel.increaseNumber();
        }) ;

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


}