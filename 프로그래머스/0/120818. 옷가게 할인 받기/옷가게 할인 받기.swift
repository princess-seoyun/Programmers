import Foundation

func solution(_ price:Int) -> Int {
    
    var finalPrice = price
    
    if price >= 500000 {
        finalPrice = Int(Double(price) * 0.8)  // 20% 할인
    } else if price >= 300000 {
        finalPrice = Int(Double(price) * 0.9)  // 10% 할인
    } else if price >= 100000 {
        finalPrice = Int(Double(price) * 0.95) // 5% 할인
    }
    
    return finalPrice
}
