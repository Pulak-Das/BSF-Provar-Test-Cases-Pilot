package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="DriveOnCalendar"                                
     , summary=""
     , relativeUrl=""
     , connection="DRDprofile"
     )             
public class DriveOnCalendar {

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@id='driveTails__item']")
	public WebElement driveDetailsClick;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@id='driveShifts__item']")
	public WebElement driveShiftsClick;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Configuration']")
	public WebElement configurationClick;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Number of 2RBC Assets']/parent::div/parent::lightning-input/parent::div/parent::div/parent::div/following-sibling::h3//lightning-primitive-icon")
	public WebElement clickOnConfiguration;
			
}
