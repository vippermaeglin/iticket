package me.iticket.android.singleton;

import android.content.Context;
import com.couchbase.lite.Database;
import com.couchbase.lite.Document;
import com.couchbase.lite.Manager;
import com.couchbase.lite.UnsavedRevision;
import com.couchbase.lite.android.AndroidContext;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

import me.iticket.android.dto.UserDTO;

/**
 * Created by Vinicius Arruda on 09/12/2016.
 */

public class DataHolder {
    private static DataHolder dataHolder = new DataHolder();
    private Context context;
    private UserDTO user;
    private Database database = null;

    public static DataHolder getInstance()
    {
        return dataHolder;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public void initializeDB(){
        try{
            // Create a manager:
            Manager manager = null;
            manager = new Manager(new AndroidContext(getContext()), Manager.DEFAULT_OPTIONS);
            // Create or open the database named iticket:
            database = manager.getDatabase("iticket");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public Object getFromDatabase(String property, Class type){
        try{
            if(database!=null){
                ObjectMapper mapper = new ObjectMapper();
                // Read document from database
                Document document = database.getDocument(property);
                Map<String, Object> map = document.getProperties();
                // Convert Map to POJO
                Object result = mapper.convertValue(map, type);
                return result;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public boolean saveOnDatabase(String property, Object object){
        try{
            if(database!=null){
                ObjectMapper mapper = new ObjectMapper();
                // Convert POJO to Map
                final Map<String, Object> map = mapper.convertValue(object, new TypeReference<Map<String, Object>>() {});
                // Create or open the document
                Document document = database.getDocument(property);
                // Save the document to the database
                try {
                    document.update(new Document.DocumentUpdater() {
                        @Override
                        public boolean update(UnsavedRevision newRevision) {
                            newRevision.setUserProperties(map);
                            return true;
                        }
                    });
                    return true;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
}
