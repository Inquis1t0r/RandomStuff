public static String getFirstOrDefault(String[] array, String defaultValue) {
    return array.length > 0 ? array[0] : defaultValue;
}

// Usage
String first = getFirstOrDefault(myArray, "No elements");
