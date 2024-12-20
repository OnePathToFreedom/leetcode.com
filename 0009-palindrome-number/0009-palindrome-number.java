class Solution {
    public boolean isPalindrome(int x) {
        int number = x;
        int reversedNumber = 0; 
        while(number > 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number = number / 10;
        }
        if(reversedNumber == x) return true;
        return false;
    }
}