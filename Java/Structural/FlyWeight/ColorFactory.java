public class ColorFactory {
    private static HashMap<String, Color> colors = new HashMap<String, Color>();

    public static getColor(String name){
        colors.computeIfAbsent(name, Color::new);
    }
}
