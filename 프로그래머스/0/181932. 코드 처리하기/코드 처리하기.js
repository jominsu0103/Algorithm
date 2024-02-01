function solution(code) {
    var answer = '';
    let mode = 0;
    let ret = "";
    
    if(code.length === 0) return "EMPTY";
    
    for(let i = 0; i < code.length; i++){
        if(mode === 0) {
            if(code[i] !== "1"){
                if(i%2 ===0){
                    ret += code[i];
                    answer = ret
                }
            }else {
                mode = 1;
            }
        }
        else{
            if(code[i] !== "1"){
                if(i%2 ===1){
                    ret += code[i];
                    answer = ret
                }
            }
            else{
                mode = 0;
            }
        }
    }
    return answer !== "" ? answer : "EMPTY";
}