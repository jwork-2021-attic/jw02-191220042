package proj;

public class Monster implements Linable{

    private int r;
    private int g;
    private int b;
    private int rank;
    private Position position;

    void setRGB(int r, int g, int b,int rank) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.rank=rank;
    }


    public int rank() {
        return this.rank;
    }

    @Override
    public String toString() {
        return "\033[48;2;" + this.r + ";" + this.g + ";" + this.b + ";38;2;0;0;0m    " + this.rank() + "  \033[0m";
    }

    @Override
    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public Position getPosition() {
        return this.position;
    }

    public void swapPosition(Monster another) {
        Position p = another.position;
        this.position.setLinable(another);
        p.setLinable(this);
    }

    @Override
    public int getValue() {
        return this.rank();
    }

}
