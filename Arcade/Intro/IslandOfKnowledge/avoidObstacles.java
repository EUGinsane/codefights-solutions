/**You are given an array of integers representing coordinates of obstacles situated on a straight line.

Assume that you are jumping from the point with coordinate 0 to the right. You are allowed only to make jumps of the same length represented by some integer.

Find the minimal length of the jump enough to avoid all the obstacles.

Example

For inputArray = [5, 3, 6, 7, 9], the output should be
avoidObstacles(inputArray) = 4.

Check out the image below for better understanding:



Input/Output

[time limit] 3000ms (java)
[input] array.integer inputArray

Non-empty array of positive integers.

Guaranteed constraints:
2 = inputArray.length = 10,
1 = inputArray[i] = 40.

[output] integer

The desired length.**/

int avoidObstacles(int[] inputArray) {
    Arrays.sort(inputArray);
    int step = 2;
    int position = 0;
    int index =0;
    while(true){
        for(;index<inputArray.length;){
            if(position<inputArray[index]){
                position+=step;
                continue;
            }
            if(position == inputArray[index]){
                position = 0;
                step++;
                index =0;
            }else{
                index++;
            }
        }
        if(index> inputArray.length-1)
            break;
    }
    return step;
}
