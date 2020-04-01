/**
    https://app.codility.com/programmers/lessons/6-sorting/triangle/
    Task Score: 100%(Correctness: 100%, Performance: 100%)
*/
fun solution(inputArray: IntArray): Int {
    val isExist = 1
    val isNotExist = 0
    
    if(inputArray.size < 3){
        return isNotExist
    } else {
        inputArray.sort()
        for(i in inputArray.size-1 downTo 2 step 1){
            if(inputArray[i].minus(inputArray[i-1])  < inputArray[i-2]){
                return isExist
            }
        }
        return isNotExist
    }
}
