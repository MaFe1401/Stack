public interface PilaInterfaz<E>
{
  public void push(E e) throws PilaLlenaException;
   public void pop() throws PilaVaciaException;
   public int size();
}
