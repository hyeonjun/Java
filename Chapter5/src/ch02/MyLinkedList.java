package ch02;

public class MyLinkedList {

    private MyListNode head;
    int count;

    public MyLinkedList() {
        head = null;
        count = 0;
    }

    public MyListNode addNode(String data) {
        MyListNode node = new MyListNode(data);
        if (head == null) { // 맨 처음
            head = node;
        } else {
            MyListNode tmp = head;
            while (tmp.next != null) { // 맨 뒤까지 가야함
                tmp = tmp.next;
            }
            tmp.next = node;
        }
        count++;
        return node;
    }

    public MyListNode insertNode(int position, String data) {
        MyListNode tmp = head;
        MyListNode node = new MyListNode(data);

        if (position < 0 || position > count) {
            System.out.println("추가 할 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
            return null;
        }

        if (position == 0) { // 맨 앞
            node.next = head;
            head = node;
        } else {
            MyListNode preNode = null;
            for (int i=0; i<position; i++) {
                preNode = tmp;
                tmp = tmp.next;
            }
            node.next = preNode.next;
            preNode.next = node;
        }
        count++;
        return node;
    }

    public MyListNode removeNode(int position) {
        MyListNode tmp = head;
        if (position >= count) {
            System.out.println("삭제 할 위치 오류입니다. 현재 리스트의 개수는 " + count + "개 입니다.");
            return null;
        }

        if (position == 0) {
            head = tmp.next;
        } else {
            MyListNode preNode = null;
            for (int i=0; i<position; i++) {
                preNode = tmp;
                tmp = tmp.next;
            }
            assert preNode != null;
            preNode.next = tmp.next;
        }
        count--;
        System.out.println(position + "번째 항목 삭제되었습니다.");
        return tmp;
    }

    public String getElement(int position) {
        MyListNode tmp = head;
        if(position >= count ){
            System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
            return "error";
        }

        if(position == 0) {
            return head.getData();
        }

        for(int i=0; i<position; i++) {
            tmp = tmp.next;
        }
        return tmp.getData();
    }

    public MyListNode getNode(int position) {
        MyListNode tmp = head;
        if(position >= count ){
            System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
            return null;
        }

        if(position == 0) {
            return head;
        }

        for(int i=0; i<position; i++) {
            tmp = tmp.next;
        }
        return tmp;
    }

    public void removeAll() {
        head = null;
        count = 0;
    }

    public int getSize() {
        return count;
    }

    public void printAll() {
        if(count == 0){
            System.out.println("출력할 내용이 없습니다.");
            return;
        }

        MyListNode tmp = head;
        while(tmp != null) {
            System.out.print(tmp.getData());
            tmp = tmp.next;
            if(tmp!=null) {
                System.out.print("->");
            }
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return head == null;
    }
}
