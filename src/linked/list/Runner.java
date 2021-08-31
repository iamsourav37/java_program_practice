package linked.list;

public class Runner {
    public static void main(String[] args) throws Exception {
        LinkedList list = new LinkedList();

    list.insertFirst(12);
    list.insertFirst(14);
    list.insertFirst(18);
    list.insertFirst(10);
    list.insertAt(2,44);

    try{
        System.out.println(list.removeAt(50));
    }catch (Exception e){
        System.out.println("Error : "+e.getMessage());
    }
        list.show();
        System.out.println("Size of the list : "+list.getSize());

    }
}
