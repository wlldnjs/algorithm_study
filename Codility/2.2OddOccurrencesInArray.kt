/**
    https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
    Task Score: 88%(Correctness: 100%, Performance: 75%)
*/
fun solution(A: IntArray): Int {
    val set = HashSet<Int>()
    for(i in A.indices){
        if(set.contains(A[i])){
            set.remove(A[i])
        } else {
            set.add(A[i])
        }
    }
    return set.first()
}
