/**
    https://app.codility.com/programmers/lessons/6-sorting/max_product_of_three/
    Task Score: 100%(Correctness: 100%, Performance: 100%)
*/
fun solution(inputArray: IntArray): Int {
    inputArray.sort()
    val minTimesValue = inputArray[0].times(inputArray[1]).times(inputArray[inputArray.size-1])
    val maxTimesValue = inputArray[inputArray.size-3].times(inputArray[inputArray.size-2]).times(inputArray[inputArray.size-1])
    
    return if(minTimesValue > maxTimesValue){minTimesValue} else {maxTimesValue}
}
