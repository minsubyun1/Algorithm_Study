package PROG.Lv0;
import java.util.*;
public class AreaofCoordinates {
    public int[] solution(String[] keyinput, int[] board) {
        int maxX = 0;
        int maxY = 0;
        int Xre = (board[0]-1) / 2;
        int Yre = (board[1]-1) / 2;
        for(int i = 0; i < keyinput.length; i++){
            if(keyinput[i].equals("left")){

                if(maxX <= (-Xre)){
                    continue;
                }
                maxX--;
            } else if(keyinput[i].equals("right")){
                if(maxX >= Xre){
                    continue;
                }
                maxX++;
            } else if(keyinput[i].equals("up")){
                if(maxY >= Yre){
                    continue;
                }
                maxY++;
            } else if(keyinput[i].equals("down")){

                if(maxY <= -(Yre)){
                    continue;
                }
                maxY--;
            }
        }


        int[] answer = {maxX, maxY};
        return answer;
    }
}
