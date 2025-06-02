public class fungsi {
    node head,tail;
    int size;
    tranksaksilayanan[] queue = new tranksaksilayanan[10];


    public fungsi(){
        head = null;
        tail = null;
        size = 0;
    }
    public boolean isEmpty(){
        return head == null;
    } 
    public void addfirst(pasien psn) {
        node newNode = new node(null, psn, null);
        if (isEmpty()) {
            head = tail = newNode; 
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;   
    }
   public pasien removeLast() {
    if (isEmpty()) {
        System.out.println("Antrian masih kosong, tidak dapat dihapus!");
        return null;
    } else if (head.next == null) {
        pasien data = head.data;
        head = tail = null;
        size--;
        return data;
    }
    node current = head;
    while (current.next != null) {
        current = current.next;
    }
    pasien data = current.data;
    current.prev.next = null;
    tail = current.prev;
    size--;
    return data;
}

    public void print() {
        if (!isEmpty()) {
            System.out.println("Antrian Pasien : ");
            node tmp = head;
            while (tmp != null) {
                tmp.data.tampilkanInformasi();
                tmp = tmp.next;
            }
        } else {
            System.out.println("Antrian kosong");
        }
    }
    public int size(){
        return size;
    }

}

