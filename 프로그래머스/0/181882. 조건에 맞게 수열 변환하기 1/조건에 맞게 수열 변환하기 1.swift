import Foundation

func solution(_ arr:[Int]) -> [Int] {
    
    var answer : [Int] = []
    
    for i in 0..<arr.count {
        if arr[i] >= 50 && arr[i] % 2 == 0 {
            answer.append(arr[i] / 2)
        } else if arr[i] < 50 && arr[i] % 2 != 0 {
            answer.append(arr[i] * 2)
        } else {
            answer.append(arr[i])
        }
     }
    
    return answer
}