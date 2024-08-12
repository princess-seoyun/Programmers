import Foundation

func solution(_ my_string:String, _ n:Int) -> String {
    
    var answer : String = ""
    
    var k = 0
    
    for char in my_string {
        while (k < n) {
            answer += String(char) // String 으로 변환해서 넣기
            k += 1
        }
        k = 0 // k 의 값 초기화
    }
    
    return answer
}