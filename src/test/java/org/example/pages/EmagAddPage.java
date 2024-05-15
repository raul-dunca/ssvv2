
package org.example.pages;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import java.util.List;

@DefaultUrl("https://www.emag.ro/laptop-14-cu-procesor-intelr-celeronr-j4105-windows-11-6gb-ram-120gb-ssd-1920-1080-full-hd-intelr-uhd-graphics-600-argintiu-laptop-m1401/pd/DJVQN8MBM/?X-Search-Id=1bd968a39bf09de4efe3&X-Product-Id=158587398&X-Search-Page=1&X-Search-Position=0&X-Section=search&X-MB=0&X-Search-Action=view")
public class EmagAddPage extends PageObject {




    @FindBy(id="my_cart")
    private WebElementFacade mycart;

    @FindBy(className="btn btn-primary btn-sm btn-block")
    private WebElementFacade viewDetails;




    public void view_cart() {
        mycart.click();

    }

    public List<String> getAddedItem() {
        WebElementFacade definitionList = find(By.className("alert-box"));
        return definitionList.findElements(By.tagName("p")).stream()
                .map( element -> element.getText() )
                .collect(Collectors.toList());
    }
}
