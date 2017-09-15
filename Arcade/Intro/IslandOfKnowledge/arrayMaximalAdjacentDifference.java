/**Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.

Example

For inputArray = [2, 4, 1, 0], the output should be
arrayMaximalAdjacentDifference(inputArray) = 3.

Input/Output

[time limit] 3000ms (java)
[input] array.integer inputArray

Guaranteed constraints:
3 = inputArray.length = 10,
-15 = inputArray[i] = 15.

[output] integer

The maximal absolute difference.**/

int arrayMaximalAdjacentDifference(int[] inputArray) {
    int rangeMax = 0;
    for(int i =0; i<inputArray.length-1; i++){
        int temp  = inputArray[i] - inputArray[i+1];
        if(temp < 0 && temp > rangeMax)
            rangeMax = temp*(-1);
        if(temp > rangeMax)
            rangeMax = temp;
    }
    return rangeMax;
}
