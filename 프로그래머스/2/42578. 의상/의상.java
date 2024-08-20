import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String[] cloth : clothes) {
            map.put(cloth[1], map.getOrDefault(cloth[1], 0) + 1);
        }

        int answer = map.values().stream()
                        .map(count -> count + 1)
                        .reduce(1, (a, b) -> a * b);

        return answer - 1;
    }
}