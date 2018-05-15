@feeds
Feature: As a user I should be able to create feeds

  Background: 
    Given I am on Konnexe website
    When I click on sign in link
    When I enter my "sumashankar@qwinix.io" and "Qwinix123"
    When I click on sign in button
    When I click on feeds

  @empty_feed
  Scenario: Creating empty feed
    When I donot enter anything and click on post button
    Then I should be not able to create a feed

  @empty_title
  Scenario: Creating feed with an empty title
    When I donot enter anything in title and when I enter description
    When I click on post button
    Then post button should be disabled

  @empty_decsription
  Scenario: Creating feed with an empty description
    When I enter title and I donot enter anything in the description
    When I click on post button
    Then post button should be disabled

  @valid_feed
  Scenario: Creating valid feed
    When I enter title and description
    When I upload photo
    When I click on post button for feeds creation
    Then I should be able to see feed created successfully
