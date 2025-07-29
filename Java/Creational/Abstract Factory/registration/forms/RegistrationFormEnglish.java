package registration.forms;

public class RegistrationFormEnglish implements RegistrationForms {
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
        return "Create a password: ";
    }

    @Override
    public String askForUsername() {
        return "Create a username: ";
    }
}
