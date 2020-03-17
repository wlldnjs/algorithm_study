/**
    https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
    Task Score: 66%(Correctness: 100%, Performance: 25%)
*/

fun solution(A: IntArray): Int {
    val list = A.toMutableList()
    list.sort()
    
    val lastCount = list.size.rem(2)
    for(i in 0 until list.size - lastCount step 2){
        if(list[i] != list[i+1]){
            return list[i]
        }
    }
    return list[list.size -1]
}