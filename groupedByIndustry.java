// Java
Map<String, List<Account>> groupedByIndustry = new HashMap<>();
for (Account acc : accounts) {
    groupedByIndustry
        .computeIfAbsent(acc.getIndustry(), k -> new ArrayList<>())
        .add(acc);
}
