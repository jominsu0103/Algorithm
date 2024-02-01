function solution(num_list) {
    let odd = "";
    let even = "";
    var answer = 0;
    for(let num of num_list){
        if(num % 2 === 0){
            even += num.toString();
        }else{
            odd += num.toString();
        }
    }
    answer = Number(odd)+Number(even);
    return answer;
}