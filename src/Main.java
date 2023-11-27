import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter Movie Name: ");
        String movieName = console.next(); // get the movie name from the user

        System.out.println();
        System.out.print("Enter Adult Ticket Price: ");

        double adultTicketPrice = console.nextDouble(); // get the adult ticket price from the user
        System.out.println();
        System.out.print("Enter Child Ticket Price: ");

        double childTicketPrice = console.nextDouble(); // get the child ticket price from the user
        System.out.println();
        System.out.print("Enter Number Of Adult Tickets Sold: ");

        int numberOfAdultTicketsSold = console.nextInt(); // get the number of sold tickets (adult type)
        System.out.println();
        System.out.print("Enter Number Of Child Tickets Sold: ");

        int numberOfChildTicketsSold = console.nextInt(); // get the number of sold tickets (child type)
        System.out.println();
        System.out.print("Enter Percentage Of Charity Donations: ");

        double percentageOfCharityDonation = console.nextDouble(); // get the percentage of total sold tickets amount for charity donations





    }
}