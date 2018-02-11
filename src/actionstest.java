import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class actionstest {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.switchTo().frame(0);
		Actions a=new Actions(driver);
		a.sendKeys(Keys.CONTROL).build().perform();
		driver.findElement(By.xpath("//*[@id='selectable']/li[1]")).click();
		driver.findElement(By.xpath("//*[@id='selectable']/li[3]")).click();
		driver.findElement(By.xpath("//*[@id='selectable']/li[5]")).click();
		
	}

}
