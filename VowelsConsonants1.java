public class VowelsConsonants1 {

    public static String vowelscons(String s) {
        int vowelcount = 0;
        int conscount = 0;

        for(int i = 0; i < s.length(); i++) {

            char ch = Character.toLowerCase(s.charAt(i));

            if(ch >= 'a' && ch <= 'z') {   // check only letters

                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelcount++;
                } else {
                    conscount++;
                }
            }
        }

        return "Vowels: " + vowelcount + " Consonants: " + conscount;
    }

    public static void main(String[] args) {
        String s = "Hello123@";
        System.out.println(vowelscons(s));
    }
}