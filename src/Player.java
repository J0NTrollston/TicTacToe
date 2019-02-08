public class Player {
    private char name; //Which can be a X or O
    private int gamesWonCount;

    /**
     * This will initialize the player
     * @param name //sets the name of the player, usually X or O
     * @param gamesWonCount //counts the number of wins for the player
     */
    public Player(char name, int gamesWonCount){
        this.name = name;
        this.gamesWonCount = gamesWonCount;
    }

    /**
     * Get the players name (either X or O)
     * @return name
     */
    public char getPlayer(){
        return name;
    }

    /**
     * Sets the name of the Player
     * @param name //to change the name
     * @return name
     */
    public char setName(char name){
        this.name = name;
        return name;
    }

    /**
     * This will get the players numbers of wins
     * @return gamesWonCount
     */
    public int getGamesWonCount(){
        return gamesWonCount;
    }

    /**
     * This will set the winning count
     * @param gamesWonCount
     * @return gamesWonCount
     */
    public int setGamesWonCount(int gamesWonCount){
        this.gamesWonCount = gamesWonCount;
        return gamesWonCount;
    }

    /**
     * Will return the winning player
     * @return winningPlayer
     */
    public String toString(){
        String winningPlayer = name + "won the game!";
        return winningPlayer;
    }
}
