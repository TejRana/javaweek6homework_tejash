package javahomeworkweek_6;

public class Question_Variable_3 {
    int a = 22;
    static int v = 30;

    public static void main(String[]args){
        MyCap();
        Question_Variable_3 man = new Question_Variable_3();
        System.out.println(man.a);
    }
    public void MyRoll(){
        System.out.println(a);
        System.out.println(v);
    }
    public static void MyCap(){
        Question_Variable_3 man = new Question_Variable_3();
        System.out.println(man.a);
        System.out.println(v);
    }

}
