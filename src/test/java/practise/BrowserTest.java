package practise;


import lombok.extern.log4j.Log4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.JsonOutput;


import static org.junit.Assert.assertEquals;

@Log4j
public class BrowserTest {

    ChromeDriver driver;
    private final String GOOGLE_URL = "https://www.google.lv/";

    @Before
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.get(GOOGLE_URL);
    }

    @After
    public void closeBrowser() {
        driver.close();
    }

    @Test
    public void chromeDriverTest() throws InterruptedException {
        assertEquals("Website has different title",
                "Google", driver.getTitle());
        assertEquals("URL is incorrect",
                GOOGLE_URL, driver.getCurrentUrl());
        assertEquals("Website has different title",
                "Google", driver.getTitle());
        assertEquals("URL is incorrect",
                GOOGLE_URL, driver.getCurrentUrl());
    }
    //Delete me in next commit
}

