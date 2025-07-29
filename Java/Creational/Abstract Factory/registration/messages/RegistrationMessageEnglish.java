package registration.messages;

public class RegistrationMessageEnglish implements RegistrationMessages {
    static String message = "User was created!";

    @Override
    public String getMessage() { return message; }
}
