import Foundation

func solution(_ numbers:[Int], _ n:Int) -> Int {
    
    var answer = 0
    
    for i in 0..<numbers.count {
        if answer > n {
            break
        }
        else {
            answer += numbers[i]
        } 
    }
    
    return answer
}