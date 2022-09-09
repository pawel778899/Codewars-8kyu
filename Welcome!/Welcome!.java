import java.util.HashMap;

public class Welcome {
  public static String greet(String language){
    HashMap<String, String> greeting = new HashMap<>();
    greeting.put("english", "Welcome");
    greeting.put("czech", "Vitejte");
    greeting.put("danish", "Velkomst");
    greeting.put("dutch", "Welkom");
    greeting.put("estonian", "Tere tulemast");
    greeting.put("finnish", "Tervetuloa");
    greeting.put("flemish", "Welgekomen");
    greeting.put("french", "Bienvenue");
    greeting.put("german", "Willkommen");
    greeting.put("irish", "Failte");
    greeting.put("italian", "Benvenuto");
    greeting.put("latvian", "Gaidits");
    greeting.put("lithuanian", "Laukiamas");
    greeting.put("polish", "Witamy");
    greeting.put("spanish", "Bienvenido");
    greeting.put("swedish", "Valkommen");
    greeting.put("welsh", "Croeso");
    
    if (greeting.containsKey(language)) {
      return greeting.get(language);
    }
    return greeting.get("english");
   }
}







// DESCRIPTION:
// Your start-up's BA has told marketing that your website has a large audience in Scandinavia and surrounding countries. Marketing thinks it would be great to welcome visitors to the site in their own language. Luckily you already use an API that detects the user's location, so this is an easy win.

// The Task
// Think of a way to store the languages as a database (eg an object). The languages are listed below so you can copy and paste!
// Write a 'welcome' function that takes a parameter 'language' (always a string), and returns a greeting - if you have it in your database. It should default to English if the language is not in the database, or in the event of an invalid input.
// The Database
// english: "Welcome",
// czech: "Vitejte",
// danish: "Velkomst",
// dutch: "Welkom",
// estonian: "Tere tulemast",
// finnish: "Tervetuloa",
// flemish: "Welgekomen",
// french: "Bienvenue",
// german: "Willkommen",
// irish: "Failte",
// italian: "Benvenuto",
// latvian: "Gaidits",
// lithuanian: "Laukiamas",
// polish: "Witamy",
// spanish: "Bienvenido",
// swedish: "Valkommen",
// welsh: "Croeso"
// Possible invalid inputs include:

// IP_ADDRESS_INVALID - not a valid ipv4 or ipv6 ip address
// IP_ADDRESS_NOT_FOUND - ip address not in the database
// IP_ADDRESS_REQUIRED - no ip address was supplied
// FUNDAMENTALS
