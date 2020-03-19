/**
    https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/
    Task Score: 100%(Correctness: 100%, Performance: 100%)
*/
fun solution(A: IntArray): Int {
    val set = A.toHashSet()
    
    for(i in 1 .. set.size+1){
        if(!set.contains(i)){
            return i
        }
    }
    return -1
}
