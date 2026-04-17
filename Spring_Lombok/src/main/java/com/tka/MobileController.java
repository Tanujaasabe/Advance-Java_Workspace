package com.tka;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MobileController {
   
	@Autowired
	private MobileService s;
	
	@PostMapping("add")
	public Mobile addmobile(@RequestBody Mobile mb)
	{
		return s.addmobile(mb);
	}
	
	@GetMapping("show")
	public List<Mobile> showmobiles()
	{
		return s.showmobiles();
	}
	
	@GetMapping("/{id}")
	public Mobile getbyid(@PathVariable long id) {
	    return s.getbyid(id);
	}
	
	@PutMapping("/{id}")
	public Mobile updatedata(long id,Mobile mb)
	{
		return s.updatedata(id, mb);
		
	}
	@DeleteMapping("/{id}")
	public String delete(@PathVariable long id)
	{
		s.delete(id);
	    return "Mobile deleted successfully";
	}

}
