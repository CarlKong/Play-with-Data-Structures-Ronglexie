/**
 * LeetCode 203
 * https://leetcode.com/problems/remove-linked-list-elements/description/
 * <p>
 * 删除链表中等于给定值 val 的所有节点
 * <p>
 * 普通处理方法
 *
 * @author carl
 * @version 2020/8/12
 */
class RemoveLinkedListElementsSolutionSimple {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        ListNode head = new ListNode(array);

        ListNode listNode = new RemoveLinkedListElementsSolutionDummyHead().removeElements(head, 3);

        System.out.println(listNode.toString());
    }

    public ListNode removeElements(ListNode head, int val) {
        // 判断头节点是否符合条件，符合即删除
        while (head != null && head.val == val) {
            ListNode delNode = head;
            head = head.next;
            delNode.next = null;
        }

        // 判断头节点是否为空
        if (head == null) {
            return head;
        }

        ListNode prev = head;

        // 循环处理后面的节点
        while (prev.next != null) {
            if (prev.next.val == val) {
                ListNode delNode = prev.next;
                prev.next = delNode.next;
                delNode.next = null;
            } else {
                prev = prev.next;
            }
        }
        return head;
    }
}

