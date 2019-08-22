@login
Feature:

  Scenario Outline

    Given I am on the "<pageName>" page
    When I login as a "<user>"
    Then the "<pageTitle>" page should be displayed
    Examples:
      | pageName | user | pageTitle |
      |     Login     |  hr    |           |



