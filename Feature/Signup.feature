Feature: a user should be able to Sign up on Medicare


  Scenario: Validate the SignUp as supplier scenario
    Given a user is on the landingPage of medicare
    When User click on Signup
    Then validate sign-up personal page invokes with title "Medicare - Membership"
    Then user click on First name and give value of First name as "Ankur"
    Then user click on Last name and give value of Last name with value "saxena"
    Then user click on Email and give value of Email
    Then user click on ContactNumber name and give value of ContactNumber with value "152345456321"
    Then user click on password and give value of password as "@12345"
    Then user click on ConfirmPassword and give value of ConfirmPassword as "@12345"
    Then user click on Select role as user
    Then user click on next billing button
    Then doingWait
    Then user is on sign up -Address page with header value "Sign Up - Address"
    Then user click on Address Line one and give value of Address Line one as "PrakashNagar"
    Then user click on Address Line two and give value of Address Line two as "Phase-1"
    Then user click on City and give value of City as "Pune"
    Then user click on Postal Code and give value of Postal Code as "414141"
    Then user click on State and give value of State as "Maharashtra"
    Then user click on Country and give value of Country as "India"
    Then user click on next-confirm button
    Then user click on confirm button
    And user is on welcome page with header value "Welcome!"
    And user could able to click on login








