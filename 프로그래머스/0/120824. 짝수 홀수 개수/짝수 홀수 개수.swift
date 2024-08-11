import Foundation

func solution(_ num_list:[Int]) -> [Int] {
    
    var answer : [Int] = []
    
    var cnt = 0 // 짝수의 개수
    var cnt2 = 0 // 홀수의 개수
    
    for i in 0..<num_list.count {
        if num_list[i] % 2 == 0 {
            cnt+=1
        } else {
            cnt2+=1
        }
    }
    
    answer.append(cnt)
    answer.append(cnt2)
    
    return answer
}