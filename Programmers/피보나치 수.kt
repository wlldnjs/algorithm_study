/**
    https://programmers.co.kr/learn/courses/30/lessons/12945?language=kotlin
    합계: 100.0 / 100.0(정확성: 100.0)
*/
class Solution {
    fun solution(n: Int): Int {
        return fibo(0, 1, 1, n).rem(1234567)
    }
    
    fun fibo(preNum: Int, num: Int ,count: Int, dest: Int): Int{
        return if(count != dest) {
            fibo(num.rem(1234567), preNum.rem(1234567).plus(num.rem(1234567)), count+1, dest)
        } else {
            num
        }
    }
}
