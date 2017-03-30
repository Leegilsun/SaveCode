import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import dao.BoardDao;
import dao.IBoardDao;

public class Test {
	public static void main(String[] args) {
	
//		for(int i=0; i<200; i++){
			HashMap<String, Object> params = new HashMap<>();
			IBoardDao dao = new BoardDao();
//			params.put(Constant.PASS, "1234");
//			params.put(Constant.NAME, "이길선");
//			params.put(Constant.EMAIL, "pjjwjwth@naver.com");
//			params.put(Constant.TITLE, "제목임돠"+i);
//			params.put(Constant.CONTENT, "내용임돠");
//			params.put(Constant.READCOUNT, 0);
//			params.put(Constant.WRITEDATE, new Date());
//			
//			dao.insertBoard(params);
//		}
//			params.put(Constant.TITLE, "이길선");
//			params.put(Constant.CONTENT, "멀캠");
//			for(HashMap<String, Object> h : dao.selectBySearch(params))
//				System.out.println(h);
			
		//페이지 설정
			Scanner scan = new Scanner(System.in);
			int input = scan.nextInt();
			int num = input * 10 - 10;
//
//			for(HashMap<String, Object> h : dao.selectPage(num))
//					System.out.println(h);
			
			List<HashMap<String, Object>>list =  dao.selectAll();
			int total = list.size() -1;
			int startPage = input - 5;
			int endPage = input + 4;
			int lastPage = total/10 + 1;
			
			if(startPage < 1){
				startPage = 1;
			}
			if(endPage > lastPage){
				endPage = lastPage;
			}
			
			System.out.println("첫 페이지" + 1);
			System.out.println("시작 페이지"+startPage);
			System.out.println("현재 페이지" + input);
			System.out.println("끝 페이지 "+endPage);
			System.out.println("마지막 페이지"+lastPage);
			
			for(int i=startPage;i<endPage+1;i++){
				System.out.print(i+" ");
			}
			
	
	}
}
