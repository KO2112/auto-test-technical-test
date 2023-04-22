Feature: application must be able to add two matrices.

  Scenario: Adding two 2x2 matrices with positive integers
    Given I have two 2 and 2 metrices with ONLY positive integers
    When I add two matrices together
    Then result should be correct with summed up values

  Scenario:adding 2 2x2 matrices with negative integers
    Given I have two 2 and 2 metrices with ONLY negative integers
    When I add two matrices together
    Then result should be correct with summed up values

    Scenario: adding 2 2x2 matrices with both negative and positive numbers
      Given I have two 2 and 2 metrices with negative and positive integers
      When I add two matrices together
      Then result should be correct with summed up values

  Scenario: adding 2 metrices with different dimensons
    Given I have two 2 and 2 metrices with different dimensons
    Then I add these two together and it should fail

  Scenario: adding 2 4x4 metrices only positive
      Given I have two 4 and 4 metrices with ONLY positive integers
      When I add two matrices together
      Then result should be correct with summed up values

  Scenario: adding 2 4x4 metrices only negative
    Given I have two 4 and 4 metrices with ONLY negative integers
    When I add two matrices together
    Then result should be correct with summed up values

  Scenario: adding 2 4x4 metrices negative and positive
    Given I have two 4 and 4 metrices with negative and positive integers
    When I add two matrices together
    Then result should be correct with summed up values

  Scenario: adding 2 3x2 metrices negative only (different)
      Given I have two 3 and 2 metrices with ONLY negative integers
      When I add two matrices together
      Then result should be correct with summed up values

  Scenario: adding 2 3x2 metrices positive only(different)
    Given I have two 3 and 2 metrices with ONLY positive integers
    When I add two matrices together
    Then result should be correct with summed up values

  Scenario: adding 2 3x2 metrices positive and negative (different)
    Given I have two 3 and 2 metrices with negative and positive integers
    When I add two matrices together
    Then result should be correct with summed up values

  Scenario: adding 2 1x1 metrices
    Given I have two 1 and 1 metrices with negative and positive integers
    When I add two matrices together
    Then result should be correct with summed up values




