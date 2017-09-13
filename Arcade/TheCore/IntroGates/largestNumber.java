/**Given an integer n, return the largest number that contains exactly n digits.

Example

For n = 2, the output should be
largestNumber(n) = 99.

Input/Output

[time limit] 3000ms (java)
[input] integer n

Guaranteed constraints:
1 = n = 7.

[output] integer

The largest integer of length n.**/

int largestNumber(int n) {
    return (int)Math.pow(10, n) -1;
}
