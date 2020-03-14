public class Pila<E> implements PilaInterfaz<E> {
    private E[] stck;
    private int pos=0;
    public Pila(int tamano) {
        stck = (E[]) new Object[tamano];
    }

    @Override
    public int size()
    {
       return pos+1;
    }

    @Override
    public void push(E e) throws PilaLlenaException {
        if(pos+1<stck.length)
        {
            stck[pos+1]=e;
            pos++;
        }
        else throw new PilaLlenaException("La pila está llena");

    }


    @Override
    public E pop() throws PilaVaciaException {
        if(stck[0]==null)
            throw new PilaVaciaException("La pila está vacia");
        else
        {
            E x=stck[pos];
            stck[pos]=null;
            pos--;
            return x;
        }
    }
    }

