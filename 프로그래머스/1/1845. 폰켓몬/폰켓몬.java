import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
       HashSet<Integer> uniquePokemon = new HashSet<>();
        for (int num : nums) {
            uniquePokemon.add(num);
        }
        return Math.min(uniquePokemon.size(), nums.length / 2);
    }
}