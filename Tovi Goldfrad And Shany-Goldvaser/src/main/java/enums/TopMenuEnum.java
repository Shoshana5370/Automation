package enums;

public enum TopMenuEnum {

    MZ ("מיצוי זכויות"),
    DM ("דמי ביטוח"),
    KV ("קצבאות והטבות"),
    YK ("יצירת קשר");

    private String menu;

    TopMenuEnum(String s) {
      this.menu=s;
    }

    public String getTopMenuEnum(){
        return menu;
    }
}
