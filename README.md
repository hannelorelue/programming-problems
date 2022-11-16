# 100 Java Programming Problems

In this repository I implement 100 Java programming problems from the following set of challenges [100 Must attempt Problems for Coding Interview](https://iq.opengenus.org/100-interview-problems/)

## Array Problems

### 1. Move Negative elements to the front

#### Problem statement:
move the negative elements of an array to the front

#### Example:

Input will be:
```
2 -9 10 12 5 -2 10 -4
```

Output will be:
```
-9 -2 -4 2 10 12 5 10
```

Note:

* The order of negative elements are same.
* The order of positive elements are same.
* All negative elements have been moved to the front.
* All positive elements have been moved to the end or followed by all the negative elements.

Implemented in [MoveNegToFront.java](./src/main/java/luebeck/hannelore/move_neg_to_front/MoveNegToFront.java) additional nodes on how it is implemented e.g. O(n log n) instead of naive O(n)

### 2. Two Sum Problem

#### Problem Statement: 
We are given a list of N elements and a number M. We have to find two elements in the given list whose sum is M.

List = [a1, a2, ... , aN]

So, if the two elements are ai and aj, then:

ai + aj = M

Example:

Given numbers = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1]

### 3. Three Sum Problem

#### Problem Statement: 
Given an array, we need to find if there is a triplet in the array whose sum is equal to a given value. If such a triplet is present, we need to print it and return true. Else, return false.

Example:

Input: arr = [3,4,12,6,2,9] , sum = 24
Output: 3 , 12 , 9
Explanation: The triplet(3,9,12) give us a sum of 24.

### 4. Three Sum Closest Problem
#### Problem Statement: 
Find all triplets close to the given sum.

Example:

Let the array be [7, 12, 3, 1, 2, -6, 5, -8, 6]
Let S = 0

It is possible to find three elements whose sum = 0
Then the output is [[2, -8, 6], [3, 5, -8], [1, -6, 5]]

Example 2:

Let the array be [1, 2, 3, 9, 6]
Let S = 7

It is not possible to find three elements whose sum = 7. But [1, 2, 3] whose sum = 6 is the closest sum and is the output

### 5. Four Sum Problem
