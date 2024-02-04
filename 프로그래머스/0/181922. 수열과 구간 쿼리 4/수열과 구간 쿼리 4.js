function solution(arr, queries) {
    var answer = [...arr];
    for (const [start, end, k] of queries) {
        for (let i = start; i <= end; i++) {
            if (i % k === 0) {
                answer[i]++;
            }
        }
    }
    return answer;
}