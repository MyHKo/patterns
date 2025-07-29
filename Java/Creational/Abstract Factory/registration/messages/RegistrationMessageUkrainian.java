package registration.messages;

public class RegistrationMessageUkrainian implements RegistrationMessages {
    static String message = "Користувач був створений!";

    @Override
    public String getMessage() {
        return message;
    }
}
