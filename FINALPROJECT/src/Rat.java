/**
 * This class is a subclass of piece, corresponding to a rat
 * in the gameboard.
 */
public class Rat extends Piece {
    private static final int _rank = 1;

    /**
     * Constructor.
     *
     * @param side indicates which user it belongs to
     */
    public Rat(int side) {
        super(side, "rat");
        rank = _rank;
    }

    /**
     * @return static rank value of a specific piece
     */
    public static int getrank() {
        return _rank;
    }

    private void setInWater(){
        this.isInWater = true;
    }

    @Override
    public boolean ableToCapture(Piece other) {
        if(this.isSameSide(other)) return false;
        if(this.isInWater && other.isInWater) return true;
        if(this.isInWater) return false;
        if (other.getRank() == this.rank || other.isInTrap || other.getRank() == 8) {
            return true;
        } else {
            return false;
        }
    }
}


