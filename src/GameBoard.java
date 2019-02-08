public class GameBoard{
    private char[][] board;

    /**
     * This will make the game board that is labeled 1 to 9
     */
    public GameBoard(){
        char count = '1';
        board = new char[3][3];
        for(int row=0; row<3; row++){
            for(int col=0; col<3; row++){
                board[row][col] = count;
                count++;
            }
        }
    }

    /**
     * This creates the gameboard
     * @return board
     */
    public char[][] board(){
        board = new char[3][3];
        return board;
    }

    /**
     * Decides which player puts their spot
     * @param position
     * @param p
     */
    public void playerMove(int position, Player p){
        int row, col;

        //rn assuming the space is void.
        row = (position-1)%2;
        col = (position-1)%3;
        board[row][col] = p.getPlayer();
    }
    /**
     * This will give back the current board
     * @param board
     * @return currentBoard
     */
    public String toString(char[][] board) {
        String currentBoard = "";
        for(int row=0; row<3; row++){
            for(int col=0; col<3; col++) {
                currentBoard += board[row][col];
            }
        }
        return currentBoard;
    }
}
