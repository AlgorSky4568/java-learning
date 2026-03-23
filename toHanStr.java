

public class toHanStr{
    private static String[] hanArr = {"零","一","二","三","四","五","六","七","八","九","",};
    private static String[] uniArr = {"十","百","千"};

    public static void main(String[] args){
        int num = 1123;
        int m = 0;
        int index = 0;
        String Han = "";
        while(num != 0){
            m = num % 10;
            if(index != 0){
                Han = hanArr[m] + uniArr[index - 1] + Han;
            }
            else{
                Han  = hanArr[m] + Han;
            }
            index += 1;
            num /= 10;
            

        }
        System.out.println(Han);
    }
}