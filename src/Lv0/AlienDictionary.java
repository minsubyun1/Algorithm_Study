package Lv0;

public class AlienDictionary {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        int count = 0;

        for(int i = 0; i < dic.length; i++){
            String str = dic[i];
            for(String s : spell){
                if(str.contains(s)){
                    count++;
                }
            }
            if(count == spell.length){
                answer = 1;
            }
            count = 0;
        }

        return answer;
    }
}
