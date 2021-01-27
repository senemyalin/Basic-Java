package tictactoe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		Board board = new Board();

		System.out.println(board);
		while (!board.isEnded()) {

			int player = board.getCurrentPlayer();
			boolean invalidRow = false;
			int row = 0;
			do {
				System.out.print("Player " + player + " enter row number:");
				try {
					row = reader.nextInt();
					invalidRow = false;
				} catch (InputMismatchException ex) {
					System.out.println("Invalid row");
					reader.nextLine();
					invalidRow = true;
				}
			} while (invalidRow);

			boolean invalidColumn = false;
			int col = 0;
			do {
				System.out.print("Player " + player + " enter column number:");
				try {
					col = reader.nextInt();
					invalidColumn = false;
				} catch (InputMismatchException ex) {
					System.out.println("Invalid column");
					reader.nextLine();
					invalidColumn = true;
				}
			} while (invalidColumn);

			try {
				board.move(row, col);
			} catch (InvalidMoveException ex) {
				System.out.println(ex.getMessage());
			}
			System.out.println(board);
		}

		reader.close();
	}

}