Feature: Testing login functionality

  Scenario Outline: User can login with invalid username and password
    Given user visits the portal
    When user inputs valid "<username>" and "<password>"
    Then User can see error message

    Examples:
      | username | password |
      | admin    | 123      |
      | wrong    | pass123  |

  Scenario Outline: User can login with valid username and password
    Given user visits the portal
    When user inputs valid "<username>" and "<password>"
    Then user  logs into the dashboard
    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |