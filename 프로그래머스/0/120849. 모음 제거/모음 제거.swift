import Foundation

func solution(_ my_string:String) -> String {
    
    var answer = my_string
    var eng : [String] = ["a","e","i","o","u"] // 알파벳 모음 배열
    
    for i in eng {
        answer = answer.replacingOccurrences(of: i , with: "")
    }
    
    return answer
}