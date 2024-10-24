import java.util.HashMap;

public class RequestLogger {
    HashMap<String,Integer> hashMap = new HashMap<>();
    int limit;
    public RequestLogger(int timeLimit) {
        limit= timeLimit;
    }

    public boolean messageRequestDecision(int timestamp, String request) {
        if(!hashMap.containsKey(request)){
            hashMap.put(request,timestamp);
            return true;
        }
        if(timestamp-hashMap.get(request) >= limit)
        {
            hashMap.put(request, timestamp);
            return true;
        }
        return false;
    }
}
