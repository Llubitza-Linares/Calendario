package activities.calculadora;

import controles.Button;
import controles.Label;
import org.openqa.selenium.By;

public class MainScreen {
    public Button twoButton = new Button(By.id("//android.widget.Button[@text='2']"));
    public Button plusButton = new Button(By.id("//android.widget.Button[contains(@resource-id, 'calc_keypad_btn_add')]"));
    public Button fiveButton = new Button(By.id("//android.widget.Button[@text='5']"));
    public Button equalsButton = new Button(By.id("com.android.calculator2:id/eq"));
    public Label resultLabel = new Label(By.id("com.android.calculator2:id/result"));
}