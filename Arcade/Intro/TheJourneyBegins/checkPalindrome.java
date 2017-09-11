/**Given the string, check if it is a palindrome.

Example

For inputString = "aabaa", the output should be
checkPalindrome(inputString) = true;
For inputString = "abac", the output should be
checkPalindrome(inputString) = false;
For inputString = "a", the output should be
checkPalindrome(inputString) = true.
Input/Output

[time limit] 3000ms (java)
[input] string inputString

A non-empty string consisting of lowercase characters.

Guaranteed constraints:
1 = inputString.length = 105.

[output] boolean

true if inputString is a palindrome, false otherwise.**/

boolean checkPalindrome(String inputString) {
    StringBuffer a = new StringBuffer(inputString);
    StringBuffer b = new StringBuffer(inputString);
    b.reverse();
    return a.toString().equals(b.toString());
}
