package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="LandingPage"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class LandingPage {

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='MoreShow more navigation items']")
	public WebElement moreShowMoreNavigationItems;
	@LinkType()
	@FindBy(xpath = "//one-app-nav-bar-menu-item/a[normalize-space(.)='Resource Availability Console']")
	public WebElement resourceAvailabilityConsoleClick;
			
}
