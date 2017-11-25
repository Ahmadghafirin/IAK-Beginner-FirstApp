package com.example.cascer.iak_beginner_firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA;
    int scoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add3PointForA(View view) {
        scoreA += 3;
        displayScore();

    }

    public void add2PointForA(View view) {
        scoreA += 2;
        displayScore();
    }

    public void addFreeThrowPointForA(View view) {
        scoreA += 1;
        displayScore();
    }

    public void add2PointForB(View view) {
        scoreB += 2;
        displayScore();
    }

    public void add3PointForB(View view) {
        scoreB += 3;
        displayScore();
    }

    public void addFreeThrowPointForB(View view) {
        scoreB += 1;
        displayScore();
    }

    public void resetPoint(View view) {
        scoreA = 0;
        scoreB = 0;
        displayScore();
    }

    public void displayScore() {
        TextView tvA = findViewById(R.id.tv_score_a);
        TextView tvB = findViewById(R.id.tv_score_b);
        tvA.setText(String.valueOf(scoreA));
        tvB.setText(String.valueOf(scoreB));
    }
}
