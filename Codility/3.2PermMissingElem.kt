/**
    https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
    Task Score: 50%(Correctness: 20%, Performance: 80%)
*/
fun solution(A: IntArray): Int {
    val hashSet = A.toHashSet()
    
    for(i in 1 .. hashSet.size){
        if(!hashSet.contains(i)){
            return i
        }
    }
    
    return -1
}
