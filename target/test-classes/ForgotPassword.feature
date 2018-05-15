@forgot_password
Feature: As a user I should be able to reset my password

  Background: 
    Given I am on Konnexe website
    When I click on sign in link
    When I click on forgot password link

  @empty_forgotPassword_email
  Scenario: Reset password for empty email field
    When I click on submit button for forgot password
    Then button should be disabled for forgot password

  @email_not_found
  Scenario Outline: Reset password for unregistered email
    When I enter unregistered "<invalid email>" for forgot password
    When I click on submit button for forgot password
    Then I should be able to see error message for password reset

    Examples: 
      | invalid email           |
      | sumashankar@yopmail.com |

  @email_found
  Scenario Outline: Reset password for a valid email address
    When I enter "<valid email>" address for forgot password
    When I click on submit button for forgot password
    Then I should be able to see successful message for password reset.

    Examples: 
      | valid email           |
      | sumashankar@qwinix.io |
