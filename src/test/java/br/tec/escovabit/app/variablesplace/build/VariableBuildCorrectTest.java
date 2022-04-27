package br.tec.escovabit.app.variablesplace.build;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class VariableBuildCorrectTest {

    @Value("${app.config.phone.phone.msg:phone}")
    private String phone;

    @Value("${app.config.phone.mobile.msg:mobile}")
    private String mobile;

    /**
     * Sem valor padrão para forçar vir de application.yml
     */
    @Value("${app.config.phone.notPhone.msg}")
    private String notPhone;

    @Autowired
    VariableBuildCorrect variableBuildCorrect;

    @Test
    @DisplayName("phone")
    public void testPhone() {
        assertEquals(
                phone,
                variableBuildCorrect.phoneType(String.valueOf("12345678")));

    }

    @Test
    @DisplayName("mobile")
    public void testMobile() {
        assertEquals(
                mobile,
                variableBuildCorrect.phoneType(String.valueOf("123456789")));

    }

    @Test
    @DisplayName("not phone")
    public void testNotPhone() {
        assertEquals(
                notPhone,
                variableBuildCorrect.phoneType(String.valueOf("1234567890")));

    }
}
