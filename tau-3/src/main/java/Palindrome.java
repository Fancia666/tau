import java.util.ArrayList;
import java.util.List;

class Palindrome {
    boolean check (String input) {

        String stringToCheck=input.toLowerCase().replaceAll("\\s+","");
        String lettersPresentInStringCollector="";
        char[] ch = input.toCharArray();
        for(char c : ch) {
            if (Character.isDigit(c)) {
                new IllegalArgumentException();
            }
        }
        for(char i='a';i<='z';i++){

            if(stringToCheck.indexOf(i)!=-1){
                lettersPresentInStringCollector=lettersPresentInStringCollector+i;
            }
        }
        if(lettersPresentInStringCollector.length()>=26){
            return true;
        }
        else{
            return false;
        }
    }

    List checkList(List<String> inputList) {
        List inputListResult = new ArrayList();
        for (int i = 0; i < inputList.size(); i++) {
            inputListResult.add(check(inputList.get(i)));
        }
        System.out.println(inputListResult);
        return inputListResult;
    }
}