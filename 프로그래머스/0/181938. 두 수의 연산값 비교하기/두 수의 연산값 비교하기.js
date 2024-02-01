function solution(a, b) {
    const ab = Number(a.toString()+b.toString());
    const gob = 2*a*b;
    if(ab >= gob){
        return ab;
    }else {
        return gob
    }
}