package MVC;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	@ResponseBody
	@RequestMapping("/first")
	
	public String displayId(HttpServletRequest req , HttpServletResponse res) {
	   	 String id=req.getParameter("id");
	    
	   	 return id;
	    }

	@RequestMapping("/second")
	public String displayName(HttpServletRequest req,HttpServletResponse res) {
	   	 
	   	 String name=req.getParameter("name");
	   	 return name;
	    }

}
