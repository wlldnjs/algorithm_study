/**
    https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/
    Task Score: 66%(Correctness: 100%, Performance: 25%)
*/
fun solution(A: IntArray): Int {
    val newArray = A.filter{item -> item > 0}
    val hashSet = HashSet<Int>(newArray)
    
    var count = 1
    for(i in hashSet){
        if(i == count){
            count++
        } else {
            break
        }
    }
    
    return count
}
