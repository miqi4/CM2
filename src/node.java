public class node {
    pasien data;
    node prev, next;
    node(node prev,pasien data,node next){
        this.prev=prev;
        this.data=data;
        this.next = next;
    }
}
