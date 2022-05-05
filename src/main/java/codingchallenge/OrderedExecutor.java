package codingchallenge;

import java.util.concurrent.Executor;

public class OrderedExecutor {
  private final Executor executor;

  public OrderedExecutor(Executor executor) {
    this.executor = executor;
  }

  /**
   * Must arrange to submit each {@link Runnable} task to the provided {@link Executor#execute executor}, while ensuring
   * that the tasks for each distinct {@link UserId} are processed sequentially in the order received.</p>
   *
   * In particular: ensure that all provided tasks are eventually executed, but no two tasks are executed concurrently
   * for any individual user.
   */
  public void executeInOrder(UserId userId, Runnable task) {
    throw new UnsupportedOperationException("Implement me");
  }
}
