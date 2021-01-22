package polymorphism4instanceOf;

public class Square extends Form {

    private int edge;

    public Square(){

    }

    public Square(int edge) {
        this.edge = edge;
    }

    public void setEdge(int edge) {
        this.edge = edge;
    }

    @Override
    public double getArea() {
        return (edge * edge);
    }

    @Override
    public double getEnvironment() {
        return (4 * edge);
    }
}
