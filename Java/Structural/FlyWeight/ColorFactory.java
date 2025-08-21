public class ColorFactory {
    private HashMap<String, Color> colors = new HashMap<String, Color>();
    public ColorFactory() {}

    public getColor(String name){
        colors.computeIfAbsent(name, Color::new);
    }
}
