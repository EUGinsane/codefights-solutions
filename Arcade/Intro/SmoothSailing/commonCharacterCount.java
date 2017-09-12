/**Given two strings, find the number of common characters between them.

Example

For s1 = "aabcc" and s2 = "adcaa", the output should be
commonCharacterCount(s1, s2) = 3.

Strings have 3 common characters - 2 "a"s and 1 "c".

Input/Output

[time limit] 3000ms (java)
[input] string s1

A string consisting of lowercase latin letters a-z.

Guaranteed constraints:
1 = s1.length = 15.

[input] string s2

A string consisting of lowercase latin letters a-z.

Guaranteed constraints:
1 = s2.length = 15.

[output] integer**/

int commonCharacterCount(String s1, String s2) {
    StringBuffer tempS1 = new StringBuffer(s1);
    StringBuffer tempS2 = new StringBuffer(s2);
    int count = 0;
        for(int i =0; i<tempS1.length(); i++){
            for(int j =0; j<tempS2.length(); j++){
                if(tempS1.charAt(i) == tempS2.charAt(j)){
                    count++;
                    tempS2.deleteCharAt(j);
                    break;
                }
            }
        }
    return count;

}
