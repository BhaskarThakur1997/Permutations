# Problem

You are given a permutation with length n. You want to play a game with you friend, Bob, and the rule will be as follows: 
- You will choose a subarray [l,r] from the permutation. Then, ask Bob to find the maximum element in the rest of the numbers.
  
  
You are given a permutation a contains all numbers 1 to n. And, in q queries, each query has two integers l and r.

For each query, you have to help Bob find the maximum value that does not exist in the subarray[l,r].

**Note:** A permutation is a sequence of integers from 1 to n of length n containing each number exactly once. 
For example, (1), (4, 3, 5, 1, 2), (3, 2, 1) are permutations and (1, 1), (4, 3, 1), (2, 3, 4) are not.

**Input format**

- The first line contains two integers n and q denoting the number of elements and the number of test cases. 
- The second line contains n space-separated integers.
- The next q lines and each line contains two integers l,r.

**Output format**

Print the maximum number that does not exist in the subarray 

**Sample Input**

5 3

2 3 1 5 4

1 2

2 4

2 5

**Sample Output**

5

4

2

**Explanation**

In the sample, we have a permutation  (2, 3, 1, 5, 4)

the first test-case [l,r] = [1,2] so we have to find the maximum number of the array except for the subarray [1,2]

in other words, we have to find the maximum number for the subarray [3,5] which will be 5. 
