
Feature: Swag Labs your Cart Page

Given user is loged into the application cart

Scenario:user varifies the product and proceed to checkout
Given the user is on your cart page
Then the product "Sauce Labs Bolt T-Shirt" should be displayed in the cart
When the user clicks on the checkout button
Then user should redirected to the checkout information page