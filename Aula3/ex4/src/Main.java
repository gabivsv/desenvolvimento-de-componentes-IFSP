import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Shape> shapes = Arrays.asList(
            new Circle(),
            new Square(),
            new Triangle()
        );

        // Estratégia 1: Ordem alfabética pelo nome da forma
        ShapeSorter alphabeticalSorter = new ShapeSorter(
            Comparator.comparing(Shape::getName)
        );
        System.out.println("--- Desenho em ordem alfabética ---");
        alphabeticalSorter.drawAllShapes(shapes);

        // Estratégia 2: Ordem personalizada (Triangle primeiro, depois Circle, depois Square)
        ShapeSorter customSorter = new ShapeSorter(
            Comparator.comparingInt(shape -> {
                switch (shape.getName()) {
                    case "Triangle": return 1;
                    case "Circle": return 2;
                    case "Square": return 3;
                    default: return 4;
                }
            })
        );
        System.out.println("\n--- Desenho em ordem personalizada ---");
        customSorter.drawAllShapes(shapes);

        /*  Explicação OCP:
           - Main e Shape não precisam ser modificados para suportar novas ordens.
           - Novas formas podem ser adicionadas implementando Shape.
           - Novas estratégias de ordenação podem ser criadas passando um Comparator diferente para ShapeSorter.
           - A responsabilidade de ordenar não está em Main nem nos Shapes, respeitando a separação de responsabilidades.
        */
    }
}
