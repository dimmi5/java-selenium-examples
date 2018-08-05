import org.testng.annotations.Test;

public class NewTestNGTest {

  @Test
  public void TestFireFox1() throws Exception {
	  JUnitTestCaseFireFox jutc = new JUnitTestCaseFireFox("http://www.qualityminds.de/");
	  jutc.test1();
	  jutc.test2();
	  jutc.test3();
  }
  
  @Test
  public void TestChrome1() throws Exception {
	  JUnitTestCaseChrome jutc = new JUnitTestCaseChrome("http://www.qualityminds.de/");
	  jutc.test1();
	  jutc.test2();
	  jutc.test3();
  }
    
}
