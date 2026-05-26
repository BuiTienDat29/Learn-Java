import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Danh sách lưu sách
    static ArrayList<Book> books = new ArrayList<>();


    static Scanner sc = new Scanner(System.in);


    // Method thêm sách
    static void addBook() {

        System.out.print("Nhap id: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhap ten sach: ");
        String title = sc.nextLine();

        System.out.print("Nhap tac gia: ");
        String author = sc.nextLine();

        // Tạo object Book
        Book b = new Book(id, title, author);

        // Thêm vào ArrayList
        books.add(b);

        System.out.println("Them thanh cong");
    }

    // Hiển thị danh sách
    static void showBooks() {

        for (Book b : books) {
            System.out.println(b.toString());
        }
    }

    static void updateBook() {

        System.out.print("Nhap id can sua: ");
        int id = sc.nextInt();
        sc.nextLine();

        // Duyệt danh sách
        for (Book b : books) {

            // Nếu tìm thấy
            if (b.getId() == id) {

                System.out.print("Nhap ten moi: ");
                b.setTitle(sc.nextLine());

                System.out.print("Nhap tac gia moi: ");
                b.setAuthor(sc.nextLine());

                System.out.println("Sua thanh cong");
                return;
            }
        }

        System.out.println("Khong tim thay sach");
    }

    static void deleteBook() {

        System.out.print("Nhap id can xoa: ");
        int id = sc.nextInt();
        sc.nextLine();

        // Duyệt danh sách sách
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);

            // Kiểm tra id
            if (b.getId() == id) {
                books.remove(i);
                System.out.println("Xoa thanh cong");
                return;
            }
        }

        System.out.println("Khong tim thay sach");
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi");
            System.out.println("3. Sua sach");
            System.out.println("4. Xoa sach");
            System.out.println("0. Thoat");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addBook();
                    break;

                case 2:
                    showBooks();
                    break;

                case 3:
                    updateBook();
                    break;

                case 4:
                    deleteBook();
                    break;

                case 0:
                    return;
            }
        }
    }
}

