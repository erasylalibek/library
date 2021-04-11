//package kz.iitu.library;
//
//import kz.iitu.library.controller.BookController;
//import kz.iitu.library.controller.LibraryController;
//import kz.iitu.library.controller.UserController;
//import kz.iitu.library.model.Books;
//import kz.iitu.library.model.Library;
//import kz.iitu.library.model.User;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//import java.util.Scanner;
//
//@Component
//public class Processes {
//
//    Scanner in = new Scanner(System.in);
//
//    public void createUser(AnnotationConfigApplicationContext context, UserController controller){
//        User user = context.getBean("user", User.class);
//        System.out.println("Enter name");
//        user.setName(in.next());
//        System.out.println("Enter username");
//        user.setUsername(in.next());
//        System.out.println("Enter password");
//        user.setPassword(in.next());
//        controller.create(user);
//        System.out.println("User created!");
//    }
//
//    public void createLibrary(AnnotationConfigApplicationContext context, LibraryController controller){
//        Library library = context.getBean("library",Library.class);
//        System.out.println("Enter name: ");
//        library.setName(in.next());
//        System.out.println("Enter country: ");
//        library.setCountry(in.next());
//        controller.create(library);
//        System.out.println("Library created!");
//    }
//
//    public void createBook(AnnotationConfigApplicationContext context, BookController bookController, LibraryController libraryController){
//        Books book = context.getBean("books", Books.class);
//
//        System.out.println("Enter name: ");
//        book.setName(in.next());
//        System.out.println("Enter author: ");
//        book.setAuthor(in.next());
//        System.out.println("Enter isbn number: ");
//        book.setIsbn(in.next());
//        book.setStatus(false);
//        System.out.println("Enter library id which this book belongs to : ");
//        book.setLibrary_id(in.nextInt());
//        bookController.create(book);
//        System.out.println("Book created!");
//    }
//
//    public void deleteUser(UserController controller){
//        System.out.println("Enter id of user: ");
//        controller.delete(in.nextInt());
//        System.out.println("User deleted!");
//    }
//
//    public void deleteLibrary(LibraryController controller){
//        System.out.println("Enter id of library: ");
//        controller.delete(in.nextInt());
//        System.out.println("Library deleted!");
//    }
//
//    public void deleteBook(BookController controller){
//        System.out.println("Enter id of book: ");
//        controller.delete(in.nextInt());
//        System.out.println("Book deleted!");
//    }
//
//    public void showAllAvailableBooks(BookController controller){
//        List<Books> books = controller.getAllAvailableBooks();
//        for(Books book : books){
//            System.out.println(book.toString());
//        }
//    }
//
//    public void showAllIssueBooks(BookController controller){
//        List<Books> books = controller.getAllIssueBooks();
//        for(Books book : books){
//            System.out.println(book.toString());
//        }
//    }
//
//    public void findBooksByName(BookController controller){
//        System.out.println("Enter book name: ");
//        List<Books> books = controller.getBooksByName(in.next());
//        for(Books book : books){
//            System.out.println(book.toString());
//        }
//    }
//
//    public void findBooksByAuthor(BookController controller){
//        System.out.println("Enter book's author: ");
//        List<Books> books = controller.getBooksByAuthor(in.next());
//        for(Books book : books){
//            System.out.println(book.toString());
//        }
//    }
//
//    public void findBookByIsbn(BookController controller){
//        System.out.println("Enter isbn number of book: ");
//        Books book = controller.getBookByIsbn(in.next());
//        System.out.println(book.toString());
//    }
//
//    public void showAllLibraries(LibraryController controller){
//        List<Library> libraries = controller.getAllLibraries();
//        for(Library library: libraries){
//            System.out.println(library.toString());
//        }
//    }
//
//    public void findLibraryByName(LibraryController controller){
//        System.out.println("Enter library name");
//        Library library = controller.getLibraryByName(in.next());
//        System.out.println(library.toString());
//    }
//
//    public void showAllUsers(UserController userController){
//        List<User> users = userController.getAllUsers();
//        for(User user : users){
//            System.out.println(user.toString());
//        }
//    }
//
//    public void findUsersWhoHasBook(UserController userController){
//        List<User> users = userController.userListWhoHasBook();
//        for(User user : users){
//            System.out.println(user.toString());
//        }
//    }
//
//    public void findUserByUsername(UserController userController){
//        System.out.println("Enter username: ");
//        User user = userController.getUserByUsername(in.next());
//        System.out.println(user.toString());
//    }
//
//    public void takeBook(UserController userController, BookController bookController){
//        System.out.println("Enter username : ");
//        User user = null;
//        user = userController.getUserByUsername(in.next());
//        if(user != null){
//            System.out.println("Enter book id : ");
//            int bookId = in.nextInt();
////            Books book = bookController.getBookById(bookId);
////            book.setStatus(true);
////            book.setUser_id(user.getUser_id());
////            bookController.update(bookId, book);
//        }else{
//            System.out.println("Such user doesn't exist!");
//        }
//    }
//}
