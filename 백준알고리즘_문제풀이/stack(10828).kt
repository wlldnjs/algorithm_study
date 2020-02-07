/**
 * 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 * https://www.acmicpc.net/problem/10828
 */

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

val EMPTY_VALUE = 0
val INVALID_VALUE = -1

val PUSH = "push"
val POP = "pop"
val SIZE = "size"
val EMPTY = "empty"
val TOP = "top"

lateinit var stack: IntArray
var stackPointer = 0

private fun push(num: Int) {
    stack[stackPointer++] = num
}

private fun pop(): Int {
    return if (stackPointer == EMPTY_VALUE) {
        INVALID_VALUE
    } else {
        stack[--stackPointer]
    }
}

private fun size(): Int {
    return stackPointer
}

private fun empty(): Int {
    return if (stackPointer == 0) {
        1
    } else {
        EMPTY_VALUE
    }
}

private fun top(): Int {
    return if (stackPointer == 0) {
        INVALID_VALUE
    } else {
        stack[stackPointer - 1]
    }
}

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var count = readLine().toInt()
    stack = IntArray(count)

    while (count-- > 0) {
        val st = StringTokenizer(readLine(), " ")
        when (st.nextToken()) {
            PUSH -> push(st.nextToken().toInt())
            POP -> bw.write("${pop()}\n")
            SIZE -> bw.write("${size()}\n")
            EMPTY -> bw.write("${empty()}\n")
            TOP -> bw.write("${top()}\n")
        }
    }
    bw.close()
}