Feature: Check that the title site is right
  Scenario: Opened main webpage
    Given I visit monique list-product page: "http://localhost:4200/products"
    When I check the title main page on Google Chrome
    Then the title main page should be "Monique - Lista de productos""