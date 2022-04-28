import java.util.Arrays;
import java.util.Objects;

public class ControlStructure {
    public static void main(String[] args) {
        System.out.println(notQuiteLisp("(()(()("));
        System.out.println(notQuiteLispUsingStreams("(()(()("));
    }

    /**Advent Of Code 2015 Day 1
    For example:
            (()) and ()() both result in floor 0.
            ((( and (()(()( both result in floor 3.
            ))((((( also results in floor 3.
            ()) and ))( both result in floor -1 (the first basement level).
            ))) and )())()) both result in floor -3.
     **/

    public static int notQuiteLisp(String str){
    int floor = 0;
    String[] stringArray = str.split("");
    for (String s : stringArray) {
            if (s.equals("(")) floor++;
            else floor--;
        }
        return floor;
    }

    public static int notQuiteLispUsingStreams(String str){
        String[] stringArray = str.split("");
        return Arrays.stream(stringArray).mapToInt(element -> {
            int floor = 0;
        if(element.equals("(")) floor++;
        else floor--;
        return floor;
        }).sum();
    }
}
