class Solution {
    public String toLowerCase(String s) {
        char c[] = s.toCharArray();
        for(int i = 0; i < c.length; i++)
            c[i] = (int)c[i] > 64 && (int)c[i] < 91 ? (char)((int)c[i] + 32) : c[i];

        return new String(c);
    }
}