import java.util.Scanner;


public class App {

    static Scanner scan = new Scanner(System.in);

        
    public static void main(String[] args) throws Exception {
        Integer();
        Prime();
        length();
        LARGEST();
        vowel();
        Identification();
        UpperOrLower();
        nestedCondition();
        Strand();
        email();
        ATM();
      

    }
        // Long exam 2
        // Total points possible (100 pts)
        // Methods and Conditions

        // Part I
        // 1. Create a method.
        // 2. Call the method.
        // 3. Print result of the method.

        // ==============================================================================
        // 1. Create a method that will:
        // print "POSITIVE" if the number is a positive number. 
        // print "NEGATIVE" if the number is a negative number. 
        // print "ZERO" if the number is ZERO. 
        //(10 pts)
        static void Integer() {
        
        System.out.println("1. Positive, negative, zero");
        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        if (number > 0){
            System.out.println("Positive");            
        } else if (number < 0){
            System.out.println("Negative");
        } else
            System.out.println("zero");
        }
        
    
        

        // ==============================================================================

         // 2. Create a method that will:
        // print "PRIME" if the last digit of your student number is a prime number
        // print "COMPOSITE" if the last digit of your student number is a composite
        // number.
        // print "NEITHER" if the last digit of your student number is neither a prime
        // or a composite number.
        // (10 pts)

        static void Prime() {
        System.out.println("2. PRIME or COMPOSITE numbers");
        System.out.print("Enter the last digit of your student number: ");

        int lastDigit = scan.nextInt();
        if(lastDigit == 2 || lastDigit ==  3 || lastDigit ==  5||lastDigit ==  7){
            System.out.println("PRIME");
        } else if (lastDigit == 4 || lastDigit == 6 || lastDigit ==8 || lastDigit == 9){
           System.out.println("COMPOSITE");
        } else  {
            System.out.println("NEITHER");
        }
    }
        

        // ==============================================================================

          // 3. Create a method that will return the sum of the character length of your
        // firstname and your surname. (10 pts)
        static void length() {
        System.out.println("3. Length of your fullname");
        System.out.print("Enter your firstname: ");
        String firstName = scan.next();
        System.out.print("Enter your surname: ");
        String surName = scan.next();
        int first = firstName.length();
        int sur = surName.length();
        System.out.println("The sum of characters your firstname is: " + (first + sur));
        }

        // ==============================================================================

        // 4. Create a method that will take three whole numbers and print the largest number.

