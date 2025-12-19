package homeassignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
public class CreateAcct {
	public static void main(String[] args) {
	ChromeOptions opt= new ChromeOptions();
	opt.addArguments("guest");
	ChromeDriver driver = new ChromeDriver(opt);
	driver.get(" http://leaftaps.com/opentaps/");//load url
	driver.manage().window().maximize();//maximize window
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");//enter username
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");//enter password
	driver.findElement(By.className("decorativeSubmit")).click();//click login
	driver.findElement(By.partialLinkText("CRM")).click();//click CRMSFA link
	//creating account
	driver.findElement(By.linkText("Accounts")).click();//click accounts tab
	driver.findElement(By.partialLinkText("Create Account")).click();//click create account
	 driver.findElement(By.id("accountName")).sendKeys("vasu");//enter account name
	driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");//enter description
	//locate ownership
	WebElement ownership=driver.findElement(By.name("ownershipEnumId"));
	Select sel=new Select(ownership);//instantiate the select class
	sel.selectByVisibleText("S-Corporation");
	//locate industry
	WebElement industry=driver.findElement(By.name("industryEnumId"));
	Select sel1=new Select(industry);//instantiate the select class
	sel1.selectByValue("IND_SOFTWARE");
	//loacte source
	WebElement source=driver.findElement(By.name("dataSourceId"));
	Select sel2=new Select(source);//instantiate the select class
	sel2.selectByValue("LEAD_EMPLOYEE");
	//locate marketing campaign
	WebElement market=driver.findElement(By.id("marketingCampaignId"));
	Select sel3=new Select(market);//instantiate the select class
	sel3.selectByIndex(6);
	//locate state
	WebElement state=driver.findElement(By.id("generalStateProvinceGeoId"));
	Select sel4=new Select(state);//instantiate the select class
	sel4.selectByValue("TX");
	// Click Create Account button
    driver.findElement(By.className("smallSubmit")).click();
    driver.getTitle();
	WebElement acc=driver.findElement(By.xpath("(//span[@class='tabletext'])[3]"));
	String accname=acc.getText();
	System.out.println(accname);
	}

}
