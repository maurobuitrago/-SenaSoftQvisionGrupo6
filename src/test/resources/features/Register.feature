Feature: Login Success


  Scenario: Login user
    Given the user needs to login
    When the user enter data
      | id_user      | password     |
      | 1019983255    | 123567 |
    Then register successful

