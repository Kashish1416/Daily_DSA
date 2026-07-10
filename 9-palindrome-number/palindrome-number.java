class Solution {
    public boolean isPalindrome(int x) {
        int ans = 0;
        int y = x;

        while(x>0){
            int num = x%10;
            ans = ans * 10 + num;
            x = x/10;
        }
    if( ans == y){
        return true;
    }
    return false;
    }
}