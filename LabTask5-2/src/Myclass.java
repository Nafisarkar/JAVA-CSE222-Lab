import java.util.Objects;
import java.util.Scanner;

public class Myclass extends PhoneBook {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the total number of friends :");
        int t = scan.nextInt();
        scan.nextLine();
        PhoneBook[] book = new PhoneBook[t];
        for (int i=0;i<book.length;i++){

            System.out.println("Enter the name :");
            String name = scan.nextLine();
            System.out.println("Enter the phone :");
            String phone = scan.nextLine();
            System.out.println("Enter the email :");
            String email = scan.nextLine();
            book[i] = new PhoneBook();
            book[i].setName(name);
            book[i].setPhone(phone);
            book[i].setEmail(email);
        }
        for (PhoneBook phoneBook : book) {
            System.out.println("Name :" + phoneBook.getName() + "Phone :" + phoneBook.getPhone() + "Email :" + phoneBook.getEmail());
        }
        System.out.println("Enter the name you want to search :");
        String src_Name = scan.nextLine();
        boolean is_Found = false;
        for (PhoneBook phoneBook : book) {
            if (Objects.equals(phoneBook.getName(), src_Name)) {
                System.out.println("Found !");
                System.out.println(phoneBook.getName());
                System.out.println(phoneBook.getPhone());
                System.out.println(phoneBook.getEmail());
                is_Found = true;
            }
        }
        if(!is_Found){
            System.out.println("Not found!");
        }

        System.out.println("Enter the name you want to delete the info :");
        String src_Name_delete = scan.nextLine();
        for (PhoneBook phoneBook : book) {
            if (Objects.equals(phoneBook.getName(), src_Name_delete)) {
                System.out.println("Found ! & deleted all details");
                phoneBook.setName("");
                phoneBook.setPhone("");
                phoneBook.setEmail("");
            }
        }
    }
}
