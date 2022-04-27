package br.tec.escovabit.app.variablesplace.build;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class VariableBuildCorrect {

    /**
     * procura o valor em app.config.phone.phone.length dentro do
     * src/main/resources/bootstrap.yml
     * ou
     * usa o valor 8
     */

    @Value("${app.config.phone.phone.length:8}")
    private Integer phoneLength;

    /**
     * procura o valor em app.config.phone.mobile.length dentro do
     * src/main/resources/bootstrap.yml
     * ou
     * usa o valor 9
     */

    @Value("${app.config.phone.mobile.length:9}")
    private Integer mobileLength;

    /**
     * procura o valor em app.config.phone.phone.msg dentro do
     * src/main/resources/bootstrap.yml
     * ou
     * usa o valor phone
     */

    @Value("${app.config.phone.phone.msg:phone}")
    private String phone;

    /**
     * procura o valor em app.config.phone.mobile.msg dentro do
     * src/main/resources/bootstrap.yml
     * ou
     * usa o valor mobile
     */

    @Value("${app.config.phone.mobile.msg:mobile}")
    private String mobile;

    /**
     * Sem valor padrão para forçar vir de bootstrap.yml
     */

    @Value("${app.config.phone.notPhone.msg}")
    private String notPhone;

    public String phoneType(String phoneNumber) {
        String response = notPhone;
        if (phoneNumber.length() == phoneLength) {
            response = phone;
        } else if (phoneNumber.length() > phoneLength && phoneNumber.length() <= mobileLength) {
            response = mobile;
        }
        return response;
    }
}
