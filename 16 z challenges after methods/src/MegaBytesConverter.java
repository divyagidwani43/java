public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes<0)
            System.out.println("invalid value");
        //1 mb = 1024kb
        int megaByte= kiloBytes/1024;
        int remainingKiloBytes = kiloBytes % 1024;
        System.out.println(kiloBytes+" Kb = "+megaByte+" mbs and "+remainingKiloBytes+" kbs");
    }
}
