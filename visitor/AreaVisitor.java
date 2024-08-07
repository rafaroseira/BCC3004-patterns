public class AreaVisitor implements Visitor {
    @Override
    public void visit(Circle circle) {
        double area = Math.PI * Math.pow(circle.getRaio(), 2);
        System.out.println("Área do círculo: " + area);
    }

    @Override
    public void visit(Rectangle rectangle) {
        double area = rectangle.getLargura() * rectangle.getAltura();
        System.out.println("Área do retângulo: " + area);
    }
}