SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

// Now when you format a date, it will be in GMT
Date date = new Date();
String gmtTime = sdf.format(date);
System.out.println("GMT time: " + gmtTime);
