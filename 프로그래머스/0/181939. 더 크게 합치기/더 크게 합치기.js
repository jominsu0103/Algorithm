function solution(a, b) {
    const ab = Number(a.toString()+b.toString());
    const ba = Number(b.toString()+a.toString());
    
    if(ab >= ba) {
        return ab;
    }else{
        return ba;
    }
}