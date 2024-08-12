import Foundation

func solution(_ my_string:String) -> Int {
    
    var answer : Int = 0
    
    for i in my_string {
        if let digit = Int(String(i))  {  // Int(String(i))가 nil일 수 있다는 점을 고려해서 if let을 사용하여 optional binding을 통해 안전하게 값을 추출
            answer += digit
        }
    }
    
    return answer
}