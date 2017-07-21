/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omr;

import net.sourceforge.jiu.codecs.*;
import net.sourceforge.jiu.data.*;
import net.sourceforge.jiu.color.reduction.*;
import net.sourceforge.jiu.filters.*;

/**
 *
 * @author RAKEZ
 */
public class ProcessForm {
    public static void main(String[] args) {
        String imgfilename = "1.png";
        String templatefilename = "template_trial.png";
        
        Gray8Image grayimage = ImageUtil.readImage(imgfilename);
//        Gray8Image grayimage = ImageUtil.readImage("../../2circle-4.tif");

        ImageManipulation image = new ImageManipulation(grayimage);
        image.locateConcentricCircles();

        image.readConfig(templatefilename + ".config");
        image.readFields(templatefilename + ".fields");
        image.readAscTemplate(templatefilename + ".asc");
        image.searchMarks();
        image.saveData(imgfilename + ".dat");
//        image.readConfig("2circle-org-colored-whole.config");
//        image.readFields("2circle-org-colored-whole.fields");
//        image.readAscTemplate("2circle-org-colored-whole.asc");
//        image.searchMarks();
//        image.saveData("2circle-4.dat");
    }
}
