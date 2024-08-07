public class Circle implements Visitable {
    private double raio;

    public Circle(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
