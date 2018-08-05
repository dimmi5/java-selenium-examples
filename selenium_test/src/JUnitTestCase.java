import org.junit.jupiter.api.Test;

class JUnitTestCase extends ClassStepsSequence {

	public JUnitTestCase(String url_web_site, Boolean chrome_browser) {
		super(url_web_site, chrome_browser);
		// TODO Auto-generated constructor stub
	}

	@Test
	void test1() {
		this.first_sequence();
	}
	@Test
	void test2() {
		this.second_sequence();
	}
	@Test
	void test3() throws Exception {
		this.third_sequence();
	}

}
