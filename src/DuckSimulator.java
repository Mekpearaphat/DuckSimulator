import adapters.GooseAdapter;
import adapters.PigeonAdapter;
import decorators.QuackCounter;
import decorators.QuackEcho;
import factories.AbstractDuckFactory;
import factories.CountAndEchoDuckFactory;
import factories.CountingDuckFactory;
import factories.DuckFactory;
import models.*;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.simulateCompositePattern2();

    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
    private void simulateCompositePattern2() {
        AbstractDuckFactory duckFactory = new DuckFactory();
        AbstractDuckFactory countingDuckFactory = new CountingDuckFactory();

        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redHeadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = countingDuckFactory.createDuckCall();
        Quackable rubberDuck = countingDuckFactory.createRubberDuck();

        Leader flock = new Leader();
        flock.add(mallardDuck);
        flock.add(redHeadDuck);
        flock.add(duckCall);
        flock.add(rubberDuck);

        flock.quack();
    }
}