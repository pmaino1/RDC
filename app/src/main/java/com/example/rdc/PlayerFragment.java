package com.example.rdc;

import androidx.lifecycle.ViewModelProviders;

import android.app.Fragment;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class PlayerFragment extends Fragment {

    private PlayerStats stats;

    private TextView hpView;
    private TextView mpView;
    private TextView attackView;
    private TextView defenseView;
    private TextView speedView;




    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View r = inflater.inflate(R.layout.player_fragment, container, false);
        hpView =  r.findViewById(R.id.hpTextView);
        mpView =  r.findViewById(R.id.mpTextView);
        attackView =  r.findViewById(R.id.attackTextView);
        defenseView =  r.findViewById(R.id.defenseTextView);
        speedView =  r.findViewById(R.id.speedTextView);
        return r;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if(this.stats != null)
            updateStats(this.stats);
    }

    public void linkStats(PlayerStats stats) {
        this.stats = stats;
    }

    public void updateStats(PlayerStats stats) {


        hpView.setText("HP: " + stats.getHp());
        mpView.setText("MP: " + stats.getMp());
        attackView.setText("Attack: " + stats.getAttack());
        defenseView.setText("Defense: " + stats.getDefense());
        speedView.setText("Speed: " + stats.getSpeed());
    }

}
