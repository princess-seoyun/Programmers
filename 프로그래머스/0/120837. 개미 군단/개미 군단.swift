import Foundation

func solution(_ hp:Int) -> Int {
    
    var answer : Int = 0
    var hp2 = hp
    
    if hp2 / 5 > 0 { // 장군개미는 5의 공격력
        answer += hp2 / 5
        hp2 %= 5
    } 
    
    if hp2 / 3 > 0 { // 병정개미는 3
        answer += hp2 / 3
        hp2 %= 3
    } 
    
    if hp2 > 0 { // 일개미는 1
        answer += hp2 / 1
        hp2 %= 1
    } 
    
    return answer
}