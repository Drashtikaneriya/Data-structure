import java.util.ArrayList;

 static class StackA{
    ArrayList<Integer> list = new ArrayList<>();
    public static boolean isempty(){
        return list.size()==0;
    }
    //push
    public static void push(int data){
        list.add(data);
    }
    //pop
    public static int pop(){
        if(!isempty()){
            return -1;
        }
        int top=list.get(size()-1);
        list.remove(list.size()-1);
        return top;
    }
    //peek
    public static  int peek(){
        if(!isempty()){
            return -1;
        }
        return  top=list.get(size()-1);;
    }
}
public class Stack {
    public static void main(String[] args) {
        StackA obj = new StackA();

        obj.push(0);
        obj.push(1);
        obj.push(2);
        obj.push(3);

        while (!obj.isempty()) {
            System.out.println(obj.peek());
            obj.pop();
        }
    }
}
