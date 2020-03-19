/**
    https://app.codility.com/programmers/lessons/1-iterations/binary_gap/start/
    Task Score: 100%(Correctness: 100%)
*/
fun solution(N: Int): Int {
    val binaryString = Integer.toBinaryString(N)
    var maxBinaryGap = 0
    var binaryGap = 0
    
    for(idx in binaryString.indices){
        if(binaryString[idx] == '1'){
            if(binaryGap > 0 && binaryGap > maxBinaryGap){
                maxBinaryGap = binaryGap
            }
            binaryGap = 0
        } else { 
            binaryGap++
        }
    }
    
    return maxBinaryGap
}

====================================================================================================

/**
    https://app.codility.com/programmers/lessons/1-iterations/binary_gap/start/
    Task Score: 100%(Correctness: 100%)
*/
import java.util.*  // using Stack

fun solution(N: Int): Int {
    val binary = Integer.toBinaryString(N)
    val stack = Stack<Int>()
    var maxGap = 0
    for(i in binary.indices){
        if(binary[i] == '1'){
            if(stack.size > maxGap){
                maxGap = stack.size
            }
            stack.clear()
        } else {
            stack.push(i)
        }
    }
    
    return maxGap
}
