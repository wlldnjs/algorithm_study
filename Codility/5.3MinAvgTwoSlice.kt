/**
    https://app.codility.com/programmers/lessons/5-prefix_sums/min_avg_two_slice/
    Task Score: 30%(Correctness: 40%, Performance: 20%)
*/

fun solution(inputArray: IntArray): Int {
    
    var minIndex = 0
    var minValue = Float.MAX_VALUE
    
    for(i in inputArray.indices){
        
        val startValue = inputArray[i]
        var tempValue: Float = startValue.toFloat()
        var divideValue = 2
        for(j in i+1 .. inputArray.size-1){
            if(inputArray[j] <= startValue){
                val temp:Float =  (tempValue + inputArray[j]) / divideValue
                divideValue++
                if(temp < minValue){
                    minValue = temp
                    minIndex = i
                }
            } else {
                if(j == i+1){
                    break
                }
            }
        }
    }
    return minIndex
}
