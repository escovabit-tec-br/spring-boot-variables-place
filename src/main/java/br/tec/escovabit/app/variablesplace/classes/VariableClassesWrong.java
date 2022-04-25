package br.tec.escovabit.app.variablesplace.classes;

public class VariableClassesWrong {

    public String phoneType(String phoneNumber) {
        String response = "not phone";
        if (phoneNumber.length() == 8) {
            response = "phone";
        } else if (phoneNumber.length() > 8 && phoneNumber.length() <= 9) {
            response = "mobile";
        }
        return response;
    }
}
