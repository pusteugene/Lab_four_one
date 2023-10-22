public class PalindromeChecker {

    public static boolean isPalindrome(String word) {
        // Прибираємо пробіли та знижуємо регістр
        word = word.replaceAll("\\s", "").toLowerCase();

        // Зворотній порядок символів
        String reversedWord = new StringBuilder(word).reverse().toString();

        // Порівнюємо оригінальне слово зі зворотнім
        return word.equals(reversedWord);
    }

    public static void main(String[] args) {
        String word = "Racecar";
        if (isPalindrome(word)) {
            System.out.println(word + " є паліндромом.");
        } else {
            System.out.println(word + " не є паліндромом.");
        }
    }
}
