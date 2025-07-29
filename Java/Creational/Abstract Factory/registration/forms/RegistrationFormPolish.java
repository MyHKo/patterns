package registration.forms;

public class RegistrationFormPolish implements RegistrationForms {
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
        return "Proszę stworzyć hasło: ";
    }

    @Override
    public String askForUsername() {
        return "Proszę stworzyć imie użytkownika: ";
    }
}
