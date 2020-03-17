/**
    https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
    Task Score: 87%(Correctness: 87%)
*/
fun solution(A: IntArray, K: Int): IntArray {
    val arraySize = A.size
    val rotationCount = K % arraySize
    var returnArray = IntArray(arraySize)
    
    for(i in A.indices){
        returnArray[(i+rotationCount) % arraySize] = A[i]
    }
    
    return returnArray
}