/**
 * 문장이 주어졌을 때, 단어를 모두 뒤집어서 출력하는 프로그램을 작성하시오. 
 * 단, 단어의 순서는 바꿀 수 없다. 단어는 영어 알파벳으로만 이루어져 있다.
 * https://www.acmicpc.net/problem/9093
 */

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val stack = Stack<Char>()

    var count = readLine().toInt()
    while (count-- > 0) {
        val st = StringTokenizer(readLine(), " ")
        while (st.hasMoreTokens()) {
            st.nextToken().toCharArray().iterator().forEachRemaining {
                stack.push(it)
            }
            while (stack.isNotEmpty()) {
                bw.append(stack.pop())
            }
            if (st.hasMoreTokens()) {
                bw.append(' ')
            }
        }
        bw.newLine()
    }
    bw.close()
}