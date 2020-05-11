/**
    https://programmers.co.kr/learn/courses/30/lessons/42578
    합계: 100.0 / 100.0(정확성: 100.0)
*/
class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        var clothesMap = HashMap<String, Int>()
        
        for(i in clothes.indices){
            if(clothesMap.containsKey(clothes[i][1])){
                clothesMap[clothes[i][1]] = clothesMap[clothes[i][1]]!!.plus(1)
            } else {
                clothesMap[clothes[i][1]] = 1
            }
        }
        var answer = 1
        for(i in clothesMap.keys){
            answer *= clothesMap[i]!!.plus(1)
        }
    
        return answer.minus(1)
    }
}
