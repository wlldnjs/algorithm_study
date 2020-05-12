/**
    https://programmers.co.kr/learn/courses/30/lessons/12918?language=kotlin
    합계: 100.0 / 100.0(정확성: 100.0)
*/
class Solution {
    fun solution(input: String): Boolean {
        if(input.length != 4 && input.length != 6){
            return false
        }
        
        val unicode_0 = 48
        val unicode_9 = 57
            
        for(i in input.indices){
            val charToInt = input[i].toInt()
            if(charToInt > unicode_9 || charToInt < unicode_0){
                return false
            }
        }
        return true
    }
}
