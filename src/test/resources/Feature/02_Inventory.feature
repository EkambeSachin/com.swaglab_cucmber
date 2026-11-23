
Feature: Inventory page


Given user is loged into the application with valid credentials 
And and user is redirected to product page 

Scenario:view product details and add single product to cart
When the user click the product "Sauce Labs Bolt T-Shirt"
And after viewing the details user should click on "Add to Cart" button
And shopping count budge will be increased by 1
When  user should click on cart icon
Then  user should be redirected to cart page