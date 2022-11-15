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

### 4. Three Sum Closest Problem

### 5. Four Sum Problem
