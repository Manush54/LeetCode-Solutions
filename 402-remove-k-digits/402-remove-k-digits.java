// class Solution {
//     public String removeKdigits(String num, int k) {
//         // Base Case
//         if(num.length() == k) return "0";
        
//         // Initializing "min"
//         int min = Integer.parseInt(num.replaceFirst(num.substring(0,k), ""));
//         // System.out.println("Min: "+min);
        
//         // Traversing all the possible cases
//         for(int i = 0; i <= num.length() - k; i++){
            
//             int current = Integer.parseInt(num.replaceFirst(num.substring(i,i+k), ""));
//             // System.out.println("Current: "+ current);
            
//             if(current < min){
//                 min = current;
//                 // System.out.println("Min Changed: "+ min);
//             }
//         }
//         return Integer.toString(min);
//     }
// }
public class Solution {
    public String removeKdigits(String num, int k) {
        int len = num.length();
        //corner case
        if(k==len)        
            return "0";
            
        Stack<Character> stack = new Stack<>();
        int i =0;
        while(i<num.length()){
            //whenever meet a digit which is less than the previous digit, discard the previous one
            while(k>0 && !stack.isEmpty() && stack.peek()>num.charAt(i)){
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
            i++;
        }
        
        // corner case like "1111"
        while(k>0){
            stack.pop();
            k--;            
        }
        
        //construct the number from the stack
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty())
            sb.append(stack.pop());
        sb.reverse();
        
        //remove all the 0 at the head
        while(sb.length()>1 && sb.charAt(0)=='0')
            sb.deleteCharAt(0);
        return sb.toString();
    }
}