package br.tec.escovabit.app.variablesplace.classes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class VariableClassesCorrectTest {
    VariableClassesCorrect variableClassesCorrect = new VariableClassesCorrect();

    @Test
    @DisplayName("phone")
    public void testPhone() {
        assertEquals(
                VariableClassesCorrect.PHONE,
                variableClassesCorrect.phoneType(String.valueOf("12345678")));

    }

    @Test
    @DisplayName("mobile")
    public void testMobile() {
        assertEquals(
                VariableClassesCorrect.MOBILE,
                variableClassesCorrect.phoneType(String.valueOf("123456789")));

    }

    @Test
    @DisplayName("not phone")
    public void testNotPhone() {
        assertEquals(
                VariableClassesCorrect.NOT_PHONE,
                variableClassesCorrect.phoneType(String.valueOf("1234567890")));

    }
}
