package String.Easy;

public class LastWordLength {
    public int lengthOfLastWord(String s) {
        String[] stringArray =  s.split(" ");
        String lastWord = stringArray[stringArray.length-1];
        return lastWord.length();
    }
}
