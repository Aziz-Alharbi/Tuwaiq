import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


       // char[][] array = new char[3][3];

        char[][] array = {
                {'.', '.', '.'},
                {'.', '.', '.'},
                {'.', '.', '.'}
        };


        Scanner sc = new Scanner(System.in);

        while (true) {
            display(array);
            play(array, sc);

            if (checkWinner(array)) break;
            if (isDraw(array)) {
                System.out.println("It's a draw!");
                break;
            }

            botTurn(array);
            if (checkWinner(array)) break;
            if (isDraw(array)) {
                System.out.println("It's a draw!");
                break;
            }
        }
        display(array);

    }

    public static void display(char [] [] array){

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j]);
            }

            System.out.println();

        }

    }

    public static void play(char [] [] array, Scanner sc){

        while (true) {
            System.out.println("Enter row (0-2): ");
            int row = sc.nextInt();
            System.out.println("Enter col (0-2): ");
            int col = sc.nextInt();

            if (row >= 0 && row < 3 && col >= 0 && col < 3 && array[row][col] == '.') {
                array[row][col] = 'X';
                break;
            } else {
                System.out.println("Invalid spot, try again.");
            }
        }
    }

    public static void botTurn(char [] [] array){

        Random rand = new Random();
        int row, col;
        do {
            row = rand.nextInt(3); // 0 to 2
            col = rand.nextInt(3);
        } while (array[row][col] != '.');

        array[row][col] = 'O';
      //  System.out.println(array[row][col]);

        System.out.println("Computer moved:");
//        display(array);
//        display(array);

    }

    public static boolean checkWinner(char[][] array) {
        // Rows and columns
        for (int i = 0; i < 3; i++) {
            if (array[i][0] != '.' && array[i][0] == array[i][1] && array[i][1] == array[i][2]) {
                System.out.println(array[i][0] == 'X' ? "Player won!" : "Computer won!");
                return true;
            }
            if (array[0][i] != '.' && array[0][i] == array[1][i] && array[1][i] == array[2][i]) {
                System.out.println(array[0][i] == 'X' ? "Player won!" : "Computer won!");
                return true;
            }
        }

        // Diagonals
        if (array[0][0] != '.' && array[0][0] == array[1][1] && array[1][1] == array[2][2]) {
            System.out.println(array[0][0] == 'X' ? "Player won!" : "Computer won!");
            return true;
        }

        if (array[0][2] != '.' && array[0][2] == array[1][1] && array[1][1] == array[2][0]) {
            System.out.println(array[0][2] == 'X' ? "Player won!" : "Computer won!");
            return true;
        }

        return false;
    }

    public static boolean isDraw(char[][] array) {
        for (char[] row : array) {
            for (char c : row) {
                if (c == '.') return false;
            }
        }
        return true;
    }
}