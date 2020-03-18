/**
    https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
    Task Score: 77%(Correctness: 100%, Performance: 50%)
*/

fun solution(A: IntArray): Int {
    A.sort()
    val lastIndex = A.size % 2
    for(i in 0 until (A.size - lastIndex) step 2){
        if(A[i] != A[i+1]){
            return A[i]
        }
    }
    return A[A.size - 1]
}
