# 360 sign up/in UI tests

This is an example project with ui tests based on [Serenity](http://thucydides.info/docs/serenity-staging/) framework. To execute tests the following software should be installed:

 * JDK
 * maven
 * chromedriver
 * Chrome browser

```
mvn clean integration-test serenity:aggregate
```

My approach is to create some sort of checklist with test-cases before test automation. Each test has a unique set of steps. While these steps are used for report generating they could also be used for populating test case management service with explicit scenarios via integration. 

## Test cases

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