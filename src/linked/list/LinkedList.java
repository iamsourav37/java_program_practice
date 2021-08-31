package linked.list;

public class LinkedList {
    private Node head;
    private int size;

    public LinkedList(){
        this.head = null;
        this.size = 0;
    }

    public int getSize(){ return this.size; }

    public void insertFirst(int data){
        this.head = new Node(data, this.head);
        this.size++;
    }

    public void insertLast(int data){
        if(this.head == null){
            this.insertFirst(data);
        }else{
            Node tmp = head;

            while(tmp.getNext() != null){
                tmp = tmp.getNext();
            }
            tmp.setNext(new Node(data, null));
            this.size++;
        }
    }

    public void insertAt(int index, int data){
        if(index <= 0 || index > this.size+1){
            System.out.println("Invalid index");
        }else if(index == 1){
            this.insertFirst(data);
        }else if(index == this.size+1){
            this.insertLast(data);
        }else{
            Node forward = this.head;
            Node prev = forward;
            int position = 1;

            while(forward != null){
                if(position == index){
                    Node node = new Node(data, forward);
                    prev.setNext(node);
                    this.size++;
                    return;
                }

                position++;
                prev = forward;
                forward = forward.getNext();
            }
        }
    }

    public int removeFirst() throws Exception {
        if(head == null){
            throw new Exception("List is underflow");
        }
        int deleted_data = head.getData();
        head = head.getNext();
        this.size--;
        return deleted_data;
    }

    public int removeLast() throws Exception{
        if(head == null){
            throw new Exception("List is empty");
        }
        if(this.size == 1){
            int deleted_data = head.getData();
            head = null;
            this.size = 0;
            return deleted_data;
        }
        Node tmp = head;
        Node prev = tmp;

        while(tmp.getNext() != null){
            prev = tmp;
            tmp = tmp.getNext();
        }
        int deleted_data = tmp.getData();
        prev.setNext(null);
        this.size--;
        return deleted_data;
    }

    public int removeAt(int index) throws Exception {
        if(head == null){
            throw new Exception("List is empty");
        }else if(index <= 0 || index > this.size){
            throw new Exception("Invalid index");
        }else if(index == 1){
            return this.removeFirst();
        }else if(index == this.size){
            return this.removeLast();
        }else{
            int position = 2;
            Node forward = this.head.getNext();
            Node prev = this.head;

            while(position < this.size){

                if(position == index){
                    prev.setNext(forward.getNext());
                    this.size--;
                    break;
                }

                prev = forward;
                forward = forward.getNext();
                position++;

            }
            return forward.getData();
        }

    }

    public void show(){
        Node tmp = head;
        while(tmp != null){
            System.out.print(tmp.getData()+" ");
            tmp = tmp.getNext();
        }
        System.out.println();
    }
}
