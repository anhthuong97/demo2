package packcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import service.MemberService;

@Controller
@ComponentScan
public class ControllerTest {
	@Autowired
	private MemberService memberService;

	@PostMapping("/index")
	public String login(@RequestParam String username, @RequestParam String password) {
		boolean checkLogin = memberService.checkInfor(username, password);
		if (checkLogin) {
			System.out.println("OK");
			return "redirect:/successPage";
		} else {
			System.out.println("Sai");
		}
		return "index";

	}

	@GetMapping("/successPage")
	public String successPage() {
		return "successPage";
	}
}
