/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_files;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.StreamCorruptedException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author Mario
 */
public class WorksObjects {

    public static void WriteObject() {

        try {
            player pl = new player(4);
            MiObjectOutputStream obj;
            try (FileOutputStream fis = new FileOutputStream("C:\\Users\\Mario\\Desktop\\player.ser", true)) {
                obj = new MiObjectOutputStream(fis);
                obj.writeObject(pl);
            }
            obj.close();
            System.out.println("The player has been add");
        } catch (IOException ex) {
            Logger.getLogger(WorksObjects.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void showObject() {
        try {
           
            FileInputStream fis = new FileInputStream("C:\\Users\\Mario\\Desktop\\player.ser");
            MiObjectInputStream obj = new MiObjectInputStream(fis);
           
            while (true) {
                player oi = (player) obj.readObject();
               
                System.out.println("***************** Player " + oi.getName() + " ************************");
                System.out.println("Date: " + oi.getDate());
                System.out.println("Nan: " + oi.getNan());
                System.out.println("Team: " + oi.getTeam());
                System.out.println("Goals: " + oi.getGoals());
                System.out.println("Match: " + oi.getMatch());
                System.out.println("Red card: " + oi.getRed_card());
                System.out.println("Yellow card: " + oi.getYellow_card());
                System.out.println("");
                System.out.println("");
              
            }
               
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } catch (IOException | ClassNotFoundException ex) {

        }
    }

    public static void removeObject() {
        FileInputStream fis = null;
        int ask = 1, compare, medida, dni = 0;
        ArrayList<player> play = new ArrayList<>();
        String h;
         do {
         System.out.println("Enter a nan to find the player to remove");
                ask = 0;
                h = pedir.readString();
                medida = h.length();
                if (medida == 8) {
                    dni = Integer.parseInt(h);
                } else {
                    ask = 1;
                }
                 } while (ask == 1);
        try {
            fis = new FileInputStream("C:\\Users\\Mario\\Desktop\\player.ser");
            MiObjectInputStream obj = new MiObjectInputStream(fis);
            while (true) {
                player oi = new player();
                oi = (player) obj.readObject();
                if (oi.getNan()!=dni) {
                    play.add(oi);
                }else{
                    System.out.println("The player has been found, deleting...");
                }
            }
        }catch(EOFException ex){
            
        } catch (FileNotFoundException ex) {
            System.out.println("The file no found");
        } catch (IOException ex) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(WorksObjects.class.getName()).log(Level.SEVERE, null, ex);
        }
        
           
            try (FileOutputStream fos = new FileOutputStream("C:\\Users\\Mario\\Desktop\\player.ser")) {
                MiObjectOutputStream ob = new MiObjectOutputStream(fos);
                for (int i = 0; i < play.size(); i++) {
                    ob.writeObject(play.get(i));
                }
                ob.close();
            System.out.println("The player has been remove");
        } catch (FileNotFoundException ex) {
            System.out.println("Can't find file");
        } catch (IOException ex) {

        }

    }
    public static void findObject(){
        int ask = 1, compare, medida, dni = 0;
        String h;
        FileInputStream fis = null;
        do {
         System.out.println("Enter a nan to find the player");
                ask = 0;
                h = pedir.readString();
                medida = h.length();
                if (medida == 8) {
                    dni = Integer.parseInt(h);
                } else {
                    ask = 1;
                }
                 } while (ask == 1);
         try {
            fis = new FileInputStream("C:\\Users\\Mario\\Desktop\\player.ser");
            MiObjectInputStream obj = new MiObjectInputStream(fis);
            while (true) {
                player oi = new player();
                oi = (player) obj.readObject();
                if(dni==oi.getNan()){
                System.out.println("*******************************************************");
                System.out.println("Name: " + oi.getName() + "                            ");
                System.out.println("Date: " + oi.getDate() + "                            ");
                System.out.println("Nan: " + oi.getNan() + "                              ");
                System.out.println("Team: " + oi.getTeam() + "                            ");
                System.out.println("Goals: " + oi.getGoals() + "                          ");
                System.out.println("Match: " + oi.getMatch() + "                          ");
                System.out.println("Red card: " + oi.getRed_card() + "                    ");
                System.out.println("Yellow card: " + oi.getYellow_card() + "              ");
                System.out.println("*******************************************************");
                }
            }
        }catch(EOFException ex){
            
        } catch (FileNotFoundException ex) {
            System.out.println("The file no found");
        } catch (IOException ex) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(WorksObjects.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public static void WriteObjectTrainer() {

        try {
            trainer tr = new trainer(4);
            MiObjectOutputStream obj;
            try (FileOutputStream fis = new FileOutputStream("C:\\Users\\Mario\\Desktop\\trainer.ser", true)) {
                obj = new MiObjectOutputStream(fis);
                obj.writeObject(tr);
            }
            obj.close();
            System.out.println("The trainer has been add");
        } catch (IOException ex) {
            Logger.getLogger(WorksObjects.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public static void showObjectTrainer() {
        try {
           
            FileInputStream fis = new FileInputStream("C:\\Users\\Mario\\Desktop\\trainer.ser");
            MiObjectInputStream obj = new MiObjectInputStream(fis);
            
            while (true) {
                trainer oi = (trainer) obj.readObject();
               
                System.out.println("***************** Trainer: " + oi.getName() + " ************************");
                System.out.println("Date: " + oi.getDate());
                System.out.println("Nan: " + oi.getNan());
                System.out.println("Team: " + oi.getTeam());
                System.out.println("Match win: " + oi.getMatchwin());
                System.out.println("Match loose: " + oi.getMatchloose());
                System.out.println("");
                System.out.println("");
               
            }
               
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } catch (IOException | ClassNotFoundException ex) {

        }
    }
        public static void removeObjectTrainer() {
        FileInputStream fis = null;
        int ask = 1, compare, medida, dni = 0;
        ArrayList<trainer> trai = new ArrayList<>();
        String h;
         do {
         System.out.println("Enter a nan to find the trainer to remove");
                ask = 0;
                h = pedir.readString();
                medida = h.length();
                if (medida == 8) {
                    dni = Integer.parseInt(h);
                } else {
                    ask = 1;
                }
                 } while (ask == 1);
        try {
            fis = new FileInputStream("C:\\Users\\Mario\\Desktop\\trainer.ser");
            MiObjectInputStream obj = new MiObjectInputStream(fis);
            while (true) {
                trainer tr = new trainer();
                tr = (trainer) obj.readObject();
                if (tr.getNan()!=dni) {
                    trai.add(tr);
                }else{
                    System.out.println("The player has been found, deleting...");
                }
            }
        }catch(EOFException ex){
            
        } catch (FileNotFoundException ex) {
            System.out.println("The file no found");
        } catch (IOException ex) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(WorksObjects.class.getName()).log(Level.SEVERE, null, ex);
        }
        
           
            try (FileOutputStream fos = new FileOutputStream("C:\\Users\\Mario\\Desktop\\trainer.ser")) {
                MiObjectOutputStream ob = new MiObjectOutputStream(fos);
                for (int i = 0; i < trai.size(); i++) {
                    ob.writeObject(trai.get(i));
                }
                ob.close();
            System.out.println("The player has been remove");
        } catch (FileNotFoundException ex) {
            System.out.println("Can't find file");
        } catch (IOException ex) {

        }

    }
        
        public static void findObjectTrainer(){
        int ask = 1, compare, medida, dni = 0;
        String h;
        FileInputStream fis = null;
        do {
         System.out.println("Enter a nan to find the trainer");
                ask = 0;
                h = pedir.readString();
                medida = h.length();
                if (medida == 8) {
                    dni = Integer.parseInt(h);
                } else {
                    ask = 1;
                }
                 } while (ask == 1);
         try {
            fis = new FileInputStream("C:\\Users\\Mario\\Desktop\\trainer.ser");
            MiObjectInputStream obj = new MiObjectInputStream(fis);
            while (true) {
                trainer tr = new trainer();
                tr = (trainer) obj.readObject();
                if(dni==tr.getNan()){
                System.out.println("*******************************************************");
                System.out.println("Name: " + tr.getName() + "                            ");
                System.out.println("Date: " + tr.getDate() + "                            ");
                System.out.println("Nan: " + tr.getNan() + "                              ");
                System.out.println("Team: " + tr.getTeam() + "                            ");
                System.out.println("Goals: " + tr.getMatchwin()+ "                        ");
                System.out.println("Match: " + tr.getMatchloose() + "                     ");
                System.out.println("*******************************************************");
                }
            }
        }catch(EOFException ex){
            
        } catch (FileNotFoundException ex) {
            System.out.println("The file no found");
        } catch (IOException ex) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(WorksObjects.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public static void Backup (){
        File origin = new File("C:\\Users\\Mario\\Desktop\\player.ser");
        File destination = new File("C:\\Users\\Mario\\Desktop\\Backup\\player_backup.ser");
        if (origin.exists()) {
            try {
                InputStream in = new FileInputStream(origin);
                OutputStream out = new FileOutputStream(destination);
                // We use a buffer for the copy (Usamos un buffer para la copia).
                
                int len;
                while ((len = in.read()) > 0) {
                    out.write(len);
                    System.out.println("Completing...");
                }
                System.out.println("Backup complete.");
                in.close();
                out.close();
              
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
        }
        public static void Restore(){
        File origin = new File("C:\\Users\\Mario\\Desktop\\Backup\\player_backup.ser");
        File destination = new File("C:\\Users\\Mario\\Desktop\\Backup\\player.ser");
        if (origin.exists()) {
            try {
                InputStream in = new FileInputStream(origin);
                OutputStream out = new FileOutputStream(destination);
                // We use a buffer for the copy (Usamos un buffer para la copia).
                
                int len;
                while ((len = in.read()) > 0) {
                    out.write(len);
                    System.out.println("Completing...");
                }
                System.out.println("Restore complete.");
                in.close();
                out.close();
              
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
        }


    public static class MiObjectOutputStream extends ObjectOutputStream {
        //constructor recibe parametros

        public MiObjectOutputStream(OutputStream out) throws IOException {
            super(out);
        }
        //Constructor vacio

        protected MiObjectOutputStream() throws IOException, SecurityException {
            super();
        }

        @Override
        protected void writeStreamHeader() throws IOException {
        }

    }
}
