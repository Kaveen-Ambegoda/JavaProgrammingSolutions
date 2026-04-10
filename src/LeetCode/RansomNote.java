package LeetCode;

import java.util.HashMap;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>magazineLetters = new HashMap<>();

        for(int j = 0; j<magazine.length();j++){
            char m = magazine.charAt(j);

            int currentCount = magazineLetters.getOrDefault(m,0);
            magazineLetters.put(m,currentCount + 1);}

    for(int i = 0;i<ransomNote.length();i++){
        char r = ransomNote.charAt(i);
        int currentCount = magazineLetters.getOrDefault(r,0);
        if(currentCount ==0){
            return false;
        }
        magazineLetters.put(r,currentCount -1);

    }
    return true;
    }
}
