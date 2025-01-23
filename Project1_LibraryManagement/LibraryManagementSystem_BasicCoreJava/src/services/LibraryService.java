package services;

import java.util.ArrayList;
import java.util.List;

import models.Book;
import models.Member;

public class LibraryService {
	
	private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();
	
	public void addBook(int sl_no, String bookName, String bookDescription, String author) {
		books.add(new Book(sl_no, bookName, bookDescription, author));
		System.out.println("Book Added Successfully");		
	}
	
	public void viewAllBooks() {
		if(books.isEmpty()) {
			System.out.println("No books Availabe!");
		}else {
			for(Book book : books) {
				System.out.println(book);
			}
		}
		
	}
	
	public Book searchBookById(int sl_no) {
		for (Book book : books) {
            if (book.getSl_no() == sl_no) {
                return book;
            }
        }
        return null;
		
	}
	
	public void addMember(int memberId, String memberName) {
		members.add(new Member(memberId, memberName));
		System.out.println("Member added Successfully");
	}
	
	public void viewAllMembers() {
		if(members.isEmpty()) {
			System.out.println("Members Not found");
			return;
		}else {
			for(Member member : members) {
				System.out.println(member);
			}
		}
	}
	public void issueBook(int bookId) {
		Book book  = searchBookById(bookId);
		if(book == null) {
			System.out.println("No books Found");
			return;
		}else {
			if(book.isIssued()) {
				System.out.println("Book is already issues");
			}else {
				book.setIsIssued(true);
				System.out.println("Book issued Successfully");
			}
		}
	}
	
	public void returnBook(int bookId) {
		Book book  = searchBookById(bookId);
		if(book == null) {
			System.out.println("No books Found");
			return;
		}else {
			if(!book.isIssued()) {
				System.out.println("Book is not issued");
			}else {
				book.setIsIssued(false);
				System.out.println("Book returned Successfully");
			}
		}
	}
	
	public int searchByMemberId(int memberId) {
		for(Member member : members) {
			if(member.getMemberId() == memberId) {
				return memberId;
			}
		}
		return -1;
	}

}
