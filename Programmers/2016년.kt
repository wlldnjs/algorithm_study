/**
    https://programmers.co.kr/learn/courses/30/lessons/12901
    합계: 100.0 / 100.0(정확성: 100.0)
*/
class Solution {
    fun solution(month: Int, day: Int): String {
        val date = intArrayOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        val weekand = arrayOf("THU","FRI","SAT","SUN","MON","TUE","WED")
        var totalDate = 0
        
        for(i in 0 .. month -2){
            totalDate += date[i]
        }
        totalDate += day
        
        var answer = weekand[totalDate%7]
        
        return answer
    }
}
