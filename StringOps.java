public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        System.out.println(camelCase("   Intro to  coMPUter   sCIEncE   "));    
    }

    public static String capVowelsLowRest (String string) {
        String ans= "";

        for(int i=0;i<string.length();i++){
            char c = string.charAt(i);

            if ((c== 97)|| (c== 101)|| (c== 111)|| (c== 117)|| (c== 105)){
                ans += (char) (c-32);
            }

            else if (c>64 && c<91 && !((c==65)|| (c==69)|| (c==73)|| (c==79)|| (c==85)|| (c==32))){
                ans += (char) (c+32);
            }

            else{
                ans += c;
            }
        }
        return ans;
    }

    //switching the first letter of the word into an Uppercase.
    // doesnt touch the other letters
    public static String firstLetter (String string){
       String ans = "";
       for (int i=0;i<string.length();i++){
            if (string.charAt(i)==' '&& (i<string.length()-1)){
                if (string.charAt(i+1)>97 && string.charAt(i+1)<122){
                    ans += (char) (string.charAt(i+1)-32);
                    i++;
                }  
            }
            else{ 
                ans += string.charAt(i);
            } 
        }   
       return ans;
    }


    public static String camelCase (String string) {
        String ans = "";
        //swithching all of the letters into Lowercase
        for (int i=0;i<string.length();i++){
            if (string.charAt(i)>65 && string.charAt(i)<90){
                ans+= (char) (string.charAt(i)+32);
            }
            else{
               ans += string.charAt(i); 
            }
        }

        //changing thefirst letters of every worrd into Uppercase
        ans = firstLetter(ans);
        
        //lowercase the first letter of the first word only.
        String finalAns = "";
        if (ans.charAt(0)>65 && ans.charAt(0)<90){
            finalAns += (char) (ans.charAt(0)+32);
        }
        for (int i=1;i<ans.length();i++){
            finalAns+=ans.charAt(i);
        }    
        return finalAns;
    }

        
    

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}
