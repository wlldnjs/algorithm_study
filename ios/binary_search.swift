func binarySearch(_ array: [Int], num: Int) -> Bool {
    var start = 0
    var end = array.count - 1
    
    while (start<=end) {
        let mid = (start + end) / 2
        if (array[mid] == num){ return true }
        if (array[mid] > num){
            end = mid - 1
        } else {
            start = mid + 1
        }
    }
    return false
}
