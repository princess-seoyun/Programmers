import Foundation

func solution(_ num_list:[Int], _ n:Int) -> [Int] {
    
    var answer : [Int] = []
    
    // n 번째 값부터 배열에 담기
    for i in n..<num_list.count {
        answer.append(num_list[i])
    }
    
    // n 번째 이전 값을 인덱스 0 부터 배열에 담기
    for i in 0..<n {
        answer.append(num_list[i])
    }
    
    return answer
}