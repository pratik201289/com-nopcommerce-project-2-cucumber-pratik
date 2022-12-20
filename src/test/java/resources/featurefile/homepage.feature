Feature: Homepage Test
  As a user I can navigate the pages successfully

  @sanity @regression
  Scenario: User can navigate computer page successfully
    Given I am on homepage
    When I select computers
    Then Computers text displayed

  @smoke @regression
  Scenario: User can navigate electronics page successfully
    Given I am on homepage
    When I select electronics
    Then Electronics text displayed

  @regression
  Scenario: User can navigate apparel page successfully
    Given I am on homepage
    When I select apparel
    Then Apparel text displayed