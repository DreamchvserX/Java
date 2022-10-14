package Radio;

import java.util.Scanner;

public class Radio {
  private final int MIN_Volume = 0;
  private final int MAX_Volume = 100;

  private boolean isOn;
  private Integer volume = 0;

  public void volumeUP(){
      if(volume < MAX_Volume)
      ++volume;

  }
    public void volumeDown(){
        if(volume == MIN_Volume)
            --volume;

    }

    public void on(){
      this.isOn=true;
        System.out.println("AN");
    }


    public void off(){
        this.isOn=false;
        System.out.println("AUS");

    }

    public boolean ison(){
      return this.isOn;
    }

    @Override
    public String toString() {
        return new String("Radio Lautstaerke = " + volume + " " + (isOn? "AN" : "AUS"));
    }
}