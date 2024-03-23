package com.tyss.Controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tyss.Employe.Employe;
@Controller
public class EmployeController {
	static EntityManager manager = Persistence.createEntityManagerFactory("hemanth").createEntityManager();
	static EntityTransaction transaction = manager.getTransaction();

	@GetMapping("/saved")
	public ModelAndView saveData(@RequestParam String name, @RequestParam String email, ModelAndView mv) {
		Employe e = new Employe();
		e.setName(name);
		e.setEmail(email);
		mv.addObject("e", e);
		mv.setViewName("succ.jsp");
		transaction.begin();
		manager.persist(e);
		transaction.commit();
		System.out.println("Data Saved Successfull..");
		return mv;
	}
	@PostMapping("/login")
	public ModelAndView loginRec(@RequestParam String name,@RequestParam String email,ModelAndView mv)
	{
		
		Employe e = null;
		Query q = manager.createQuery("select e from Employe e where e.name=:name and e.email=:email");
		q.setParameter("name", name);
		q.setParameter("email", email);
		List<Employe> list = q.getResultList();
		if(list.size() > 0)
		{
			e = list.get(0);
			mv.addObject("e",e);
			mv.setViewName("loginsucc.jsp");
		}
		else
		{
			mv.addObject("msg","InvalidCreditioals");
			mv.setViewName("index.jsp");
		}
		return mv;
		
	}
	@RequestMapping("/fetch")
	public ModelAndView fetchRecords(ModelAndView mv)
	{
		mv.setViewName("fetch.jsp");
		mv.addObject("employe",addAll());
		return mv;
	}
	private List<Employe> addAll() {
		Query q = manager.createQuery("from Employe");
		List<Employe> list = q.getResultList();
		return list;
	}
    @RequestMapping("/update")
	public ModelAndView updateRecord(@RequestParam int id,ModelAndView mv)
	{
		Employe e = manager.find(Employe.class, id);
		if(e == null)
		{
			mv.addObject("msg","Invalid User Id");
			mv.setViewName("index.jsp");
			return mv;
		}
		else
		{
			mv.setViewName("update.jsp");
			mv.addObject("e", e);
		return mv;
		}
		
	}
    @PostMapping("/updateEmp")
    public ModelAndView updateEmploye(@RequestParam int id,@RequestParam String name,@RequestParam String email,ModelAndView mv)
    {
    	Employe e = manager.find(Employe.class, id);
    	   e.setName(name);
    	   e.setEmail(email);
    	   transaction.begin();
    	   manager.merge(e);
    	   transaction.commit();
    	return fetchRecords(mv);
    }
    @RequestMapping("/delete")
    public ModelAndView removeRecord(ModelAndView mv,@RequestParam int id)
    {
    	Employe e = manager.find(Employe.class, id);
    	transaction.begin();
    	manager.remove(e);
    	transaction.commit();
    	return fetchRecords(mv);
    }
}
