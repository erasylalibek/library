//package kz.iitu.library;
//
//import kz.iitu.library.controller.BookController;
//import kz.iitu.library.controller.LibraryController;
//import kz.iitu.library.controller.UserController;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.stereotype.Component;
//
//import java.util.Scanner;
//
//@Component
//public class Menu {
//
//    public void menu(AnnotationConfigApplicationContext context){
//        BookController bookController = context.getBean("bookController", BookController.class);
//        LibraryController libraryController = context.getBean("libraryController", LibraryController.class);
//        UserController userController = context.getBean("userController", UserController.class);
//
//        Scanner in = new Scanner(System.in);
//        Processes process = context.getBean("processes", Processes.class);
//        int choice = -1;
//        while(choice != 0){
//
//            System.out.println("1. Create user");
//            System.out.println("2. Create library");
//            System.out.println("3. Create book");
//            System.out.println("4. Show all available books");
//            System.out.println("5. Show all issue books");
//            System.out.println("6. Find books by name");
//            System.out.println("7. Find books by author");
//            System.out.println("8. Find book by isbn number");
//            System.out.println("9. Show all libraries");
//            System.out.println("10. Find library by name");
//            System.out.println("11. Show all users");
//            System.out.println("12. List of users who has book");
//            System.out.println("13. Find user by username");
//            System.out.println("14. Delete book");
//            System.out.println("15. Delete library");
//            System.out.println("16. Delete user");
//            System.out.println("17. Take book");
//            System.out.println("0. EXIT");
//            System.out.print("Your choice ->");
//            choice = in.nextInt();
//
//            switch (choice){
//                case 1:
//                    process.createUser(context, userController);
//                    break;
//                case 2:
//                    process.createLibrary(context, libraryController);
//                    break;
//                case 3:
//                    process.createBook(context, bookController, libraryController);
//                    break;
//                case 4:
//                    process.showAllAvailableBooks(bookController);
//                    break;
//                case 5:
//                    process.showAllIssueBooks(bookController);
//                    break;
//                case 6:
//                    process.findBooksByName(bookController);
//                    break;
//                case 7:
//                    process.findBooksByAuthor(bookController);
//                    break;
//                case 8:
//                    process.findBookByIsbn(bookController);
//                    break;
//                case 9:
//                    process.showAllLibraries(libraryController);
//                    break;
//                case 10:
//                    process.findLibraryByName(libraryController);
//                    break;
//                case 11:
//                    process.showAllUsers(userController);
//                    break;
//                case 12:
//                    process.findUsersWhoHasBook(userController);
//                    break;
//                case 13:
//                    process.findUserByUsername(userController);
//                    break;
//                case 14:
//                    process.deleteBook(bookController);
//                    break;
//                case 15:
//                    process.deleteLibrary(libraryController);
//                    break;
//                case 16:
//                    process.deleteUser(userController);
//                    break;
//                case 17:
////                    process.takeBook(userController, bookController);
//                    break;
//                case 0:
//                    System.out.println("EXIT");
//                    return;
//                default:
//                    System.out.println("Incorrect choice! Please try again!");
//                    break;
//            }
//            System.out.println();
//        }
//
//    }
//}
