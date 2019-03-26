
Feature: Registration feature

Scenario: user is trying to register using invalid set of details

Given User is accessing RegistrationPage on Browser

When user is trying submit data without entering 'User Id'
Then 'User Id should not be empty /length be between 5 to 12' alert message should display

When user is trying submit request without entering 'Password'
Then 'Password should not be empty /length be between 7 to 12' alert message should display

When user is trying submit request without entering 'username'
Then 'Name should not be empty and must contain only alphabet characters only' alert message should display

When user is trying submit request without entering 'address'
Then 'User address must have alphanumeric characters only' alert message should display

When user is trying submit request without entering 'country'
Then 'Select your country from the list' alert message should display

When user is trying submit request without entering 'zipCode'
Then 'Zip code must be numeric only' alert message should display

When user is trying submit request without entering 'email'
Then 'You have entered an invalid email address!' alert message should display

When user is trying submit request without entering 'gender'
Then 'Please select your gender' alert message should display

Scenario: user is trying to register using valid set of details

Given User is accessing RegistrationPage on Browser

When user is trying to submit data
Then 'Your Registration with JobsWorld.com has successfully done plz check your registred email addres to activate your profile' alert message should display