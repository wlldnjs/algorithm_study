/**
    https://app.codility.com/programmers/lessons/5-prefix_sums/min_avg_two_slice/
    Task Score: 60%(Correctness: 100%, Performance: 20%)
*/
fun solution(A: IntArray): Int {
    var minValue = Float.MAX_VALUE
    var minIndex = -1

    for(i in A.indices){
        var sumValue: Float = A[i].toFloat()
        var count = 1
        for(j in i+1 until A.size){
            sumValue += A[j]
            val averageValue = sumValue / ++count
            if(averageValue < minValue){
                minValue = averageValue
                minIndex = i
            }
        }
    }
    
    return minIndex
}
