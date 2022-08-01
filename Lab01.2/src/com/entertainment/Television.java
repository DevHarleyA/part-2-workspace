package com.entertainment;

import java.util.Objects;

public class Television implements Comparable<Television> {
  private String brand;
  private int volume;
  private DisplayType display;
  private Tuner tuner = new Tuner();

  public Television() {
  }

  public Television(String brand, int volume) {
    this.brand = brand;
    this.volume = volume;
  }

  public Television(String brand, int volume, DisplayType display) {
    this(brand, volume);
    this.display = display;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  public DisplayType getDisplay() {
    return display;
  }

  public void setDisplay(DisplayType display) {
    this.display = display;
  }

  public int getCurrentChannel() {
    return tuner.getChannel();
  }

  public void changeChannel(int channel) {
    tuner.setChannel(channel);
  }

  @Override
  public String toString() {
    return "Television{" +
        "brand='" + brand + '\'' +
        ", volume=" + volume +
        ", display=" + display +
        '}';
  }

  @Override
  public boolean equals(Object obj) {
    boolean result = false;
    if (obj instanceof Television) {
      Television other = (Television) obj;
      result = Objects.equals(this.getBrand(), other.getBrand()) &&
          Objects.equals(this.getVolume(), other.getVolume());
    }
    return result;
//    if (this == o) {
//      return true;
//    }
//    if (o == null || getClass() != o.getClass()) {
//      return false;
//    }
//
//    Television that = (Television) o;
//
//    if (volume != that.volume) {
//      return false;
//    }
//    return brand.equals(that.brand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getBrand(), getVolume());
//    int result = brand.hashCode();
//    result = 31 * result + volume;
//    return result;
  }

  @Override
  public int compareTo(Television obj) {
    return this.getBrand().compareTo(obj.getBrand());
  }

}
