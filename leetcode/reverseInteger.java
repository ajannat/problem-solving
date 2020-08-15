class Solution {
    public int reverse(int x) {
        boolean b = false;
        if(x < 0){
            x = x*(-1);
            b = true;
        }
        String s = ""+x;
        s.replaceFirst("^0+(?!$)", "");
        s = new StringBuilder(s).reverse().toString();
        int ml = 1;
        x = 0;
        for(int i = s.length()-1; i >= 0; i--){
            int num = (int)s.charAt(i)-48;
            x+=(num*ml);
            ml*=10;
        }
        if(s.length() > 10){
            return 0;
        }
        String s2 = ""+x;
        if(s.length() == 10 && !s.equals(s2)){
            return 0;
        }
        if(b){
            x = x * (-1);
        }
        return x;
    }
}