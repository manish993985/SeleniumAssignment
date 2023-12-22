// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//     }
// }


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\seleniumproject\\myselenium-project\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Initialize Chrome driver
        WebDriver driver = new ChromeDriver();

        // Navigate to Mercury Tours registration page
        driver.get("http://demo.guru99.com/test/newtours/register.php");

        // Fill the registration form
        WebElement firstName = driver.findElement(By.name("firstName"));
        firstName.sendKeys("Manish");

        WebElement lastName = driver.findElement(By.name("lastName"));
        lastName.sendKeys("Joshi");

        WebElement phone = driver.findElement(By.name("phone"));
        phone.sendKeys("9719996453");

        WebElement email = driver.findElement(By.id("userName"));
        email.sendKeys("manish.joshi@example.com");

        WebElement address = driver.findElement(By.name("address1"));
        address.sendKeys("123 Main St");

        WebElement city = driver.findElement(By.name("city"));
        city.sendKeys("Bazpur");

        WebElement state = driver.findElement(By.name("state"));
        state.sendKeys("Uttarakhand");

        WebElement postalCode = driver.findElement(By.name("postalCode"));
        postalCode.sendKeys("262401");

        WebElement country = driver.findElement(By.name("country"));
        country.sendKeys("India");

        WebElement username = driver.findElement(By.id("email"));
        username.sendKeys("manish.joshi");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("password123");

        WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
        confirmPassword.sendKeys("password123");

        // Submit the form
        WebElement submitButton = driver.findElement(By.name("submit"));
        submitButton.click();

        // Close the browser
        // driver.quit();
    }
}
