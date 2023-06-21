package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHome {
	
	WebDriver driver;
	
	public GoogleHome (WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

@FindBy(name="q")
WebElement	searchBox;
//	WebElement	searchBox = driver.findElement(By.name("q"));


public void enterSearch(String string){
	searchBox.sendKeys(string);
}

@FindBy(name="btnK")
WebElement seachBtn;
//WebElement seachBtn =driver.findElement(By.name("btnK"));

//seachBtn.click();
//seachBtn.submit();
public void clickSearch(){
	seachBtn.submit();
}
	

}
