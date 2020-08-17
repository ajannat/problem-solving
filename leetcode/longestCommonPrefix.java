class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        if(strs.length > 0){
            res = strs[0];
        }
        for(int i = 1; i < strs.length; i++){
            if(strs[i].length() < res.length()){
                res = res.substring(0, strs[i].length());
            }else if(strs[i].length() > res.length()){
                strs[i] = strs[i].substring(0, res.length());
            }
            int j = 0;
            String s = "";
            while(j < res.length() && (res.charAt(j) == strs[i].charAt(j))){
                s+=res.charAt(j);
                j++;
            }
            res = s;
            if(res.equals("")){
                return res;
            }
        }
        return res;
    }
}