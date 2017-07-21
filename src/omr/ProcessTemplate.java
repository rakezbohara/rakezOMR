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
import net.sourceforge.jiu.geometry.*;

/**
 *
 * @author RAKEZ
 */


public class ProcessTemplate {

    public static void main(String args[]) {
        String filename = "template_trial.png";

        Gray8Image grayimage = ImageUtil.readImage(filename);
        //Gray8Image grayimage = ImageUtil.readImage("2circle-org-colored-whole.jpeg");
        
        ImageManipulation image = new ImageManipulation(grayimage);
        image.locateConcentricCircles();
        image.locateMarks();
        
        image.writeAscTemplate(filename + ".asc");
        image.writeConfig(filename + ".config");
//        image.writeAscTemplate("2circle-org-colored-whole.asc");
//        image.writeConfig("2circle-org-colored-whole.config");
    }    
}
