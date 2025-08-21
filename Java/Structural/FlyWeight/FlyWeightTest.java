public class FlyWeightTest {
    public static void main(String[] args) {
        Shape square = new Shape("square", "red");
        Shape rectangle = new Shape("rectangle", "red");

        square.draw();
        rectangle.draw();

        Color red1 = ColorFactory.getColor("red");
        Color red2 = ColorFactory.getColor("red");
        Color red3 = new Color("red");

        System.out.println(red1 == red2);
        System.out.println(red1 == red3);
        System.out.println(red3 == red2);
    }
}
