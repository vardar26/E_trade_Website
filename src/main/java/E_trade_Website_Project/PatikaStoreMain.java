package E_trade_Website_Project;

import E_trade_Website_Project.service.CustomerService;

import java.util.Scanner;

public class PatikaStoreMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while(true){
            System.out.println("Patika Store'a hoş geldiniz!");
            System.out.println("1- Müşteri Kaydı");
            System.out.println("2- Giriş yap");
            System.out.println("3- Çıkış yap");

            System.out.println("Seçim yapınız...");
            String choise = scanner.nextLine();

            switch (choise)

            case "1":

                saveCustomer(scanner);
                break;

            case "2":

                loginCustomer(scanner);
                break;

            case"3":

                System.out.println("Çıkış yapılıyor...");;
                return;

            default:

                System.out.println("Geçersiz Seçim");



        }
    }

    private static void loginCustomer(Scanner scanner) { //TODO oluştur
    }

    private static void saveCustomer(Scanner scanner) {

        System.out.println("İsim: ");
        String name = scanner.nextLine();

        System.out.println("E-mail: ");
        String email = scanner.nextLine();

        System.out.println("Şifre: ");
        String password = scanner.nextLine();

        CustomerService customerService = new CustomerService();
        customerService.save(name, email, password);

    }
}
