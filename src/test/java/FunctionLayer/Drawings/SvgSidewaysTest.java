package FunctionLayer.Drawings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SvgSidewaysTest {

    SvgSideways svgSideways;

    @Before
    public void setUp() throws Exception {
        svgSideways = new SvgSideways(1);
    }

    @Test
    public void addCarportSideways() {
        svgSideways.addCarport();
        svgSideways.addRoof();
        svgSideways.addLines();
        svgSideways.addRooftiles();

        String expectedAddCarportSideways = "<svg version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" x=\"0\" y=\"0\" height=\"400\" width=\"900\" viewBox=\"0,0,600,600\" preserveAspectRatio=\"xMinYMin\"> <defs>\n" +
                "<marker id=\"beginArrow\" markerWidth=\"12\" markerHeight=\"12\" refX=\"0\" refY=\"6\" orient=\"auto\">\n" +
                "<path d=\"M0,6 L12,0 L12,12 L0,6\" style=\"fill: #000000;\" />\n" +
                "</marker>\n" +
                "<marker id=\"endArrow\" markerWidth=\"12\" markerHeight=\"12\" refX=\"12\" refY=\"6\" orient=\"auto\">\n" +
                "<path d=\"M0,0 L12,6 L0,12 L0,0 \" style=\"fill: #000000;\" />\n" +
                "</marker>\n" +
                "</defs><rect transform=\"translate(100,100)\" x=\"39.000000\" y=\"95.000000\" height=\"210.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"470.000000\" y=\"95.000000\" height=\"210.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"180.000000\" y=\"95.000000\" height=\"210.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"250.000000\" y=\"95.000000\" height=\"210.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"30.000000\" y=\"90.000000\" height=\"19.500000\" width=\"450.000000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"185.000000\" y=\"90.000000\" height=\"19.500000\" width=\"295.000000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"185.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #e88700\" /><rect transform=\"translate(100,100)\" x=\"200.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #e88700\" /><rect transform=\"translate(100,100)\" x=\"215.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #e88700\" /><rect transform=\"translate(100,100)\" x=\"230.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #e88700\" /><rect transform=\"translate(100,100)\" x=\"245.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #e88700\" /><rect transform=\"translate(100,100)\" x=\"260.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #e88700\" /><rect transform=\"translate(100,100)\" x=\"275.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #e88700\" /><rect transform=\"translate(100,100)\" x=\"290.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #e88700\" /><rect transform=\"translate(100,100)\" x=\"305.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #e88700\" /><rect transform=\"translate(100,100)\" x=\"320.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #e88700\" /><rect transform=\"translate(100,100)\" x=\"335.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #e88700\" /><rect transform=\"translate(100,100)\" x=\"350.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #e88700\" /><rect transform=\"translate(100,100)\" x=\"365.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #e88700\" /><rect transform=\"translate(100,100)\" x=\"380.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #e88700\" /><rect transform=\"translate(100,100)\" x=\"395.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #e88700\" /><rect transform=\"translate(100,100)\" x=\"410.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #e88700\" /><rect transform=\"translate(100,100)\" x=\"425.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #e88700\" /><rect transform=\"translate(100,100)\" x=\"440.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #e88700\" /><rect transform=\"translate(100,100)\" x=\"455.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #e88700\" /><rect transform=\"translate(100,100)\" x=\"470.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #e88700\" /><rect transform=\"translate(100,100)\" x=\"180.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"195.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"210.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"225.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"240.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"255.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"270.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"285.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"300.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"315.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"330.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"345.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"360.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"375.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"390.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"405.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"420.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"435.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"450.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"465.000000\" y=\"105.000000\" height=\"200.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"0.000000\" y=\"80.000000\" height=\"15.000000\" width=\"510.000000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"39.000000\" y=\"2.500000\" height=\"87.500000\" width=\"4.500000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"78.000000\" y=\"2.500000\" height=\"87.500000\" width=\"4.500000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"117.000000\" y=\"2.500000\" height=\"87.500000\" width=\"4.500000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"156.000000\" y=\"2.500000\" height=\"87.500000\" width=\"4.500000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"195.000000\" y=\"2.500000\" height=\"87.500000\" width=\"4.500000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"234.000000\" y=\"2.500000\" height=\"87.500000\" width=\"4.500000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"273.000000\" y=\"2.500000\" height=\"87.500000\" width=\"4.500000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"312.000000\" y=\"2.500000\" height=\"87.500000\" width=\"4.500000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"351.000000\" y=\"2.500000\" height=\"87.500000\" width=\"4.500000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"390.000000\" y=\"2.500000\" height=\"87.500000\" width=\"4.500000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"429.000000\" y=\"2.500000\" height=\"87.500000\" width=\"4.500000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"468.000000\" y=\"2.500000\" height=\"87.500000\" width=\"4.500000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"507.000000\" y=\"2.500000\" height=\"87.500000\" width=\"4.500000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"0.000000\" y=\"10.000000\" height=\"4.500000\" width=\"510.000000\" style=\"stroke:#000000; fill: #f5e400\" /><rect transform=\"translate(100,100)\" x=\"0.000000\" y=\"20.000000\" height=\"4.500000\" width=\"510.000000\" style=\"stroke:#000000; fill: #f5e400\" /><rect transform=\"translate(100,100)\" x=\"0.000000\" y=\"30.000000\" height=\"4.500000\" width=\"510.000000\" style=\"stroke:#000000; fill: #f5e400\" /><rect transform=\"translate(100,100)\" x=\"0.000000\" y=\"40.000000\" height=\"4.500000\" width=\"510.000000\" style=\"stroke:#000000; fill: #f5e400\" /><rect transform=\"translate(100,100)\" x=\"0.000000\" y=\"50.000000\" height=\"4.500000\" width=\"510.000000\" style=\"stroke:#000000; fill: #f5e400\" /><rect transform=\"translate(100,100)\" x=\"0.000000\" y=\"60.000000\" height=\"4.500000\" width=\"510.000000\" style=\"stroke:#000000; fill: #f5e400\" /><rect transform=\"translate(100,100)\" x=\"0.000000\" y=\"70.000000\" height=\"4.500000\" width=\"510.000000\" style=\"stroke:#000000; fill: #f5e400\" /><rect transform=\"translate(100,100)\" x=\"0.000000\" y=\"80.000000\" height=\"4.500000\" width=\"510.000000\" style=\"stroke:#000000; fill: #f5e400\" /><rect transform=\"translate(100,100)\" x=\"0.000000\" y=\"90.000000\" height=\"4.500000\" width=\"510.000000\" style=\"stroke:#000000; fill: #f5e400\" /><rect transform=\"translate(100,100)\" x=\"0.000000\" y=\"2.500000\" height=\"7.500000\" width=\"510.000000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"-5.000000\" y=\"0.000000\" height=\"85.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"505.000000\" y=\"0.000000\" height=\"85.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"-5.000000\" y=\"70.000000\" height=\"2.500000\" width=\"10.000000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"505.000000\" y=\"70.000000\" height=\"2.500000\" width=\"10.000000\" style=\"stroke:#000000; fill: #f58f00\" /><line transform=\"translate(100,100)\" x1=\"-15.000000\" y1=\"305.000000\" x2=\"525.000000\" y2=\"305.000000\" style=\"stroke:#000000; fill: #ffffff\" /><rect transform=\"translate(100,100)\" x=\"5.000000\" y=\"10.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"30.000000\" y=\"10.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"55.000000\" y=\"10.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"80.000000\" y=\"10.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"105.000000\" y=\"10.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"130.000000\" y=\"10.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"155.000000\" y=\"10.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"180.000000\" y=\"10.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"205.000000\" y=\"10.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"230.000000\" y=\"10.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"255.000000\" y=\"10.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"280.000000\" y=\"10.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"305.000000\" y=\"10.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"330.000000\" y=\"10.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"355.000000\" y=\"10.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"380.000000\" y=\"10.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"405.000000\" y=\"10.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"430.000000\" y=\"10.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"455.000000\" y=\"10.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"480.000000\" y=\"10.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"505.000000\" y=\"10.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"5.000000\" y=\"25.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"30.000000\" y=\"25.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"55.000000\" y=\"25.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"80.000000\" y=\"25.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"105.000000\" y=\"25.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"130.000000\" y=\"25.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"155.000000\" y=\"25.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"180.000000\" y=\"25.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"205.000000\" y=\"25.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"230.000000\" y=\"25.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"255.000000\" y=\"25.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"280.000000\" y=\"25.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"305.000000\" y=\"25.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"330.000000\" y=\"25.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"355.000000\" y=\"25.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"380.000000\" y=\"25.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"405.000000\" y=\"25.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"430.000000\" y=\"25.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"455.000000\" y=\"25.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"480.000000\" y=\"25.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"505.000000\" y=\"25.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"5.000000\" y=\"40.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"30.000000\" y=\"40.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"55.000000\" y=\"40.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"80.000000\" y=\"40.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"105.000000\" y=\"40.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"130.000000\" y=\"40.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"155.000000\" y=\"40.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"180.000000\" y=\"40.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"205.000000\" y=\"40.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"230.000000\" y=\"40.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"255.000000\" y=\"40.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"280.000000\" y=\"40.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"305.000000\" y=\"40.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"330.000000\" y=\"40.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"355.000000\" y=\"40.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"380.000000\" y=\"40.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"405.000000\" y=\"40.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"430.000000\" y=\"40.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"455.000000\" y=\"40.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"480.000000\" y=\"40.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"505.000000\" y=\"40.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"5.000000\" y=\"55.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"30.000000\" y=\"55.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"55.000000\" y=\"55.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"80.000000\" y=\"55.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"105.000000\" y=\"55.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"130.000000\" y=\"55.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"155.000000\" y=\"55.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"180.000000\" y=\"55.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"205.000000\" y=\"55.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"230.000000\" y=\"55.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"255.000000\" y=\"55.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"280.000000\" y=\"55.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"305.000000\" y=\"55.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"330.000000\" y=\"55.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"355.000000\" y=\"55.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"380.000000\" y=\"55.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"405.000000\" y=\"55.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"430.000000\" y=\"55.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"455.000000\" y=\"55.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"480.000000\" y=\"55.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"505.000000\" y=\"55.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"5.000000\" y=\"70.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"30.000000\" y=\"70.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"55.000000\" y=\"70.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"80.000000\" y=\"70.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"105.000000\" y=\"70.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"130.000000\" y=\"70.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"155.000000\" y=\"70.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"180.000000\" y=\"70.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"205.000000\" y=\"70.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"230.000000\" y=\"70.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"255.000000\" y=\"70.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"280.000000\" y=\"70.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"305.000000\" y=\"70.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"330.000000\" y=\"70.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"355.000000\" y=\"70.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"380.000000\" y=\"70.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"405.000000\" y=\"70.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"430.000000\" y=\"70.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"455.000000\" y=\"70.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"480.000000\" y=\"70.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"505.000000\" y=\"70.000000\" height=\"15.000000\" width=\"25.000000\" style=\"stroke:#000000; fill: #742727\" /><rect transform=\"translate(100,100)\" x=\"515.000000\" y=\"0.000000\" height=\"90.000000\" width=\"25.000000\" style=\"stroke:#ffffff; fill: #f8f9fa\" /><rect transform=\"translate(100,100)\" x=\"-5.000000\" y=\"0.000000\" height=\"85.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"505.000000\" y=\"0.000000\" height=\"85.000000\" width=\"10.000000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"-5.000000\" y=\"70.000000\" height=\"2.500000\" width=\"10.000000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"505.000000\" y=\"70.000000\" height=\"2.500000\" width=\"10.000000\" style=\"stroke:#000000; fill: #f58f00\" /><rect transform=\"translate(100,100)\" x=\"0.000000\" y=\"80.000000\" height=\"15.000000\" width=\"510.000000\" style=\"stroke:#000000; fill: #f58f00\" /></svg>";

        assertEquals(svgSideways.toString(), expectedAddCarportSideways);
    }
}