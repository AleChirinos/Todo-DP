package practica1.Iterator7;

public class IteratorBussiness2 implements Iterator{

    private int position;
    private String[] employers;

    public IteratorBussiness2(String[] nombres){
        this.employers=nombres;
    }
    @Override
    public Object next() {
        return employers[position++];
    }

    @Override
    public boolean hasNext() {
        return employers.length != 0 && position<employers.length;
    }
}
