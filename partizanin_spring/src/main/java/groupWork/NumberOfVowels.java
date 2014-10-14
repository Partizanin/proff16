package groupWork;

/**
 * Created with Intellij IDEA.
 * Project name: proff16
 * User: Partizanin
 * Date: 13.07.2014
 * Time: 15:37
 * To change this template use File|Setting|File Templates.
 */
public class NumberOfVowels {

    public static void main(String[] args) {

        System.out.println("Результат " + counter("alala") + " Ожидаеться 3");
        System.out.println("Результат " + counter("Bkjdsbndo;sj") + " Ожидаеться 1");
        System.out.println("Результат " + counter("[];'.;l,mononaeiou") + " Ожидаеться 7");
    }

    public static String counter(String str) {

        char[] vowels = {'A', 'E', 'I', 'O', 'U'};

        int count = 0;

        str = str.toUpperCase();

        char[] words = str.toCharArray();


        for (char vowel : vowels) {
            for (char word : words) {
                if (vowel == word) {
                    count++;
                }
            }
        }

        return String.valueOf(count);
    }

}
