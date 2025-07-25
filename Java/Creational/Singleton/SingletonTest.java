public class SingletonTest {
    public static void main(String[] args) {
        Singleton intance1 = Singleton.getInstance();
        Singleton intance2 = Singleton.getInstance();

        intance1.increment();
        System.out.println(intance2.counter);

        intance2.setMessage("We are comming in peace");
        System.out.println(intance1.getMessage());
    }
}