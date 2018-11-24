
/**
 * This class is used to initialize the whole game board in terms of data.
 */
public class Board {
    private static final int WIDTH = 7;
    private static final int LENGTH = 9;
    /**
     * This is the gameboard of our game,
     * containg 7*9 cells.
     * @see dataCell
     */
    public dataCell[][] board;

    /**
     * Constructor1: this is the constructor for initializing from scratch
     */
    public Board() {
        for (int i = 0; i < WIDTH; i++) {
            for (int k = 0; k < LENGTH; k++) {
                if ((i == 2 && k == 0) || (i == 2 && k == 8) || (i == 3 && k == 1) || (i == 3 && k == 7) || (i == 4 && k == 0)
                        || (i == 4 && k == 8))
                    board[i][k] = new dataCell(i, k, null);
                else if ((i == 3 && (k == 0 || k == 8))) board[i][k] = new dataCell(i, k, null);
                else if ((i >= 2 && i <= 3 && k >= 3 && k <= 5) || (i >= 4 && i <= 5 && k >= 3 && k <= 5))
                    board[i][k] = new dataCell(i, k, null);
                else if (i == 0 && k == 0) board[i][k] = new dataCell(i, k, new Tiger(0));
                else if (i == 6 && k == 8) board[i][k] = new dataCell(i, k, new Tiger(1));
                else if (i == 1 && k == 1) board[i][k] = new dataCell(i, k, new Cat(0));
                else if (i == 5 && k == 7) board[i][k] = new dataCell(i, k, new Cat(1));
                else if (i == 0 && k == 2) board[i][k] = new dataCell(i, k, new Elephant(0));
                else if (i == 6 && k == 6) board[i][k] = new dataCell(i, k, new Elephant(1));
                else if (i == 2 && k == 2) board[i][k] = new dataCell(i, k, new Wolf(0));
                else if (i == 4 && k == 6) board[i][k] = new dataCell(i, k, new Wolf(1));
                else if (i == 4 && k == 2) board[i][k] = new dataCell(i, k, new Leopard(0));
                else if (i == 2 && k == 6) board[i][k] = new dataCell(i, k, new Leopard(1));
                else if (i == 5 && k == 1) board[i][k] = new dataCell(i, k, new Dog(0));
                else if (i == 1 && k == 7) board[i][k] = new dataCell(i, k, new Dog(1));
                else if (i == 6 && k == 0) board[i][k] = new dataCell(i, k, new Lion(0));
                else if (i == 0 && k == 8) board[i][k] = new dataCell(i, k, new Lion(1));
                else if (i == 6 && k == 2) board[i][k] = new dataCell(i, k, new Rat(0));
                else if (i == 0 && k == 6) board[i][k] = new dataCell(i, k, new Rat(1));
            }

        }

    }

    /**
     * Constructor2, which is used to initialize a gameboard stored before. The data is stored in a 2D array.
     * @param save a 2D array used to represent the data stored.
     */
    public Board(int save[][]) {
        for (int i = 0; i < WIDTH; i++) {
            for (int k = 0; k < LENGTH; k++) {
                //side and rank uniquely defined an animal
                int side = save[i][k] % 2 == 0 ? 0 : 1;
                int rank = (save[i][k] - side) / 2;
                switch (rank) {
                    case 0:
                        board[i][k] = new dataCell(i, k, null);
                        break;
                    case 1:
                        board[i][k] = new dataCell(i, k, new Rat(side));
                        break;
                    case 2:
                        board[i][k] = new dataCell(i, k, new Cat(side));
                        break;
                    case 3:
                        board[i][k] = new dataCell(i, k, new Dog(side));
                        break;
                    case 4:
                        board[i][k] = new dataCell(i, k, new Wolf(side));
                        break;
                    case 5:
                        board[i][k] = new dataCell(i, k, new Leopard(side));
                        break;
                    case 6:
                        board[i][k] = new dataCell(i, k, new Tiger(side));
                        break;
                    case 7:
                        board[i][k] = new dataCell(i, k, new Lion(side));
                        break;
                    case 8:
                        board[i][k] = new dataCell(i, k, new Elephant(side));
                        break;
                    }
                }

            }
        }
}
