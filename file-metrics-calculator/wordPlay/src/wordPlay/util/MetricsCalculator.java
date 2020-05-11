package wordPlay.util;

/**
 * @author Bhargav Choudhury
 *
 */

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MetricsCalculator {

    int length = 0, max_freq_count = 1, wordsCount = 0, sentence_index = 0, num_of_words = 0, total_num_words = 0, whitespace_count = 0, char_count = 0, num_of_chars = 0, total_num_chars = 0;
    String longest_word = "";
    String[] words = {};
    HashMap<String, Integer> max_freq_word = new HashMap<String, Integer>();
    List<String> metricsList =  new ArrayList<String>();
    DecimalFormat decimalFormat = new DecimalFormat("0.00");

    public List<String> getMetricsList() {

        metricsList.add("AVG_NUMBER_WORDS_PER_SENTENCE = " + getAverageNumOfWords());
        metricsList.add("AVG_NUMBER_CHARS_PER_SENTENCE = " + getAverageNumOfChars());
        metricsList.add("MAX_FREQ_WORD = " + getMaxFreqWord());
        metricsList.add("LONGEST_WORD = " + longest_word);
        return metricsList;
    }

    /**
     * Processes the input string and calculates the total num of characters and the total
     * of words, also updates the getLongestWord(String word) method and updateCountForEachWord(String word)
     * as it keeps getting input from the processFile() method of FileProcessor class
     *
     * @param  sentence  a string, input passed line by line as a string by the processFile() method of FileProcessor class
     */
    public void calculateMetrics(String sentence){

        if (!sentence.isEmpty()){

            words = sentence.split(" ");
            for (String word : words){
                if (String.valueOf(word.charAt(word.length() - 1)).matches("[.?!]")){
                    wordsCount++;
                    num_of_words = wordsCount;
                    whitespace_count = --wordsCount;
                    char_count += word.length() + whitespace_count;
                    num_of_chars = char_count;
                    wordsCount = 0;
                    char_count = 0;
                }else {
                    wordsCount++;
                    char_count += word.length();
                }
                getLongestWord(word);
                updateCountForEachWord(word);
            }
            sentence_index++;
            total_num_words = total_num_words + num_of_words;
            total_num_chars = total_num_chars + num_of_chars;
        }
    }

    public String getAverageNumOfWords(){


        return  decimalFormat.format((Double.valueOf(total_num_words)/Double.valueOf(sentence_index)));
    }

    public String getAverageNumOfChars(){

        return decimalFormat.format((Double.valueOf(total_num_chars)/Double.valueOf(sentence_index)));
    }

    public void getLongestWord(String word){

        if(word.length() >= length){
            longest_word = String.valueOf(word.charAt(word.length() - 1)).matches("[.?!]")? word.replace(String.valueOf(word.charAt(word.length() - 1)), ""):word;
            length = longest_word.length();
        }
    }

    public void updateCountForEachWord(String word){

        if (max_freq_word.containsKey(word)){
            max_freq_word.put(word, max_freq_word.get(word).intValue() + 1);
        }else {
            max_freq_word.put(word, max_freq_count);
        }
    }

    public String getMaxFreqWord(){

        int maxValue = 1;
        String maxWord = "";
        for (Map.Entry<String, Integer> entry : max_freq_word.entrySet())
        {
            if (entry.getValue() > maxValue)
            {
                maxValue = entry.getValue();
                maxWord = entry.getKey();
            }
        }

        return maxWord;
    }
}
