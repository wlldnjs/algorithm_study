/**
    https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
    Task Score: 100%(Correctness: 100%, Performance: 100%)
*/
fun solution(X: Int, Y: Int, D: Int): Int {
    val distance = Y.minus(X)
    return if(distance.rem(D) != 0){distance.div(D).plus(1)} else{distance.div(D)}
}
