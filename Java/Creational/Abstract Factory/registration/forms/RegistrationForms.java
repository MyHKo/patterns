package registration.forms;

import java.util.Scanner;

interface RegistrationForms {
    String askForPassword();
    String askForUsername();

    void setUsername(String username);
    void setPassword(String password);

    default String[] createUser() {
        Scanner sc = new Scanner(System.in);

        System.out.print(askForUsername());
        String username = sc.nextLine();

        System.out.print(askForPassword());
        String password = sc.nextLine();

        setUsername(username);
        setPassword(password);

        String[] user = new String[2];
        user[0] = username;
        user[1] = password;
        return user;
    }
}
