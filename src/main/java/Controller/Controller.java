package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.Case;
import Service.Case_Service;

@RestController
@CrossOrigin(origins="*" )
@RequestMapping(value="/api")
public class Controller {
	
	@Autowired
	private Case_Service caseservice;
	
	@PostMapping("save-case1")
	public boolean saveCase(@RequestBody Case case1) {
		 return caseservice.saveCase(case1);
		
	}
	
	
	@GetMapping("list-case1")
	public List<Case> getCases() {
		 return caseservice.getCases();
	}
	

	@DeleteMapping("delete-case1/{id}")
	public boolean deleteCase(@PathVariable("id") int id,Case case1) {
		case1.setId(id);
		return caseservice.deleteCase(case1);
	}
	
	@PostMapping("update-case1/{id}")
	public boolean updateCase(@RequestBody Case case1,@PathVariable("id") int id) {
		case1.setId(id);
		return caseservice.updateCase(case1);
	}
	

	@GetMapping("case1/{id}")
	public Case getCaseByID(@PathVariable("id") int id,Case case1) {
		case1.setId(id);
		return caseservice.getCaseByID(case1);
	}
}
