/**
    https://app.codility.com/programmers/lessons/4-counting_elements/perm_check/
    Task Score: 58%(Correctness: 66%, Performance: 50%)
*/
fun solution(A: IntArray): Int {
    val hashSet = A.toHashSet()
    
    for(i in hashSet.indices){
        if(!hashSet.contains(i+1)){
            return 0
        }
    }
    return 1
}
