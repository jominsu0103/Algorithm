import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> genrePlayCount = new HashMap<>();
        Map<String, List<int[]>> genreSongs = new HashMap<>();
        
        for (int i = 0; i < genres.length; i++) {
            genrePlayCount.put(genres[i], genrePlayCount.getOrDefault(genres[i], 0) + plays[i]);
            genreSongs.computeIfAbsent(genres[i], k -> new ArrayList<>()).add(new int[]{i, plays[i]});
        }
        
        return genrePlayCount.entrySet().stream()
            .sorted((a, b) -> b.getValue() - a.getValue())
            .flatMap(entry -> genreSongs.get(entry.getKey()).stream()
                .sorted((a, b) -> b[1] != a[1] ? b[1] - a[1] : a[0] - b[0])
                .limit(2))
            .mapToInt(song -> song[0])
            .toArray();
    }
}