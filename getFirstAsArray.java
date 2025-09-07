public static String[] getFirstAsArray(String[] array) {
    if (array.length > 0) {
        return new String[]{array[0]};
    }
    return new String[0]; // Return empty array
}
