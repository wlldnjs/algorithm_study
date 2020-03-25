/**
    https://app.codility.com/programmers/lessons/5-prefix_sums/genomic_range_query/
    Task Score: 62%(Correctness: 100%, Performance: 0%)
*/
fun solution(inputText: String, startArray: IntArray, endArray: IntArray): IntArray {
    val returnArray = IntArray(startArray.size)
    for(i in returnArray.indices){
        returnArray[i] = inputText.substring(startArray[i],endArray[i]+1).min()?.let{
            when(it){
                'A' -> 1
                'C' -> 2
                'G' -> 3
                else -> 4
            }
        }!!
    }
    return returnArray
}
