import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter Movie Name: ");
        String movieName = console.nextLine(); // get the movie name from the user

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

        int totalNumberOfTickets = numberOfAdultTicketsSold + numberOfChildTicketsSold; // total number of sold tickets

        double grossAmount = childTicketPrice * numberOfChildTicketsSold + adultTicketPrice * numberOfAdultTicketsSold; // total of sales

        double donationAmount = (grossAmount*percentageOfCharityDonation)/100;// total that goes for donations
        double totalNetSale = grossAmount - donationAmount; // total net sale

        String message = "Movie Name: "+movieName+"\nNumber Of Tickets Sold: "+totalNumberOfTickets+"\nGross Amount: $"+String.format("%.2f",grossAmount)+"\nPercentage of the Gross Amount Donated: $"+String.format("%.2f",percentageOfCharityDonation)+"%\nAmount Donated: $"+String.format("%.2f",donationAmount)+"\nNet Sale: $"+totalNetSale; // Dialog Message String
        JOptionPane.showMessageDialog(null,message,"Theater Sales Data",JOptionPane.INFORMATION_MESSAGE);



    }
}