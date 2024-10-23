public class Variables {

    public static void main(String[] args) {
        // Types primitifs
        byte myByte = 127;        // Un entier sur 8 bits (valeurs de -128 à 127)
        short myShort = 32767;    // Un entier sur 16 bits (valeurs de -32,768 à 32,767)
        int myInt = 2147483647;   // Un entier sur 32 bits (valeurs de -2^31 à 2^31-1)
        long myLong = 9223372036854775807L; // Un entier sur 64 bits (valeurs de -2^63 à 2^63-1)

        float myFloat = 3.14f;    // Un nombre à virgule flottante sur 32 bits
        double myDouble = 3.14159265359;  // Un nombre à virgule flottante sur 64 bits

        char myChar = 'A';        // Un caractère unique
        boolean myBoolean = true; // Un booléen (true ou false)

        // Types référence (ou objets)
        String myString = "Ceci est une chaîne de caractères";

        // Affichage des différentes variables
        System.out.println("Types primitifs:");
        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println("char: " + myChar);
        System.out.println("boolean: " + myBoolean);

        System.out.println("\nTypes référence:");
        System.out.println("String: " + myString);
    }
}