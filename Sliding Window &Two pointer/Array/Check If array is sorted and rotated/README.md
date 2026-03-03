-Problem Statement:
Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.

There may be duplicates in the original array.

Note: An array A rotated by x positions results in an array B of the same length such that B[i] == A[(i+x) % A.length] for every valid index i.



Approach:
- Initialize a counter count = 0 to track order violations.
- Loop through the array from index 0 to n - 1:
- Compare arr[i] with arr[(i + 1) % n] to handle circular rotation.
- If arr[i] > arr[(i + 1) % n], increment count.
- Decision:
- If count > 1: return false
- if count <1 return true
 
Time Complexity -O(n)
Space Complexity -O(1)
