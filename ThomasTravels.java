import java.util.*;

class Customer {
    int id;
    String name;
    String destination;

    Customer(int id, String name, String destination) {
        this.id = id;
        this.name = name;
        this.destination = destination;
    }

    void display() {
        System.out.println(id + "\t" + name + "\t" + destination);
    }
}

public class ThomasTravels {

    static ArrayList<Customer> bookings = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;
        do {
            System.out.println("\n--- Thomas Travels Management System ---");
            System.out.println("1. View Travel Packages");
            System.out.println("2. Add Booking");
            System.out.println("3. View All Bookings");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    showPackages();
                    break;
                case 2:
                    addBooking();
                    break;
                case 3:
                    viewBookings();
                    break;
                case 4:
                    System.out.println("Thank you for using Thomas Travels!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);
    }

    static void showPackages() {
        System.out.println("\nAvailable Travel Packages:");
        System.out.println("1. Goa Tour – 5 Days – ₹15,000");
        System.out.println("2. Kerala Tour – 7 Days – ₹22,000");
        System.out.println("3. Manali Tour – 6 Days – ₹20,000");
    }

    static void addBooking() {
        System.out.print("Enter Customer ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Destination: ");
        String destination = sc.nextLine();

        bookings.add(new Customer(id, name, destination));
        System.out.println("Booking added successfully!");
    }

    static void viewBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings found!");
        } else {
            System.out.println("\nID\tName\tDestination");
            for (Customer c : bookings) {
                c.display();
            }
        }
    }
}

