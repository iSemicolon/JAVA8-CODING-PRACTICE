package realtime_coding_set.main;

import realtime_coding_set.model.Book;
import realtime_coding_set.service.BookService;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BookMain {

    public static void main(String[] args) {

        BookService bookService=new BookService();
        List<Book> bookList=bookService.getBooks();

        //Sorted The Books Based on id

        System.out.println("--Sorted Based on Id--");
        List<Integer> listId= bookList.stream().map(n->n.getId()).sorted().collect(Collectors.toList());
        listId.forEach(System.out::println);

        //Sorted The Books Based on Name

        System.out.println("--Sorted Based on Name--");
        List<String> listName=bookList.stream().map(n->n.getName()).sorted().collect(Collectors.toList());
        listName.forEach(System.out::println);


        //Sorted The Books Based on Pages

        System.out.println("---Sorted Based on Pages--");
        List<Integer> listPages=bookList.stream().map(s->s.getPages()).sorted().collect(Collectors.toList());
        listPages.forEach(System.out::println);


        // Descending Order Sorted The Books Based on id

        System.out.println("--Descending Order Sorted Based on Id--");
        List<Integer> desclistId= bookList.stream().map(n-> n.getId()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        desclistId.forEach(System.out::println);

        //Descending Order Sorted The Books Based on Name

        System.out.println("--Sorted Based on Name--");
        List<String> desclistName=bookList.stream().map(n-> n.getName()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        desclistName.forEach(System.out::println);


        //Sorted The Books Based on Pages

        System.out.println("---Sorted Based on Pages--");
        List<Integer> desclistPages=bookList.stream().map(s->s.getPages()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        desclistPages.forEach(System.out::println);









    }
}
