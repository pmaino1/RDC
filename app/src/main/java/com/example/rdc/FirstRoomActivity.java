package com.example.rdc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstRoomActivity extends AppCompatActivity {

    private TextView textView;
    private PlayerStats stats;
    private PlayerFragment fragment;
    private Button continueButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_room);
        Intent intent = getIntent();
        stats = (PlayerStats) intent.getSerializableExtra("STATS");

        fragment = (PlayerFragment) getFragmentManager().findFragmentById(R.id.fragment);
        fragment.linkStats(stats);

        textView = findViewById(R.id.textView);
        textView.setText("You awake in a cold, dusty room.\n You remember nothing about yourself,\n " +
                "not even your name. As you get up,\n you notice a small, rusted key.\n You absentmindedly " +
                "put it in your pocket\n and continue exploring.");

        continueButton = findViewById(R.id.button);
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stats.addItem("strange key");

                Intent intent = new Intent(getApplicationContext(), ChoiceRoomActivity.class);
                intent.putExtra("STATS", stats);

                startActivity(intent);
            }
        });
    }
}
