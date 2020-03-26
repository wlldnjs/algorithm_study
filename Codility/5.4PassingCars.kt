/**
    https://app.codility.com/programmers/lessons/5-prefix_sums/passing_cars/
    Task Score: 100%(Correctness: 100%, Performance: 100%)
*/

import java.util.*

fun solution(inputArray: IntArray): Int {
    val zeroStack = Stack<Int>()
    
    for(i in inputArray.indices){
        if(inputArray[i] == 0){
            zeroStack.push(i+1)
        }
    }
    val totalSize = inputArray.size
    var previousIndexes = 0
    var returnValue = 0
    while(zeroStack.isNotEmpty()){
        val popIndex = zeroStack.pop()
        returnValue = returnValue + totalSize - popIndex - previousIndexes
        previousIndexes++
        if(returnValue > 1000000000){
            return -1
        }
    }
    
    return returnValue
}
