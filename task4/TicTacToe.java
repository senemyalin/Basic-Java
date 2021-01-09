import java.io.IOException;
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		char[][] board = { { ' ', ' ', ' ' }, 
                           { ' ', ' ', ' ' }, 
                           { ' ', ' ', ' ' } };

		printBoard(board);

        
        int moveCount = 0;
        int currentPlayer = 0;

        while(moveCount < 9){
            System.out.print("Player " + (currentPlayer + 1) + " enter row      number:");
		    int row = reader.nextInt();
		    System.out.print("Player " + (currentPlayer +1) + " enter column number:");
		    int col = reader.nextInt();
            if (row > 0 && row < 4 && col > 0 && col < 4 &&
                board[row-1][col-1] == ' ') {
		    board[row - 1][col - 1] = currentPlayer == 0 ? 'X' : 'O';
            moveCount++;
            
            printBoard(board);
            if (checkBoard(board, row-1, col-1)){
                System.out.println("Player " + (currentPlayer +1) + " has won.");
            break; }
                currentPlayer= (currentPlayer + 1) % 2;
            }else {
                System.out.println("It is not a valid location"); }
		   
        }

		reader.close();
	}


    public static boolean checkBoard(char[][] board, int rowLast, int colLast) { 
        char symbol = board[rowLast][colLast];
        // check column  
        boolean win= true;
        for(int col=0; col<3; col++){
            if (board[rowLast][col] != symbol) {
                win=false;
                break;
            }
        }        
        if (win){
            return true;
        }
        //check row
        win= true;
        for(int row=0; row<3; row++){
            if (board[row][colLast] != symbol) {
                win=false;
                break;
            }
        }        
        if (win){
            return true;
        }
        win= true;
        //check diagonal top right to bottom left
        if (rowLast + colLast ==2){
            for(int row=0; row<3; row++){
                if( board[row][2-row] != symbol){
                    win=false;
                    break;
                }            
            }
            if (win){
                return true;
            }
        }
        //check diagonal top left to bottom right

        if (rowLast== colLast){
            for(int loc=0; loc<3; loc++){
                if( board[loc][loc] != symbol){
                    win=false;
                    break;
                }            
            }
            if (win){
                return true;
            }
        }

        return false;
       
    }
	public static void printBoard(char[][] board) {
		System.out.println("    1   2   3");
		System.out.println("   -----------");
		for (int row = 0; row < 3; ++row) {
			System.out.print(row + 1 + " ");
			for (int col = 0; col < 3; ++col) {
				System.out.print("|");
				System.out.print(" " + board[row][col] + " ");
				if (col == 2)
					System.out.print("|");

			}
			System.out.println();
			System.out.println("   -----------");

		}

	}

}
