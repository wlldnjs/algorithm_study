/**
    https://programmers.co.kr/learn/courses/30/lessons/42748?language=kotlin
    합계: 100.0 / 100.0(정확성: 100.0)
*/
class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        
        val returnArray = IntArray(commands.size)
        for(i in commands.indices){
            val partialIntArray = array.copyOfRange(commands[i][0]-1, commands[i][1])
            partialIntArray.sort()
            returnArray[i] = partialIntArray[commands[i][2]-1]
        }
        
        return returnArray
    }
}
