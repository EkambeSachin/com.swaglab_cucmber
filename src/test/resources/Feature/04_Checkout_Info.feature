
Feature: Swag Labs Checkout Information page


Given user is loged into the application

Scenario: user enters shipping information and continues to overview
Given the user is on the checkout information page
When the user enters first name "Sachin" last name "Ekambe" and postal code "500028"
And the user clicks on the continue button
Then the user should be redirected to the checkout overview page