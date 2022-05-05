package codingchallenge;

import com.google.common.util.concurrent.MoreExecutors;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;

import static com.google.common.truth.Truth.assertThat;

class OrderedExecutorTest {
  @Test
  void singleTaskIsExecuted() {
    AtomicInteger completions = new AtomicInteger(0);
    OrderedExecutor subject = new OrderedExecutor(MoreExecutors.directExecutor());
    subject.executeInOrder(new UserId("user1"), completions::incrementAndGet);
    assertThat(completions.get()).isEqualTo(1);
  }
}