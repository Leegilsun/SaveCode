package service;

import java.util.HashMap;
import java.util.List;

import commons.Constant;
import dao.BoardDao;
import dao.IBoardDao;

public class BoardService implements IBoardService{

	private IBoardDao dao = new BoardDao();
	@Override
	public boolean writeBoard(String pass, String title, String content, String name, String email, int pnum) {
		// TODO Auto-generated method stub
		HashMap<String, Object> params = new HashMap<>();
		params.put(Constant.PASS, pass);
		params.put(Constant.TITLE, title);
		params.put(Constant.NAME, name);
		params.put(Constant.EMAIL, email);
		int result  = dao.insertBoard(params);
		if( pnum == 0){
			params.put(Constant.GROUP_CODE, params.get("num"));
			params.put(Constant.GROUP_SEQ, 0);
			params.put(Constant.GROUP_LV, 0);
			dao.updateRe(params);
		} else{
			HashMap<String, Object> parent = new HashMap<>();
			parent = dao.selectOne(pnum);
			params.put(Constant.GROUP_CODE, parent.get(Constant.GROUP_CODE));
			params.put(Constant.GROUP_SEQ, parent.get(Constant.GROUP_SEQ));
			dao.updatePlus(params);
			params.put(Constant.NUM, params.get("num"));
			params.put(Constant.GROUP_CODE, parent.get(Constant.GROUP_CODE));
			params.put(Constant.GROUP_SEQ, ((int)parent.get(Constant.GROUP_SEQ)) + 1);
			params.put(Constant.GROUP_LV, ((int)parent.get(Constant.GROUP_LV)) + 1);
			dao.updateRe(params);
		}
		if(result > 0 ){
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public boolean modifyBoard(int num, String title, String content) {
		// TODO Auto-generated method stub
		HashMap<String, Object> board = dao.selectOne(num);
		board.put(Constant.TITLE, title);
		board.put(Constant.CONTENT, content);
		int result = dao.updateBoard(board);
		if(result > 0){
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean deleteBoard(int num) {	//실제 현장에서는 데이터를 지웠다고해서 디비에서 날리지않는 경우가 많음 지워졌는지 여부를 판단하는 컬럼을 갖고 해당 컬럼의 값을 변경
		// TODO Auto-generated method stub
		int result = dao.deleteBoard(num);
		if(result > 0){
			return true;
		} else {
			return false;
		}
	}

	@Override
	public HashMap<String, Object> readBoard(int num) {
		// TODO Auto-generated method stub
		HashMap<String, Object> board = dao.selectOne(num);
		board.put("readCount", (int)board.get("readCOunt")+1);
		dao.updateBoard(board);
		return board;
	}

	@Override
	public HashMap<String, Object> getBoardList(int page) {
		// TODO Auto-generated method stub
		//시작페이지와 끝페이지
		int start = (page-1) / 10 * 10 + 1;
		int end = ( (page-1) / 10 + 1) * 10;
		
		//첫페이지와 마지막페이지
		int first = 1;
		int last = (dao.getBoardCount() -1) /10 +1;
		
		//끝페이지 검증
		end = last < end ? last:end;
		
		//해당 페이지 게시물을쿼리하기 위한 skip과 count
		int skip = (page - 1) * 10;	//몇개 이후부터 보고싶냐?
		int count = 10;	//한 페이지에 몇개 보고싶냐?
		HashMap<String, Object> params = new HashMap<>();
		params.put("skip", skip);
		params.put("count", count);
		List<HashMap<String, Object>> list = dao.selectBoardLimit(params);
		
		HashMap<String, Object> result = new HashMap<>();
		result.put("start", start);
		result.put("first", first);
		result.put("end", end);
		result.put("last", last);
		result.put("current", page);
		result.put("boardList", list);
		
		return result;
	}

	@Override
	public List<HashMap<String, Object>> selectBoardLimit(int page, int getBoardCount) {
		// TODO Auto-generated method stub
		HashMap<String, Object>params = new HashMap<>();
		params.put("skip", page);
		params.put("count", getBoardCount);
		List<HashMap<String, Object>> list = dao.selectBoardLimit(params);
		return list;
	}

	@Override
	public int getBoardCount() {
		// TODO Auto-generated method stub
		return 0;
	}
}
