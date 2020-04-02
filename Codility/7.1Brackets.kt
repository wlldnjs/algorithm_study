/**
    https://app.codility.com/programmers/lessons/7-stacks_and_queues/brackets/
    Task Score: 37%(Correctness: 33%, Performance: 40%)
*/
import java.util.*
fun solution(inputString: String): Int {
    val bracket = Stack<Char>()
    
    for(i in inputString.indices){
        when(inputString[i]){
            '(' -> bracket.push(inputString[i])
            ')' -> if(bracket.peek() == '('){bracket.pop()} else {return 0}
            '{' -> bracket.push(inputString[i])
            '}' -> if(bracket.peek() == '{'){bracket.pop()} else {return 0}
            '[' -> bracket.push(inputString[i])
            ']' -> if(bracket.peek() == '['){bracket.pop()} else {return 0}
        }
    }
    return if(bracket.isEmpty()) 1 else 0
}
