package BitManipulation;

// ===============================
// BIT MANIPULATION NOTES IN JAVA
// ===============================

public class AndOrXorXnor {

    public static void main(String[] args) {

        int a = 5; // Binary: 0101

        // 1. AND Operator (&)
        // Both bits must be 1
        System.out.println("AND: " + (a & 3));
        // 0101 & 0011 = 0001 => 1


        // 2. OR Operator (|)
        // At least one bit is 1
        System.out.println("OR: " + (a | 3));
        // 0101 | 0011 = 0111 => 7


        // 3. XOR Operator (^)
        // Same bits => 0
        // Different bits => 1
        System.out.println("XOR: " + (a ^ 3));
        // 0101 ^ 0011 = 0110 => 6


        // 4. NOT Operator (~)
        // Flips all bits
        System.out.println("NOT: " + (~a));


        // 5. Left Shift (<<)
        // Multiply by 2
        System.out.println("Left Shift: " + (a << 1));
        // 5 * 2 = 10


        // 6. Right Shift (>>)
        // Divide by 2
        System.out.println("Right Shift: " + (a >> 1));
        // 5 / 2 = 2

        // 7. Unsigned Right Shift (>>>)
        System.out.println("Unsigned Right Shift: " + (-5 >>> 1));


        // IMPORTANT BIT MANIPULATION TRICKS
        int n = 13; // 1101

        // 8. Check ith bit is SET or not
        int i = 2;
        if ((n & (1 << i)) != 0) {
            System.out.println("Bit is SET");
        } else {
            System.out.println("Bit is NOT SET");
        }

        // 9. Set ith Bit
        int setBit = n | (1 << 1);
        System.out.println("Set Bit: " + setBit);

        // 10. Clear ith Bit
        int clearBit = n & ~(1 << 2);
        System.out.println("Clear Bit: " + clearBit);

        // 11. Toggle ith Bit
        int toggleBit = n ^ (1 << 0);
        System.out.println("Toggle Bit: " + toggleBit);

        // 12. Count Number of Set Bits
        int count = 0;
        int temp = n;
        while (temp > 0) {
            count += (temp & 1);
            temp >>= 1;
        }
        System.out.println("Set Bits Count: " + count);

        // 13. Check Even or Odd
        if ((n & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // 14. Swap Two Numbers without temp
        int x = 10;
        int y = 20;
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // 15. Check Power of 2
        int num = 16;
        if ((num & (num - 1)) == 0) {
            System.out.println("Power of 2");
        } else {
            System.out.println("Not Power of 2");
        }


        // 16. Remove Lowest Set Bit
        int val = 12; // 1100
        val = val & (val - 1);
        System.out.println("After Removing Lowest Set Bit: " + val);


        // 17. Find Lowest Set Bit
        int lowest = n & (-n);

        System.out.println("Lowest Set Bit: " + lowest);


        // 18. XOR Properties

//         a ^ a = 0
//         a ^ 0 = a
        // XOR is reversible

        int p = 7;
        System.out.println(p ^ p); // 0
        System.out.println(p ^ 0); // 7


        // 19. Find Unique Element
        int[] arr = {2, 3, 4, 3, 2};
        int unique = 0;
        for (int ele : arr) {
            unique ^= ele;
        }
        System.out.println("Unique Element: " + unique);


        // 20. Convert Lowercase to Uppercase
        char ch = 'a';
        char upper = (char) (ch & '_');
        System.out.println("Uppercase: " + upper);


        // 21. Convert Uppercase to Lowercase
        char ch2 = 'A';
        char lower = (char) (ch2 | ' ');
        System.out.println("Lowercase: " + lower);


        // 22. Fast Exponentiation
        int base = 2;
        int power = 10;
        long ans = 1;
        while (power > 0) {
            if ((power & 1) == 1) {
                ans *= base;
            }
            base *= base;
            power >>= 1;
        }
        System.out.println("Fast Power: " + ans);

        // 23. Binary Representation
        int number = 13;
        System.out.println(Integer.toBinaryString(number));

        // 24. Built-in Methods
        System.out.println(Integer.bitCount(13));
        System.out.println(Integer.highestOneBit(13));
        System.out.println(Integer.lowestOneBit(13));
        System.out.println(Integer.numberOfLeadingZeros(13));
        System.out.println(Integer.numberOfTrailingZeros(16));
    }
}