import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTestCaseChrome extends JUnitTestCase{

	public JUnitTestCaseChrome(String url_web_site) {
		super(url_web_site, true);
		// TODO Auto-generated constructor stub
	}

	@Test
	void test1() {
		super.test1();
	}
	@Test
	void test2() {
		super.test2();
	}
	@Test
	void test3() throws Exception {
		super.test3();
	}

}
