# Logic
Similar to Binary Search
* • If the middle version is bad(isBadVersion() = true), then definitely all the versions after it will be Bad.
* • Hence, bring the "high" to mid (high=mid-1)
* • Else low = mid+1 (if the middle version is Good then definietly all the versions before it will be Good)
* Return "low"
​
## Take mid = start+ (end-start)/2 to reduce complexity