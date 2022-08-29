package persongenerator;

import java.io.PrintWriter;
import java.io.IOException;

public class PersonTestData
{
    public static void main (String[] args) throws IOException
    {
        PrintWriter out = new PrintWriter("PersonTestData");
        out.println("000001 , Bilbo , Baggins , Esq., 1060");
        out.println("000002 , Frodo , Baggins , Esq., 1120");
        out.println("000003 , Samwise , Gamgee , Esq., 1125");
        out.println("000004 , Peregrin , Took , Esq., 1126");
        out.println("000005 , Meridoc , Brandybuck , Esq., 1126");

        out.close();
    }
}