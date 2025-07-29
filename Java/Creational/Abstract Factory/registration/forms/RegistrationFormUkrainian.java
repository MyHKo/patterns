package registration.forms;

public class RegistrationFormUkrainian implements RegistrationForms {
    String username;
    String password;

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String askForPassword() {
        return "Створіть пароль: ";
    }

    @Override
    public String askForUsername() {
        return "Створіть ім'я користувача: ";
    }
}
