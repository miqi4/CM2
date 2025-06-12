public class Transaksi {
    tranksaksilayanan[] antrian;
    int front, rear, size, max;
    public Transaksi(int kapasitas) {
        max = kapasitas;
        antrian = new tranksaksilayanan[kapasitas];
        front = size = 0;
        rear = -1;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == max;
    }
    public void enqueue(tranksaksilayanan t) {
        if (isFull()) {
            System.out.println("Queue transaksi penuh. Tidak bisa menambahkan transaksi.");
            return;
        }
        rear = (rear + 1) % max;
        antrian[rear] = t;
        size++;
    }
    public tranksaksilayanan dequeue() {
        if (isEmpty()) {
            System.out.println("Queue kosong.");
            return null;
        }
        tranksaksilayanan t = antrian[front];
        front = (front + 1) % max;
        size--;
        return t;
    }
    public void tampilkanTransaksi() {
        if (isEmpty()) {
            System.out.println("Tidak ada transaksi.");
            return;
        }
        System.out.println("=== Riwayat Transaksi ===");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            antrian[index].tampilkanTx();
        }
    }
}
