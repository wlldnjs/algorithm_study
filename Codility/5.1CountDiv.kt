/**
    https://app.codility.com/programmers/lessons/5-prefix_sums/count_div/
    Task Score: 50%(Correctness: 100%, Performance: 0)
*/
fun solution(A: Int, B: Int, K: Int): Int {
    val startIndex = A
    val endIndex = B
    val divider = K
    
    var returnCount = 0
    
    for(i in startIndex .. endIndex){
        if(i.rem(divider) == 0){
            returnCount++
        }
    }
    
    return returnCount
}
