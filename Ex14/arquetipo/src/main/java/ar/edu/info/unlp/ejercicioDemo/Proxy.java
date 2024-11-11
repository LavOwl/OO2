package ar.edu.info.unlp.ejercicioDemo;

import java.util.Collection;
import java.util.List;

public class Proxy implements DatabaseAccess{
    private DatabaseRealAccess access;
    private String password;
    private boolean loggedIn;

    public Proxy(DatabaseRealAccess DB) {
        access = DB;
        this.loggedIn = false;
    }

    public Collection<String> getSearchResults(String queryString) {
        if(loggedIn)
            return this.access.getSearchResults(queryString);
        throw new RuntimeException("BU");
    }

    public int insertNewRow(List<String> rowData){
        if(loggedIn){
            return this.access.insertNewRow(rowData);
        }
        throw new RuntimeException("Bu!");
    }

    public boolean login(String password){
        if(password.equals(this.password)){
            this.loggedIn = true;
        }
        return this.loggedIn;
    }

    public void logout(){
        this.loggedIn = false;
    }
}
