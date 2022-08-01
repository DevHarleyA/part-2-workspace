package com.entertainment;

import java.util.Comparator;

public class TelevisionChannelComparator implements Comparator<Television> {

  public TelevisionChannelComparator() {
  }

  @Override
  public int compare(Television o1, Television o2) {
    return Integer.compare(o1.getCurrentChannel(), o2.getCurrentChannel());
  }
}
