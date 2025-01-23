package main;

import java.util.Scanner;

import services.LibraryService;

public class LibraryManagementSystem {

	public static void main(String[] args) {
		LibraryService libraryService = new LibraryService();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			 System.out.println("\nLibrary Management System");
	            System.out.println("1. Add Book");
	            System.out.println("2. View Books");
	            System.out.println("3. Add Member");
	            System.out.println("4. View Members");
	            System.out.println("5. Issue Book");
	            System.out.println("6. Return Book");
	            System.out.println("7. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            
	            switch(choice) {
	            case 1:
                    System.out.print("Enter book ID: ");
                    int sl_no = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter book title: ");
                    String bookName = scanner.nextLine();
                    System.out.print("Enter book Description: ");
                    String bookDescription = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    libraryService.addBook(sl_no, bookName, bookDescription, author);
                    break;

                case 2:
                    libraryService.viewAllBooks();
                    break;

                case 3:
                    System.out.print("Enter member ID: ");
                    int memberId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter member name: ");
                    String memberName = scanner.nextLine();
                    libraryService.addMember(memberId, memberName);
                    break;

                case 4:
                    libraryService.viewAllMembers();
                    break;

                case 5:
                    System.out.print("Enter book ID to issue: ");
                    int issueBookId = scanner.nextInt();
                    libraryService.issueBook(issueBookId);
                    break;

                case 6:
                    System.out.print("Enter book ID to return: ");
                    int returnBookId = scanner.nextInt();
                    libraryService.returnBook(returnBookId);
                    break;

                case 7:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }	  
		}
	}
}
