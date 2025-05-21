package PROG.Lv3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class BestAlbum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};



        HashMap<String, Integer> genreTotalMap = new HashMap<>();
        HashMap<String, List<int[]>> genreSong_map = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            genreTotalMap.put(genres[i], genreTotalMap.getOrDefault(genres[i], 0) + plays[i]);
        }

        for (int i = 0; i < genres.length; i++) {
            genreSong_map
                    .computeIfAbsent(genres[i], k -> new ArrayList<>())
                    .add(new int[]{plays[i], i}); // {재생 수, 고유 번호}
        }

        List<String> sortedGenres = new ArrayList<>(genreTotalMap.keySet());

        sortedGenres.sort((a, b) -> genreTotalMap.get(b) - genreTotalMap.get(a)); // 내림차순 정렬

        // 각 장르별로 노래 2개씩 추출
        List<Integer> result = new ArrayList<>();

        for (String genre : sortedGenres) {
            List<int[]> songList = genreSong_map.get(genre);
            songList.sort((a, b) ->{
                if(b[0] == a[0]){
                    return a[1] - b[1]; // 재생 수 같으면 고유 번호 오름차순
                }
                return b[0] - a[0]; // 재생 수 내림차순
            });

            result.add(songList.get(0)[1]); // 첫 번째 노래
            if (songList.size() > 1){
                result.add(songList.get(1)[1]); // 두 번째 노래
            }


        }

    }
}
