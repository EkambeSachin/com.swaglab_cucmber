Feature:Login Functionality

Scenario:Successful Login with valid credentials

Given User launch the browser
When  User opens URL "https://www.saucedemo.com/"
Then User Should enters the username as "standard_user" and password as "secret_sauce"
And Clicks on Login Button
Then User expect product page and Title "SwagLab"