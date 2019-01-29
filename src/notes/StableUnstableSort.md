There are stable sorts and unstable sorts.

This comes into play when there are duplicate values in the data being sorted.

Consider the array `[1,2,3,9,9,0]`. The data contains two 9's. 

When we sort this array,  will the original ordering of the two 9's be preserved? Will the nine's still be together, will all data still come before the `0`. Will the positions remain unchanged? If a sort is _unstable_ then the relative ordering of duplicate entries will not be preserved. In an unstable sort, duplicate entries will not maintain their relative position in the array. Conversely for a stable sort, after we sort the relative ordering of duplicate entries is preserved. 

A stable sort is preferable to an unstable sort. If we are sorting objects this might make a difference. For instance, we might want to do a sort within a sort, so sort based on name and then sort based on gender for a discrete array of objects. 

Consider bubble sort, bubble sort is a _stable_ sorting algorithm, when we're comparing adjacent elements we swap them only if the element if `i` is greater than the element of `i+1`. If a sort algorithm isn't stable, our implementation should not change it to an unstable algorithm. 

