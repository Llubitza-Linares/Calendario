package testClean;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class CalendarioTest {
    private AppiumDriver appiumDriver;

    @BeforeEach
    public void openApplication() throws MalformedURLException {
        DesiredCapabilities capabilities= new DesiredCapabilities();
        capabilities.setCapability("deviceName","Galaxy A51 de Llubitza");
        capabilities.setCapability("platformVersion","11");
        capabilities.setCapability("appPackage","com.samsung.android.calendar");
        capabilities.setCapability("appActivity","com.samsung.android.app.calendar.activity.MainActivity");
        capabilities.setCapability("platformName","Android");

        appiumDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

        // implicit
        appiumDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterEach
    public void closeApplication(){
        appiumDriver.quit();
    }

    @Test
    public void verifyTaskCreate() throws InterruptedException {

        String title = "Tarea creada";
        String note = "Primera tarea";

        //click +
        appiumDriver.findElement(By.id("com.samsung.android.calendar:id/floating_action_button")).click();
        // Settear titulo
        appiumDriver.findElement(By.id("com.samsung.android.calendar:id/title")).sendKeys(title);
        // Settear Notes
        appiumDriver.findElement(By.id("com.samsung.android.calendar:id/note_text")).sendKeys(note);
        // Save
        appiumDriver.findElement(By.id("com.samsung.android.calendar:id/smallLabel")).click();

        Thread.sleep(2000);

        // Verifico que se haya creado el elemento en mi lista
        String expectedResult=title;


    }

}
