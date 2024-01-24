// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class wihoutVowels {
    public static void main(String[] args) {
        String withVowels = "This website is for losers LOL!";
        String withoutVowels = withVowels.replaceAll("[aeiou]", "");

        System.out.println(withoutVowels);
    }
}