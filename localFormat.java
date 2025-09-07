// Parse a date string in local timezone
SimpleDateFormat localFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
Date date = localFormat.parse("2023-12-25 15:30:00");

// Format it as GMT
SimpleDateFormat gmtFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
gmtFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
String gmtString = gmtFormat.format(date);

System.out.println("Local: " + localFormat.format(date));
System.out.println("GMT: " + gmtString);
