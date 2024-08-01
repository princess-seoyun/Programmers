import Foundation

func solution(_ array:[Int], _ n:Int) -> Int {
    
    var answer : Int = 0
    
    for i in 0 ..< array.count {
        if array[i] == n  {
            answer+=1 // 연산자 주의
        }
    }
    
    return answer
}