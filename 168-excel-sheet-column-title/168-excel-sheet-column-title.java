class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuffer buff = new StringBuffer();
        
        while(columnNumber > 0){
            buff.append((char)('A'+ --columnNumber % 26));
            columnNumber /= 26;
         }
        return buff.reverse().toString();
    }
}