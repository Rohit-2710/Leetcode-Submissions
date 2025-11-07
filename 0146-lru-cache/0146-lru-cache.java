class LRUCache {

    Map<Integer, dll> hm = new HashMap<>();
    int k = 0;
    dll head = null;
    dll tail = null;

    public LRUCache(int capacity) {
        k = capacity;
    }

    public int get(int key) {
        if (!hm.containsKey(key)) {
            return -1;
        }

        dll node = hm.get(key);
        moveToTail(node);
        return node.value;
    }

    public void put(int key, int value) {
        // If key already exists, update and move to tail
        if (hm.containsKey(key)) {
            dll node = hm.get(key);
            node.value = value;
            moveToTail(node);
            return;
        }

        dll newNode = new dll(key, value, null, null);

        // If cache full → remove head (LRU)
        if (hm.size() == k) {
            hm.remove(head.key);
            removeHead();
        }

        // Add new node at tail
        addToTail(newNode);
        hm.put(key, newNode);
    }


    private void moveToTail(dll node) {
        if (node == tail) return; // already most recently used

        // Detach node from current position
        if (node.prev != null) {
            node.prev.next = node.next;
        } else {
            head = node.next; // node was head
        }

        if (node.next != null) {
            node.next.prev = node.prev;
        }

        // Move node to tail
        node.prev = tail;
        node.next = null;

        if (tail != null) {
            tail.next = node;
        }

        tail = node;

        // If list was of size 1 before move
        if (head == null) {
            head = node;
        }
    }

    private void removeHead() {
        if (head == null) return;

        if (head == tail) {
            head = tail = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    private void addToTail(dll node) {
        if (head == null) {
            head = tail = node;
            return;
        }

        tail.next = node;
        node.prev = tail;
        tail = node;
    }
}

// Doubly linked list node
class dll {
    dll prev;
    int key;
    int value;
    dll next;

    public dll(int k, int val, dll p, dll n) {
        key = k;
        value = val;
        prev = p;
        next = n;
    }
}
