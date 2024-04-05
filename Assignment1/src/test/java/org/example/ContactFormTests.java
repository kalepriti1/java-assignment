package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactFormTests {

    public static void main(String[] args) throws InterruptedException {
        testContactForm();
        testDynamicWebElements();
    }

    public static void testContactForm() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\rbs\\Desktop\\rbs\\Practice\\SeliumTestDemo\\src\\main\\resources\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.mycontactform.com/samples.php");

        // Select send to Option Three opetion value 0 to 2
        WebElement nameInput = driver.findElement(By.cssSelector("input[type='checkbox'][name='email_to[]'][value='2']"));
        nameInput.click();

        WebElement emailInput = driver.findElement(By.xpath("//input[@id= 'email']"));
        emailInput.sendKeys("abc@example.com");

        WebElement messageInput = driver.findElement(By.xpath("//input[@name='subject']"));
        messageInput.sendKeys("This is test message.");

        WebElement textBoxFields = driver.findElement(By.xpath("//input[@name='q1']"));
        textBoxFields.sendKeys("This is test field");

        WebElement textBoxMultiLine = driver.findElement(By.xpath("//textarea[@name = 'q2']"));
        textBoxMultiLine.sendKeys("This is Box field for test only..");
        // Select from dropdown Box
        WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='q3']"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText("Second Option");

        // Radio Buttons:
        WebElement radioButton = driver.findElement(By.xpath("//input[@value='First Option']"));
        radioButton.click();

        // Check single checkboxes
        WebElement singlecheckbox = driver.findElement(By.xpath("//input[@name=\"q5\"]"));
        singlecheckbox.click();

        //Check multi checkboxes
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@value='First Check Box']"));
        checkbox1.click();

        WebElement checkbox2 = driver.findElement(By.xpath("//input[@value='Second Check Box']"));
        checkbox2.click();

        WebElement calaender = driver.findElement(By.xpath("//input[@name='q7']"));
        calaender.click();


        // Select Year
        WebElement yearElement = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select yearDropdown = new Select(yearElement);
        yearDropdown.selectByValue("2004");

        // Month Selector:
        WebElement monthElement = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select monthDropdown = new Select(monthElement);
        monthDropdown.selectByVisibleText("Feb");

        // Select Date
        WebElement dateElement = driver.findElement(By.xpath("//a[@class='ui-state-default' and text()='16']"));
        dateElement.click();

        //select state
        WebElement stateElement = driver.findElement(By.xpath("//select[@id = 'q8']"));
        Select stateDropdown  = new Select(stateElement);
        stateDropdown.selectByVisibleText("DE");

        //select countries
        WebElement countriesElement = driver.findElement(By.xpath("//select[@id = 'q9']"));
        Select selectCountries = new Select(countriesElement);
        selectCountries.selectByVisibleText("China");

        //select candian
        WebElement canadianElement = driver.findElement(By.xpath("//select[@id = 'q10']"));
        Select selectCanadian =new Select(canadianElement);
        selectCanadian.selectByVisibleText("Yukon");

        //Full Name
        WebElement name = driver.findElement(By.xpath("//select[@name=\"q11_title\"]"));
        Select selectname = new Select(name);
        selectname.selectByVisibleText("Miss");

        WebElement firstname = driver.findElement(By.xpath("//input[@name=\"q11_first\"]"));
        firstname.sendKeys("abc");


        WebElement lastname = driver.findElement(By.xpath("//input[@name=\"q11_last\"]"));
        lastname.sendKeys("xyz");

        //Birth Date
        //Birth Month
        WebElement birthMonthElement = driver.findElement(By.xpath("//select[@name=\"q12_month\"]"));
        Select birthMonth = new Select(birthMonthElement);
        birthMonth.selectByVisibleText("10");

        WebElement birthYearElemet = driver.findElement(By.xpath("//select[@name=\"q12_year\"]"));
        Select birthYear= new Select(birthYearElemet);
        birthYear.selectByVisibleText("2004");

        WebElement birthDatelement = driver.findElement(By.xpath("//select[@name=\"q12_day\"]"));
        Select birthDate = new Select(birthDatelement);
        birthDate.selectByVisibleText("10");

        WebElement attachFileElement = driver.findElement(By.xpath("//input[@type=\"file\"]"));
        attachFileElement.sendKeys("C:\\Users\\rbs\\Documents\\mysql1.txt");
        Thread.sleep(10000);
        // Submit form
        WebElement submitButton = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
        submitButton.click();

        // Verify confirmation message
        System.out.println(driver.getTitle());
        WebElement confirmationMessage = driver.findElement(By.tagName("h4"));
        if (confirmationMessage.isDisplayed()) {
            System.out.println("Confirmation message displayed.");
        } else {
            System.out.println("Confirmation message not displayed.");
        }
        driver.quit();
    }

    public static void testDynamicWebElements() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\rbs\\Desktop\\rbs\\Practice\\SeliumTestDemo\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mycontactform.com/samples.php");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement dynamicElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\"highlighttab\"]")));

        dynamicElement.click();
        driver.quit();
    }
}