        static void LARGEST() {
        System.out.println("4. Largest Number");
        System.out.print("Enter your first number: ");
        int firstNumber = scan.nextInt();
        System.out.print("Enter your second number: ");
        int secondNumber = scan.nextInt();
        System.out.print("Enter your third number: ");
        int thirdNumber = scan.nextInt();
        

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber){
            System.out.println(firstNumber + " is the largest number");
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber){
            System.out.println(secondNumber + " is the largest number");
        } else { 
            System.out.println(thirdNumber + " is the largest number");
        }
        }

        // ==============================================================================

        // 5. Create a method that will print "VOWEL" if your name starts with
        // a vowel and "CONSONANT" if your name starts with a consonant.
       
        static void vowel(){
        System.out.println("5. Vowel or Consonant");
        System.out.print("Enter the first character of your first name: ");
        char firstChar = scan.next().charAt(0);

        if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u'
        || firstChar == 'A' || firstChar == 'E' || firstChar == 'I' || firstChar == 'O' || firstChar == 'U')
             System.out.println("VOWEL");
             else 
             System.out.println("CONSONANT");
        }
       
        // =========================================================================================================================

        // Part II
        // Print "valid" if the result is true.
        // Print "invalid" if the result is false.

        // ==============================================================================
        // 6. Create a condition to check if the entered student number is your student
        // number. (10 pts)
       
        static void Identification(){
        System.out.println("6. Student number validation");
        System.out.print("Enter your ten digit student number: ");
        int StudentNumber = scan.nextInt();

        if (StudentNumber == 2022101527)
        System.out.println("valid");
        else
        System.out.println("invalid");
        }

        // ==============================================================================

        // 7. Create a condition to check if your firstname is in UPPERCASE and your
        // lastname is in lowercase. (10 pts)
        static void UpperOrLower() {
        System.out.println("7. Spelling checker");
        System.out.print("Enter your firstname in UPPERCASE: ");
        String firstName = scan.next();
        System.out.print("Enter your surname in lowercase: ");
        String surName = scan.next();

        if (firstName == firstName.toUpperCase() && surName == surName.toLowerCase())
        System.out.println("valid");
        else
        System.out.println("invalid");
    }
    

        // ==============================================================================

        // 8. Create a nested condition that will ask the specialization of the student
        // is taking
        // depending if the student is a BSIT or BSCS student.

        // Condition 1
        // if the student is BSIT, ask again if the student is taking MWAA or MAA.

        // Condition 2
        // if the student is BSCS, ask again if the student is taking ML or DF.
        static void nestedCondition(){
            System.out.println("8. Nested conditions");
            System.out.print("Enter your enrolled course (BSIT or BSCS): ");
            String course = scan.next();

     
            // If BSIT
            switch (course){
                case "BSIT":
            System.out.print("Enter your specialization (MWA or MAA): ");
            String specializationIT = scan.next();
            switch (specializationIT){
                case "MWA":
                System.out.println("You are a BSIT-MWA student");
                break;

                case "MAA":
                System.out.println("You are a BSIT-MAA student");
                break;
                
                default:
                System.out.println("invalid");

            }
            break;

            // If BSCS
            case "BSCS":{
            System.out.print("Enter your specialization (DF or ML): ");
            String specializationCS = scan.next();
            switch (specializationCS){
                case "ML":
                System.out.println("You are a BSCS-ML student");
                break;

                case "DF":
                System.out.println("You are a BSCS-DF student");
                break;

                default:
                System.out.println("invalid");
            
            }
        }

        }
    }




        // ==============================================================================

        // 9. Create a condition to check if the answer belongs to one of the possible
        // answers. (10 pts)

        // STEM
        // ICT
        // ABM
        // HUMSS
        // HOME ECONOMICS
        // ARTS AND DESIGN
        // TVL MARITIME
      
        static void Strand(){
        System.out.println("9. Selection");

        System.out.println("STEM");
        System.out.println("ICT");
        System.out.println("HUMSS");
        System.out.println("HOME ECONOMICS");
        System.out.println("ARTS AND DESIGN");
        System.out.println("TVL MARITIME");
        System.out.print("Enter your SHS strand: ");

        String strand = scan.next();
        switch (strand) {
           case "STEM":
           System.out.println("valid");
           break;

           case "ICT":
           System.out.println("valid");
           break;

           case "HUMSS":
           System.out.println("valid");
           break;

           case "HOME ECONOMICS":
           System.out.println("valid");
           break;

           case "ARTS AND DESIGN":
           System.out.println("valid");
           break;

           case "TVL MARITIME":
           System.out.println("valid");
           break;

           default:
           System.out.println("invalid");
           break;
        }
        
    }
        // ==============================================================================

        // 10. Create a condition to check if your student email address contains your
        // surname. (10 pts)
        static void email(){
        System.out.println("10. Validate student email address ");

        System.out.println("Enter your Email Address:");
        String studentEmail = scan.next();

        if (studentEmail.contains("mullet")) {
        System.out.println("valid");

        } else {
        System.out.println("invalid");
        }
    }
    // 11. Think like an ATM.

        // You have an N amount of pesos in your savings account and you have decided
        // that you want to withdraw all of your money in the ATM.

        // The denomination of peso bills that the ATM could dispense are 20, 50, 100,
        // 200, 500, 1000.

        // Create a method that will return the minimum number of peso bills that the
         //ATM will dispense after withdrawing all of your money.

        // Example:
        // Elizer has 150 pesos in his bank account. If elizer withdraws 150 pesos in
        // the ATM, the ATM will dispense two peso bills (100 peso bill and 50 peso
        // bill). (Answer is 2)

        
        //static void ATM(){

       // System.out.println("11. Think like an ATM");
        //System.out.println( "Welcome to the National-U Bank");
       // System.out.print("Enter the total amount of money in your bank account: ");
       // int amount = scan.nextInt();
       // System.out.println("Your total amount of money is" + amount);
       // System.out.print("how much would you like to withdraw?");
    
       
        
        
    
          

        // Close scanner
       // scan.close();

}
