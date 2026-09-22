class Solution {
    public String largestOddNumber(String num) {
        int n =  num.length()-1;
        int i=0;
        for( i=n;i>=0;i--){
            int x= (int) num.charAt(i);
            if(x % 2 ==0){
                continue;
            }else{
                break;
                
            }

        }
                return num.substring(0,(i+1));
        
    }
}