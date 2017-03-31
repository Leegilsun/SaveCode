package dao;

import java.util.HashMap;
import java.util.List;

public interface IStudentDao {
	public int insertStudent(HashMap<String, Object> params);
	public int updateStudent(HashMap<String, Object> params);
	public int deleteStudent(HashMap<String, Object> params);
	public HashMap<String, Object> selectOne(HashMap<String, Object> params);
	public List<HashMap<String,Object>> selectAll();
}
