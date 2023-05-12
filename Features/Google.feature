Feature: Chceking functionlaity of search text box in Google web application

Background:
Given launch the desired browser
And provide the google url 

@Smoke
Scenario: Validating the search option in google web application by providing Laptop as input


When provide input as laptop in search text box and press enter
And Take the screenshot
Then verify the results


Scenario: Validating the search option in google web application by providing Watch as input
 
When provide input as watch in search text box and press enter
And Take the screenshot
Then verify the results


Scenario: Validating the search option in google web application by providing Shoes as input

When provide input as Shoes in search text box and press enter
And Take the screenshot
Then verify the results

