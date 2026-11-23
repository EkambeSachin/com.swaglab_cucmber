
Feature: swag Labs Checkout Overview page

Scenario:user reviews the order details and finishes the purchase
Given the user is on the checkout overview page
Then the order summery should display product name along with item, total and tax
When user clicks on the finish button
Then the user should be navigated to the checkout complete page