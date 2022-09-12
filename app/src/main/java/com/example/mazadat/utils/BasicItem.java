package com.example.mazadat.utils;

public class BasicItem {
    private int imge;
    private String text;

    public BasicItem(int imge, String text) {
        this.imge = imge;
        this.text = text;
    }

    public int getImge() {
        return imge;
    }

    public void setImge(int imge) {
        this.imge = imge;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
