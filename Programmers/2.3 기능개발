/**
    https://programmers.co.kr/learn/courses/30/lessons/42586?language=kotlin
    합계: 100.0 / 100.0(정확성: 100.0)
*/
import java.util.*;

class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        var distributeIndex = 0
        val returnArray = ArrayList<Int>()
        
        while(distributeIndex < progresses.size){
            // 진행률 증가
            for(i in distributeIndex until progresses.size){
                if(progresses[i] < 100){
                    progresses[i] += speeds[i]
                }
            }
            
            // 배포 가능 수 체크
            var distributeCount = 0
            for(i in distributeIndex until progresses.size){
                if(progresses[i] >= 100){
                    distributeIndex++
                    distributeCount++
                } else {
                    break
                }
            }
            if(distributeCount > 0){
                returnArray.add(distributeCount)   
            }
        }
        return returnArray.toIntArray()
    }
}
