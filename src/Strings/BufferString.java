package Strings;

public class BufferString {
    public static void main(String[] args) {
//     =======================
//     STRINGBUFFER
//     Mutable, Thread Safe
//     =======================

//     Create
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer("Hello");
        StringBuffer sb3 = new StringBuffer(50);

//     append() -> add at end
        sb2.append(" World");

//     insert() -> add at index
        sb2.insert(5, ",");

//     replace() -> replace range
        sb2.replace(0, 5, "Java");

//     delete() -> delete range
        sb2.delete(0, 4);

//     deleteCharAt() -> delete one char
        sb2.deleteCharAt(0);

//     reverse() -> reverse string
        sb2.reverse();

//     charAt() -> get char
        char ch = sb2.charAt(0);

//     setCharAt() -> modify char
        sb2.setCharAt(0, 'A');

//     length() -> current length
        int len = sb2.length();

//     capacity() -> storage capacity
        int cap = sb2.capacity();

//     ensureCapacity() -> increase capacity
        sb2.ensureCapacity(100);

//     trimToSize() -> reduce capacity to length
        sb2.trimToSize();

//     setLength() -> resize string
        sb2.setLength(5);

//     substring() -> extract string
        String s1 = sb2.substring(2);
        String s2 = sb2.substring(2, 5);

//     indexOf() -> first occurrence
        int idx1 = sb2.indexOf("a");

//     lastIndexOf() -> last occurrence
        int idx2 = sb2.lastIndexOf("a");

//     toString() -> String conversion
        String str = sb2.toString();


//     =======================
//     Method Chaining
//     =======================

        StringBuffer sb = new StringBuffer();

        sb.append("Java")
                .append(" ")
                .append("DSA");


//     =======================
//     Capacity
//     =======================

        StringBuffer a = new StringBuffer();
//        System.out.println(a.capacity());    16

        StringBuffer b = new StringBuffer("Hello");
//        System.out.println(b.capacity());    21

//     New Capacity Formula
//     (oldCapacity * 2) + 2


//     =======================
//     Traversal
//     =======================

        for (int i = 0; i < sb.length(); i++) {
            System.out.println(sb.charAt(i));
        }


//     =======================
//     StringBuffer -> String
//     =======================

        String str1 = sb.toString();


//     =======================
//     String -> StringBuffer
//     =======================

        StringBuffer sb4 = new StringBuffer(str1);


//     =======================
//     StringBuffer vs StringBuilder
//     =======================

//     StringBuffer
//     Mutable
//     Thread Safe
//     Slower

//     StringBuilder
//     Mutable
//     Not Thread Safe
//     Faster
    }
}
