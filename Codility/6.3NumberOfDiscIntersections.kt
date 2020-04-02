/**
    https://app.codility.com/programmers/lessons/6-sorting/number_of_disc_intersections/
    Task Score: 81%(Correctness: 100%, Performance: 62%)
*/
fun solution(inputArray: IntArray): Int {
    val pointArray = Array(inputArray.size){IntArray(2)}
    var intersection = 0
    
    for(i in inputArray.indices){
        pointArray[i][0] = if(i.minus(inputArray[i]) < 0) 0 else {i.minus(inputArray[i])}
        pointArray[i][1] = if(Integer.MAX_VALUE.minus(i).minus(inputArray[i]) < 0) Integer.MAX_VALUE else i.plus(inputArray[i])
    }
    
    for(i in inputArray.indices){
        for(j in i+1 until inputArray.size){
            if(pointArray[i][1] >= pointArray[j][0]){
                intersection++
            }
        }
    }
    
    return intersection
}
