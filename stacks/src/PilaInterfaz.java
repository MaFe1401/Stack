public interface PilaInterfaz<E>
{
  public void push(E e) throws PilaLlenaException;
   public E pop() throws PilaVaciaException;
   public int size();
}
