import Foundation

func solution(_ a:Int, _ b:Int, _ flag:Bool) -> Int {
    
    if flag { // flag 가 true 라는 조건
        return a+b
    } else {
        return a-b
    }
}