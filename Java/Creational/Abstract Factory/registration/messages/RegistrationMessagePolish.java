package registration.messages;

public class RegistrationMessagePolish implements RegistrationMessages {
    static String message = "Użytkownik został utworzony!";

    @Override
    public String getMessage() {
        return message;
    }
}
