import java.util.Scanner;

interface RegistrationForms {
    String askForPassword();
    String askForUsername();

    void setUsername(String username);
    void setPassword(String password);

    default void createUser() {
        Scanner sc = new Scanner(System.in);

        System.out.print(askForUsername());
        String username = sc.nextLine();

        System.out.print(askForPassword());
        String password = sc.nextLine();

        setUsername(username);
        setPassword(password);
    }
}

class RegistrationFormEnglish implements RegistrationForms {
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

class RegistrationFormUkrainian implements RegistrationForms {
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

class RegistrationFormPolish implements RegistrationForms {
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
