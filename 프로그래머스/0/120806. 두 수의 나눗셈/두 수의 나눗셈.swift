import Foundation

func solution(_ num1:Int, _ num2:Int) -> Int {
    // 형 변환
    // Int() : Int 형으로 형변환
    // Float() : Float 형으로 형변환
    var answer : Int = Int(( Float(num1) / Float(num2) ) * 1000)
    return answer
}