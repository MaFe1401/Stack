public class Pila<E> implements PilaInterfaz<E> {
    private E[] stck;
    private int tamano;
    public Pila(int tamano) {
        stck = (E[]) new Object[tamano];
        this.tamano=tamano;
    }

    @Override
    public int size()
    {
        int i=0;
        boolean encontrado=false;
        while ((i<this.tamano)&&(encontrado=false))
        {
            if (stck[i]==null)
                encontrado=true;
            else i++;

        }
        return i;
    }

    @Override
    public void push(E e) throws PilaLlenaException {
        int i=0;
        boolean encontrado=false;
        while ((i<stck.length)&&(encontrado=false))
        {
            if (stck[i]==null)
                encontrado=true;
            else i++;
        }
        if (encontrado=true)
            stck[i]=e;
        else throw new PilaLlenaException("La pila está llena");

    }


    @Override
    public void pop() throws PilaVaciaException {
        if (stck[0]==null) {
            throw new PilaVaciaException("La pila está vacia");
        } else {
            int i=0;
            while(i<stck.length)
            {
                if (stck[i]==null)
                {
                    E x = stck[i - 1];
                    stck[i-1]=null;
                    System.out.println(x);
                }
                else i++;
            }
        }
    }
    }

