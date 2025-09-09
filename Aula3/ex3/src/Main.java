import java.util.Arrays;
import java.util.List;

public class Main {
    public static void drawAllShapes(List<Shape> shapes) {
        for (Shape s : shapes) {
            s.draw();
        }
    }

    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(new Circle(), new Square(), new Triangle());
        drawAllShapes(shapes);

        
    }
}

//Por que agora conseguimos adicionar o Triangle sem modificar a main?
/*Antes da refatoração, o método drawAllShapes dependia de tipos concretos (Circle e Square) usando instanceof. Ou seja, toda vez que adicionássemos um novo shape, como Triangle, precisaríamos modificar o código para tratar esse novo tipo.

Após a refatoração, Circle, Square e Triangle implementam a mesma interface Shape, que possui o método draw() */


// Como isso se relaciona com o princípio Aberto/Fechado?

/*“Entidades de software devem estar abertas para extensão, mas fechadas para modificação.”
 Sendo assim, o código fica mais flexível, seguro e fácil de manter.
*/