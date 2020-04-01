/**
    https://app.codility.com/programmers/lessons/6-sorting/number_of_disc_intersections/
    Task Score: 75%(Correctness: 87%, Performance: 62%)
*/
fun solution(inputArray: IntArray): Int {
    val leftPointArray = IntArray(inputArray.size)
    val rightPointArray = IntArray(inputArray.size)
    
    var intersectionCount = 0
    
    for(i in inputArray.indices){
        leftPointArray[i] = if(i.minus(inputArray[i]) > 0){i.minus(inputArray[i])} else {0}
        rightPointArray[i] = if(i.plus(inputArray[i]) > Integer.MAX_VALUE){Integer.MAX_VALUE} else {i.plus(inputArray[i])}
    }
    
    for(i in inputArray.indices){
        for(j in i+1 until inputArray.size){
            if(rightPointArray[i] >= leftPointArray[j]){
                intersectionCount++
            }
        }
    }
    
    return intersectionCount
}
