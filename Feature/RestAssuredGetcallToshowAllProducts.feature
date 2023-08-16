Feature: a user should be able to see all products on Medicare


  Scenario: Response should be 200 when user  get respone for all products API
    Given a user is on the landingPage of medicare
    When user click on Login button
    Then login dialog invokes with header value "Login"
    Then user click on email and enter email address as "ankur.signet@gmail.com"
    Then user click on password and enter password as "Surbhi@190112"
    Then user click on a login button
    And user can able to login successfully and reach to medicare home page tile value "Medicare - Home"
    #Then user click on view product tab
    #Then user click on Add to cart medicine view button for paracetmol
    Then user hit this urlOne "http://localhost:8080/medicare/show/all/products" and get response 200


  Scenario: Response should be 200 when user  get respone for category 2 products
    Given a user is on the landingPage of medicare
    When user click on Login button
    Then login dialog invokes with header value "Login"
    Then user click on email and enter email address as "ankur.signet@gmail.com"
    Then user click on password and enter password as "Surbhi@190112"
    Then user click on a login button
    And user can able to login successfully and reach to medicare home page tile value "Medicare - Home"
    Then user click on Analgesics category
    Then user hit this urlTwo "http://localhost:8080/medicare/show/category/2/products" and get response 200
    #When hit this urlTwo "http://localhost:8080/medicare/show/category/2/products" Also validate response contain "Analgesics"







