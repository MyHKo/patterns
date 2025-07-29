interface RegistrationInterface {
    void registration();
}

class RegistrationEnglish implements RegistrationInterface {
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

class RegistrationPolish implements RegistrationInterface {
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

class RegistrationUkrainian implements RegistrationInterface {
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
