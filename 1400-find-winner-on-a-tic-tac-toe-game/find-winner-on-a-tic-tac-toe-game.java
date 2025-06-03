class Solution {
    public String tictactoe(int[][] moves) {
        char[][] board = new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }

        char player = 'A'; 
        boolean gameOver = false;
        int i = 0;

        while (!gameOver && i < moves.length) {
            int row = moves[i][0];
            int col = moves[i][1];

            if (board[row][col] == ' ') {
                board[row][col] = player;
                gameOver = haveWon(board, player);

                if (gameOver) {
                    return String.valueOf(player);
                } else {
                    player = (player == 'A') ? 'B' : 'A';
                    i++; 
                }
            } else {
                return "Invalid"; 
            }
        }

        
        return moves.length == 9 ? "Draw" : "Pending";
    }

    public static boolean haveWon(char[][] board, char player) {
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }
        for (int col = 0; col < board[0].length; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }
}