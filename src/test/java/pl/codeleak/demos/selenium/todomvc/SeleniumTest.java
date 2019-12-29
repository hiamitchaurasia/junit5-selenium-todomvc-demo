package pl.codeleak.demos.selenium.todomvc;

import io.github.bonigarcia.seljup.SeleniumExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.firefox.FirefoxDriver;

@ExtendWith(SeleniumExtension.class)
class SeleniumTest {

    @Test
    void projectIsConfigured(FirefoxDriver driver) {}
}