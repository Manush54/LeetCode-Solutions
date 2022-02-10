# Approach
Using HashMap
1. Initialize Sum, Count = 0;
2. Initialize Hashmap with (0,1) values for those (sum - k) == 0 calculations which are valid subarrays and need to get counted. 
    • E.g. if k = 7 and sum = 7 (at second element for array is : 3, 4, 3, 8) at some iteration.....then sum - k = 0....this 0 will get counted in statement result += preSum.get(sum - k);
3. Run a for loop through all the elements of the array.
4. if the hashset contains (sum - k) add the count of element in "count".
5. put the pair of (sum, sum+1 / 0) in the HashSet
6. Repeat
7. Return Count.
