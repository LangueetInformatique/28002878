package devoir06;

import java.io.FileInputStream;  
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;

public  FileInputStreamTP7 extends FileInput Stream implements Comparable{
  private String nomFichier;
  private File file = null;  
  //Contructeur
  public FileProperty(String nomFichier) {
    this.nomFicher=nomFichier ;   
    file = new FileInputStream(fileName);
  }
  
  //Exercice 1
  
 public void Copie(File la_copie) throws IOException{         
        try{
            FileInputStream inStream = new FileInputStream(this.file);
            FileOutputStream outStream = new FileOutputStream(la_copie);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inStream.read(buffer)) > 0){
                outStream.write(buffer, 0, length);
            }
            inStream.close();
            outStream.close();
            System.out.println("File is copied successful!");
        }
      catch(IOException e){
            e.printStackTrace();
        }
 }
  
  
  //Exercice 2 
 public void zipFile(File la_copie) {
   try {
      la_copie.createNewFile();
      FileInputStream fis = new FileInputStream(nomFichier);
      FileOutputStream fos = new FileOutputStream(la_copie);
      ZipOutputStream zos = new ZipOutputStream(fos) {
      ZipEntry entry = new ZipEntry("file-in-zip.txt");
      zos.putNextEntry(entry);   
      byte[] buffer = new byte[1024];
      int length;
      while ((length = fis.read(buffer)) >= 0) {
      zos.write(buffer, 0, length);
      } 
   } catch (IOException e) {
     LOG.error("The file can't be added to the zip", e);
   }
   assertThat(zipPath).exists();
 }
  
 
  //Exercice 3 
   public void propriete(){     
  
     //afficher la date du fichier     
        System.out.println("la date du fichier "+this.file.lastModified());
  
     // Afficher la date du fichier au format dd/m/yyyy H:mm:ss
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy H:mm:ss");
        Date d = new Date(this.file.lastModified());
        System.out.println("la date du fichier "+sdf.format(d));

     // Afficher la taille du fichier
        System.out.println("la taille du fichier "+this.file.length());
     
    // Afficher la taille au format xx Ko ou xx Mo
        int size = (int) (this.file.length() / 1024) + 1;
        if (size > 1024) {
            System.out.println("la taille est "+(size / 1024) + " Mo");
        } else {
            System.out.println("la taille est "+size + " ko");
        }
    }
 
    // Afficher Type du fichier  
        JFileChooser chooser = new JFileChooser();
        System.out.println("Type du fichier est "+chooser.getTypeDescription(this.file));
   
        
   //Exrecice 4
   public int compareTo(Object o) {
      FileInputStreamTP7 F = (FileInputStreamTP7) o;
      return this.nomFichier.compareTo(F.nomFichier);
    }

}