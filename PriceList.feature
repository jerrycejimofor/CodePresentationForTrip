Feature: Price List

  @Test
  Scenario: As a user I want to get full vehicle price list

    Given I navigate to the url https://www.lingscars.com/
    And I click on Cars/Vans button
    When I click on Full Price List
    Then Car leasing PriceList information page is displayed

  @Test
  Scenario: As a user I want to input details on price list page

    Given I choose a Make
    And I sort by price
    When I show everything carVan
    And I show all prices
    When I show all deposit options
    And I select TrimGas type
    When I select Transmission type
    And I select all year
    When I click show me the deal
    Then Result showing Car Deals in price order displays
