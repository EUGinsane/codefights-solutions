/**Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.

Given a ticket number n, determine if it's lucky or not.

Example

For n = 1230, the output should be
isLucky(n) = true;
For n = 239017, the output should be
isLucky(n) = false.
Input/Output

[time limit] 3000ms (java)
[input] integer n

A ticket number represented as a positive integer with an even number of digits.

Guaranteed constraints:
10 = n < 106.

[output] boolean

true if n is a lucky ticket number, false otherwise.**/

boolean isLucky(int n) {
    String temp = n+"";
    int sum = 0;
    for(int i =0; i<temp.length()/2; i++){
        sum += (temp.charAt(i)-temp.charAt(temp.length()-1-i));
    }
    return sum==0;
}
