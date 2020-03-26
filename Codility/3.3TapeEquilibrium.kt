/**
    https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
    Task Score: 100%(Correctness: 100%, Performance: 100%)
*/
import kotlin.math.abs

fun solution(A: IntArray): Int {
    var addSum = 0
    for(i in A.indices){
        addSum += A[i]
    }
    
    var frontValue = 0
    
    var returnValue = Integer.MAX_VALUE
    for(i in 0 until A.size-1){
        frontValue += A[i]
        val temp = abs(frontValue - (addSum - frontValue))
        if(temp < returnValue){
            returnValue = temp
        }
    }
    
    return returnValue
}
