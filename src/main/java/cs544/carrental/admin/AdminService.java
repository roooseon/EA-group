package cs544.carrental.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cs544.carrental.domain.Admin;
import cs544.carrental.repositories.AdminDAO;

@Service
public class AdminService implements IAdminService{
	
	@Autowired
	private AdminDAO adminDAO;

	@Override
	public void addAdmin(Admin admin) {
		List<Admin> admins=(List<Admin>) adminDAO.findAll();
		if(admins.size()==0 || admins==null)
		adminDAO.save(admin);
	}

}
