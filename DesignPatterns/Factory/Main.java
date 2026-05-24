package DesignPatterns.Factory;

public class Main
{
    public static void  main(String[] args)
    {
        Database db = new MySQL();
        DatabaseFactory dbf = db.createDBFactory();
        Query q = dbf.createQuery();
        Transaction t = dbf.createTransaction();
        q.execute();
        t.read();


        db = new MongoDB();
        dbf = db.createDBFactory();
        q = dbf.createQuery();
        t = dbf.createTransaction();
        q.execute();
        t.read();

    }
}