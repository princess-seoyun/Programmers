import Foundation

func solution(_ num:Int, _ n:Int) -> Int {
    
    var answer : Int = 0
    
    if num % n == 0 {
        answer = 1
    }
    
    return answer
}