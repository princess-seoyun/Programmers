import Foundation

func solution(_ array:[Int]) -> Int {
    
    var answer : Int = 0
    
    var array2 = array.sorted() // 배열을 정렬하고 정렬된 배열을 반환, 그냥 sort() 를 사용하면 원본 배열을 정렬함 !
    
    answer = array2[array2.count/2]
    
    return answer
}