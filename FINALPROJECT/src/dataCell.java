public class dataCell {
    private final int x;
    private final int y;
    private Piece animal;
    private final Area area;
    public dataCell(int x, int y, Piece animal, Area area){
        this.x = x;
        this.y = y;
        this.animal = animal;
        this.area = area;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public Piece getPiece(){
        return animal;
    }

    public void setPiece(Piece p){
        this.animal = p;
    }

    public Area getArea(){
        return area;
    }

}
