package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QuoteController {
	
	@GetMapping
	public String BeginQuoteRequest() {
		
		return "newQuote";
	}
	
	@GetMapping
	public String getRoomNumber() {
		
		return "100";
	}
	@GetMapping
	public String getRoomType() {
		
		return "Master Bed";
	}
	
	@PostMapping
	public String SubmitQuoteRequest() {
		
		
		return "newQuoteConfirmation";
	}

	
}
