import Foundation

func solution(_ num_list:[Int], _ n:Int) -> [Int] {
    
    var answer : [Int] = []
    
    answer.append(num_list[0]) // 첫번째는 무조건 들어감
    
    for i in 1..<num_list.count {
        if i % n == 0 {
            answer.append(num_list[i])
        }
    }
    
    return answer
}