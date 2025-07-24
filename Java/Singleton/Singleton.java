public class Singleton {
    public static Singleton instance = null;

    public int counter = 0;

    private String message = "";

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void increment() {
        counter++;
    }
    public void decrement() { counter--; }

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
