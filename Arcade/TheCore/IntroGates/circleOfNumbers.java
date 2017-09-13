/**Consider integer numbers from 0 to n - 1 written down along the circle in such a way that the distance between any two neighbouring numbers is equal (note that 0 and n - 1 are neighbouring, too).

Given n and firstNumber, find the number which is written in the radially opposite position to firstNumber.

Example

For n = 10 and firstNumber = 2, the output should be
circleOfNumbers(n, firstNumber) = 7.



Input/Output

[time limit] 3000ms (java)
[input] integer n

A positive even integer.

Guaranteed constraints:
4 = n = 20.

[input] integer firstNumber

Guaranteed constraints:
0 = firstNumber = n - 1.

[output] integer**/

int circleOfNumbers(int n, int firstNumber) {
    if((n<4 || n>10) && (n%2!=0) && (firstNumber<0 || firstNumber<(n-1)))
        return 0;
    int temp = firstNumber+((n-2)/2)+1;
    if(temp < n)
        return temp;
    return  firstNumber-((n-2)/2)-1;
}
