class Solution {
    public int solution(String[][] board, int h, int w) {
        int n = board.length;
        int count = 0;
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};
        String targetColor = board[h][w];

        for (int i = 0; i < 4; i++) {
            int h_check = h + dh[i];
            int w_check = w + dw[i];

            if (h_check >= 0 && h_check < n && w_check >= 0 && w_check < n) {
                if (board[h_check][w_check].equals(targetColor)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[][] board1 = {
            {"blue", "red", "orange", "red"},
            {"red", "red", "blue", "orange"},
            {"blue", "orange", "red", "red"},
            {"orange", "orange", "red", "blue"}
        };
        System.out.println(sol.solution(board1, 1, 1)); // 2

        String[][] board2 = {
            {"yellow", "green", "blue"},
            {"blue", "green", "yellow"},
            {"yellow", "blue", "blue"}
        };
        System.out.println(sol.solution(board2, 0, 1)); // 1
    }
}