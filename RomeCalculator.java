import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomeCalculator {

    public static String PATTERN_ROME = "(V?I{0,3}|I[VX]|X)([+-\\\\*\\\\/])(V?I{0,3}|I[VX]|X)";
    public static String PATTERN_ARAB = "(\\d|10)([+-\\\\*\\\\/])(\\d|10)";

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        String result = "";

        if (scanner.hasNext()) {
            String command = scanner.nextLine();
            Matcher matcherRome = Pattern.compile(PATTERN_ROME).matcher(command);
            Matcher matcherArab = Pattern.compile(PATTERN_ARAB).matcher(command);
            if (matcherRome.matches()) {
                result = Processing.processRomeNumbers(
                        matcherRome.group(1),
                        matcherRome.group(3),
                        matcherRome.group(2)
                );

            } else if (matcherArab.matches()) {
                result = Processing.processArabNumbers(
                        matcherArab.group(1),
                        matcherArab.group(3),
                        matcherArab.group(2)
                );
            } else {
                throw new Exception("Введен неверный набор данных");
            }
        }

        System.out.println(result);
    }
}
