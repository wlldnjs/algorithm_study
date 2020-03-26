/**
    https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
    Task Score: 61%(Correctness: 71%, Performance: 50%)
*/
import kotlin.math.abs
import java.util.*

fun solution(inputArray: IntArray): Int {
    val deque = ArrayDeque<Int>()

    inputArray.forEach { deque.add(it) }
    var frontSum = deque.pollFirst()
    var endSum = deque.pollLast()
    
    for(i in deque.indices){
	
        if(abs(frontSum) < abs(endSum)){
            frontSum += deque.pollFirst()
        } else {
            endSum += deque.pollLast()
        }
    }

    return abs(frontSum - endSum)
}
