package cs544.carrental.student;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class StudentService implements IStudentService{
	@Autowired
	private StudentDAO studentDAO;
	
	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDAO.save(student);
	}

}
