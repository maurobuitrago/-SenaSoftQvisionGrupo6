Feature: RegisterSuccess


  Scenario: Register Successful
    Given the user needs to register in platform
    When the user enter the credentials
      | id      | email     | password     |
      | 1234567890 | jonddos@hotmail.com | 12345567890    |
    Then he could see the products