import Foundation

func solution(_ str1:String, _ str2:String) -> Int {
    
    var answer : Int = 0
    
    if str1.contains(str2) {
        answer = 1
    } else {
        answer = 2
    }
    return answer
}