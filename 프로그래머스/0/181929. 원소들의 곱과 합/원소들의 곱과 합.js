function solution(num_list) {
    let product = 1;
    let sum = 0;
    var answer = 0;
    for(let num of num_list){
        product *= num;
        sum += num;
    }
    if(product < sum**2){
        answer = 1;
    }else{
        answer = 0;
    }
    return answer;
}