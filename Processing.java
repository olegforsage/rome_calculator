public class Processing {

    public static String processArabNumbers(String firstNumber, String  secondNumber, String operator) throws Exception {
        int first = Integer.parseInt(firstNumber);
        int second = Integer.parseInt(secondNumber);
        int result = getResult(first, second, operator);
        return String.valueOf(result);
    }

    public static String processRomeNumbers(String firstNumber, String  secondNumber, String operator) throws Exception {
        int first = Converter.convertRomeToArab(firstNumber);
        int second = Converter.convertRomeToArab(secondNumber);
        int result = getResult(first, second, operator);

        if (result <= 0) {
            throw new Exception("Итоговое римское число меньше или равно нулю!");
        }

        return Converter.convertArabToRome(result);
    }

    private static int getResult(int firstNumber, int  secondNumber, String operator) throws Exception {
        return switch (operator) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            case "/" -> firstNumber / secondNumber;
            default -> throw new Exception("Что-то пошло не так...");
        };
    }
}
