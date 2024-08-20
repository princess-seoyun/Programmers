import Foundation

func solution(_ array:[Int]) -> [Int] {
    
    var answer : [Int] = []
    
    var big = array[0] // 큰 수가 들어갈 곳
    var idx = 0 // 큰 수의 인덱스
    
    for i in 0..<array.count-1 {
        if array[i] < array[i+1] {
            big = array[i+1]
            idx = i + 1
        }
    }
    
    answer.append(big)
    answer.append(idx)
    
    return answer
}