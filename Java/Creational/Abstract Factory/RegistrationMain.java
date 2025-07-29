import registration.procedures.*;

public class RegistrationMain {
    public static void main(String[] args) {
        RegistrationProcedureEnglish regEng = new RegistrationProcedureEnglish();
        RegistrationProcedurePolish regPl = new RegistrationProcedurePolish();
        RegistrationProcedureUkrainian regUa = new RegistrationProcedureUkrainian();

        regEng.registration();
        regPl.registration();
        regUa.registration();
    }
}