package book;

import java.util.*;

public class BookStore {
    List<Book> books;
    private Scanner scanner = new Scanner(System.in);
    public BookStore(){
        books = new ArrayList<>();
        Book book = new Book(1, "Conan","Truyện trinh thám",new Date(), 10000);
        books.add(book);
        books.add(new Book(2,"Doraemon", "Truyện tranh", new Date(),15000));
        books.add(new Book(3,"Pokemon", "Truyện tranh", new Date(),20000));

    }

    public void showBook(){
        System.out.printf("%-3s | %-15s | %-20s | %-10s | %-10s\n",
                "ID", "Name", "Description", "Price", "Date");
        for (int i=0;i<books.size();i++){
            Book book = books.get(i);
            System.out.printf("%-3s | %-15s | %-20s | %-10s | %-10s\n"
                    , book.getId(), book.getName(), book.getDescription(), book.getPrice(), book.getEntryDate());
        }
    }
    public void showBook(List<Book> books){
        System.out.printf("%-3s | %-15s | %-20s | %-10s | %-10s\n"
                , "ID", "Name", "Description", "Price", "Date");
        for(int i = 0;i<books.size();i++){
            Book book = books.get(i);
            System.out.printf("%-3s | %-15s | %-20s | %-10s | %-10s\n"
                    , book.getId(), book.getName(), book.getDescription(), book.getPrice(), book.getEntryDate());
        }
    }
    public void addBook(){
        System.out.println("Nhập thông tin sách:");
        System.out.println("Nhập tên sách:");
        String name = scanner.nextLine();
        System.out.println("Nhập mô tả:");
        String description = scanner.nextLine();
        System.out.println("Nhập giá: ");
        double price = Double.parseDouble(scanner.nextLine());

        Comparator comparator = new ComparatorById();
        books.sort(comparator);
        long maxId = books.get(books.size() -1).getId();

        Book book = new Book();
        book.setId(maxId + 1);
        book.setName(name);
        book.setDescription(description);
        book.setPrice(price);
        book.setEntryDate(new Date());

        books.add(book);
        showBook();
    }

    public void editBook(){
        System.out.println("Nhập ID bạn muốn sửa: ");
        long id = Long.parseLong(scanner.nextLine());

        System.out.println("Nhập tên mới:");
        String nameNew = scanner.nextLine();
        System.out.println("Nhập mô tả mới:");
        String descriptionNew = scanner.nextLine();
        System.out.println("Nhập giá mới:");
        double priceNew = Double.parseDouble(scanner.nextLine());

        for (int i = 0;i<books.size();i++){
            if (id == books.get(i).getId()){
                books.get(i).setName(nameNew);
                books.get(i).setDescription(descriptionNew);
                books.get(i).setPrice(priceNew);
            }
        }
        showBook();
    }

    public void deleteBook(){
        System.out.println("Nhập sách bạn muốn xóa:");
        long id= Long.parseLong(scanner.nextLine());

        for (int i = 0;i< books.size();i++){
            if (id== books.get(i).getId()){
                books.remove(i);
            }
        }
        showBook();
    }

    public void searchByName(){
        System.out.println("Nhâp tên bạn muốn tìm kiếm:");
        String key= scanner.nextLine();
        List<Book> result = new ArrayList<>();
        for (int i=0;i< books.size();i++){
            if (books.get(i).getName().contains(key)){
                result.add(books.get(i));
            }
        }
        showBook(result);
    }

    public void searchByNameOrDecription(){
        System.out.println("Nhập thông tin bạn muốn tìm kiếm:");
        String key = scanner.nextLine();
        List<Book> resuts = new ArrayList<>();
        for (int i=0;i< books.size();i++){
            if (books.get(i).getDescription().contains(key) || books.get(i).getName().contains(key) ){
                resuts.add(books.get(i));
            }
        }
        showBook(resuts);

    }

    public void sortByName(){
        books.sort(new ComparatorByName());
        showBook();
    }

    public void sortByPrice(){
        books.sort(new ComparatorByPrice());
        showBook();
    }



}
