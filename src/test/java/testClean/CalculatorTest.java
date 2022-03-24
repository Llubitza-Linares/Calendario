package testClean;


import activities.calculadora.MainScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

import java.net.MalformedURLException;

public class CalculatorTest {
    MainScreen mainScreen= new MainScreen();
    @Test
    public void sumaTest() throws MalformedURLException {
        mainScreen.twoButton.click();
        mainScreen.plusButton.click();
        mainScreen.fiveButton.click();
        mainScreen.equalsButton.click();

        String expectResult="7";
        String actualResult=mainScreen.resultLabel.getText();
        Assertions.assertEquals(expectResult,actualResult,"ERROR la suma es incorrecta");
    }

    @AfterEach
    public void closeApp() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
