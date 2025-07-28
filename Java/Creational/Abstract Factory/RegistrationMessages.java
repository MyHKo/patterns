interface RegistrationMessages {
    String getMessage();

    default void showMessage() {
        System.out.println(getMessage());
    };
}

class RegistrationMessageEnglish implements RegistrationMessages {
    static String message = "User was created!";

    @Override
    public String getMessage() {
        return message;
    }
}

class RegistrationMessageUkrainian implements RegistrationMessages {
    static String message = "Користувач був створений!";

    @Override
    public String getMessage() {
        return message;
    }
}

class RegistrationMessagePolish implements RegistrationMessages {
    static String message = "Użytkownik został utworzony!";

    @Override
    public String getMessage() {
        return message;
    }
}
