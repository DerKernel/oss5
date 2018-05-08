package de.mangelsdorf;
import java.io.*;

public class App 
{
    public static void main( String[] args )
    {
        BufferedReader in  = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        try
        {
            System.out.println("Eingabe: ");
            str = in.readLine();
        } catch (IOException ex) {};
        System.out.println(str.toUpperCase());
        return;
    }
}
