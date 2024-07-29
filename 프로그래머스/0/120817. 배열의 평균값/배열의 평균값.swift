import Foundation

func solution(_ numbers:[Int]) -> Double {
    
    var answer : Double = 0
    
    // 배열의 개수를 return 하는 count
    for i in 0..<numbers.count
    {
        answer += Double(numbers[i])
    }
    
    // 방법 2
    // 배열의 값을 모두 더하기
    // for number in numbers {
    //     answer += Double(number)
    // }
    
    answer = answer / Double(numbers.count)
    
    return answer
}