package android.example.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Initialize the two teams
    Team teamA = new Team();
    Team teamB = new Team();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Update the goals for Team A
        Button goalTeamAButton = findViewById(R.id.button_goal_A);
        goalTeamAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamA.addGoal();
                displayGoalsForTeamA(teamA.getGoals());

            }
        });

        // Update the goals for Team B
        Button goalTeamBButton = findViewById(R.id.button_goal_B);
        goalTeamBButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamB.addGoal();
                displayGoalsForTeamB(teamB.getGoals());

            }
        });

        // Update the fouls for Team A
        Button foulTeamAButton = findViewById(R.id.button_foul_A);
        foulTeamAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamA.addFoul();
                displayFoulsForTeamA(teamA.getFouls());

            }
        });

        // Update the fouls for Team B
        Button foulTeamBButton = findViewById(R.id.button_foul_B);
        foulTeamBButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamB.addFoul();
                displayFoulsForTeamB(teamB.getFouls());

            }
        });

        // Reset the goals and fouls of the teams
        Button resetButton = findViewById(R.id.button_reset);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamA.resetScore();
                teamB.resetScore();
                displayGoalsForTeamA(teamA.getGoals());
                displayGoalsForTeamB(teamB.getGoals());
                displayFoulsForTeamA(teamA.getFouls());
                displayFoulsForTeamB(teamB.getFouls());

            }
        });
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayGoalsForTeamA(int goals) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(goals));
    }

    /**
     * Displays the given fouls for Team A.
     */
    public void displayFoulsForTeamA(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(foul));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayGoalsForTeamB(int goals) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(goals));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayFoulsForTeamB(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(foul));
    }


}
