package wordPlay.util;
import java.io.*;

/**
 * @author Bhargav Choudhury
 *
 */

public class FileProcessor {


    /**
     * Processes the input file and passes arguments line by line to SentenceUtil and
     * MetricsCalculator classes for further operations. Finally calls the explicit value constructor
     * of the Results class
     *
     * @param  filepath  an absolute filepath giving the base location of the input file
     * @param  outputFilename the output filename
     * @param  metricsFilename the metrics filename
     * @exception IOException for file input error
     * @exception FileNotFoundException for file not found error
     */
    public void processFile(String filepath, String outputFilename, String metricsFilename){

        try {
            File file = new File(filepath);
            if (!file.isDirectory() && file.isFile() && file.exists()){

                if(filepath.endsWith(".txt")){

                    BufferedReader br = new BufferedReader(new FileReader(file));
                    String str;
                    StringBuilder input = new StringBuilder();
                    SentenceUtil sentenceUtil = new SentenceUtil();
                    MetricsCalculator metricsCalculator = new MetricsCalculator();
                    while ((str = br.readLine()) != null) {
                        input.append(str).append("\n");
                        sentenceUtil.sentenceHandler(str);
                        metricsCalculator.calculateMetrics(str);
                    }
                    new Results(sentenceUtil, metricsCalculator, outputFilename, metricsFilename);
                } else {

                    System.err.println("Invalid Input File Extension. Accepted File Format: .txt");
                    System.exit(0);
                }
            }else {

                System.err.println("Not a File");
                System.exit(0);
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
