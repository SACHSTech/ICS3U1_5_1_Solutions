class Hours extends ConsoleProgram {

  /**
  * Program that converts hours to days and hours
  * @author: Mr. Fabroa
  */
  
  public void run() {
    int intHours;
    int intDays;
    int intLeftOverHours;

    // Get hours from user
    intHours = readInt("Enter the number of hours: ");

    // Compute number of days and leftover hours
    intDays = intHours/24;
    intLeftOverHours = intHours % 24;

    // Output results
    System.out.println(intHours + " = " + intDays + " days and " + intLeftOverHours + " hours");
  }
}