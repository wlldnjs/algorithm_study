/**
    https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
    Task Score: 100%(Correctness: 100%, Performance: 100%)
*/
fun solution(array: IntArray): Int {
    array.sort()
    
    for(i in array.indices){
        if(i+1 != array[i]){
            return i+1
        }
    }
    return array.size + 1
}
