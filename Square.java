
public class Square extends Rectangle {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }
    public Square(double side,String color,boolean filled)
    {
        super(side,side);
        super.setColor(color);
        super.setFilled(filled);
        this.side=side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
