/*
 * package Utility;
 * 
 * import java.time.Duration;
 * 
 * import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.edge.EdgeDriver; import
 * org.openqa.selenium.firefox.FirefoxDriver; import
 * org.testng.annotations.AfterClass; import org.testng.annotations.BeforeClass;
 * 
 * public class BaseDriver { private final static ThreadLocal<WebDriver> driver
 * = new ThreadLocal<>(); private final static ThreadLocal<String> browser = new
 * ThreadLocal<>();
 * 
 * @BeforeClass public static WebDriver getDriver() { if (browser.get() == null)
 * { browser.set("chrome"); }
 * 
 * if (driver.get() == null) { switch (browser.get()) { case "edge":
 * driver.set(new EdgeDriver()); break; case "firefox": driver.set(new
 * FirefoxDriver()); break; default: driver.set(new ChromeDriver()); break; }
 * driver.get().manage().window().maximize();
 * driver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
 * System.out.println("Test for this page is started running..........");
 * 
 * } return driver.get(); }
 * 
 * @AfterClass public void driverQuit() { if (driver.get() != null) {
 * driver.get().quit();
 * System.out.println("Test for this class completed............."); } ; }
 * 
 * }
 */