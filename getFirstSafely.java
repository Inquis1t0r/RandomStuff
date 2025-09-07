import java.util.Optional;

public static Optional<String> getFirstSafely(String[] array) {
    return array.length > 0 ? Optional.of(array[0]) : Optional.empty();
}

// Usage
Optional<String> first = getFirstSafely(myArray);
if (first.isPresent()) {
    System.out.println(first.get());
}
