import Foundation

func solution(_ myString:String) -> String {
    
    var answer : String = ""
    
    for i in myString {
        if i.isUppercase { // 소문자인지 확인 / 반대로 대문자는 isLowercase 사용
            answer += i.lowercased() // 소문자로 변환 , 대문자로 변환은 uppercased
        } else {
            answer += String(i) // 소문자는 그대로
        }
    }
    
    return answer
}