    fun main() {
        println(solution("aabbaccc"))                     // 7
        println(solution("ababcdcdababcdcd"))             // 9
        println(solution("abcabcdede"))                   // 8
        println(solution("abcabcabcabcdededededede"))     // 14
        println(solution("xababcdcdababcdcd"))            // 17
    }


    /**
     * [2020카카오공채] 문자열 압축
     * https://programmers.co.kr/learn/courses/30/lessons/60057
     */
    private fun solution(s: String): Int {
        var answer = s.length
        val maxDivider = s.length / 2

        for (i in 1 .. maxDivider) {

            var preValue = s.substring(0, i)
            val sb = StringBuilder()
            var count = 1
            for (j in i until (s.length - i) step i) {
                val tmp = s.substring(j, j + i)

                if (preValue == tmp) {
                    count++
                } else {
                    if (count > 1) {
                        sb.append(count)
                        count = 1
                    }
                    sb.append(preValue)
                    preValue = tmp
                }
            }

            val lastIdx = s.length % i
            var tmp: String

            if (lastIdx == 0) {
                tmp = s.substring(s.length - i, s.length)
                if (preValue == tmp) {
                    count++
                    sb.append(count)
                }
                sb.append(preValue)
                if (preValue != tmp) {
                    sb.append(tmp)
                }
            } else {
                tmp = s.substring(s.length - lastIdx, s.length)
                if (count > 1) {
                    sb.append(count)
                }
                sb.append(preValue).append(tmp)
            }

            val result = sb.toString()
            // println(result)
            if (answer > result.length) {
                answer = result.length
            }
        }
        return answer
    }
