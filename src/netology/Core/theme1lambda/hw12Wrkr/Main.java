package netology.Core.theme1lambda.hw12Wrkr;

public class Main {

    public static void main(String[] args) {

        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener listErr = System.out::println;

        Worker worker = new Worker(listener, listErr);
        worker.start();
    }
}
