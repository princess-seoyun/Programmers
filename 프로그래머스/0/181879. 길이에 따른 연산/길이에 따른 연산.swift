import Foundation

func solution(_ num_list:[Int]) -> Int {
    
    var answer = 0
    
    if num_list.count > 10 {
        for i in num_list {
            answer += i
        }
    } else {
        answer = 1
        for i in num_list {
            answer *= i
            print(answer)
        }
    }
    
    return answer
}