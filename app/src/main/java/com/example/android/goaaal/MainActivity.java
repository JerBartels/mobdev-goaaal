package com.example.android.goaaal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int homeScore = 0;
    int awayScore = 0;
    int homeFoul = 0;
    int awayFoul = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayHomeScore(homeScore);
        displayAwayScore(awayScore);
        displayHomeFoul(homeFoul);
        displayAwayFoul(awayFoul);
    }

    public void scoreForHomeTeam(View view) {
        homeScore += 1;
        displayHomeScore(homeScore);
    }

    public void scoreForAwayTeam(View view) {
        awayScore += 1;
        displayAwayScore(awayScore);
    }

    public void foulForHomeTeam(View view) {
        homeFoul += 1;
        displayHomeFoul(homeFoul);
    }

    public void foulForAwayTeam(View view) {
        awayFoul += 1;
        displayAwayFoul(awayFoul);
    }

    public void resetMatch(View view) {
        homeScore = 0;
        awayScore = 0;
        homeFoul = 0;
        awayFoul = 0;

        displayHomeScore(homeScore);
        displayAwayScore(awayScore);
        displayHomeFoul(homeFoul);
        displayAwayFoul(awayFoul);
    }

    public void displayHomeScore(int score) {
        TextView homeScore = (TextView) findViewById(R.id.homeTeam_score);
        homeScore.setText(String.valueOf(score));
    }

    public void displayAwayScore(int score) {
        TextView awayScore = (TextView) findViewById(R.id.awayTeam_score);
        awayScore.setText(String.valueOf(score));
    }

    public void displayHomeFoul(int foul) {
        TextView homeFoul = (TextView) findViewById(R.id.homeTeam_foul);
        homeFoul.setText(String.valueOf(foul));
    }

    public void displayAwayFoul(int foul) {
        TextView awayFoul = (TextView) findViewById(R.id.awayTeam_foul);
        awayFoul.setText(String.valueOf(foul));
    }
}
