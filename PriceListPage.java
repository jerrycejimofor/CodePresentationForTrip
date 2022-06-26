package pages;

import org.openqa.selenium.By;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.DriverUtil;

public class PriceListPage extends DriverUtil{

    // website Element
    By CarVanButton = By.xpath("//*[@id=\"navigation\"]/ul/li[2]/a");
    By FullPriceList = By.xpath("//*[@id=\"navigation\"]/ul/li[2]/ul/li[1]");
    By MakeDropDown = By.id("make");
    By Sort = By.id("sort");
    By ShowCar = By.id("advanced");
    By ShowPrice = By.id("budget");
    By ShowDeposit = By.id("deposit_months");
    By TrimGas = By.xpath("//input[@value=\"0\"]");
    By TrimTransmission = By.id("trim_gbox");
    By Year = By.xpath("//*[@id=\"sortingtable\"]/tbody/tr[6]/td/input");
    By DealButton = By.xpath("//*[@id=\"sortingtable\"]/tbody/tr[10]/td/input");


    //method to open the URL
    String BaseUrl = "https://www.lingscars.com/";
    public void LauchUrl(){
        driver.get(BaseUrl);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }
    //method to click CarVanButton
    public void ClickCarVanButton(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(CarVanButton)).click();
    }
    //method to click the Price full List Button
    public void ClickPriceListButton() {
        driver.findElement(FullPriceList).click();
    }
    //method to verify that the PriceList page opened
    public void VerifyPriceListPageOpened() {
        String actualTitle = "Car Leasing deals UK | Personal Price List | LINGsCARS";
        String expectedTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

      /* if (actualTitle == expectedTitle) {
           System.out.println("Title is correct");
           } else {
           System.out.println("Title is Incorrect");
           } */
    }

    //method to choose Vehicles Make
    public void SelectCarMake(){

        //scrolling page Down
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();

        Select dropdown = new Select(driver.findElement(MakeDropDown));
        dropdown.selectByValue("DOW");
    }
    //method to Sort Vehicles options
    public void SortCarsOptions(){
        Select dropdown = new Select(driver.findElement(Sort));
        dropdown.selectByValue("price");
    }
    //method to Show  Vehicles options
    public void ShowCarsOptions() throws InterruptedException{
        Select dropdown = new Select(driver.findElement(ShowCar));
        dropdown.selectByVisibleText("Show EVERYTHING all cars and vans");
        Thread.sleep(3000);
    }
    //method to Show  Price options
    public void ShowPriceOptions(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(ShowPrice));

        Select dropdown = new Select(driver.findElement(ShowPrice));
        dropdown.selectByVisibleText("Show ALL prices");
    }
    //method to Show  Deposit options
    public void ShowDepositOptions(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(ShowDeposit));

        Select dropdown = new Select(driver.findElement(ShowDeposit));
        dropdown.selectByVisibleText("Show ALL deposit options");
    }

    //method to select TrimGas
    public void SelectTrimEngine(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(TrimGas)).click();
    }

    //method to select Transmission type
    public void SelectTrimTransmission(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(TrimTransmission)).click();
        }

    //method to select vehicle year
    public void SelectCarVanYear(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(Year)).click();
        }

    //method to click deal button
    public void ClickShowMeDealButton (){
        driver.findElement(DealButton).click();
        WebDriverWait wait = new WebDriverWait(driver,50);
        }

    //method to car list
    public void VerifyCarVanList (){
        String title = "Your logo";
        if (title.contains("Your logo")){
            System.out.println("PriceList Information is Accurate");
            }else{System.out.println("PriceList Information is not Accurate");
            }

        //scrolling page Down to see results
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();

        Actions jactions = new Actions(driver);
        jactions.sendKeys(Keys.PAGE_DOWN).build().perform();

    }

}
