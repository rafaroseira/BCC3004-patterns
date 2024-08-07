public class PerimeterVisitor implements Visitor {
    @Override
    public void visit(Circle circle) {
        double perimeter = 2 * Math.PI * circle.getRaio();
        System.out.println("Perímetro do círculo: " + perimeter);
    }

    @Override
    public void visit(Rectangle rectangle) {
        double perimeter = 2 * (rectangle.getLargura() + rectangle.getAltura());
        System.out.println("Perímetro do retângulo: " + perimeter);
    }
}