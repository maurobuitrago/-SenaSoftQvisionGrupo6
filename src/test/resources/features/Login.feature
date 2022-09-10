Feature: Login

  Scenario: Login successful
    Given The user is about to join
    When he enter the credentials
      |username|password|
      |1019983255|Sc182822004|
    Then he join successful

  Scenario: Login not successful
    Given The user is about to join
    When he enter the credentials
      |username|password|
      |10199832552|Sc1828220043|
    Then he cant join on platform