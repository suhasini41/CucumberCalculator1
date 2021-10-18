Feature: Addition Subtraction Multiplication and Division
@add
Scenario: Addition
Given six numbers to add
|2|4|5|3|7|9|
When added
Then the sum is 30

@sub
Scenario Outline: Subtraction
Given any two <n1> and <n2>
When they are subtracted
Then the difference is <difference>
Examples:
|n1|n2|difference|
|5|2|3|
|8|4|4|
|10|8|2|

@mul
Scenario: Multiplication
Given four numbers to multiply
|2|3|4|5|
When they are multiplied
Then the product is 120

@div
Scenario Outline: Division
Given two numbers <num1> and <num2>
When divided
Then the quotient is <q>
Examples:
|num1|num2|q|
|9|3|3|
|20|4|5|
|24|6|4|





