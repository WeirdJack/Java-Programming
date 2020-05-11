package wordPlay.driver;

import wordPlay.util.*;

/**
 * @author Bhargav Choudhury
 *
 */

public class Driver {
	public static void main(String[] args) {

		/*
		 * As the build.xml specifies the arguments as argX, in case the
		 * argument value is not given java takes the default value specified in
		 * build.xml. To avoid that, below condition is used
		 */
		if ((args.length != 3) || (args[0].equals("${arg0}")) || (args[1].equals("${arg1}")) || (args[2].equals("${arg2}"))) {
			System.err.println("Error: Incorrect number of arguments. Program accepts 3 arguments.");
			System.exit(0);
		}
		System.out.println("Hello World! Lets get started with the assignment");
		FileProcessor fileProcessor = new FileProcessor();
		fileProcessor.processFile(args[0], args[1], args[2]);

		StdoutDisplayInterface stdoutDisplayInterface = new Results();
		stdoutDisplayInterface.logConsole();

		FileDisplayInterface fileDisplayInterface = new Results();

		fileDisplayInterface.displayInputFile(args[0]);
		fileDisplayInterface.displayOutputFile(args[1]);
		fileDisplayInterface.displayMetricsFile(args[2]);


	}
}
