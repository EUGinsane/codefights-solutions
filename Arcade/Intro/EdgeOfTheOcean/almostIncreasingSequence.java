/**Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence by removing no more than one element from the array.

Example

For sequence = [1, 3, 2, 1], the output should be
almostIncreasingSequence(sequence) = false;

There is no one element in this array that can be removed in order to get a strictly increasing sequence.

For sequence = [1, 3, 2], the output should be
almostIncreasingSequence(sequence) = true.

You can remove 3 from the array to get the strictly increasing sequence [1, 2]. Alternately, you can remove 2 to get the strictly increasing sequence [1, 3].

Input/Output

[time limit] 3000ms (java)
[input] array.integer sequence

Guaranteed constraints:
2 = sequence.length = 105,
-105 = sequence[i] = 105.

[output] boolean

Return true if it is possible to remove one element from the array in order to get a strictly increasing sequence, otherwise return false.**/

boolean almostIncreasingSequence(int[] sequence) {
    int left =0;
    int right = sequence.length -1;
    
    while(left <right){
        if(sequence[left]>=sequence[left+1])
            break;
        left++;
    }
    
    if(left==right)
        return true;
    
    while(right>0){
        if(sequence[right-1]>=sequence[right])
            break;
        right--;
    }
    
    return left+1 == right && 
        ( right==sequence.length-1 
         || sequence[left] <sequence[right+1] 
         || left == 0 
         || sequence[left-1] < sequence[right]);
}