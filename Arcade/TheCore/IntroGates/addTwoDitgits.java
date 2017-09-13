/**You are given a two-digit integer n. Return the sum of its digits.

Example

For n = 29, the output should be
addTwoDigits(n) = 11.

Input/Output

[time limit] 3000ms (java)
[input] integer n

A positive two-digit integer.

Guaranteed constraints:
10 = n = 99.

[output] integer

The sum of the first and second digits of the input number.**/

int addTwoDigits(int n) {
    return (n/10)+(n%10);
}
