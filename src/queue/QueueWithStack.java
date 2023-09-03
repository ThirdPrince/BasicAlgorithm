package queue;

import java.util.Stack;

/**
 * 队列模拟栈
 * @author dhl
 */
public class QueueWithStack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();


    public void push(int node){
        stack1.push(node);

    }
    public int pop(){
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public boolean isEmpty(){
        return (stack1.size() + stack2.size())==0;
    }
    public static void main(String[] args) {
        QueueWithStack queue = new QueueWithStack();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);

        while (!queue.isEmpty()){
            System.out.println(queue.pop());
        }


    }


}
