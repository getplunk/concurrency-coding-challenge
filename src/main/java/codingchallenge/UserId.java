package codingchallenge;

import java.util.Objects;

public class UserId {
  private final String id;

  public UserId(String id) {
    this.id = Objects.requireNonNull(id);
  }

  public String id() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    return this == o || o instanceof UserId uid && uid.id.equals(id);
  }

  @Override
  public int hashCode() {
    return id.hashCode();
  }

  @Override
  public String toString() {
    return "UserId{'" + id + "'}";
  }
}
