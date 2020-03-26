/**
    https://app.codility.com/programmers/lessons/4-counting_elements/max_counters/
    Task Score: 100%(Correctness: 100%, Performance: 100%)
*/

fun solution(count: Int, inputArray: IntArray): IntArray {
    var returnArray = IntArray(count)
    var maxCounter = 0
    var maxValue = 0
    
    for(i in inputArray.indices){
        if(inputArray[i] <= count){
            if(returnArray[inputArray[i]-1] < maxCounter){
                returnArray[inputArray[i]-1] = maxCounter
            }
            returnArray[inputArray[i]-1]++
            if(maxValue < returnArray[inputArray[i]-1]){
                maxValue = returnArray[inputArray[i]-1]
            }
        } else {
            maxCounter = maxValue
        }
    }
    
    for(i in returnArray.indices){
        if(returnArray[i] < maxCounter){
            returnArray[i] = maxCounter
        }
    }
    
    return returnArray
}
