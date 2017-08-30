Feature: gmail LoginFeature

  Background:
    Given user navigate to gmail home page

  Scenario: gmail login with valid credentials

    When enters accountName as "epam0333"
    And  click next button
    And enters the following as password
        |password|
        |epam1234.|
    And click next button and go to Inbox page
    Then gmail_inbox is displayed


  Scenario Outline: user create draft email

    When enters accountName as "epam0333"
    And  click next button
    And enters the following as password
      |password|
      |epam1234.|
    And click next button
    And enter <email>
 #   And enter <subject>

    Examples:
    |email|subject|
    |Sona_Gamaryan@epam.com|Test123|
    |Andranik_Chorokhyan@epam.com|Test456|


