package se.vertigodigital.mobileapps2lab1;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import se.vertigodigital.mobileapps2lab1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //This binding object is used to access views and layout elements in the associated XML layout.
    //binding class is automatically generated, and will bind based on naming conventions, for example :
    //ActivityMainBinding will bind to the layout activity_main.xml
    //by this logic ActivityTimerBinding would bind to the layout activity_timer.xml
    private ActivityMainBinding binding;

    //overrides oncreate from superclass, onCreate is called when the activity is being created
    // bundle carries data from a previous instance of the activity, For example,
    // if the user had typed something into an input field before rotating the screen,
    // that entered text could be saved in the savedInstanceState.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //calls superclass oncreate method with the bundle
        super.onCreate(savedInstanceState);

        // Inflate the layout and obtain the binding object
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        // Set the content view using the root view from the binding object
        // Now you can access UI elements using binding object, e.g., binding.textView.setText("Hello");
        setContentView(binding.getRoot());

        //next up is the BottomNavigationView, from the activity main layout (which means that we could access it from the binding variable)
        //BottomNavigationView navView = findViewById(R.id.nav_view);
        BottomNavigationView navView = binding.navView;

        //Create configuration object using builder, this config defines top level destinations for app,
        //this works by providing the builder with ids for our different fragments.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();

        //Part of android navigation component, helps us navigate between different destinations in our app
        //find a navigation controller associated with a certain fragment, in this case, the host fragment resides in activity_main.xml
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);

        //using our navcontroller and configuration, sets up our action bar (top bar)
        //In summary, this step establishes a connection between the navigation controller and the action bar,
        // ensuring that the action bar reflects the navigation state of the app.
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        //using our navcontroller and navView, sets up our bottom navigation bar (bottom bar)
        NavigationUI.setupWithNavController(navView, navController);

        //these two last steps ensure that the top and bottom bars stay consistent with the navigation state
    }

}