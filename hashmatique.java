import java.util.HashMap;
import java.util.Set;

public class hashmatique{
    public void assignment1(){
        HashMap<String,String> assignment = new HashMap<String,String>();
        assignment.put("Song1", "blah blah blah");
        assignment.put("Song2", "here we go it's one");
        assignment.put("Song3", "these are textsssss");
        assignment.put("Song4", "chat chat chat chat");
        Set<String> keys = assignment.keySet();
        System.out.println(assignment.get("Song3"));
        for(String key: keys){
            System.out.println("Track: " +key+ ", Lyrics: "+ assignment.get(key));
        }
    }
}