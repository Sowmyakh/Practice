import org.testng.annotations.Test;

public class ReadDataParTest {
	
	@Test
	public void readdata()
	{
		
		String URL = System.getProperty("url");
		String Browser= System.getProperty("browser");
		System.out.println("URL is"+URL);
		System.out.println("Browser is"+Browser);
	}

}
