/**
    https://app.codility.com/programmers/lessons/4-counting_elements/max_counters/
    Task Score: 90%(Correctness: 100%, Performance: 80%)
*/

fun solution(N: Int, A: IntArray): IntArray {
    val array = IntArray(N)
    var maxValue = 0
    A.forEach{
        if(it > N){
            array.max()?.let{max ->
                maxValue = max
            }
        } else {
            if(array[it-1] < maxValue){
                array[it-1] = maxValue + 1
            } else {
                array[it-1]++
            }
        }
    }
    for(i in array.indices){
        if(array[i] < maxValue){
            array[i] = maxValue
        }
    }
    return array
}
