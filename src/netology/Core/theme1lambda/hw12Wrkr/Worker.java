package netology.Core.theme1lambda.hw12Wrkr;

public class Worker {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errr;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errr) {
        this.callback = callback;
        this.errr = errr;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) errr.onError("Task " + i + " is NOTdone bcs EROR");
            else callback.onDone("Task " + i + " is done");
        }
    }
}
