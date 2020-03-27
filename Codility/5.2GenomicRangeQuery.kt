/**
    https://app.codility.com/programmers/lessons/5-prefix_sums/genomic_range_query/
    Task Score: 100%(Correctness: 100%, Performance: 100%)
*/
fun solution(inputString: String, p: IntArray, q: IntArray): IntArray {
    val stringToIntArray = Array(inputString.length + 1, { IntArray(4) })

    val counter = IntArray(4)
    for (i in inputString.indices) {
        when (inputString[i]) {
            'A' -> counter[0]++
            'C' -> counter[1]++
            'G' -> counter[2]++
            'T' -> counter[3]++
        }
        for (j in counter.indices) {
            stringToIntArray[i + 1][j] = counter[j]
        }

    }

    var returnArray = IntArray(p.size)
    for (i in p.indices) {
        for (j in counter.indices) {
            if (0 < stringToIntArray[q[i] + 1][j] - stringToIntArray[p[i]][j]) {
                returnArray[i] = j + 1
                break
            }
        }
    }

    return returnArray
}
