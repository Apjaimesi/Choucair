Feature: Navigate the product catalog

  Background: Enter to the a new experience HomePage
    Given the user open the test page "http://automationpractice.com/index.php"

  Scenario: TC013: Browse category Women - Tops - All
    Given the user select Women menu
    When the user press click the button Tops
    Then the user should see the information of the subcategories of Tops (T-shirts & Blouses)

  Scenario: TC020: Browse category Dresses - All
    Given the user select Women menu
    When the user press click the button Dresses
    Then the user should see the information of the subcategories of Dresses (Casual, Evening, Summer)