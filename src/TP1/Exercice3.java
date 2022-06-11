package TP1;

import java.io.File;
import java.util.Scanner;

public class Exercice3 {
    public static String fullPath= "";
    public static void main(String args[]){
        Exercice3 Testfile = new Exercice3();
        Scanner scan = new Scanner(System.in);
        System.out.println("!! WARNING : file and directory must belong to project packages !! \n Name of the file you are looking for: " );
        String name = scan.next();
        System.out.println("Enter the directory where to search : ");
        String directory = System.getProperty("user.dir")+"/src/"+scan.next();
        System.out.println("Search in progress . . ");
        Testfile.findFile(name,new File(directory));
        System.out.println("This is the full path : "+fullPath);
    }
    public void findFile(String filename,File loc)
    {        
        File[] list = loc.listFiles();
        if(list!=null){
        for (File file : list)
        {                
            if (file.isDirectory())
            {             
                findFile(filename,file);              
            } 
            else {
                if (filename.equals(file.getName()))
                {
                   System.out.println("File "+filename+" found in "+file.getParentFile()+"\n");
                   this.fullPath = file.getParentFile()+"\\"+filename;
                   //System.exit(0);
                } else{
                 //Uncomment next line for this exercice
                //System.out.println(file.getName());               
            }}
        }
    } 
}

}
