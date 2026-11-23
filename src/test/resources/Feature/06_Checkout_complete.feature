
Feature: Swag Labs checkout complete page


Scenario: the user varifies the order confirmation message
Given the user is on checkout complete page
Then the order confirmation header "Thank you for your order!" should be displayed
And the user clicks on the back home button to return to the product page