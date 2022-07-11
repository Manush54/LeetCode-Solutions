class Solution {
    public String toLowerCase(String s) {
        char c[] = s.toCharArray();
        for(int i = 0; i < c.length; i++)
            c[i] = c[i] >= 'A' && c[i] <= 'Z' ? (char)(c[i] + 32) : c[i];

        return new String(c);
    }
}