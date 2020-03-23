/**
    https://app.codility.com/programmers/lessons/5-prefix_sums/count_div/
    Task Score: 100%(Correctness: 100%, Performance: 100%)
*/
fun solution(A: Int, B: Int, K: Int): Int {
    val startIndex = A
    val endIndex = B
    val divider = K
    
    var count = 0
    if(startIndex.rem(divider) == 0){
        count++
    }
    
    return endIndex.div(divider).minus(startIndex.div(divider)).plus(count)
}
