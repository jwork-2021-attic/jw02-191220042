package proj;

public class Square implements Formation{
    private int length;
    private Position[][] positions;
    public Square(int length) {
        this.positions = new Position[length][length];
        this.length=length;
    }

    public void put(Linable linable, int i) {
        if (this.positions[i/length][i%length] == null) {
            this.positions[i/length][i%length] = new Position(null);
        }
        this.positions[i/length][i%length].setLinable(linable);
    }

    public Linable get(int i) {
        if ((i < 0) || (i > positions.length* positions.length)) {
            return null;
        } else {
            return positions[i/length][i%length].linable;
        }
    }


    @Override
    public String toString() {
        String lineString= "\t";

        int count=0;
        for (int i=0;i<length*length;i++) {
            lineString += positions[i/length][i%length].linable.toString();
            count++;
            if(count==8)
            {
                lineString += "\n";
                count=0;
            }
        }
        return lineString;
    }

    public Linable[] toArray() {
        Linable[] linables = new Linable[this.positions.length*this.positions.length];

        for (int i = 0; i < linables.length; i++) {
            linables[i] = positions[i/length][i%length].linable;
        }
        return linables;
    }

}
