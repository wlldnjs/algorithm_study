/**
    https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
    Task Score: 100%(Correctness: 100%)
*/
fun solution(A: IntArray, K: Int): IntArray {
    if(A.size != 0){
        val rotationCount = K % A.size
        var returnArray = IntArray(A.size)
        for(i in A.indices){
            returnArray[(i+rotationCount) % A.size] = A[i]
        }
        return returnArray
    } else {
        return A
    }
}
