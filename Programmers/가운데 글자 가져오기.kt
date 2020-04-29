/**
    https://programmers.co.kr/learn/courses/30/lessons/12903
    합계: 100.0 / 100.0(정확성: 100.0)
*/
class Solution {
    fun solution(inputString: String): String {
        var answer = ""
        if(inputString.length%2 == 0){  // 짝수
            answer = inputString.substring(inputString.length/2 -1, inputString.length/2 +1)
        } else{                         // 홀수
            answer = inputString.substring(inputString.length/2, inputString.length/2 +1)
        }
    
        return answer
    }
}
