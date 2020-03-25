/**
    https://app.codility.com/programmers/lessons/4-counting_elements/perm_check/
    Task Score: 100%(Correctness: 100%, Performance: 100%)
*/
fun solution(array: IntArray): Int {
    array.sort()
    for(i in array.indices){
        if(array[i] != i+1){
            return 0
        }
    }
    return 1
}
