package br.tec.escovabit.app.variablesplace.classes;

public class VariableClassesCorrect {

    public static Integer PHONE_LENGTH = 8;
    public static Integer MOBILE_LENGTH = 9;
    public static String PHONE = "phone";
    public static String MOBILE = "mobile";
    public static String NOT_PHONE = "not phone";

    public String phoneType(String phoneNumber) {
        String response = NOT_PHONE;
        if (phoneNumber.length() == PHONE_LENGTH) {
            response = PHONE;
        } else if (phoneNumber.length() > PHONE_LENGTH && phoneNumber.length() <= MOBILE_LENGTH) {
            response = MOBILE;
        }
        return response;
    }

}
