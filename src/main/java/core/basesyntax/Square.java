package core.basesyntax;

public class Square extends Figure {
    private final int lag;

    public Square(int firstLag, String color) {
        this.lag = firstLag;
        setColor(color);
    }

    @Override
    public Double getArea() {
        return (double)lag * lag;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq.units, firstLag: " + lag + " units, color: "
                + getColor());
    }
}
