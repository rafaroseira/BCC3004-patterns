public class Rectangle implements Visitable {
    private double largura;
    private double altura;

    public Rectangle(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}