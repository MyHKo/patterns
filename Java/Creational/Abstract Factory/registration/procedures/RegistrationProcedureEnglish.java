package registration.procedures;

public class RegistrationProcedureEnglish implements RegistrationProcedures {
    @Override
    public void registration() {
        RegistrationFormEnglish reg = new RegistrationFormEnglish();
        RegistrationMessageEnglish msg = new RegistrationMessageEnglish();
        String[] user = reg.createUser();
        if (user.length == 2) {
            msg.showMessage();
            System.out.println(user[0]);
        } else {
            System.out.println("Something went wrong");
        }
    }
}
