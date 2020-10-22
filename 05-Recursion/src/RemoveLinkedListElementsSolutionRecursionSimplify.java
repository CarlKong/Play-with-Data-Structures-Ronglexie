/**
 * LeetCode 203
 * https://leetcode.com/problems/remove-linked-list-elements/description/
 * <p>
 * 删除链表中等于给定值 val 的所有节点
 * <p>
 * 递归处理方法【简化版】
 *
 * @author carl
 * @version 2020/8/12
 */
public class RemoveLinkedListElementsSolutionRecursionSimplify {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        ListNode head = new ListNode(array);

        ListNode listNode = new RemoveLinkedListElementsSolutionRecursionSimplify().removeElements(head, 3);

        System.out.println(listNode.toString());
    }

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        // 递归处理方法
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }
}
