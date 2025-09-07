SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
sdf.setTimeZone(TimeZone.getTimeZone("UTC"));

String utcTime = sdf.format(new Date());
System.out.println("UTC time: " + utcTime);
