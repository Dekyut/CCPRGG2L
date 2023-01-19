
package labact3no4;


public class LabAct3no4 {
    public static void main(String[] args) {
        System.out.println(noX("xxhelloxxixxamxxcutexx"));
    }
    public static String noX(String s){
        if(s.equals("")){
            return "";
        }
        if(s.charAt(0)=='x'){
            return "y" + noX(s.substring(1));
        }
        return s.charAt(0) + noX(s.substring(1));
    }
}
 
    
