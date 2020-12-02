package data.structure;

public class ListLinked<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public ListLinked() {
        head = tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addHead(E data) {
        Node<E> node = new Node<E>(data);
        if (isEmpty()) {
            tail = node;
        }
        node.setLink(head);
        head = node;
        size++;
    }

    public void addTail(E data) {
        Node<E> node = new Node<>(data);
        if (isEmpty()) {
            head = node;
        } else {
            tail.setLink(node);
        }
        tail = node;
        size++;
    }

    /*public void add(E data)
    {
        Node<E> node = new Node<>(data);
        if (isEmpty()) {
            head = node;
        } else {
            tail.setLink(node);
        }
        tail = node;
        size++;
    }*/

    public void add(E data) {
        Node<E> node = new Node<>(data);
        Node<E> iterator = head;
        if (isEmpty()) {
            head = node;
        } else {
            while(iterator.getLink()!=null)
                iterator = iterator.getLink();
            iterator.setLink(node);
        }
        tail = node;
        size++;
    }

    public void removeHead()
    {
        if(!isEmpty())
            head = head.getLink();
        else
            head = null;
    }

    public void removeTail()
    {
        Node<E> aux=null;
        Node<E> prev=null;
        if(!isEmpty())
        {
            aux = head;
            if(aux.getLink()==null)
            {
                if(aux == head)
                {
                    head = null;
                    tail = null;
                }
                else
                {
                    prev.setLink(null);
                    tail = prev;
                }
                size--;
            }
            prev = aux;
            aux = aux.getLink();
        }
    }

    public Node<E> getNode(int j)
    {
        Node<E> aux=head;
        int i=0;
        if(!isEmpty())
        {
            while(aux.getLink()!=null)
            {
                if(j==i)
                    break;
                aux = aux.getLink();
                i++;
            }
        }
        return aux;
    }
    
    public Node<E> getHead()
    {
        return head;
    }

    public Node<E> getTail()
    {
        Node<E> aux = null;
        if(!isEmpty())
        {
            aux = head;
            while(aux.getLink()!=null)
                aux = aux.getLink();
        }
        return aux;
    }

    public void setLink(Node<E> current, Node<E> link)
    {
        current.setLink(link);
    }

    public int size()
    {
        return size;
    }

    public String toString() {
        return "List={head={" + head + "},tail={" + tail + "},size={" + size + "}}";
    }
}
