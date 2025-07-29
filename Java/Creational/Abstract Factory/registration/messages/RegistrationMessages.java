package registration.messages;

interface RegistrationMessages {
    String getMessage();

    default void showMessage() {
        System.out.println(getMessage());
    };
}
