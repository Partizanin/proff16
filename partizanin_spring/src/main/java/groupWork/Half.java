package groupWork;

/**
 * Created with Intellij IDEA.
 * Project name: proff16
 * User: Partizanin
 * Date: 13.07.2014
 * Time: 15:36
 * To change this template use File|Setting|File Templates.
 */

public class Half {

    public static void main(String[] args) {

        System.out.println(half("LIPTON"));
        System.out.println(half("JAVA"));
        System.out.println(half("MICROSOFT"));
    }

    public static String half(String str) {

        int midpoint = str.length() / 2;
        String firstHalf = str.substring(0, midpoint);
        String secondHalf = str.substring(midpoint);
        String result = secondHalf + firstHalf;

        return result;
    }
}
