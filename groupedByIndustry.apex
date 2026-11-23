// Apex
Map<String, List<Account>> groupedByIndustry = new Map<String, List<Account>>();
for (Account acc : accounts) {
    if (!groupedByIndustry.containsKey(acc.Industry)) {
        groupedByIndustry.put(acc.Industry, new List<Account>());
    }
    groupedByIndustry.get(acc.Industry).add(acc);
}
