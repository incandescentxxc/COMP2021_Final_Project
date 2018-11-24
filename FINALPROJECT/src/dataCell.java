/**
 * This class defines one unit of gameboard.
 * Contains: the location of unit, the piece on that unit(if not, null)
 * also contains the property of that cell
 */
public class dataCell {
    private final int x;
    private final int y;
    private Piece animal;
    private Area area;

    /**
     * Constructor of one unit
     * @param x the x coordinate
     * @param y the y coordinate
     * @param animal the piece at that location
     * @see Area
     * @see Piece
     */
    public dataCell(int x, int y, Piece animal){
        this.x = x;
        this.y = y;
        this.animal = animal;
        this.area = this.setArea();
    }
    /**
     *
     * @return the x coordinate of that cell
     */
    public int getX(){
        return x;
    }
    /**
     *
     * @return the y coordinate of that cell
     */
    public int getY(){
        return y;
    }
    /**
     *
     * @return the piece at that location
     * @see Piece
     */
    public Piece getPiece(){
        return animal;
    }
    /**
     * assign another piece at the location
     * @param p another piece
     * @see  Piece
     */
    public void setPiece(Piece p){
        this.animal = p;
    }
    /**
     *
     * @return the property of that cell
     * @see  Area
     */
    public Area getArea(){
        return area;
    }

    /**
     * used to construct the area property for a cell, based on its position(x,y)
     * @return  the corresponding area for initializing
     */
   private Area setArea(){
        if ((x== 2 && y == 0) || (x == 2 && y == 8) || (x == 3 && y == 1) || (x == 3 && y == 7) || (x == 4 && y == 0)
                || (x == 4 && y == 8)){
            return Area.TRAP;
        }
        else if ((x == 3 && (y == 0 || y == 8))){
            return Area.DEN;
        }
        else if ((x >= 2 && x <= 3 && y >= 3 && y <= 5) || (x >= 4 && x <= 5 && y >= 3 && y <= 5)){
            return  Area.RIVER;
        }
        else{
            return Area.NORMAL;
        }
    }

}
