Feature: Login
  Scenario: Login successful
    Given The user is about to join
    When he enter the credentials
      |username|password|
      |1019983255|Sc182822004|
    Then he join successful