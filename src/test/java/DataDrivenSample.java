import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.text.MessageFormat;

public class DataDrivenSample {

    @ParameterizedTest
    @ArgumentsSource(CustomArgumentProvider.class)
    void sampleTest(String input, String expected) {
        System.out.println(MessageFormat.format("Input: {0}; Expected: {1}", input, expected));
    }
}
