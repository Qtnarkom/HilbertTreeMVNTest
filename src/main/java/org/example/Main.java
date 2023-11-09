package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HilbertRTree tree = new HilbertRTree(new Rectangle(0, 0, 10, 10));

        tree.insert(new Point(1.0, 2.0));
        tree.insert(new Point(3.0, 4.0));
        tree.insert(new Point(5.0, 6.0));
        tree.insert(new Point(7.0, 8.0));

        List<Point> result = tree.search(new Rectangle(2.0, 3.0, 6.0, 7.0));
        System.out.println("Найденные точки:");
        for (Point p : result) {
            System.out.println("(" + p.x + ", " + p.y + ")");
        }
    }
}
