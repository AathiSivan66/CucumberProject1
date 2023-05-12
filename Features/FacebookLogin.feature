Feature: Validating the facebook login feature

@unit
Scenario: Verfiying the login feature by using invalid username and password
Given Launch the browser
And Load the facebook Url
When Provide the invalid username and invalid password 
And Click the login button 
Then Verify the Error message 



