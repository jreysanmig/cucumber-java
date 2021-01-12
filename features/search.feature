Feature: Woolies Search

  Scenario Outline: Search items using keywords
    Given Woolworths Home Page is open
    When "<keyword>" is searched
    Then Results header must contain "<keyword>"
    Examples:
    |keyword|
    |essentials|
    |coffee|
    |cheese|
    