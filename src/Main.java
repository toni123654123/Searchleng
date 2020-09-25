import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter strig: ");
        String st = scanner.nextLine();
        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < st.length();i++){
            LinkedList<Character> list = new LinkedList<>();
            list.add(st.charAt(i));
            for (int j = i+1;j<st.length();j++){
                if (st.charAt(j)>list.getLast()){
                    list.add(st.charAt(j));
                }
            }
            if (list.size()>max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character character : max) {
            System.out.print(character);
        }
    }
}
