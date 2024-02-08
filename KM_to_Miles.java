class KM_to_Miles extends ConsoleProgram {

  /**
  * Description: Program converts km to miles
  * @author: Mr. Fabroa
  */
  
  public void run() {

    double dblKm;
    double dblMiles;
    
    // Get KM
    dblKm = readDouble("Enter the distance in KM: ");

    // Compute Miles
    dblMiles = dblKm * 0.621371;

    // Output result
    System.out.println(dblKm + " km = " + dblMiles + " miles.");
  }
}