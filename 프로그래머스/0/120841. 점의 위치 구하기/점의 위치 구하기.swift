import Foundation

func solution(_ dot:[Int]) -> Int {
    
    var answer : Int = 0
    
    if(dot[0] > 0 && dot[1] > 0) { // 제1사분면
        answer = 1
    } else if (dot[0] < 0 && dot[1] > 0) { // 제2사분면
        answer = 2
    } else if (dot[0] < 0 && dot[1] < 0) { // 제3사분면
        answer = 3
    } else if (dot[0] > 0 && dot[1] < 0) { // 제4사분면
        answer = 4
    }
    
    return answer
}