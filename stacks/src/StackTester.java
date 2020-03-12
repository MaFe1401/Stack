
public class StackTester
{
    public static void main (String args[])
    {
        Pila<Integer> p = new Pila (5);

        try
        {
            p.push(3);
            p.push(2);
            p.push (4);
            p.push(7);

        }
        catch (PilaLlenaException e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            for(int i=0;i<6;i++)
            {
                p.pop();
            }

        }
        catch(PilaVaciaException e)
        {
            System.out.println(e.getMessage());
        }

        }

    }



