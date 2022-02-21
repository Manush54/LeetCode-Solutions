# Logic
​
1. Suppose the first element as major
2. Traverse the array
3. Increment the count till nums[i] equals major
4. If the current element != major, decrement the count.
5. If the count = 0, this implies that the "current element" is the major element.
6. Hence update the major and reset the count
7. Repeat