/**Given a rectangular matrix of characters, add a border of asterisks(*) to it.

Example

For

picture = ["abc",
           "ded"]
the output should be

addBorder(picture) = ["*****",
                      "*abc*",
                      "*ded*",
                      "*****"]
Input/Output

[time limit] 3000ms (java)
[input] array.string picture

A non-empty array of non-empty equal-length strings.

Guaranteed constraints:
1 = picture.length = 5,
1 = picture[i].length = 5.

[output] array.string

The same matrix of characters, framed with a border of asterisks of width 1.**/

String[] addBorder(String[] picture) {
    String[] strPicture = new String[picture.length+2];
    char[] line = new char[picture[0].length()+2];
    Arrays.fill(line, '*');
    strPicture[0] = new String(line);
    strPicture[strPicture.length-1] = new String(line);
    for(int i =1; i<=strPicture.length-2;i++){
        strPicture[i] = "*" + picture[i-1] +"*";
    }
    return strPicture;
}
