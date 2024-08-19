import Foundation

func solution(_ my_string: String) -> String {
    
    var answer = ""
    
    for i in my_string {
        if let asciiValue = i.asciiValue { // char 타입의 값을 asciiValue 를 사용하여 아스키코드 값을 반환
            if asciiValue >= 97 && asciiValue <= 122 { // 소문자
                answer += String(UnicodeScalar(asciiValue - 32)) // UnicodeScalar 는 Swift에서 유니코드 스칼라 값을 표현하는 타입
                // ex ) UnicodeScalar(65) 의 값은 'A' 로 반환
            } else if asciiValue >= 65 && asciiValue <= 90 { // 대문자
                answer += String(UnicodeScalar(asciiValue + 32))
            }
        }
    }
    
    return answer
}
