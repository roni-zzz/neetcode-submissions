class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        boolean isValid = true;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || 
                s.charAt(i) == '{' || 
                s.charAt(i) == '[') {
                stack.push(s.charAt(i));
                // System.out.println("Pushed: " + s.charAt(i));
            }
            else if (!stack.isEmpty()){ 
                char c = stack.pop();
                // System.out.println("Popped: " + c);
                // System.out.println("Char at i: " + s.charAt(i));
                switch (s.charAt(i)) {
                    case (')'):
                        if (c != '(') {
                            isValid = false;
                            //System.out.println("Is Valid (: " + isValid);
                        }
                        break;
                    case ('}'):
                        if (c != '{') {
                            isValid = false;
                            //System.out.println("Is Valid {: " + isValid);
                        }
                        break; 
                    case (']'):
                        if (c != '[') {
                            isValid = false;
                            //System.out.println("Is Valid [: " + isValid);
                        }
                        break;
                } 
            }
            else 
                return false;
        }
        if (!stack.isEmpty() || !isValid){
            return false;
        }
        else 
            return true;
    }
}
