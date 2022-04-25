package br.tec.escovabit.app.variablesplace.classes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class VariableClassesWrongTest {
    VariableClassesWrong variableClassesWrong = new VariableClassesWrong();

    @Test
    @DisplayName("phone")
    public void testPhone() {
        assertEquals(
                "phone",
                variableClassesWrong.phoneType(String.valueOf("12345678")));

    }

    @Test
    @DisplayName("mobile")
    public void testMobile() {
        assertEquals(
                "mobile",
                variableClassesWrong.phoneType(String.valueOf("123456789")));

    }

    @Test
    @DisplayName("not phone")
    public void testNotPhone() {
        assertEquals(
                "not phone",
                variableClassesWrong.phoneType(String.valueOf("1234567890")));

    }

}
