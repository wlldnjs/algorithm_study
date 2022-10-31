import UIKit

func bubbleSort(_ array: inout [Int]){
    for i in 0..<(array.count - 1){
        var isSwap = false
        for j in 0..<(array.count - i - 1){
            if array[j] > array[j+1]{
                array.swapAt(j, j+1)
                isSwap = true
            }
        }
        if !isSwap {return}
    }
}

func selectionSort(_ array: inout [Int]){
    for i in 0..<array.count - 1{
        var minPosition = i
        for j in i+1..<array.count{
            if array[j] < array[minPosition]{
                minPosition = j
            }
        }
        array.swapAt(i, minPosition)
    }
}

func insertionSort(_ array: inout [Int]){
    for i in 1 ..< array.count{
        for j in stride(from: i, to: 0, by: -1){
            if array[j] < array[j-1]{
                array.swapAt(j, j-1)
            }
        }
    }
}

func quickSort(_ array: [Int]) -> [Int]{
    guard let first = array.first, array.count > 1 else{ return array }
    
    let pivot = first
    let left = array.filter{$0 < pivot}
    let right = array.filter{$0 > pivot}
    
    return quickSort(left) + [pivot] + quickSort(right)
}

func mergeSort(_ array: [Int]) -> [Int] {
    if array.count <= 1 {return array}
    let center = array.count / 2
    let left = Array(array[0..<center])
    let right = Array(array[center..<array.count])
    
    func merge(_ left: [Int], _ right: [Int]) -> [Int]{
        var left = left
        var right = right
        var result: [Int] = []
        
        while(!left.isEmpty && !right.isEmpty){
            if(left[0] < right[0]){
                result.append(left.removeFirst())
            } else {
                result.append(right.removeFirst())
            }
        }
        if(!left.isEmpty) {
            result.append(contentsOf: left)
        }
        if(!right.isEmpty) {
            result.append(contentsOf: right)
        }
        return result
    }
    return merge(mergeSort(left), mergeSort(right))
}
