import Foundation

func solution(_ n:Int) -> [Int] {
    
    var answer : [Int] = [] // int 배열 선언
    
    for i in 0...n { // 0 ~ n 까지를 범위로
        if i % 2 != 0 {
            answer.append(i)
        } 
    }
    
    return answer
}