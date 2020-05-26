package FunctionLayer.Drawings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SvgTest {

    Svg svg;

    @Before
    public void setUp() throws Exception {
        svg = new Svg(1);
    }

    @Test
    public void addCarportTopView(){
        svg.addCarport();

        String expectedAddCarport = "<svg version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"x=\"0\" y=\"0\" height=\"400\" width=\"550\" viewBox=\"0,0,650,650\" preserveAspectRatio=\"xMinYMin\"> <defs>\n" +
                "<marker id=\"beginArrow\" markerWidth=\"12\" markerHeight=\"12\" refX=\"0\" refY=\"6\" orient=\"auto\">\n" +
                "<path d=\"M0,6 L12,0 L12,12 L0,6\" style=\"fill: #000000;\" />\n" +
                "</marker>\n" +
                "<marker id=\"endArrow\" markerWidth=\"12\" markerHeight=\"12\" refX=\"12\" refY=\"6\" orient=\"auto\">\n" +
                "<path d=\"M0,0 L12,6 L0,12 L0,0 \" style=\"fill: #000000;\" />\n" +
                "</marker>\n" +
                "</defs><rect transform=\"translate(100,100)\" x=\"0.000000\" y=\"0.000000\" height=\"450.000000\" width=\"510.000000\" style=\"stroke:#000000; fill: #ffffff\" /><rect transform=\"translate(100,100)\" x=\"180.000000\" y=\"23.409204\" height=\"401.090796\" width=\"300.000000\" style=\"stroke:#000000; fill: #cfcfcf\" /><rect transform=\"translate(100,100)\" x=\"180.000000\" y=\"27.909204\" height=\"10.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #ffffff\" /><rect transform=\"translate(100,100)\" x=\"470.000000\" y=\"27.909204\" height=\"10.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #ffffff\" /><rect transform=\"translate(100,100)\" x=\"180.000000\" y=\"416.090796\" height=\"10.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #ffffff\" /><rect transform=\"translate(100,100)\" x=\"470.000000\" y=\"416.090796\" height=\"10.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #ffffff\" /><line transform=\"translate(100,100)\" x1=\"545.000000\" y1=\"27.909204\" x2=\"545.000000\" y2=\"420.000000\" style=\"stroke:#000000;\n" +
                "marker-start: url(#beginArrow);\n" +
                "marker-end: url(#endArrow);\" /><line transform=\"translate(100,100)\" x1=\"180.000000\" y1=\"-30.000000\" x2=\"480.000000\" y2=\"-30.000000\" style=\"stroke:#000000;\n" +
                "marker-start: url(#beginArrow);\n" +
                "marker-end: url(#endArrow);\" /><text transform=\"translate(100,100)\" style=\"text-anchor: middle\" x=\"330.000000\" y=\"-33.000000\"> 300 cm</text><text transform=\"translate(100,100)\" style=\"text-anchor: middle\" x=\"543.000000\" y=\"240.000000\"> 420 cm</text><rect transform=\"translate(100,100)\" x=\"0.000000\" y=\"23.750000\" height=\"6.500000\" width=\"510.000000\" style=\"stroke:#000000; fill: #bababa\" /><rect transform=\"translate(100,100)\" x=\"0.000000\" y=\"423.750000\" height=\"6.500000\" width=\"510.000000\" style=\"stroke:#000000; fill: #bababa\" /><rect transform=\"translate(100,100)\" x=\"0.000000\" y=\"0.000000\" height=\"4.500000\" width=\"510.000000\" style=\"stroke:#000000; fill: #ffffff\" /><rect transform=\"translate(100,100)\" x=\"0.000000\" y=\"25.000000\" height=\"4.500000\" width=\"510.000000\" style=\"stroke:#000000; fill: #ffffff\" /><rect transform=\"translate(100,100)\" x=\"0.000000\" y=\"50.000000\" height=\"4.500000\" width=\"510.000000\" style=\"stroke:#000000; fill: #ffffff\" /><rect transform=\"translate(100,100)\" x=\"0.000000\" y=\"75.000000\" height=\"4.500000\" width=\"510.000000\" style=\"stroke:#000000; fill: #ffffff\" /><rect transform=\"translate(100,100)\" x=\"0.000000\" y=\"100.000000\" height=\"4.500000\" width=\"510.000000\" style=\"stroke:#000000; fill: #ffffff\" /><rect transform=\"translate(100,100)\" x=\"0.000000\" y=\"125.000000\" height=\"4.500000\" width=\"510.000000\" style=\"stroke:#000000; fill: #ffffff\" /><rect transform=\"translate(100,100)\" x=\"0.000000\" y=\"150.000000\" height=\"4.500000\" width=\"510.000000\" style=\"stroke:#000000; fill: #ffffff\" /><rect transform=\"translate(100,100)\" x=\"0.000000\" y=\"175.000000\" height=\"4.500000\" width=\"510.000000\" style=\"stroke:#000000; fill: #ffffff\" /><rect transform=\"translate(100,100)\" x=\"0.000000\" y=\"200.000000\" height=\"4.500000\" width=\"510.000000\" style=\"stroke:#000000; fill: #ffffff\" /><rect transform=\"translate(100,100)\" x=\"0.000000\" y=\"225.000000\" height=\"4.500000\" width=\"510.000000\" style=\"stroke:#000000; fill: #ffffff\" /><rect transform=\"translate(100,100)\" x=\"0.000000\" y=\"250.000000\" height=\"4.500000\" width=\"510.000000\" style=\"stroke:#000000; fill: #ffffff\" /><rect transform=\"translate(100,100)\" x=\"0.000000\" y=\"275.000000\" height=\"4.500000\" width=\"510.000000\" style=\"stroke:#000000; fill: #ffffff\" /><rect transform=\"translate(100,100)\" x=\"0.000000\" y=\"300.000000\" height=\"4.500000\" width=\"510.000000\" style=\"stroke:#000000; fill: #ffffff\" /><rect transform=\"translate(100,100)\" x=\"0.000000\" y=\"325.000000\" height=\"4.500000\" width=\"510.000000\" style=\"stroke:#000000; fill: #ffffff\" /><rect transform=\"translate(100,100)\" x=\"0.000000\" y=\"350.000000\" height=\"4.500000\" width=\"510.000000\" style=\"stroke:#000000; fill: #ffffff\" /><rect transform=\"translate(100,100)\" x=\"0.000000\" y=\"375.000000\" height=\"4.500000\" width=\"510.000000\" style=\"stroke:#000000; fill: #ffffff\" /><rect transform=\"translate(100,100)\" x=\"0.000000\" y=\"400.000000\" height=\"4.500000\" width=\"510.000000\" style=\"stroke:#000000; fill: #ffffff\" /><rect transform=\"translate(100,100)\" x=\"0.000000\" y=\"425.000000\" height=\"4.500000\" width=\"510.000000\" style=\"stroke:#000000; fill: #ffffff\" /><rect transform=\"translate(100,100)\" x=\"0.000000\" y=\"450.000000\" height=\"4.500000\" width=\"510.000000\" style=\"stroke:#000000; fill: #ffffff\" /><rect transform=\"translate(100,100)\" x=\"0.000000\" y=\"0.000000\" height=\"455.000000\" width=\"4.500000\" style=\"stroke:#000000; fill: #ffffff\" /><rect transform=\"translate(100,100)\" x=\"85.000000\" y=\"0.000000\" height=\"455.000000\" width=\"4.500000\" style=\"stroke:#000000; fill: #ffffff\" /><rect transform=\"translate(100,100)\" x=\"170.000000\" y=\"0.000000\" height=\"455.000000\" width=\"4.500000\" style=\"stroke:#000000; fill: #ffffff\" /><rect transform=\"translate(100,100)\" x=\"255.000000\" y=\"0.000000\" height=\"455.000000\" width=\"4.500000\" style=\"stroke:#000000; fill: #ffffff\" /><rect transform=\"translate(100,100)\" x=\"340.000000\" y=\"0.000000\" height=\"455.000000\" width=\"4.500000\" style=\"stroke:#000000; fill: #ffffff\" /><rect transform=\"translate(100,100)\" x=\"425.000000\" y=\"0.000000\" height=\"455.000000\" width=\"4.500000\" style=\"stroke:#000000; fill: #ffffff\" /><rect transform=\"translate(100,100)\" x=\"510.000000\" y=\"0.000000\" height=\"455.000000\" width=\"4.500000\" style=\"stroke:#000000; fill: #ffffff\" /><rect transform=\"translate(100,100)\" x=\"422.750000\" y=\"22.750000\" height=\"10.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #ffffff\" /><rect transform=\"translate(100,100)\" x=\"82.750000\" y=\"22.659204\" height=\"10.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #ffffff\" /><rect transform=\"translate(100,100)\" x=\"422.750000\" y=\"422.750000\" height=\"10.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #ffffff\" /><rect transform=\"translate(100,100)\" x=\"82.750000\" y=\"422.750000\" height=\"10.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #ffffff\" /><rect transform=\"translate(100,100)\" x=\"252.750000\" y=\"22.750000\" height=\"10.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #ffffff\" /><rect transform=\"translate(100,100)\" x=\"252.750000\" y=\"422.750000\" height=\"10.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #ffffff\" /><line transform=\"translate(100,100)\" x1=\"0.000000\" y1=\"480.000000\" x2=\"510.000000\" y2=\"480.000000\" style=\"stroke:#000000;\n" +
                "marker-start: url(#beginArrow);\n" +
                "marker-end: url(#endArrow);\" /><text transform=\"translate(100,100)\" style=\"text-anchor: middle\" x=\"255.000000\" y=\"495.000000\"> 510 cm</text><line transform=\"translate(100,100)\" x1=\"-30.000000\" y1=\"0.000000\" x2=\"-30.000000\" y2=\"450.000000\" style=\"stroke:#000000;\n" +
                "marker-start: url(#beginArrow);\n" +
                "marker-end: url(#endArrow);\" /><text transform=\"translate(100,100)\" style=\"text-anchor: middle\" x=\"-33.000000\" y=\"225.000000\"> 450 cm</text><line transform=\"translate(100,100)\" x1=\"0.000000\" y1=\"-30.000000\" x2=\"85.000000\" y2=\"-30.000000\" style=\"stroke:#000000;\n" +
                "marker-start: url(#beginArrow);\n" +
                "marker-end: url(#endArrow);\" /><text transform=\"translate(100,100)\" style=\"text-anchor: middle\" x=\"43.000000\" y=\"-35.000000\"> 85 cm</text><line transform=\"translate(100,100)\" x1=\"520.000000\" y1=\"27.909204\" x2=\"520.000000\" y2=\"0.000000\" style=\"stroke:#000000;\n" +
                "marker-start: url(#beginArrow);\n" +
                "marker-end: url(#endArrow);\" /><text transform=\"translate(100,100)\" style=\"text-anchor: middle\" x=\"550.000000\" y=\"13.954602\"> 27 cm</text><line transform=\"translate(100,100)\" x1=\"87.250000\" y1=\"27.909204\" x2=\"425.000000\" y2=\"422.090796\" style=\"stroke:#000000; stroke-dasharray: 5 5;\" /><line transform=\"translate(100,100)\" x1=\"87.250000\" y1=\"422.090796\" x2=\"425.000000\" y2=\"27.909204\" style=\"stroke:#000000; stroke-dasharray: 5 5;\" /></svg>";

        assertEquals(svg.toString(), expectedAddCarport);

    }
}