package com.example.android.blackjack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int playerOneScore = 0;
    int playerTwoScore = 0;
    String win = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void TwoPointsP1(View v) {
        playerOneScore = playerOneScore + 2;
        displayPlayerOneScore(playerOneScore);
    }

    public void TwoPointsP2(View v) {
        playerTwoScore = playerTwoScore + 2;
        displayPlayerTwoScore(playerTwoScore);
    }

    public void ThreePointsP1(View v) {
        playerOneScore = playerOneScore + 3;
        displayPlayerOneScore(playerOneScore);
    }

    public void ThreePointsP2(View v) {
        playerTwoScore = playerTwoScore + 3;
        displayPlayerTwoScore(playerTwoScore);
    }

    public void FourPointsP1(View v) {
        playerOneScore = playerOneScore + 4;
        displayPlayerOneScore(playerOneScore);
    }

    public void FourPointsP2(View v) {
        playerTwoScore = playerTwoScore + 4;
        displayPlayerTwoScore(playerTwoScore);
    }

    public void FivePointsP1(View v) {
        playerOneScore = playerOneScore + 5;
        displayPlayerOneScore(playerOneScore);
    }

    public void FivePointsP2(View v) {
        playerTwoScore = playerTwoScore + 5;
        displayPlayerTwoScore(playerTwoScore);
    }

    public void SixPointsP1(View v) {
        playerOneScore = playerOneScore + 6;
        displayPlayerOneScore(playerOneScore);
    }

    public void SixPointsP2(View v) {
        playerTwoScore = playerTwoScore + 6;
        displayPlayerTwoScore(playerTwoScore);
    }

    public void SevenPointsP1(View v) {
        playerOneScore = playerOneScore + 7;
        displayPlayerOneScore(playerOneScore);
    }

    public void SevenPointsP2(View v) {
        playerTwoScore = playerTwoScore + 7;
        displayPlayerTwoScore(playerTwoScore);
    }

    public void EightPointsP1(View v) {
        playerOneScore = playerOneScore + 8;
        displayPlayerOneScore(playerOneScore);
    }

    public void EightPointsP2(View v) {
        playerTwoScore = playerTwoScore + 8;
        displayPlayerTwoScore(playerTwoScore);
    }

    public void NinePointsP1(View v) {
        playerOneScore = playerOneScore + 9;
        displayPlayerOneScore(playerOneScore);
    }

    public void NinePointsP2(View v) {
        playerTwoScore = playerTwoScore + 9;
        displayPlayerTwoScore(playerTwoScore);
    }

    public void TenPointsP1(View v) {
        playerOneScore = playerOneScore + 10;
        displayPlayerOneScore(playerOneScore);
    }

    public void TenPointsP2(View v) {
        playerTwoScore = playerTwoScore + 10;
        displayPlayerTwoScore(playerTwoScore);
    }

    public void OnePointP1(View v) {
        playerOneScore = playerOneScore + 1;
        displayPlayerOneScore(playerOneScore);
    }

    public void OnePointP2(View v) {
        playerTwoScore = playerTwoScore + 1;
        displayPlayerTwoScore(playerTwoScore);
    }

    public void ElevenPointsP1(View v) {
        playerOneScore = playerOneScore + 11;
        displayPlayerOneScore(playerOneScore);
    }

    public void ElevenPointsP2(View v) {
        playerTwoScore = playerTwoScore + 11;
        displayPlayerTwoScore(playerTwoScore);
    }

    public void resetButton(View v) {
        playerOneScore = 0;
        playerTwoScore = 0;
        win = "";
        displayPlayerOneScore(playerOneScore);
        displayPlayerTwoScore(playerTwoScore);
    }


    public void displayPlayerOneScore(int number) {
        TextView scoreView = (TextView) findViewById(R.id.player_one_score);
        scoreView.setText(String.valueOf(number));

        if (number == 21) {
            win = "Player One BLACK JACK!";
            TextView blackJackView = (TextView) findViewById(R.id.gameResult);
            blackJackView.setText(String.valueOf(win));
        } else if (number > 21) {
            win = "PLAYER ONE LOSES";
            TextView blackJackView = (TextView) findViewById(R.id.gameResult);
            blackJackView.setText(String.valueOf(win));
        } else if (number == 0) {
            win = " ";
            TextView blackJackView = (TextView) findViewById(R.id.gameResult);
            blackJackView.setText(String.valueOf(win));
        } else {
            win = "HIT?";
            TextView blackJackView = (TextView) findViewById(R.id.gameResult);
            blackJackView.setText(String.valueOf(win));
        }
    }

    public void displayPlayerTwoScore(int number) {
        TextView scoreView = (TextView) findViewById(R.id.player_two_score);
        scoreView.setText(String.valueOf(number));

        if (number == 21) {
            win = "Player Two BLACK JACK!";
            TextView blackJackView = (TextView) findViewById(R.id.gameResult);
            blackJackView.setText(String.valueOf(win));
        } else if (number > 21) {
            win = "PLAYER TWO LOSES";
            TextView blackJackView = (TextView) findViewById(R.id.gameResult);
            blackJackView.setText(String.valueOf(win));
        } else if (number == 0) {
            win = " ";
            TextView blackJackView = (TextView) findViewById(R.id.gameResult);
            blackJackView.setText(String.valueOf(win));
        } else {
            win = "HIT?";
            TextView blackJackView = (TextView) findViewById(R.id.gameResult);
            blackJackView.setText(String.valueOf(win));
        }
    }
}
