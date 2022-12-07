Feature: Product Search
  @productSearch
  Scenario Outline: Validate product search functionality on Green-Kart
    Given User is on Green-Kart landing page
    When User enters <productName> to search product and extracts the product name
    Then User clicks on top Deals element
    Then user searches <productName> in offers page
    And validate product name is offers page matches with landing page product name

    Examples:
    | productName |
    | Tomato      |
    | Cucumber    |