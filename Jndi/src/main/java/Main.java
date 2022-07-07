import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {
        Hashtable env = new Hashtable();
        env.put(Context.INITIAL_CONTEXT_FACTORY,
                "com.sun.jndi.fscontext.RefFSContextFactory");

        String name = "/tmp";

        try {
            // Create the initial context
            Context ctx = new InitialContext(env);

            // Look up an object
            Object obj = ctx.lookup(name);

            // Print it
            System.out.println(name + " is bound to: " + obj);

        } catch (NamingException e) {
            System.err.println("Problem looking up " + name + ": " + e);
        }

    }

}
