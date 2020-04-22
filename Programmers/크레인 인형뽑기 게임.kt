/**
    https://programmers.co.kr/learn/courses/30/lessons/64061?language=kotlin
    합계: 90.9 / 100.0(정확성: 90.9)
*/

import java.util.*

class Solution {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        val maxIndex = board.size-1
        
        val basketStack = Stack<Int>()
        var popCount = 0
        
        val topPositions = IntArray(board.size)
        for(i in board.indices){        
            for(j in board.indices){
                if(board[j][i] > 0){
                    topPositions[i] = j
                    break
                }
                if(j == board.size-1){  // 인형이 없으면
                    topPositions[i] = board.size-1
                }
            }
        }
        
        for(i in moves.indices){
            if(!basketStack.empty() && basketStack.peek() == board[topPositions[moves[i]-1]][moves[i]-1]){
                basketStack.pop()
                popCount = popCount + 2
            } else{
                basketStack.push(board[topPositions[moves[i]-1]][moves[i]-1])
            }
            if(topPositions[moves[i]-1] < board.size-1){
                topPositions[moves[i]-1]++
            }
        }    
        return popCount
    }
}
