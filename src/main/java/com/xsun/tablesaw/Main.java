package com.xsun.tablesaw;

import tech.tablesaw.api.DoubleColumn;
import tech.tablesaw.api.StringColumn;
import tech.tablesaw.api.Table;
import tech.tablesaw.plotly.Plot;
import tech.tablesaw.plotly.api.Histogram;
import tech.tablesaw.plotly.traces.BarTrace;

/**
 * created at 17:23, 2020-01-16
 *
 * @author sunhaoran
 */
public class Main {
    public static void main(String[] args) {
        String[] animals = {"dog", "cat", "man"};
        double[] cuteness = {89.0, 77.4, 33.22};
        Table cuteTable = Table.create("cute name")
                .addColumns(StringColumn.create("Animal", animals),
                        DoubleColumn.create("Cuteness", cuteness));
        System.out.println(cuteTable.sortOn("Cuteness").print());
        Plot.show(Histogram.create("test table", cuteTable, "Cuteness"));

    }
}
