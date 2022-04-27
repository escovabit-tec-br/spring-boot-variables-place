package br.tec.escovabit.app.variablesplace.build;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class VariableBuildCorrect {

    @Value("${app.config.phone.phone.length:8}")
    private Integer phoneLength;

    @Value("${app.config.phone.mobile.length:9}")
    private Integer mobileLength;

    @Value("${app.config.phone.phone.msg:phone}")
    private String phone;

    @Value("${app.config.phone.mobile.msg:mobile}")
    private String mobile;

    /**
     * Sem valor padrão para forçar vir de application.yml
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
