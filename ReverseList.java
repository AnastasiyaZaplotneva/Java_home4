import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseList {

    public static LinkedList<Character> createAlphabetList() {
        LinkedList<Character> ll = new LinkedList<Character>();
        for (char i = 'a'; i <= 'z'; i++) {
            ll.add(i);
        }
        return ll;
    }

    public static LinkedList<Character> reverseAlphabetList(LinkedList<Character> ll) {
        LinkedList<Character> rl = new LinkedList<Character>();
        ListIterator i = ll.listIterator(ll.size());
        while (i.hasPrevious()) {
            rl.add((Character) i.previous());
            }
        return rl;
    }

    public static LinkedList<Character> alternativeReverse(LinkedList<Character> ll) {
        LinkedList<Character> rl = new LinkedList<Character>();
        Iterator<Character> i = ll.iterator();
        while(i.hasNext()) {
            rl.addFirst(i.next());
        }
        return rl;
    }
        public static void main(String[] args) {
        LinkedList<Character> alphabet = createAlphabetList();
        System.out.println(alphabet);
        LinkedList<Character> reverseAlphabet = reverseAlphabetList(alphabet);
        System.out.println(reverseAlphabet);
        LinkedList<Character> alternativeAlphabet = alternativeReverse(alphabet);
        System.out.println(alternativeAlphabet);
    }
    
}