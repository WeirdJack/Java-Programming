package wordPlay.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Bhargav Choudhury
 *
 */

public class Results implements FileDisplayInterface, StdoutDisplayInterface {

    static List<String> consoleOutput = new ArrayList<String>();
    public Results(){
        super();
    }

    public Results(SentenceUtil sentenceUtil, MetricsCalculator metricsCalculator, String outputFilename, String metricsFilename) {

        writeToOutputTxt(outputFilename, sentenceUtil.full);
        writeToMetricsTxt(metricsFilename, metricsCalculator);
    }

    /**
     * displays all the results
     *
     */
    @Override
    public void logConsole() {

        System.out.println("Printing output to console\n");
        for (String str : consoleOutput){
            System.out.println(str);
        }
    }

    /**
     * displays the contents of the input file
     *
     * @param  filepath  absolute path of the input file
     * @exception  FileNotFoundException  file not found error
     * @exception IOException for file input error
     */
    @Override
    public void displayInputFile(String filepath) {

        File file = new File(filepath);

        System.out.println("\n Contents of " + file.getName() + "\n");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filepath));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * displays the contents of the output file
     *
     * @param  filename  output filename
     * @exception  FileNotFoundException  file not found error
     * @exception IOException for file input error
     */
    @Override
    public void displayOutputFile(String filename) {

        System.out.println("\n Contents of " + filename + "\n");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * displays the contents of the metrics file
     *
     * @param  filename  metrics filename
     * @exception  FileNotFoundException  file not found error
     * @exception IOException for file input error
     */
    @Override
    public void displayMetricsFile(String filename) {

        System.out.println("\n Contents of " + filename + "\n");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * writes the output reversed text to the output file
     *
     * @param  filename  output filename
     * @param  outputString  output text
     * @exception IOException for file input error
     */
    public void writeToOutputTxt(String filename, String outputString) {

        try {
            FileWriter myWriter = new FileWriter(filename);
            System.out.println(filename + " file is created");
            myWriter.write(outputString);
            myWriter.close();
            consoleOutput.add(outputString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * writes the metrics calculation results of the input text to the metrics file
     *
     * @param  filename  metrics filename
     * @param  metricsCalculator  instance of MetricsCalculator class
     * @exception IOException for file input error
     */
    public void writeToMetricsTxt(String filename, MetricsCalculator metricsCalculator) {

        try {
            FileWriter myWriter = new FileWriter(filename);
            System.out.println(filename + " file is created");
            for (String metric : metricsCalculator.getMetricsList()){
                myWriter.write(metric + "\n");
                consoleOutput.add(metric);
            }
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
