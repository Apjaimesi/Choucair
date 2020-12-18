Feature: Validate the product purchase order

  Background: Enter to the a new experience HomePage
    Given the user open the test page "http://automationpractice.com/index.php"

  Scenario: TC029: See purchase order summary
    Given the user select Women menu
    When the user click on the button T-shirts
    Then the user click on Quick Faded Short Sleeve T-shirts
    And the user should be in the Faded Short Sleeve T-shirts view
    And the user should click on the button T-shirts Add to cart
    And the user should click on the button continue shopping
    And the user should select Cart
    And the user should click on the button Check out
    And the user should see the information of order summary