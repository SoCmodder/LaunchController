package world.mitchmiller.launchcontroller.view;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import world.mitchmiller.launchcontroller.view.fragment.MainFragment;
import world.mitchmiller.launchcontroller.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commit();
    }
}
