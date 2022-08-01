package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;
import java.util.HashSet;
import java.util.Set;
import static com.entertainment.DisplayType.*;

public class TelevisionClient {

  public static void main(String[] args) {
    Television tv1 = new Television();
    Television tv2 = new Television("Sony",15);
    System.out.println(tv1);
    System.out.println(tv2);
    tv1.changeChannel(5);
    System.out.println(tv1);

    Television tvA = new Television("Sony", 50);
    Television tvB = new Television("Sony", 50);
    System.out.println(tvA == tvB);
    System.out.println(tvA.equals(tvB));

    Set<Television> tvs = new HashSet<Television>();
    tvs.add(tvA);
    tvs.add(tvB);
    System.out.println(tvs.size());
    System.out.println(tvs);

    Television tvX = new Television();
    System.out.println(tvX);
    Television tvY = new Television("RCA", 10);
    System.out.println(tvY);
    Television tvZ = new Television("Sony", 50, LED);
    System.out.println(tvZ);

  }

}
