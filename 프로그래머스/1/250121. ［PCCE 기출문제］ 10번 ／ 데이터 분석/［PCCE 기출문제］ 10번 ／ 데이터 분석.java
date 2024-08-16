import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int extIndex = getIndex(ext);
        int sortByIndex = getIndex(sort_by);

        List<int[]> filteredData = new ArrayList<>();

        for (int[] row : data) {
            if (row[extIndex] < val_ext) {
                filteredData.add(row);
            }
        }

        filteredData.sort(Comparator.comparingInt(o -> o[sortByIndex]));

        int[][] answer = new int[filteredData.size()][];
        for (int i = 0; i < filteredData.size(); i++) {
            answer[i] = filteredData.get(i);
        }

        return answer;
    }

    private int getIndex(String key) {
        switch (key) {
            case "code":
                return 0;
            case "date":
                return 1;
            case "maximum":
                return 2;
            case "remain":
                return 3;
            default:
                throw new IllegalArgumentException("Invalid key: " + key);
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] data = {
            {1, 20300104, 100, 80},
            {2, 20300804, 847, 37},
            {3, 20300401, 10, 8}
        };
        String ext = "date";
        int val_ext = 20300501;
        String sort_by = "remain";
        int[][] result = sol.solution(data, ext, val_ext, sort_by);
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}