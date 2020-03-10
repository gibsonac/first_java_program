public class StringManipulation {
    public String trimAndConcact(String stringA, String stringB) {
        stringA = stringA.trim();
        stringB = stringB.trim();
        String answer = stringA + stringB;
        return answer;
    }
    public Integer getIndexOrNull(String theString, char theLetter){
        Integer theLocation = theString.indexOf(theLetter);
        if(theLocation == -1){
            return null;
        }
        return theLocation;
    }
    public Integer getIndexOrNull(String theString, String theSubString){
        Integer theLocation = theString.indexOf(theSubString);
        if(theLocation == -1){
            return null;
        }
        return theLocation;
    }
    public String concatSubstring(String stringA, int theStart, int theEnd, String stringB){
        stringA = stringA.substring(theStart, theEnd);
        return stringA+stringB;
    }
}