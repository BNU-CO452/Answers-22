public class Program 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";

    private static int age;

    public static void main(String[] args)
    {
        System.out.println(ConsoleColours.ANSI_BG_BLUE);
        System.out.println(CONSOLE_CLEAR);

        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();

        age = InputReader.getInt("Please enter your age > ");
        System.out.println("You were born in " + (2022 - age));
        System.out.println();
        
        Week01 exercise01 = new Week01();
        exercise01.run();
    }
}
