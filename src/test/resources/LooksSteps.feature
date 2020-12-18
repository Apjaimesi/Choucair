Feature: Select looks from the product catalog

  Background: Enter to the a new experience HomePage
    Given the user open the test page "http://automationpractice.com/index.php"

  Scenario: TC025: Select garment of the category Women - Tops - Subcategory T-shirts - Faded Short Sleeve T-shirts
    Given the user select Women menu
    When the user click on the button T-shirts
    Then the user should click on Quick view for Faded Short Sleeve T-shirts
    And the user should see the Item Faded Short Sleeve T-shirts description

  Scenario: TC028: View selected products in the cart
    Given the user select Women menu
    When the user press click on the button T-shirts
    Then the user should press click on Quick Faded Short Sleeve T-shirts
    And the user should be in the Faded Short Sleeve T-shirts view
    And the user should click on the button Add to cart
    And the user should click on the button continue shopping
    And the user should navigate on the cart
    And the user should see the shopping cart view