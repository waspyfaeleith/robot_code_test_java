import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to `Robots on Mars`");

        System.out.println("Enter the dimensions size of the map: ");
        String dimensions = in.nextLine();

        String[] dims = dimensions.split(" ");
        int x = Integer.parseInt(dims[0]);
        int y = Integer.parseInt(dims[1]);

        Grid grid = new Grid(x, y);


        System.out.println("Enter the robot start position and orientation: ");
        String pos = in.nextLine();
        Robot robot = new Robot(pos, grid);

        System.out.println("Enter the robot instructions: ");
        String instructions = in.nextLine();
        robot.carryOutInstructions(instructions);

        System.out.println(robot.getPosition());

    }
}
