package registration.procedures;

import registration.forms.RegistrationFormPolish;
import registration.messages.RegistrationMessagePolish;

public class RegistrationProcedurePolish implements RegistrationProcedures {
    @Override
    public void registration() {
        RegistrationFormPolish reg = new RegistrationFormPolish();
        RegistrationMessagePolish msg = new RegistrationMessagePolish();
        String[] user = reg.createUser();
        if (user.length == 2) {
            msg.showMessage();
            System.out.println(user[0]);
        } else {
            System.out.println("Wystąpił błąd");
        }
    }
}
