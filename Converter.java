import java.util.Arrays;

public class Converter {

    public static int convertRomeToArab(String romeNumber) throws Exception {
        return Arrays.stream(RomeNumbers.values())
                .filter(n -> romeNumber.equals(n.name()))
                .map(Enum::ordinal).findAny().orElseThrow(() -> new Exception("Что-то пошло не так..."));
    }

    public static String convertArabToRome(int arabNumber) throws Exception {
        return Arrays.stream(RomeNumbers.values())
                .filter(n -> n.ordinal() == arabNumber)
                .map(Enum::name).findAny().orElseThrow(() -> new Exception("Что-то пошло не так..."));
    }
}
