function solution(arr, queries) {
    var answer = [];
    for(let query of queries){
        const [i,j] = query
        const temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    answer = arr
    return answer;
}