class Solution {
    public String solution(String s) {
        String[] nums = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (String num : nums) {
            int number = Integer.parseInt(num);
            min = Math.min(min, number);
            max = Math.max(max, number);
        }
        
        String answer = min + " " + max;
        return answer;
    }
}