package Lecture4_RECURSION2.Assignment;

public class CheckAB {
    private static boolean ab(String str,int a){
        if(str.substring(a).length()==1){
            return true;
        }
        else if (str.substring(a).charAt(0)=='b'){
            if(str.substring(a).charAt(1)=='b'){
                if(str.substring(a).length()==2){
                    return true;
                }
                else if(str.substring(a).charAt(2)=='b'){
                    return false;
                }
                return ab(str,a+2);
            }
            return false;
        }
        return ab(str,a+1);
    }
    public static boolean checkAB(String input) {
        if(input.length()==0){
            return true;
        }else if (input.charAt(0)!='a'){
            return false;
        }
        return ab(input,0);
    }

}
