public class Shape {
    private String name;
    private Color color;

    public Shape(String name, String color) {
        this.name = name;
        this.color = ColorFactory.getColor(color);
    }

    public void draw() {
        System.out.println("Drawing a " + this.color.getName() + " " + this.name);
    }
}