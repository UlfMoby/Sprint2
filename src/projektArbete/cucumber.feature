Feature: Test mimicservice app

  Scenario Outline: Learn a new response
  
    Given Environment is up and running
    When  Learn that <request> should answer with <response>
    Then  The Response of <request> should answers with <response>

    Examples: 
      | request             | response |
      | "test"              | "hi!"    |
      | "Does it work?"     | "Yes"    |
      | "2+2"               | "4"      |
      | "4+4"               | "8"      |
      | "5+5"               | "10"     |
      | "10+10"             | "20"     |

  
  
  Scenario: Learn a new response and then unlearn it
  
    Given Environment is up and running
    When  Learn that request test should answer with Yes
    And   Unlearn the request
    Then  The Response of Test should answers with null