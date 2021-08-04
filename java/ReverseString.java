class ReverseString {
    public void reverseString(char[] s) {
        int start = 0;
        int last = s.length - 1;
        while (start < last) { 
            char cStart = s[start]; 
            char cLast = s[last]; 
            s[start] = cLast; 
            s[last] = cStart; 
            start++;
            last--;
        }        
    }
}