import Foundation

func solution(_ start_num:Int, _ end_num:Int) -> [Int] {
    
    var answer = [Int]()
    
    for i in stride(from: start_num, through: end_num, by: -1) { // through 를 사용하면 그 범위까지 포함, to 를 사용하면 그 이전 범위까지 
        answer.append(i)
    }
    
    return answer
}