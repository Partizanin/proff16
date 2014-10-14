package groupWork;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with Intellij IDEA.
 * Project name: proff16
 * User: Partizanin
 * Date: 13.07.2014
 * Time: 15:34
 * To change this template use File|Setting|File Templates.
 */
public class Revolution {

    public static void main(String[] args) {


        System.out.println(revolution("LIPTON"));
        System.out.println(revolution("JAVA"));
        System.out.println(revolution("GOOGLE"));
        System.out.println(revolution("MICROSOFT"));
    }

    public static String revolution(String str) {

        List<Character> result = new ArrayList<>(str.length());

        for (int i = str.length() - 1; i >= 0; i--) {

            result.add(str.charAt(i));
        }

        return result.toString();
    }
}
