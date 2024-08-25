import Foundation

func solution(_ n:Int) -> Int {
    
    let squareRoot = sqrt(Double(n))
    if squareRoot == Double(Int(squareRoot)) { // 제곱근이 정수인지 확인
        return 1
    } else {
        return 2
    }
}