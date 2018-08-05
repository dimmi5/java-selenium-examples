import static org.junit.jupiter.api.Assertions.fail;

import org.openqa.selenium.Keys;

public class ClassStepsSequence extends ClassBrowser{
	private Boolean chrome_browser;
	public ClassStepsSequence(String url_web_site,Boolean chrome_browser) {
		super(url_web_site);
		this.chrome_browser = chrome_browser;
	}

	public int first_sequence() {
		start_browser(chrome_browser);
		String s = get_text("//body[1]/div[1]/div[1]/a[1]");
		if(s.compareTo("Alles klar!") != 0) {
			fail("Error 1");
		}
		try {
			click("//body[1]/div[3]/div[2]/div[1]/div[1]/div[3]/ul[1]/li[1]/a[1]");
		}catch(Exception e) {
			fail("Error 2");
			
		}
		s = get_text("//body[1]/div[1]/div[1]/a[1]");
		if(s.compareTo("Got it!") != 0) {
			fail("Error 3");
		}
		stop_browser();
	
		return 0;
	}

	public int second_sequence() {
		start_browser(chrome_browser);
		try {
			mouse_over("//body[1]/div[3]/div[2]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]");
		} catch (Exception e1) {
			fail("Error 0");
		}
		try {
			click("//body[1]/div[3]/div[2]/div[1]/div[1]/div[6]/ul[1]/li[1]/ul[1]/li[3]/a[1]");
		}catch(Exception e) {
			fail("Error 1");
			
		}
		String s = get_text("//body[1]/div[1]/div[1]/a[1]");
		
		if(!is_highlighted("//body[1]/div[8]/div[2]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")) {
			fail("Error 2");
		}
		stop_browser();
	
		return 0;
	}
	
	public int third_sequence() throws Exception {
		start_browser(chrome_browser);
		try {
			click("//body[1]/div[3]/div[2]/div[1]/div[1]/div[5]/a[1]/span[1]");
		}catch(Exception e) {
			fail("Error 1");
			
		}
		
		try {
			click("//body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[6]/div[1]/input[1]");
		}catch(Exception e) {
			fail("Error 2");
			
		}
		
		String s = get_text("//body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]");
		if(s.compareTo("Name, Vorname ist ein Pflichtfeld.") != 0) {
			fail("Error 3");
		}

		
		set_text("//body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/input[1]","aaa");
		
		try {
			click("//body[1]/div[3]/div[1]/div[2]/div[1]/div[1]");
		}catch(Exception e) {
			fail("Error 4");
			
		}
		set_text("//body[1]",Keys.END);
		try {
			click("edit-webform-ajax-submit-80");
		}catch(Exception e) {
			fail("Error 5");
			
		}
		
		s = get_text("//body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]");
		if(s.compareTo("E-Mail ist ein Pflichtfeld.") != 0) {
			fail("Error 6");
		}

		set_text("//body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[2]/input[1]","bbb");
		try {
			click("//body[1]/div[3]/div[1]/div[2]/div[1]/div[1]");
		}catch(Exception e) {
			fail("Error 7");
			
		}
		set_text("//body[1]",Keys.END);
		try {
			click("edit-webform-ajax-submit-80");
		}catch(Exception e) {
			fail("Error 8");
			
		}
		
		s = get_text("//body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/em[1]");
		if(s.compareTo("bbb") != 0) {
			fail("Error 9");
		}
		set_text("//body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[2]/input[1]",Keys.DELETE);
		set_text("//body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[2]/input[1]",Keys.DELETE);
		set_text("//body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[2]/input[1]",Keys.DELETE);
		set_text("//body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[2]/input[1]","dimmi5@interia.pl");
		try {
			click("//body[1]/div[3]/div[1]/div[2]/div[1]/div[1]");
		}catch(Exception e) {
			fail("Error 10");
			
		}
		set_text("//body[1]",Keys.END);
		try {
			click("edit-webform-ajax-submit-80");
		}catch(Exception e) {
			fail("Error 11");
			
		}

		s = get_text("//body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]");
		if(s.compareTo("Betreff ist ein Pflichtfeld.") != 0) {
			fail("Error 12");
		}
		
		
		stop_browser();
	
		return 0;
	}
	
}
