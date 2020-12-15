import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
public class ToJSON {
    Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
    public void stringToJSON(Object person){
        String stringJSON = gsonBuilder.toJson(person);
        System.out.println(stringJSON);
    }
}