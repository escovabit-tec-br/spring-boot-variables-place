package br.tec.escovabit.app.variablesplace.environment;

import org.springframework.stereotype.Component;

@Component
public class VariableEnvironmentCorrect {

    public String getJavaHome() {
        String java_home = System.getenv("JAVA_HOME");
        return java_home;
    }
}
