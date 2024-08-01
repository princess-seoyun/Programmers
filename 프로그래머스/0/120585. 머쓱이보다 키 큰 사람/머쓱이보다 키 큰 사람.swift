import Foundation

func solution(_ array:[Int], _ height:Int) -> Int {
    
    var answer : Int = 0
    
    for i in 0 ..< array.count {
        if array[i] > height {
            answer+=1
        }
    }
    
    return answer
}