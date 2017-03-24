package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import constant.Student;


@Component
public class StudentDao {
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	public boolean insertStudent(HashMap<String, Object> params){
		int result = jdbcTemplate.update("insert into student values(0, :name, :age, :score)", params);
		if(result > 0){
			return true;
		} else {
			return false;
		}
	}
	
	public boolean deleteStudent(HashMap<String, Object> params){
		int result = jdbcTemplate.update("delete from student where s_id = :s_id", params);
		if(result > 0){
			return true;
		} else {
			return false;
		}
	}
	
	public boolean updateStudent(HashMap<String, Object> params){
		int result = jdbcTemplate.update("update student set score = :score where s_id = :s_id", params);
		if(result > 0){
			return true;
		} else {
			return false;
		}
	}
	
	public List<HashMap<String, Object>> selectAll(){
		return jdbcTemplate.query("select * from student", mapper);
	}
	
	RowMapper<HashMap<String, Object>> mapper = new RowMapper<HashMap<String,Object>>() {

		@Override
		public HashMap<String, Object> mapRow(ResultSet arg0, int arg1) throws SQLException {
			// TODO Auto-generated method stub
			HashMap<String, Object> result = new HashMap<>();
			result.put(Student.S_ID, arg0.getInt(Student.S_ID));
			result.put(Student.NAME, arg0.getString(Student.NAME));
			result.put(Student.AGE, arg0.getInt(Student.AGE));
			result.put(Student.SCORE, arg0.getInt(Student.SCORE));
			return result;
		}
	};
}
