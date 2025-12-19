package homeassignments;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateFacebook {

	public static void main(String[] args) {
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://en-gb.facebook.com/");//load url
		driver.manage().window().maximize();//maximize window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//implictwait
		driver.findElement(By.partialLinkText("Create new account")).click();//click create new account
		driver.findElement(By.name("firstname")).sendKeys("honey");//enter firstname
		driver.findElement(By.name("lastname")).sendKeys("sweety");//enter surname
		//locate date of birth
		WebElement date=driver.findElement(By.id("day"));
		Select sel=new Select(date);
		sel.selectByValue("8");//select day
		WebElement month=driver.findElement(By.id("month"));
		Select sel1=new Select(month);
		sel1.selectByValue("8");//select month
		WebElement years=driver.findElement(By.id("year"));
		Select sel2=new Select(years);
		sel2.selectByValue("2003");//select year
		//enter mobilenumber or emailaddress
		driver.findElement(By.name("reg_email__")).sendKeys("mopuri@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("vhdghvcv");//enter new password
		driver.findElement(By.xpath("//input[@value='1']")).click();//select gender
		

	}

}
