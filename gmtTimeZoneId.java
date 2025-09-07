DateTimeFormatter formatter = DateTimeFormatter
    .ofPattern("yyyy-MM-dd HH:mm:ss")
    .withZone(ZoneId.of("GMT"));

String gmtTime = formatter.format(Instant.now());
System.out.println("GMT time: " + gmtTime);
