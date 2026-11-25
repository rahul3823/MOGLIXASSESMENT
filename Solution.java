import java.util.Stack;
import java.util.Scanner;
class Solution {
    public static int maxLength(String s) {
        Stack <Integer> stack = new Stack<>();
        int maxLen = 0;
        stack.push(-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            }
            else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                    
                }
                else{
                    maxLen = Math.max(maxLen,i-stack.peek());
                }
            }
            
        }
        return maxLen;
        
    }
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	int ans = maxLength(s);
	System.out.println(ans);
    }
}
