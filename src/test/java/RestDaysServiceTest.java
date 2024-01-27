import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.javaqamvn.DZ5.RestDaysService;

public class RestDaysServiceTest {

    @ParameterizedTest
    //@CsvSource({
    // "3, 10000, 3000, 20000",
    //"2, 100000, 60000, 150000"
    //})
    @CsvFileSource(files = "src/test/resources/data.csv")
    public void monthsOfRest(int expected, int income, int expenses, int threshold) {

        RestDaysService service = new RestDaysService();


        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);


    }
}

