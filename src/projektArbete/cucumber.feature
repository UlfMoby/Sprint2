Feature: Test mimicservice app

  Scenario Outline: Learn a new response
  
    Given Environment is up and running
    When  Learn that <request> should answer with <response>
    Then The Response of <request> should answers with <response>

    Examples: 
      | request             | response |
      | "test"              | "hi!"    |
      | "Does it work?"     | "Yes"    |
      | "2+2"               | "4"      |