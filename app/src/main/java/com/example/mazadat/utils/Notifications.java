package com.example.mazadat.utils;

public class Notifications {
    private String name;
    private String details;
    private String time;
    private int imge;

    public Notifications(String name, String details, String time, int imge) {
        this.name = name;
        this.details = details;
        this.time = time;
        this.imge = imge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getImge() {
        return imge;
    }

    public void setImge(int imge) {
        this.imge = imge;
    }
}
