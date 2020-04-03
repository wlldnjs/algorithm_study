/**
    https://app.codility.com/programmers/lessons/7-stacks_and_queues/brackets/
    Task Score: 100%(Correctness: 100%, Performance: 100%)
*/
import java.util.*

fun solution(inputString: String): Int {
    val smallBracket = 1
    val mediumBracket = 2
    val largeBracket = 3
    
    val stack = Stack<Int>()
    
    fun checkPeek(bracket: Int): Boolean{
        if(stack.isNotEmpty() && stack.peek() == bracket){
            stack.pop()
            return true
        }
        return false
    }
    
    for(i in inputString.indices){
        when(inputString[i]){
            '(' -> stack.push(smallBracket)
            '{' -> stack.push(mediumBracket)
            '[' -> stack.push(largeBracket)
            ')' -> if(!checkPeek(smallBracket)) return 0
            '}' -> if(!checkPeek(mediumBracket)) return 0
            ']' -> if(!checkPeek(largeBracket)) return 0
        }
    }
    
    return if(stack.isEmpty()) 1 else 0
}
