package android.example.scorekeeper;

public class Team {

    private int mGoals = 0;
    private int mFouls = 0;

    /**
     * Increase the goals for the team by 1 point.
     */
    public void addGoal() {
        mGoals += 1;
    }


    /**
     * Increase the fouls for the team by 1 point.
     */
    public void addFoul() {
        mFouls += 1;
    }


    /**
     * Get the goals of the team.
     */
    public int getGoals() {
        return mGoals;
    }

    /**
     * Get the fouls of the team.
     */
    public int getFouls() {
        return mFouls;
    }

    /**
     * Resets the goals and fouls for the team.
     */
    public void resetScore() {
        mGoals = 0;
        mFouls = 0;
    }
}
