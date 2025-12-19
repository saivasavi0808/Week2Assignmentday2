package homeassignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
public class EditLead {
	public static void main(String[] args) {
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get(" http://leaftaps.com/opentaps/");//load url
		driver.manage().window().maximize();//maximize window
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");//enter username
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");//enter password
		driver.findElement(By.className("decorativeSubmit")).click();//click login
		driver.findElement(By.partialLinkText("CRM")).click();	//click crmsfa link
		//creating lead
		driver.findElement(By.partialLinkText("Leads")).click();//click leads 
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();//click on create lead
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("v");//enter first name
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("s");//enter last name
		driver.findElement(By.xpath("//input[contains(@id,'companyName')]")).sendKeys("testLeaf");//enter company name
		driver.findElement(By.xpath("//input[contains(@id,'departmentName')]")).sendKeys("test");//enter department name
		driver.findElement(By.name("description")).sendKeys("gdfgfhg");//enter description
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mopuri@gmail.com");//enter email
		//locate state/province
		WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sel=new Select(state);
		sel.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();//click on create lead
		driver.findElement(By.linkText("Edit")).click();//edit lead
		driver.findElement(By.name("description")).clear();//clear description
		driver.findElement(By.name("importantNote")).sendKeys("fhdj");//enter important note
		driver.findElement(By.xpath("//input[@value='Update']")).click();//click on update button

		driver.getTitle();//get title
		
		driver.close();//close browser window
	}

}
