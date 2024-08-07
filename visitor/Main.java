public class Main {
    public static void main(String[] args) {
        Visitable[] shapes = new Visitable[] {
            new Circle(5),
            new Rectangle(4, 6)
        };

        Visitor areaVisitor = new AreaVisitor();
        Visitor perimeterVisitor = new PerimeterVisitor();

        for (Visitable shape : shapes) {
            shape.accept(areaVisitor);
            shape.accept(perimeterVisitor);
        }
    }
}
/*
 * O padrão de design Visitor é um padrão comportamental que permite adicionar novas operações a uma estrutura de objetos sem modificar as classes dos elementos dessa estrutura.
 * É particularmente útil quando você precisa realizar operações diferentes sobre um conjunto de objetos de uma estrutura de dados, mas não quer modificar as classes desses objetos.
 */

/*
Resumo
Visitable: Interface que define o método accept para receber um visitante.
Visitor: Interface com métodos visit para diferentes tipos de elementos.
Circle e Rectangle: Implementam Visitable e o método accept.
AreaVisitor e PerimeterVisitor: Implementam Visitor e definem operações específicas.
Main: Demonstra o uso dos visitantes para operar sobre uma coleção de formas.
Este exemplo mostra como o padrão Visitor permite adicionar novas operações (como cálculo de área e perímetro) sem alterar as classes das formas geométricas.
*/