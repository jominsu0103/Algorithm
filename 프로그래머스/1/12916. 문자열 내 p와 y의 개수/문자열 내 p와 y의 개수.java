class Solution {
    boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;
        
        s = s.toLowerCase();
        
        for(char c : s.toCharArray()){
            if(c == 'p'){
                pCount++;
            }else if(c == 'y'){
                yCount++;
            }
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return pCount == yCount;
    }
}