/**
    https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
    Task Score: 46%(Correctness: 57%, Performance: 33%)
*/
import kotlin.math.abs
import java.util.*

fun solution(inputArray: IntArray): Int {
    val deque = ArrayDeque<Int>()

    inputArray.forEach { deque.add(it) }
    var frontSum = deque.pollFirst()
    var endSum = deque.pollLast()
    
    for(i in deque.indices){
        if(frontSum < endSum){
            frontSum += deque.pollFirst()
        } else {
            endSum += deque.pollLast()
        }
    }

    return abs(frontSum - endSum)
}
