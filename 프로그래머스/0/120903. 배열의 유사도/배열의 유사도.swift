import Foundation

func solution(_ s1:[String], _ s2:[String]) -> Int {
    
    var answer = 0
    
    for i in s1 { // s1 를 돌면서 
        if s2.contains(i) { // s1 의 각 인덱스 값인 i 가 s2 에 포함된다면
            answer += 1 // count 하기
        }
    }
    
    return answer
}