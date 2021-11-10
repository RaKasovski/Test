import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.Objects;

public class Test {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.rshb.ru/");




        WebElement input = driver.findElement(By.xpath("/html/body/div[6]/div[1]/header/nav/div[1]/a[1]"));
        input.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));


        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(4)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div[1]/div[2]/div/div[2]/div[1]/nav/a[3]"))));
        element.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));


        WebElement button = new WebDriverWait(driver, Duration.ofSeconds(6)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"alert\"]/div/div/div[2]/button")));
        button.click();

        WebElement el = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[6]/div[1]/div[2]/div/div[2]/div[5]/div[1]/div[1]/a")));
        el.click();
        WebElement butt = new WebDriverWait(driver, Duration.ofSeconds(6)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div[2]/div/button")));
        butt.click();



        WebElement button2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[4]/div[1]/div/div/div[4]/div[1]/label/span/input"));
        button2.click();
        WebElement button3 = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[4]/div[1]/div/div/div[4]/div[3]/label/span/input"));
        button3.click();
        driver.manage().window().fullscreen();
        WebElement scroll =  driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[4]/div[1]/div/div/div[2]/div[3]/div/div[2]/div[4]"));
        for(int i2 = 0; i2<3000; i2++){
            scroll.sendKeys(Keys.ARROW_RIGHT);

        }
        WebElement scroll2 =  driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[4]/div[1]/div/div/div[2]/div[4]/div/div[3]/div[4]"));
        for(int i3 = 0; i3<12; i3++){
            scroll2.sendKeys(Keys.ARROW_RIGHT);
        }



        WebElement chislo = driver.findElement(By.xpath("//div[@class='loan-calculator-result__value loan-calculator-result__value--green']"));
        String ch = chislo.getAttribute("innerText");
        System.out.println(ch);

        WebElement prosent = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[4]/div[2]/div/div[2]/div[2]/div[1]"));
        String pr = prosent.getAttribute("innerText");

        System.out.println(pr);

        String c = "66 279 ₽";
        String p ="11.7%";

        if(ch.equals(c)){
            System.out.println("Ежемесячный платёж совпадает");
        }else{
            System.out.println("Ежемесячный платёж не совпадает");
        }

        if(pr.equals(p)){
            System.out.println("Проценты совпадают");
        }else{
            System.out.println("проценты не совпадают");
        }









    }
}
