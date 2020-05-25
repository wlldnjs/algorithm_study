/**
    https://programmers.co.kr/learn/courses/30/lessons/42588?language=kotlin
    합계: 100.0 / 100.0(정확성: 100.0)
*/
class Solution {
    fun solution(heights: IntArray): IntArray {
        val returns = IntArray(heights.size)
        for(i in heights.indices){
            for(j in i-1 downTo 0){
                if(heights[i] < heights[j]){
                    returns[i] = j+1
                    break
                }
            }
        }
        
        return returns
    }
}
