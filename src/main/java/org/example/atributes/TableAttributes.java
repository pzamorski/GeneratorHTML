package org.example.atributes;

public interface TableAttributes  {
    // Atrybuty dla elementu <table>
    void setBorder(int border);

    void setCellPadding(int cellPadding);

    void setCellSpacing(int cellSpacing);

    void setSummary(String summary);

    void setWidth(String width);

    void setCaption(String caption);

    // Atrybuty dla elementu <caption>
    void setAlign(String align);

    void setValign(String valign);

    // Atrybuty dla elementu <colgroup>
    void setColGroupAlign(String align);

    void setColGroupValign(String valign);

    // Atrybuty dla elementu <thead>
    void setTheadAlign(String align);

    void setTheadValign(String valign);

    // Atrybuty dla elementu <tbody>
    void setTbodyAlign(String align);

    void setTbodyValign(String valign);

    // Atrybuty dla elementu <tfoot>
    void setTfootAlign(String align);

    void setTfootValign(String valign);

}
