Feature: Place an Order
  @placeOrder
  Scenario Outline: Validate order can be placed from Green Kart portal
    Given User is on Green-Kart landing page
    When User enters <productName> to search product and extracts the product name
    And User adds "3" items to the cart
    And User proceeds to checkout
    Then User validates <productName> in checkout page
    #And verify user can apply the promo code
    #And verify user can place the order
    Examples:
    | productName  |
    | Tomato       |