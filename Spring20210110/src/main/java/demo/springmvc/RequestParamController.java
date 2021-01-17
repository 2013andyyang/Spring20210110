package demo.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestParamController {
	@RequestMapping("/user")
	public String userInfo(Model m, @RequestParam(value = "name", defaultValue = "Guest") String name) {
		m.addAttribute("username", name);
		if ("admin".equals(name)) {
			m.addAttribute("email", "admin@demo.com");
		} else {
			m.addAttribute("email", "Not set");
		}
		return "UserInfo";
	}
}
