public final class rovar {

    //Det är fel i koden, därför får vi inte ut rätt när kör genom koden.
    //För att rätta till, lägg till bokstaven i raden nedan.

    private static String lower_consonants = "bcdfghjklmnpqrstvwxz";
    private static String upper_consonants = "BCDFGHJKLMNPQRSTVWXZ";

    //Skapa rövarspråkt av vanligt språk.
    /// <summary>
    /// Encode the string in rovarspraket.
    /// </summary>
    /// <param name="normal">Normal string.</param>
    /// <returns>Encoded string.</returns>
    public static String enrov (String normal) {
        if (normal == null)
            return null;
        StringBuilder builder = new StringBuilder();
        System.out.println("test null");

        for (char c : normal.toCharArray())
            if (lower_consonants.contains(String.valueOf(c)))
                builder.append(c + "o" + c);
            else if (upper_consonants.contains(String.valueOf(c)))
                builder.append(c + "o" + c);
            else
                builder.append(c);

        System.out.println(builder.toString());
        return builder.toString();

    }


    //Avkoda rövarspråk til vanligt språk
    /// <summary>
    /// Decode a string from rovarspraket.
    /// </summary>
    /// <param name="rov">Encoded string.</param>
    /// <returns>Normal string.</returns>
    public static String derov(String rov) {
        if (rov == null)
            return null;

        for (char c : lower_consonants.toCharArray()) {
            String find = (String.valueOf(c) + "o" + String.valueOf(c));
            rov = rov.replace(find, String.valueOf(c));
        }

        for (char c : upper_consonants.toCharArray()) {
            String find = (String.valueOf(c) + "o" + String.valueOf(c));
            rov = rov.replace(find, String.valueOf(c));
        }
        System.out.println(rov);
        return rov;

    }

}

