class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stackPar = new Stack<>();  
        for (int i = 0; i < s.length(); i++) {
            char parth = s.charAt(i); 
            if (parth == '(' || parth == '{' || parth == '[') {
                stackPar.push(parth);
            } else if (stackPar.size() == 0) {
                return false;
            } else {
                Character lastPar = stackPar.pop(); 
                switch (lastPar) {
                    case '(': if (parth != ')') return false;
                            break;
                    case '{': if (parth != '}') return false;
                            break;
                    case '[': if (parth != ']') return false;
                            break;
                }
            }
        }
        
        return stackPar.size() == 0;
    }
}