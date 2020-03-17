 /**
    https://app.codility.com/programmers/lessons/1-iterations/binary_gap/start/
    Task Score: 100%(Correctness: 100%)
*/

fun solution(N: Int): Int {
    val binaryString = Integer.toBinaryString(N)
    var maxBinaryGap = 0
    var binaryGap = 0
    
    for(idx in binaryString.indices){
        if(binaryString[idx] == '1'){
            if(binaryGap > 0 && binaryGap > maxBinaryGap){
                maxBinaryGap = binaryGap
            }
            binaryGap = 0
        } else { 
            binaryGap++
        }
    }
    
    return maxBinaryGap
}
