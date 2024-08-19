import Foundation

func solution(_ cipher:String, _ code:Int) -> String {
    
    var answer = ""
    var cipherArray = Array(cipher) // 배열로 변환하면 한 글자씩 배열에 들어감
    
    // code 의 숫자 배수만 진짜 암호임
    for i in code...cipher.count {
        if i % code == 0 {
            answer += String(cipherArray[i-1])
        }
    }
    
    return answer
}