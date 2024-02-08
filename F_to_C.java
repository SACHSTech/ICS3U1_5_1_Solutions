class F_to_C extends ConsoleProgram {

  /**
  * Description: Program that converst Fahrenheit to Celsius
  * @author: Mr. Fabroa
  */
  
  public void run() {

    double dblCelsius;
    double dblFahrenheit;
    
    // Get Fahrenheit
    dblFahrenheit = readDouble("Enter the temperature in degrees Fahrenheit: ");

    // Compute Celsius
    dblCelsius = 5.0/9.0 * (dblFahrenheit - 32);

    // Output Celsius
    System.out.println(dblFahrenheit + " degrees Fahrenheit = " + dblCelsius + " degrees Celsius.");
  }
}