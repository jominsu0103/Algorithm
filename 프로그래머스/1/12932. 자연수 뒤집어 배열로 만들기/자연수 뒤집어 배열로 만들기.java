class Solution {
    public int[] solution(long n) {
        String number = Long.toString(n);

        int[] answer = new int[number.length()];
        
        for (int i = 0; i < number.length(); i++) {
            answer[i] = Character.getNumericValue(number.charAt(number.length() - 1 - i));
        }
        
        return answer;
    }
}