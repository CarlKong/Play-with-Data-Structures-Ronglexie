/**
 * @author carl
 * @version 2020/9/1
 */
public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.add("word");
        boolean isContains = trie.contains("word");
        System.out.println(isContains);
    }
}
