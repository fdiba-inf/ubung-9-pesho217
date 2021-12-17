package exercise9;

public class EllipseDemo {
    public static void main(String[] args) {
    Ellipse Ellipse1 = new Ellipse();
    Point Anfangspunkt1 = new Point(2, 3);
    Ellipse Ellipse2 = new Ellipse(Anfangspunkt1, 5, 6);
    Ellipse Ellipse3 = new Ellipse(Ellipse2);
    Ellipse Ellipse4 = new Ellipse();
    Ellipse4.initialize();
    
    System.out.println("Ellipse 1: " + Ellipse1);
    System.out.println("Ellipse 2: " + Ellipse2);
    System.out.println("Ellipse 3: " + Ellipse3);
    System.out.println("Ellipse 4: " + Ellipse4);

    System.out.println("Ellipse 2 equals Ellipse 1: " + Ellipse2.equals(Ellipse1));
    System.out.println("Ellipse 2 equals Ellipse 3: " + Ellipse2.equals(Ellipse3));
    }
}
