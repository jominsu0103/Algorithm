function solution(arr, queries) {
    var answer = [];
    for(let query of queries){
        const [s,e,k] = query;
        let minValue = Infinity;
        for(let i = s; i<=e; i++ ){
            if (arr[i] > k && arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        answer.push(minValue === Infinity? -1 : minValue)
    }
    return answer;
}