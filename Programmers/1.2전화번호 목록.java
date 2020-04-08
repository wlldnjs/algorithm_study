/**
    https://programmers.co.kr/learn/courses/30/lessons/42577
    합계: 53.8 / 100.0(정확성: 53.8, 효율성: 0.0)
*/
class Solution {
    public boolean solution(String[] phoneBook) {
        if(phoneBook.length == 1){
            return true;
        }
        String prePhoneNumeber = phoneBook[0];
        for(int i=1;i<phoneBook.length;i++){
            if(prePhoneNumeber.equals(phoneBook[i].substring(0,prePhoneNumeber.length()))){
                return false;
            }
        }
        return true;
    }
}
