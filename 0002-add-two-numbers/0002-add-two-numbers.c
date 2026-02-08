struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {

    struct ListNode* dummy = malloc(sizeof(struct ListNode));
    dummy->val = 0;
    dummy->next = NULL;

    struct ListNode* current = dummy;
    int carry = 0;

    while (l1 != NULL || l2 != NULL || carry != 0) {

        int v1 = (l1 != NULL) ? l1->val : 0;
        int v2 = (l2 != NULL) ? l2->val : 0;

        int sum = v1 + v2 + carry;

        carry = sum / 10;
        int digit = sum % 10;

        struct ListNode* node = malloc(sizeof(struct ListNode));
        node->val = digit;
        node->next = NULL;

        current->next = node;
        current = current->next;

        if (l1) l1 = l1->next;
        if (l2) l2 = l2->next;
    }

    return dummy->next;
}

