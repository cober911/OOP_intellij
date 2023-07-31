package Tutorial.Generics;

public class CustomLinkedList<Element> {
    private Node<Element> first;
    private Node<Element> last;

    public void add(Element element){
        if (first == null){
            Node<Element> node = new Node<>(element, null, null);
            first = node;
            last = node;
        }else {
            Node<Element> node = new Node<>(element, last, null);

        }
    }
    private static class Node<Element>{
        Element item;
        Node<Element> prev;
        Node<Element> next;

        public Node(Element item, Node<Element> prev, Node<Element> next) {
            this.item = item;
            this.prev = prev;
            this.next = next;
        }

    }
}
