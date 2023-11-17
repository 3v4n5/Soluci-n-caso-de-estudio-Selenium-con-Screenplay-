Feature: Categories

  Scenario: Create category
    Given he user is on the page
    When he user enter de data for the category
      | category | subcategory                          |
      | pom | es una herramienta de automatizacion |
    Then he could see the category pom


