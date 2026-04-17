package com.tka;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MobileService {

	@Autowired
	private MobileRepo r;
	
	public Mobile addmobile(Mobile mb) {
		return r.save(mb);
	}

	public List<Mobile> showmobiles() {
		
		return r.findAll();
	}
	
	public Mobile getbyid(long id)
	{
		return r.findById(id).orElseThrow();
	}
	
	public Mobile updatedata(long id,Mobile mb)
	{
		Mobile mobile=r.findById(id).orElseThrow();
		mobile.setName(mb.getName());
		mobile.setSalary(mb.getSalary());
		mobile.setColor(mb.getColor());
		r.save(mobile);
		return mobile;
	}
	
	public void delete(long id) {
	    r.deleteById(id);
	}

}
