/**
    https://app.codility.com/programmers/lessons/4-counting_elements/max_counters/
    Task Score: 77%(Correctness: 100%, Performance: 60%)
*/

fun solution(N: Int, A: IntArray): IntArray {
    val list = IntArray(N).toMutableList()
    A.forEach{
        if(it > N){
            list.max()?.let{
                list.fill(it)
            }
        } else {
            list[it-1] = list[it-1] + 1
        }
    }
    return list.toIntArray()   
}
