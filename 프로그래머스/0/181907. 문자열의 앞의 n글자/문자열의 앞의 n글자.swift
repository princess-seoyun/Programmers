import Foundation

func solution(_ my_string:String, _ n:Int) -> String {
    
    var answer : String = ""
    
     // my_string의 첫 번째 글자부터 n번째 글자까지 추출
    let endIndex = my_string.index(my_string.startIndex, offsetBy: n)
    answer = String(my_string[..<endIndex])
    
    return answer
}