package LinearSearch;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Programming";
        char target = 'h';
        System.out.println(search(name,target));
        System.out.println(search2(name,target));

    }
    static boolean search(String str,char target)  {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.length()) {
                return true;
            }

        }

        return false;

    }

    static boolean search2(String str,char target)  {
        if (str.length() == 0) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }

        return false;

    }
}
