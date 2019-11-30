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


    public static PlayerFragment newInstance() {
        return new PlayerFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        //TODO: find way to link views from layout in code to update them
        //hpView =  R.layout.player_fragment.

        return inflater.inflate(R.layout.player_fragment, container, false);
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
        hpView.setText(stats.getHp());
        mpView.setText(stats.getMp());
        attackView.setText(stats.getAttack());
        defenseView.setText(stats.getDefense());
        speedView.setText(stats.getSpeed());
    }

}
