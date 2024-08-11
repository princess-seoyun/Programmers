import Foundation

func solution(_ n:Int) -> Int {
    
    // 피자는 7 조각
    // 7 * answer >= n
    
    var pizza = 1 // 최소 1판부터 시작
    
    while n > 2 {
        
        if 7 * pizza >= n {
            break;
        }
        
        pizza += 1
    }
    
    
    return pizza
}