package PROG.Lv0;

public class CheckSuffixes {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String[] string_list = new String[my_string.length()];
        for (int i = 0; i < my_string.length(); i++){
            string_list[i] = my_string.substring(i, my_string.length());
        }

        for (int j = 0; j < string_list.length; j++){
            if(string_list[j].equals(is_suffix)){
                answer = 1;
            }
        }

        return answer;
    }
}
