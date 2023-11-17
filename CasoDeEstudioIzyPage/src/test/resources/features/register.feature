Feature: Register
  i as service user, i need register for log in

  Scenario: Register Successful
    Given he user is on the page
    When he user enter de data for the register
      | user     | username  | country | city     | id        | phone      | email              | password      | verifypassword |
      | Mauricio | mbuitrago | brasil  | Medellin | 123475639 | 3015331662 | maob61@yopmail.com | Colombia2023* | Colombia2023*  |
    Then he user could see the username
