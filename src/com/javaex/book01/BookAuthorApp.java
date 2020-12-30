package com.javaex.book01;

public class BookAuthorApp {

	public static void main(String[] args) {
		
		//작가 6명 등록
		//AuthorDao, AuthorVo 이용해서 등록
		//수정, 삭제 리스트 (부가적)	
		
		
		//책 8권 등록
		//BookDao, BookVo 이용해서 등록
		BookDao bookDao = new BookDao();

		BookVo bookVo1 = new BookVo("우리들의 일그러진 영웅", "다림", "1998-02-22", 1);
		bookDao.bookInsert(bookVo1);

		BookVo bookVo2 = new BookVo("삼국지", "민음사", "2002-03-01", 1);
		bookDao.bookInsert(bookVo2);

		BookVo bookVo3 = new BookVo("토지", "마로니에북스", "2012-08-15", 2);
		bookDao.bookInsert(bookVo3);

		BookVo bookVo4 = new BookVo("유시민의 글쓰기 특강", "생각의길", "2015-04-01", 3);
		bookDao.bookInsert(bookVo4);

		BookVo bookVo5 = new BookVo("패션왕", "중앙북스(books)", "2012-02-22", 4);
		bookDao.bookInsert(bookVo5);

		BookVo bookVo6 = new BookVo("순정만화", "재미주의", "2011-08-03", 5);
		bookDao.bookInsert(bookVo6);

		BookVo bookVo7 = new BookVo("오직두사람", "문학동네", "2017-05-04", 6);
		bookDao.bookInsert(bookVo7);

		BookVo bookVo8 = new BookVo("26년", "재미주의", "2012-02-04", 5);
		bookDao.bookInsert(bookVo8);
		
		//책 전체를 출력 
		//(책 = 책정보 + 작가정보)
		//BookVo --> 책정보 + 작가정보
		
		

	}

}
