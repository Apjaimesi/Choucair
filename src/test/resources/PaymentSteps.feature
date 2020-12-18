Feature: Validate order payment

  Background: Enter to the a new experience HomePage
    Given the user open the test page "http://automationpractice.com/index.php"

  Scenario: TC038: Pay by check
    Given the user select Women menu
    When the user click on the button T-shirts
    Then the user should click on Quick Faded Short Sleeve T-shirts
    And the user should be in the Faded Short Sleeve T-shirts
    And the user should click on the button T-shirts Add to cart
    And the user should click on the button continue shopping
    And the user should select Cart
    And the user should click on the button Check out
    And the user should be in SHOPPING-CART SUMMARY
    And the user should click on the button Proceed to checkout
    And the user should be in ADDRESSES
    And the user should click on the button Proceed to checkout
    And the user should be in SHIPPING
    And the user should click on the button Proceed to checkout
    And the user should be in PLEASE CHOOSE YOUR PAYMENT METHOD
    And the user should click on the button Pay by check