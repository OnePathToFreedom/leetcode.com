class Solution {
    public boolean isPalindrome(int x) {
        int original_number = x;
        int reversed_number = 0;
        while(original_number > 0) {
            reversed_number = reversed_number * 10 + original_number % 10;
            original_number /= 10;
        }
        return reversed_number == x;
    }
}