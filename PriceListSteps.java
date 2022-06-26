package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.PriceListPage;

public class PriceListSteps {
    PriceListPage JPriceListPage = new PriceListPage();

    @Given("^I navigate to the url https://www\\.lingscars\\.com/$")
    public void i_navigate_to_the_url_https_www_lingscars_com() throws Throwable {
        JPriceListPage.LauchUrl();
    }

    @And("^I click on Cars/Vans button$")
    public void i_click_on_Cars_Vans_button() throws Throwable {
        JPriceListPage.ClickCarVanButton();
    }

     @When("^I click on Full Price List$")
    public void i_click_on_Full_Price_List() throws Throwable {
        JPriceListPage.ClickPriceListButton();
    }

    @Then("^Car leasing PriceList information page is displayed$")
    public void car_leasing_PriceList_page_is_displayed() throws Throwable {
        JPriceListPage.VerifyPriceListPageOpened();
    }

    @Given("^I choose a Make$")
    public void i_choose_a_made_BMW() throws Throwable {
        JPriceListPage.SelectCarMake();
    }

    @And("^I sort by price$")
    public void i_sort_by_price() throws Throwable {
        JPriceListPage.SortCarsOptions();
    }

    @When("^I show everything carVan$")
    public void i_show_everything_carVan() throws Throwable {
        JPriceListPage.ShowCarsOptions();
    }

    @And("^I show all prices$")
    public void i_show_all_prices() throws Throwable {
        JPriceListPage.ShowPriceOptions();
    }

    @When("^I show all deposit options$")
    public void i_show_all_deposit_options() throws Throwable {
        JPriceListPage.ShowDepositOptions();
    }

    @And("^I select TrimGas type$")
    public void i_select_all_engine_type() throws Throwable {
        JPriceListPage.SelectTrimEngine();
    }

    @When("^I select Transmission type$")
    public void i_select_both_transmission_type() throws Throwable {
        JPriceListPage.SelectTrimTransmission();
    }

    @And("^I select all year$")
    public void i_select_all_year() throws Throwable {
        JPriceListPage.SelectCarVanYear();
    }

    @When("^I click show me the deal$")
    public void i_click_show_me_the_deal() throws Throwable {
        JPriceListPage.ClickShowMeDealButton();
    }

    @Then("^Result showing Car Deals in price order displays$")
    public void result_showing_BMW_deals_in_price_order_displays() throws Throwable {
        JPriceListPage.VerifyCarVanList();
    }

}
