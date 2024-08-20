import Foundation

func solution(_ n:Int, _ numlist:[Int]) -> [Int] {
    
    var answer: [Int] = []
    for i in 0..<numlist.count {
        if numlist[i] % n == 0 {
           answer.append(numlist[i])
        }
    } 
    
    return answer
}