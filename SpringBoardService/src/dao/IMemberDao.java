package dao;

import java.util.List;

import model.Member;

public interface IMemberDao {
	public void insertMember(Member member);
	public void updateMember(Member member);
	public void deleteMember(Member member);
	public Member selectOne(String id);
	public List<Member> selectAll();
}
