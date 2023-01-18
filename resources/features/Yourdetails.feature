Feature: View Details

  Scenario: I am logged in successfully and view details
 		Given I am logged in with nino
    When I visit change of circumstances
    Then I should see caption
    Then I should see title
    Then I should see name
    Then I should see preferred name
    Then I should see marital status
    Then I should see national insurance number
    Then I should see home address 
    Then I should see postal assress
    Then I should see email 
    Then I should see phone number
   