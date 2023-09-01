Feature: To validate user login and Amazon Website search functionality

  @TestCase1
  Scenario: To validate error message on login page
    Given User enters the credential on login page
    When User validates the error message

  @TestCase2 @Chrome
  Scenario: User validates search and Add to cart functionality in Chrome
    Given User search a specific product on search tab, row "0" column "0"
    When Results should be displayed for searched keyword
    And User will select appropriate search result
    And User will add the product to cart
    And User will view the cart and increase product quantity, row "0" column "1"
    Then User will proceed for payment


  @TestCase3 @Edge
   Scenario: User validates the multiple search and Add to cart functionality in Edge
    Given User search a specific product on search tab, row "1" column "0"
    When Results should be displayed for searched keyword.
    And User will select appropriate search result and add to cart
    And User search a specific product on search tab, row "2" column "0"
    And User select pop holder and add to cart
    And User search a specific product on search tab, row "3" column "0"
    And User select earphone and add to cart, row "3" column "1"
    And User will decrease quantity of earphone and increase quantity of pop holder
    Then User will proceed for payment


  @TestCase4 @Chrome
  Scenario: User validates multiple search, Add and remove from cart functionality in Chrome
    Given User search a specific product on search tab, row "4" column "0"
    When User will select appropriate result and add to the cart
    And User search a specific product on search tab, row "5" column "0"
    And User will select a product and add to cart
    And User navigates to 1st tab and returns to homepage
    And User search a specific product on search tab, row "6" column "0"
    And User selects a product of Wall shelves and add to the cart
    And User removes 1st product from cart
    Then User will proceed for payment

  @TestCase5 @Edge
   Scenario:  User validates search, add filters, sort and wishlist functionality in Edge
    Given User search a specific product on search tab, row "7" column "0"
    When User select 2 brands from checkbox
    And User select a category and price range
    And User select a Bag and adds to wishlist
    And User navigates to 1st tab and clears the search field
    When User search a specific product on search tab, row "8" column "0"
    And User sorts the search results and filters according to ratings
    Then User select a wallet and add to wishlist


