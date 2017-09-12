/**Given an array of strings, return another array containing all of its longest strings.

Example

For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
allLongestStrings(inputArray) = ["aba", "vcd", "aba"].

Input/Output

[time limit] 3000ms (java)
[input] array.string inputArray

A non-empty array.

Guaranteed constraints:
1 = inputArray.length = 10,
1 = inputArray[i].length = 10.

[output] array.string

Array of the longest strings, stored in the same order as in the inputArray.**/

String[] allLongestStrings(String[] inputArray) {
    int maxChar = inputArray[0].length();
    String allLongestString = inputArray[0];
    
    for(int i =1; i< inputArray.length; i++){
        if(inputArray[i].length() == maxChar){
            allLongestString = allLongestString + "," + inputArray[i];
            continue;
        }
        if(inputArray[i].length() > maxChar){
            maxChar = inputArray[i].length();
            allLongestString = inputArray[i];
            continue;
        }
    }
    return allLongestString.split(",");
}
