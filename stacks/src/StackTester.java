
public class StackTester
{
    public static void main (String args[])
    {
        Pila<Integer> p = new Pila (5);

        try
        {
             p.push(1);
            p.push(3);
            p.push(2);
            p.push (4);
            p.push(7);
            p.push(8);
        }
        catch (PilaLlenaException e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            p.pop();
            p.pop();
            p.pop();
            p.pop();
            p.pop();
            p.pop();

        }
        catch(PilaVaciaException e)
        {
            System.out.println(e.getMessage());
        }

        }

    }



