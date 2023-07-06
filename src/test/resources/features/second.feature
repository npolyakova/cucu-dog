Feature: Dogs searching
  Scenario: As a user I want to open the site and find a dog by its type
  Given unauthorized user opened the site
  And user opened the page "Free dogs"
  When user choose a dog with a type filter option
  Then user see all dogs which have the chosen type