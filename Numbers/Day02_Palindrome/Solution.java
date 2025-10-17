class Solution {
    public boolean isPalindrome(int x) {
        int ori=x,sum=0;
        String ch;
        if(x<0) return false;
        while(x!=0){
        sum=sum*10+x%10;
        x=x/10;
        }
        

        return (ori==sum);
    }
}