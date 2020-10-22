/**
 * LeetCode 203
 * https://leetcode.com/problems/remove-linked-list-elements/description/
 * <p>
 * 删除链表中等于给定值 val 的所有节点
 * <p>
 * 递归处理方法
 *
 * @author carl
 * @version 2020/8/12
 */
public class RemoveLinkedListElementsSolutionRecursion {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        ListNode head = new ListNode(array);

        ListNode listNode = new RemoveLinkedListElementsSolutionRecursion().removeElements(head, 3);

        System.out.println(listNode.toString());
    }

    public ListNode removeElements(ListNode head, int val) {

        if (head == null) {
            return null;
        }

        // 递归处理方法
        ListNode res = removeElements(head.next, val);
        if (head.val == val) {
            return res;
        } else {
            head.next = res;
            return head;
        }
    }
}
