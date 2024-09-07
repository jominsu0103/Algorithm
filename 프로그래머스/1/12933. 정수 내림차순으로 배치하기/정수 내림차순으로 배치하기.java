import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String number = Long.toString(n);
        
        Character[] digits = new Character[number.length()];
        for (int i = 0; i < number.length(); i++) {
            digits[i] = number.charAt(i);
        }
        
        Arrays.sort(digits, Collections.reverseOrder());
        
        StringBuilder sortedNumber = new StringBuilder(digits.length);
        for (char digit : digits) {
            sortedNumber.append(digit);
        }
        
        return Long.parseLong(sortedNumber.toString());
    }
}