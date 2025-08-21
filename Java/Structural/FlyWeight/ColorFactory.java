import java.util.HashMap;

public class ColorFactory {
    private static HashMap<String, Color> colors = new HashMap<String, Color>();

    public static Color getColor(String name){
        return colors.computeIfAbsent(name, Color::new);
    }
}
