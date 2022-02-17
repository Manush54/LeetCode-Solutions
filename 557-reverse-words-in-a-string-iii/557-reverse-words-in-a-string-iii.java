class Solution {
     public String reverseWords(String s) {
         int n = s.length();
         // Converting the entire string to a character array
         char[] c = s.toCharArray();

         // Looping through entire char array
         for (int i = 0, j = 1; j <= n; j++) {
             // If Whitespace or end of the string found
             if (j == n || c[j] == ' ') {

                 // i -> Start of the word
                 // j -> End of the word
                 reverse(c, i, j-1);

                 // "+1" for leaving the whitespace as it is
                 i = j+1;
             }
         }
         return new String(c);
     }

    private void reverse(char[] c, int low, int high) {
        while (low < high) {
            char temp = c[low];
            c[low++] = c[high];
            c[high--] = temp;
        }
    }
}