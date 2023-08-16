Feature: a user should be able to Add items from Medicare


  Scenario: Validate that after login user is able to add items one item into the cart
    Given a user is on the landingPage of medicare
    When user click on Login button
    Then login dialog invokes with header value "Login"
    Then user click on email and enter email address as "ankur.signet@gmail.com"
    Then user click on password and enter password as "Surbhi@190112"
    Then user click on a login button
    And user can able to login successfully and reach to medicare home page tile value "Medicare - Home"
    Then user click on view product tab
    Then user click on Add to cart medicine view button for paracetmol
    Then doingWait





  Scenario: Validate that after login user is able to add multiple items into the cart
    Given a user is on the landingPage of medicare
    When user click on Login button
    Then login dialog invokes with header value "Login"
    Then user click on email and enter email address as "ankur.signet@gmail.com"
    Then user click on password and enter password as "Surbhi@190112"
    Then user click on a login button
    And user can able to login successfully and reach to medicare home page tile value "Medicare - Home"
    Then user click on view product tab
    Then user click on Add to cart medicine view button for paracetmol
    Then user click on view product tab
    Then user click on Add to cart medicine view button for Combiflame
    Then user click on view product tab
    Then user click on Add to cart medicine view button for Diclofenac
    Then doingWait

