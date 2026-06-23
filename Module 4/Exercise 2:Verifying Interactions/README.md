# Exercise 2 - Verifying Interactions

Objective:
Verify that a method is called on a mock object using Mockito.

Concepts Used:
- mock()
- verify()

Scenario:
A service calls an external API. Mockito verifies that the API method was invoked.

Expected Result:
The test passes if getData() is called exactly once.
