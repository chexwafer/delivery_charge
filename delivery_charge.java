import java.util.Scanner;
public class delivery_charge {
  public static void main(String[] args) {
    double weight, delivery_charge;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter weight of your parcel in Kg");
    weight = input.nextDouble();
    if(weight < 2.5) {
      delivery_charge = weight * 3.50;
    }
    else if(weight >= 2.5 && weight <= 5) {
      delivery_charge = weight * 2.85;
    }
    else {
      delivery_charge = weight * 2.45;
    }
    System.out.println("Delivery charge is RM"+delivery_charge);
  }
}
