package Service;

import java.util.List;

import Model.Case;


public interface Case_Service {

	public boolean saveCase(Case case1);
	public boolean deleteCase(Case case1);
	public boolean updateCase(Case case1);
	public List<Case> getCases();
	public Case getCaseByID(Case case1);
	
}
