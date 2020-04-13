package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import DAO.Case_DAO;
import Model.Case;

@Service
@Transactional
public class Case_Service_Imp implements Case_Service {
 
	@Autowired
	private Case_DAO casedao;	

	@Override
	public boolean saveCase(Case case1) {
		return casedao.saveCase(case1);
	}

	@Override
	public boolean deleteCase(Case case1) {
		return casedao.deleteCase(case1);
	}

	@Override
	public boolean updateCase(Case case1) {
		return casedao.updateCase(case1);
	}

	@Override
	public List<Case> getCases() {
		// TODO Auto-generated method stub
		return casedao.getCases();
	}

	@Override
	public Case getCaseByID(Case case1) {
		return casedao.getCaseByID(case1);
	}

}
