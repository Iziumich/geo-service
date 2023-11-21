import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationServiceImpl;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocalizationServiceImplTest {

    private LocalizationServiceImpl localizationService = new LocalizationServiceImpl();

    @Test
    public void testLocale_Russian() {
        String greetings = localizationService.locale(Country.RUSSIA);
        assertEquals("Добро пожаловать", greetings);
    }

    @Test
    public void testLocale_American() {
        String greetings = localizationService.locale(Country.USA);
        assertEquals("Welcome", greetings);
    }
}