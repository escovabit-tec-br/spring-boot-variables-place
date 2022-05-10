package br.tec.escovabit.app.variablesplace.environment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class VariableEnvironmentCorrectTest {

    @Autowired
    VariableEnvironmentCorrect variableEnvironmentCorrect;

    @Test
    @DisplayName("java_home")
    public void testPhone() {
        String java_home = System.getenv("JAVA_HOME");

        assertEquals(
                java_home,
                variableEnvironmentCorrect.getJavaHome());

    }

}
