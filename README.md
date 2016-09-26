# 360 auth popup UI tests

This is an example project with ui tests based on [Serenity](http://thucydides.info/docs/serenity-staging/) framework. The following software should be installed:

 * JDK
 * maven
 * chromedriver
 * Chrome browser

Clone the repository, open project folder and run the command:

```
mvn clean integration-test serenity:aggregate
```

The test run will generate HTML-report locally. You can see previously generated report [here](http://live-on.ru/serenity/index.html)

The approach here is to create some sort of checklist with test-cases before test automation. Each test has a unique set of steps. While these steps are used for report generating by Serenity they could also be used for populating test case management service with explicit scenarios via API integration. 

## Example test cases set

### Sign up
* User with acceptable email and password should be able to sign up
* User with acceptable email and password should be able to sign up after unsuccessful submitting
* Signing up user with empty email should return validation error
* Signing up user with invalid email should return validation error
* Signing up user with too short password should return validation error
* Signing up user with wrong confirmation password should return validation error
* User should be able to sign up with the shortest email
* User should be able to sign up with the longest email
* User should be able to sign up with the shortest password
* User should be able to sign up with the longest password
* Existing user should not be able to sign up twice with the same email
* Existing user should not be able to sign up twice with only character case difference in email 

### Sign in
* Existing user should be able to sign in with email and password
* Existing user should not be able to sign in without password

### Password restoring 
* Existing user should be able to restore password
* Nonexistent user should receive error on restoring password

### Miscellaneous
* User should be able to close popup auth form by clicking cross icon
* User should be able to close popup auth form by clicking outside
* Cancel button should close auth form and show social buttons
* User should be able to fill and submit auth form using keyboard keys
* Sign up and cancel buttons should be disabled after form submission

## Worth to check 
* User should not be able to use special chars in email
* Inputs which are too long should be validated

## FYI

* JavaScript error occurs on submitting auth form with inputs which length is more accepted by encryption functions. This breaks script flow and user has to reload landing page in order to proceed http://take.ms/IDILP
* Cancel button should be disabled after form submission
