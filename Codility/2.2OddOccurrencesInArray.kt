/**
    https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
    Task Score: 100%(Correctness: 100%, Performance: 100%)
*/
fun solution(A: IntArray): Int {
    var resultValue = 0
    for(i in A.indices){
        resultValue = resultValue.xor(A[i])
    }
    return resultValue
}
