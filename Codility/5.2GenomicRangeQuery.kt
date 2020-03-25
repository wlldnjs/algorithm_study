/**
    https://app.codility.com/programmers/lessons/5-prefix_sums/genomic_range_query/
    Task Score: 62%(Correctness: 100%, Performance: 0%)
*/
fun solution(inputString: String, startArray: IntArray,endArray: IntArray): IntArray {
    
    val intTextArray = IntArray(inputString.length)
    for(i in inputString.indices){
        intTextArray[i] = when(inputString[i]){
            'A' -> 1
            'C' -> 2
            'G' -> 3
            else -> 4
        }
    }
    
    val returnArray = IntArray(startArray.size)
    for(i in returnArray.indices){
        intTextArray.copyOfRange(startArray[i],endArray[i]+1).min()?.let{
            returnArray[i] = it
        }
    }
    
    return returnArray
}
