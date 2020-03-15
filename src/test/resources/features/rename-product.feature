Feature: Check that the name of a product can be changed

  Scenario: change the name of a product
    Given I want to change the name of a product to "Palta"
    When I enter the name "Palta" in the system
    Then the name of the product should be "Palta"