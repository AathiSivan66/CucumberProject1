Feature: Verify the orange HRM web application login page

@Smoke
  Scenario Outline: Validating the login functionality by providing multiple inputs
    Given launch the GC browser
    And load the URL
    When provide the <username> and <password> in the respective textboxes
    And click the login button
    Then logout the application

    Examples: 
      | username | password   |
      | Admin    | admin123   |
      | Apple    | Cat3245326 |
      | DAvid    | Parrot123  |
      | Star     | Hello25637 |
      | GVaskar  | Vscoh      |
