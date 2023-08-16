Feature: a user should be able to login on Mediare

  Scenario: Validate that user and supplier are able to login
   Given a user is on the landingPage of medicare
   When user click on Login button
   Then login dialog invokes with header value "Login"
   Then user click on email and enter email address as "ankur.signet@gmail.com"
   Then user click on password and enter password as "Surbhi@190112"
   Then user click on a login button
   And user can able to login successfully and reach to medicare home page tile value "Medicare - Home"



