package br.noelen;

/**
 * Hello world!
 */
public final class App {
    private App() {

    }

    public static void main(String[] args) {
        Stack stack = new Stack(3);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
