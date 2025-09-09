import java.util.Comparator;
import java.util.List;

public class ShapeSorter {
    private Comparator<Shape> comparator;

    public ShapeSorter(Comparator<Shape> comparator) {
        this.comparator = comparator;
    }

    public void drawAllShapes(List<Shape> shapes) {
        shapes.stream()
              .sorted(comparator) 
              .forEach(Shape::draw);
    }
}
