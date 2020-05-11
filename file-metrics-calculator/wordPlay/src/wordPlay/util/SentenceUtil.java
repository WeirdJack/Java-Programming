package wordPlay.util;

/**
 * @author Bhargav Choudhury
 *
 */

public class SentenceUtil {

    String[] words = {};
    StringBuilder sb = new StringBuilder();
    String full = new String();

    /**
     * Reverses the input string word
     *
     * @param  word  input word, passed as a String. Excludes any of ".?!"
     */
    public String reverse(String word){

        String reverse = "";
        if(String.valueOf(word.charAt(word.length() - 1)).matches("[.?!]")){
            String modStr = word.replace(String.valueOf(word.charAt(word.length() - 1)),"");
            for(int i = modStr. length() - 1; i >= 0; i--)
                reverse += modStr.charAt(i);
            return reverse.concat(String.valueOf(word.charAt(word.length() - 1)));
        }else {
            for(int i = word. length() - 1; i >= 0; i--)
                reverse += word.charAt(i);
            return reverse;
        }
    }

    /**
     * Reverses the input string word by word after spliting it with whitespaces
     *
     * @param  sentence  a string, input passed line by line as a string by the processFile() method of FileProcessor class
     * @exception Exception
     */
    public void sentenceHandler(String sentence){

        try {
            if (!sentence.isEmpty()){

                words = sentence.split(" ");
                for (String word : words){
                    sb.append(reverse(word)).append(" ");
                }
            }

            full = sb.append("\n").toString();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
