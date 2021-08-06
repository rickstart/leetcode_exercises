class RomanInteger {
    public int romanToInt(String s) {
        int prev = 0; //0
        int ans = 0; //1994
        for (int i = 0; i < s.length(); i++) {
           int crtNum = romanToInt(s.charAt(i));//v
            if (prev != 0 && crtNum > prev) {                
                ans += (crtNum - prev);
                prev = 0;                                
            } else { 
                ans += prev;
                prev = crtNum;                       
            }                        
        }
        
        return ans + prev;
    }
    
    public int romanToInt(char roman) {
        switch (roman) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        
        return 0;
    }
}