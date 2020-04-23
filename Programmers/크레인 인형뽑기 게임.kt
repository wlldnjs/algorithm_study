/**
    https://programmers.co.kr/learn/courses/30/lessons/64061?language=kotlin
    합계: 100.0 / 100.0(정확성: 100.0)
*/
import java.util.*

class Solution {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        val topPositions = IntArray(board.size)
        val basketStack = Stack<Int>()
        var popCount = 0
        
        for(i in board.indices){    // topPositions 초기화
            for(j in board.indices){
                if(board[j][i] > 0){
                    topPositions[i] = j
                    break
                }
                if(j == board.size-1){
                    topPositions[i] = board.size
                }
            }
        }
        
        for(i in moves.indices){
            if(topPositions[moves[i]-1] < board.size){    // 크레인이 위치한 곳에 인형이 있을 때
                if(!basketStack.isEmpty() && basketStack.peek() == board[topPositions[moves[i]-1]][moves[i]-1]){    // 바구니에 같은 인형이 있다면
                    basketStack.pop()
                    popCount = popCount+2
                } else{
                    basketStack.push(board[topPositions[moves[i]-1]][moves[i]-1])
                }
                topPositions[moves[i]-1]++
            }
        }
        
        return popCount
    }
}
