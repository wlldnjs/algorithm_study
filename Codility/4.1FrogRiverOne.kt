/**
    https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/
    Task Score: 100%(Correctness: 100%, Performance: 100%)
*/
fun solution(goal: Int, inputArray: IntArray): Int {
    val hashSet = HashSet<Int>()
    
    for(i in inputArray.indices){
        if(inputArray[i] <= goal){
            hashSet.add(inputArray[i])
        }
        if(hashSet.size == goal){
            return i
        }
    }
    
    return -1
}
