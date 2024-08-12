import Foundation

func solution(_ money:Int) -> [Int] {
    
    var answer : [Int] = []
    
    var cnt = money / 5500 // 최대로 마실 수 있는 아메리카노 잔 수
    var no = money - (cnt * 5500) // 잔돈
    
    answer.append(cnt)
    answer.append(no)
    
    return answer
}