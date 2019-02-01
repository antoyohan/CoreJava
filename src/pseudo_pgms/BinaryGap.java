package pseudo_pgms;

public class BinaryGap {

    private static int binaryGap;

    public static void main(String[] args) {
        String binaryNumber = "10000010";
        System.out.println(getBinaryGap(binaryNumber));
    }

    private static int getBinaryGap(String binaryNumber) {
        int gapCounter = 0;
        int maxGap = 0;
        for (int i = binaryNumber.length() - 1; i >= 0; i--) {
            char c = binaryNumber.charAt(i);
            if (c == '0') {
                gapCounter++;
            } else {
                if (gapCounter > maxGap) maxGap = gapCounter;
                gapCounter = 0;
            }
        }


        return maxGap;
    }
}
