import java.util.*;

public class OTP {

    public static String generateOTP() {
        Random random = new Random();
        int otp = 100000 + random.nextInt(900000); 
        return String.valueOf(otp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String generatedOTP = generateOTP();
        System.out.println("Your OTP is: " + generatedOTP);
        System.out.print("Enter the OTP: ");
        String enteredOTP = sc.nextLine();
        if (enteredOTP.equals(generatedOTP)) 
            System.out.println("Login Successful!");
        else 
            System.out.println("Invalid OTP. Login Failed.");
        sc.close();
    }
}