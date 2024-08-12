import Foundation

func solution(_ my_string:String, _ letter:String) -> String {
    
    var answer = my_string
    
    // 문자열 내에서 Target Substring 을 모두 찾아 원하는 Replacement 문자열로 바꿔주는 replacingOccurrences 메소드
    answer = answer.replacingOccurrences(of : letter , with: "")
    
    return answer
}