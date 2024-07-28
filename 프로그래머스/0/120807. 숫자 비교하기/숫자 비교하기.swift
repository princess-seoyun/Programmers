import Foundation

func solution(_ num1:Int, _ num2:Int) -> Int {
    var answer : Int
    
    if(num1 == num2) {
        answer = 1
    } else {
        answer = -1
    }
    return answer
}