class Minutes extends ConsoleProgram {

  /**
  * Description: Enters a number of minutes, and that will calculate the number of days, hours and minutes that represents.
  * @author: Mr. Fabroa
  */
  
  public void run() {

    int intMinutes;
    int intDays;
    int intHours;

    int intLeftOverMinutes;
    
    // Get number of minutes from the user
    intMinutes = readInt("Enter number of minutes: ");

    //Compute days, hours, minutes
    intDays = intMinutes/(1440);
    intLeftOverMinutes = intMinutes % 1440;

    intHours  = intLeftOverMinutes/60;
    intLeftOverMinutes = intLeftOverMinutes % 60;
   
    // Output answer.
    System.out.println (intDays + " day(s) " + intHours + " hour(s) " + intLeftOverMinutes + " minute(s).");
  }
}