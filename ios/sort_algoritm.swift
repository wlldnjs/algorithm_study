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
