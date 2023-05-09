# Sliding Window

This set of codes will be a practice section of Leetcode exercises related to the **Sliding Window** technique.

> You may be thinking: there is a while loop inside of the for loop, isn't the time complexity
O(n2)?  
> The reason it is still O(n) is that the while loop can only iterate n times in total for the entire algorithm 
> (left starts at 0, only increases, and never exceeds n). 
> 
> If the while loop were to run n times on one iteration of the for loop, 
> that would mean it wouldn't run at all for all the other iterations of the for loop. 
> 
> This is what we refer to as amortized analysis:
    - even though the worst case for an iteration inside the for loop is O(n), 
> it averages out to O(1) when you consider the entire runtime of the algorithm.