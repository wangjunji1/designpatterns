import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<Task>();
        tasks.add(new PotatoPeelingTask(1));
        tasks.add(new PotatoPeelingTask(2));
        tasks.add(new PotatoPeelingTask(3));
        tasks.add(new PotatoPeelingTask(4));
        tasks.add(new PotatoPeelingTask(5));
        tasks.add(new PotatoPeelingTask(6));
        tasks.add(new PotatoPeelingTask(7));
        tasks.add(new PotatoPeelingTask(8));
        tasks.add(new PotatoPeelingTask(9));
        tasks.add(new PotatoPeelingTask(10));
        tasks.add(new PotatoPeelingTask(11));
        tasks.add(new CoffeMakingTask(12));
        tasks.add(new CoffeMakingTask(13));
        tasks.add(new CoffeMakingTask(14));
        tasks.add(new CoffeMakingTask(15));
        tasks.add(new CoffeMakingTask(16));
        tasks.add(new CoffeMakingTask(17));
        tasks.add(new CoffeMakingTask(18));
        tasks.add(new CoffeMakingTask(19));
        tasks.add(new CoffeMakingTask(20));
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 0; i < tasks.size(); i++) {
            Runnable worker = new Worker(tasks.get(i));
            executor.execute(worker);

        }
        executor.shutdown();
        while (!executor.isTerminated()){
            Thread.yield();
        }


    }

}
