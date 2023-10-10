package org.example.elemts.table;

import org.example.elemts.MyElemet;

public class Table extends MyElemet {

    Tr trHeaderElement = new Tr();

    public Table() {
        super("table");
    }

    public Table(String s) {
        super("table");
        text(s);
    }

    public Table createTable(String[] headres, String[][] data) {

        int numCols = headres.length;
        int numRows = data.length;

        if (numRows != numCols) {
            throw new IllegalArgumentException("Błędne dane wejściowe");
        }


        Th[] th = new Th[numCols];
        Tr[] tr = new Tr[numRows];

        for (int i = 0; i < th.length; i++) {
            th[i] = new Th(headres[i]);
        }

        for (int i = 0; i < tr.length; i++) {
            tr[i] = new Tr();
            for (int i1 = 0; i1 < numCols; i1++) {
                tr[i].add(new Td(data[i][i1]));
            }
        }

        this.add(new Thead().add(th).add(tr));
        return this;
    }

}
