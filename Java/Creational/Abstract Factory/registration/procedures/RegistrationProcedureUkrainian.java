package registration.procedures;

public class RegistrationProcedureUkrainian implements RegistrationProcedures {
    @Override
    public void registration() {
        RegistrationFormUkrainian reg = new RegistrationFormUkrainian();
        RegistrationMessageUkrainian msg = new RegistrationMessageUkrainian();
        String[] user = reg.createUser();
        if (user.length == 2) {
            msg.showMessage();
            System.out.println(user[0]);
        } else {
            System.out.println("Сталася помилка");
        }
    }
}
