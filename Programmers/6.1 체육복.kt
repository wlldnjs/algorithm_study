/**
    https://programmers.co.kr/learn/courses/30/lessons/42862
    합계: 100.0 / 100.0(정확성: 100.0)
*/
class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        val students = IntArray(n){1}
        
        for(i in lost.indices){
            students[lost[i]-1]--
        }
        
        for(i in reserve.indices){
            students[reserve[i]-1]++
        }
        
        for(i in students.indices){
            if(students[i] < 1){    // 체육복이 없으면
                if(i > 0 && students[i-1] > 1){    // 앞사람 여분 확인
                    students[i-1]--
                    students[i]++
                } else if(i < students.size-1 && students[i+1] > 1){    // 뒷사람 여분 확인
                    students[i+1]--
                    students[i]++
                }
            }
        }
        
        var returnValue = 0
        for(i in students.indices){
            if(students[i] > 0){
                returnValue++
            }
        }
        
        return returnValue
    }
}
