class Solution {
    public void reorderList(ListNode head) {
        // Edge case: If list is empty or has only 1 node, no reordering needed
        if (head == null || head.next == null) return;

        // 1. Find the middle (Your code)
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Reverse the second half (Your code)
        ListNode second = slow.next;
        slow.next = null; // CRITICAL: Break the connection between the two halves!
        ListNode prev = null;

        while (second != null) {
            ListNode temp = second.next;
            second.next = prev;
            prev = second;
            second = temp;
        }

        // 3. MERGE 2 HALVES (The Missing Piece)
        ListNode first = head;
        second = prev; // 'prev' is currently standing on the head of the reversed half

        // We only need to check 'second != null' because the second half 
        // will always be equal to or 1 node shorter than the first half.
        while (second != null) {
            // A. Save the futures
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            // B. Weave the pointers
            first.next = second;   // 1 -> 5
            second.next = temp1;   // 5 -> 2

            // C. Step forward for the next loop
            first = temp1;         // Move first to 2
            second = temp2;        // Move second to 4
        }
    }
}