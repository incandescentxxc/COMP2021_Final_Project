/**
 * This class is a subclass of piece, corresponding to a wolf
 * in the gameboard.
 */
public class Wolf extends Piece {
    private static final int _rank = 4;
    /**
     * Constructor.
     * @param side indicates which user it belongs to
     */
    public Wolf( int side){
        super(side,"wolf");
        rank = _rank;


    }
    /**
     *
     * @return static rank value of a specific piece
     */
    public static int getrank(){
        return _rank;
    }
}
