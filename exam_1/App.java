public class App {
    public static void main(String[] args) {
      
      //Student Class
      
      Student Vincent = new Student ();

      Vincent.surname = "Mullet";
      Vincent.firstName = "Vincent Jay";
      Vincent.middleInitial = 'R';
      Vincent.dateOfBirth = "06/14/2004";
      Vincent.studentNumber = "2022101527";
      Vincent.studentEmailAddress = "mulletvr@students.national-u.edu.ph";
      Vincent.IAmAwesome = true;
      
      // print
      
      Vincent.sayMysurname ();
      Vincent.sayMyfirstName ();
      Vincent.sayMymiddleInitial ();
      Vincent.sayMydateOfBirth ();
      Vincent.sayMystudentNumber ();
      Vincent.sayMystudentEmailAddress ();
      Vincent.amIAwesome ();
        
    }
      
}
