Feature: test with multiple data set
Scenario Outline: data driven test
Given open a url
When data "<username>"  "<password>"
Then I verify the in step

Examples:
    | username  |password| 
    | anil |  5   | 
    | reddy |  7   |
