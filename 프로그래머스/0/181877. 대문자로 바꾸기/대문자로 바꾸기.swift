import Foundation

func solution(_ myString:String) -> String {
    
    var answer = ""
    
    for i in myString {
        if i.isLowercase {
            answer += i.uppercased()
        } else {
            answer += String(i)
        }
    }
    
    return answer
}