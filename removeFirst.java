public static String[] removeFirst(String[] array) {
    if (array.length <= 1) {
        return new String[0]; // Return empty array
    }
    
    String[] newArray = new String[array.length - 1];
    System.arraycopy(array, 1, newArray, 0, array.length - 1);
    return newArray;
}
