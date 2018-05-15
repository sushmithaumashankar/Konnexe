@signin
Feature: As a user I should be able to sign in Konnexe

  Background: 
    Given I am on Konnexe website
    When I click on sign in link

  @invalid_signin
  Scenario Outline: Trying to sign in with invalid email or password
    When I enter my invalid "<email>" or "<password>"
    When I click on sign in button
    Then I should be able to see error message

    Examples: 
      | email                 | password |
      | sumashankar@qwinix.io | Admin123 |

  @unregistered_email
  Scenario Outline: Trying to sign in with unregistered email
    When I enter my unregistered "<email>" and "<password>"
    When I click on sign in button
    Then I should be able to see error message for unregistered email

    Examples: 
      | email                       | password |
      | sumashankar+00000@qwinix.io | Admin123 |

  @valid_signin
  Scenario Outline: Valid Signin
    When I enter my "<email>" and "<password>"
    When I click on sign in button
    Then I should be able to see Konnexe homepage

    Examples: 
      | email                 | password  |
      | sumashankar@qwinix.io | Qwinix123 |
