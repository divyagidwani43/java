public class speedconverter {
    //right click on src --> new -->class
    //we can put code in one class and call ir in another
    //we need to right click in the class code and then run to run it when running it for the first time
    // then we can use top right corner icon

    //code stays in speed converter class and will be called in main class


    public static void main(String[] args) {

    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0)
            System.out.println("invalid value");
        else {
            double milesPerHour = kilometersPerHour / 1.609;
            System.out.println(kilometersPerHour + " km/hr = " + milesPerHour + " Mi/hr");
        }
    }
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour<0)
            return -1;
        else{
            long milesPerHOur= Math.round(kilometersPerHour/1.60900);
            return milesPerHOur;}
    }
}
