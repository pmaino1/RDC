package com.example.rdc;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*BASIC IDEA/TODO:
- Dungeon Crawler
- Use a stationary Fragment at the bottom of the screen to display health and stuff
- Use an Extra carrying a custom class to carry around the player stats/inventory between views
- Different views for different rooms
*/

public class StartActivity extends AppCompatActivity {

    private PlayerStats stats;
    private PlayerFragment fragment;
    private Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        stats = new PlayerStats("Morgan");
        fragment = (PlayerFragment) getFragmentManager().findFragmentById(R.id.fragment);
        fragment.linkStats(stats);


        startButton = findViewById(R.id.button);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stats.setHp(stats.getHp() - 1);
                fragment.updateStats(stats);
            }
        });
    }


}
