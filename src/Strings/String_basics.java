package Strings;

public class String_basics {
    public static void main(String[] args) {

        String s = "  Hello Titan  ";
        String s2 = "hello";

        // 1. Basic Info
        System.out.println("Length: " + s.length());
        System.out.println("Is Empty: " + s.isEmpty());

        // 2. Access Characters
        System.out.println("Char at 1: " + s.charAt(1));
        char[] arr = s.toCharArray();
        System.out.println("Char Array: ");
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 3. Comparison
        System.out.println("Equals: " + s.equals(s2));
        System.out.println("Equals Ignore Case: " + s.equalsIgnoreCase(s2));
        System.out.println("CompareTo: " + s.compareTo(s2));

        // 4. Searching
        System.out.println("IndexOf 'lo': " + s.indexOf("lo"));
        System.out.println("LastIndexOf 'l': " + s.lastIndexOf("l"));
        System.out.println("Contains 'Titan': " + s.contains("Titan"));

        // 5. Substring
        System.out.println("Substring(2): " + s.substring(2));
        System.out.println("Substring(2, 7): " + s.substring(2, 7));

        // 6. Modification
        System.out.println("Trim: '" + s.trim() + "'");
        System.out.println("To Upper: " + s.toUpperCase());
        System.out.println("To Lower: " + s.toLowerCase());
        System.out.println("Replace: " + s.replace("Titan", "Bro"));

        // 7. Split & Join
        String csv = "a,b,c";
        String[] parts = csv.split(",");
        System.out.println("Split:");
        for (String part : parts) {
            System.out.print(part + " ");
        }
        System.out.println();

        String joined = String.join("-", parts);
        System.out.println("Joined: " + joined);

        // 8. Starts & Ends
        System.out.println("StartsWith 'He': " + s.trim().startsWith("He"));
        System.out.println("EndsWith 'an': " + s.trim().endsWith("an"));

        // 9. Conversion
        int x = 100;
        String numStr = String.valueOf(x);
        System.out.println("ValueOf: " + numStr);

        String formatted = String.format("Value is %d", x);
        System.out.println("Formatted: " + formatted);

        // 10. Advanced
        String concatStr = "Hello".concat(" World");
        System.out.println("Concat: " + concatStr);

        System.out.println("Matches regex [a-z]+: " + s2.matches("[a-z]+"));

        // 11. StringBuilder (IMPORTANT)
        StringBuilder sb = new StringBuilder("hello");

        sb.append(" world");
        System.out.println("Append: " + sb);

        sb.insert(0, "Say ");
        System.out.println("Insert: " + sb);

        sb.delete(0, 4);
        System.out.println("Delete: " + sb);

        sb.reverse();
        System.out.println("Reverse: " + sb);
    }
}