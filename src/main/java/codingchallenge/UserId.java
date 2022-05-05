package codingchallenge;

import java.util.Objects;

public class UserId {
  private final String id;

  public UserId(String id) {
    this.id = Objects.requireNonNull(id);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    UserId userId = (UserId) o;

    return id.equals(userId.id);
  }

  @Override
  public int hashCode() {
    return id.hashCode();
  }
}
