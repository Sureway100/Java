public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(1000);
    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        int result = kiloBytes / 1024;
        int remainder = kiloBytes % 1024;
        System.out.println(
                (kiloBytes < 0 ? "Invalid Value" : kiloBytes + " KB =" + result + " MB and " + remainder + " KB")
        );
    }
}
