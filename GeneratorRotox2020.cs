List<string> stringList = new List<string>()
      {
        "PONIEDZIAŁEK",
        "WTOREK",
        "ŚRODA",
        "CZWARTEK",
        "PIĄTEK",
        "SOBOTA",
        "NIEDZIELA"
      };

  string input = item.Item2;

    foreach (string str in stringList)
    {
        if (input.StartsWith(str))
            return;
    }
