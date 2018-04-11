package question1;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class IPValidationRegex {

	private static String regex= "^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";

	private static String inputFileName = "resource\\ipList.txt";
	private static String outputFileName = "resource\\filteredIpList.txt";
	
	public static void main(String[] args) {
		
		try (Stream<String> input = Files.lines(Paths.get(inputFileName)); PrintWriter output = new PrintWriter(outputFileName, "UTF-8");) {
			input.filter(Pattern.compile(regex).asPredicate()).forEachOrdered(output::println);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
