package com.example.rdc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ChoiceRoomActivity extends AppCompatActivity {

    private TextView textView;
    private PlayerStats stats;
    private PlayerFragment fragment;
    private Button continueButton;

    private Button swordButton;
    private Button shieldButton;
    private Button bootsButton;
    boolean picked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_room);
        Intent intent = getIntent();
        stats = (PlayerStats) intent.getSerializableExtra("STATS");

        fragment = (PlayerFragment) getFragmentManager().findFragmentById(R.id.fragment);
        fragment.linkStats(stats);

        textView = findViewById(R.id.textView);
        textView.setText("There are some items in front of you in the next room. Being unarmed," +
                "you decide to take one.");

        swordButton = findViewById(R.id.swordButton);
        shieldButton = findViewById(R.id.shieldButton);
        bootsButton = findViewById(R.id.bootsButton);

        picked = false;

        swordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(picked) return;

                stats.addItem("sword");
                stats.setAttack(stats.getAttack() + 2);
                fragment.updateStats(stats);
                picked = true;
            }
        });

        shieldButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(picked) return;

                stats.addItem("shield");
                stats.setDefense(stats.getDefense() + 2);
                fragment.updateStats(stats);
                picked = true;
            }
        });

        bootsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(picked) return;

                stats.addItem("boots");
                stats.setSpeed(stats.getSpeed() + 2);
                fragment.updateStats(stats);
                picked = true;
            }
        });

        continueButton = findViewById(R.id.button);
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ChoiceRoomActivity.class);
                intent.putExtra("STATS", stats);

                startActivity(intent);
            }
        });
    }
}
