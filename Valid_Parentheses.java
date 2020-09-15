import java.util.Stack;

// Time Complexity : O(n), length of input string
// Space Complexity : O(n), length of input string
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

/**We push the respective closing bracket into the stack for each opening bracket
 * Whenever a closing bracket is found and it is not on top of the stack, we return false
 * At the end if the stack is not empty, we return false else true
 * **/
public class Valid_Parentheses {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<s.length(); i++){
			char c = s.charAt(i);   //curr character
			//push closing bracket corresponding to open ones 
			if(c == '(')
				stack.push(')');
			else if(c == '{')
				stack.push('}');
			else if(c == '[')
				stack.push(']');
			else if(stack.isEmpty() || stack.pop() != c)
				return false;
		}
		return stack.isEmpty();  // if stack is empty then it is valid
	}
}
