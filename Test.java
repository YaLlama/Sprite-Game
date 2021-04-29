public class Test {

    public static void main(String args[]){
        String test = "te \\st";
        for(int i = 0; i < test.length(); i++){
            String s = String.valueOf(test.charAt(i));
            System.out.print(s);
        }
    }
}
