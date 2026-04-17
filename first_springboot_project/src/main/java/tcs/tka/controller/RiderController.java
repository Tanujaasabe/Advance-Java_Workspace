
package tcs.tka.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RiderController {
	 @RequestMapping("first")
	public String Hello()
	{
		return "hello";
		
	}
	
	@RequestMapping("show")
	public Employee showDetail()
	{
		Employee e=new Employee(1,"tanuja","shelve");
		return e;
	}

}
