public class Factoral {

    public static void main(String[] args) {

        System.out.println(recursive(4));

    }

    public static int  recursive(int num){

        if(num == 1){
            return 1;
        }

        return num * recursive(num -1);
    }
}
