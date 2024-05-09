package studentgradingsystemproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;


public class StudentGradingSystemProject {
    public static List students;
    public static SimpleDateFormat fmt;
    
    public static void main(String[] args) {
        students = new ArrayList();
        fmt = new SimpleDateFormat("dd/MM/yyyy");        
        
        //test_students();
        create_students();
        
        new Menu().setVisible(true);
        
        System.out.printf("\n");
    }
    
    public static void add_student(int std_id, String std_no, String std_name, 
                       String std_surname, char std_gender, 
                       String std_nationality, GregorianCalendar birthday) {
            Student st =new Student(std_id, std_no, std_name, std_surname, std_gender, std_nationality, birthday);
            students.add(st);
    }
    
    public static void edit_student(int std_id, String std_no, String std_name, 
                       String std_surname, char std_gender, 
                       String std_nationality, GregorianCalendar std_birthday) {
        
     Student st=null;
      Boolean found=false;
      Iterator <Student> itr = students.iterator();
      while (itr.hasNext()) {
          st = itr.next(); 
          if(std_id==st.getStd_id()) {
              found=true;
              break;
          }
      }
      if (found) {
          st.setStd_no(std_no);
          st.setStd_name(std_name);
          st.setStd_surname(std_surname);
          st.setNationality(std_nationality);
          st.setGender(std_gender);
          st.setBirthday(std_birthday);
      }
    }
    
    
    public static void delete_student(int std_id) {
      Student st=null;
      Boolean found=false;
      Iterator <Student> itr = students.iterator();
      while (itr.hasNext()) {
          st = itr.next(); 
          if(std_id==st.getStd_id()) {
              found=true;
              break;
          }
      }
      if (found) students.remove(st);
      }

    public static void draw_line(int num) {
        String ln="";
        for (int i=0; i<num; i++) ln+="=";
        System.out.printf("\n"+ln);
    }
    
    public static void list_students() {
      Student st;
      //SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
      
      Iterator <Student> itr = students.iterator();
      System.out.printf("\n%10s %10s %15s %15s %10s %12s %12s",
              "Student Id", "Student No","Std. Name", "Std. Surname", 
              "Gender","Nationality", "Birthday");
        draw_line(90);
        
      while (itr.hasNext()) {
          st = itr.next(); 
//          fmt.setCalendar(st.getBirthday());
          System.out.printf("\n%10d %10s %15s %15s %10s %12s %12s",
              st.getStd_id(), st.getStd_no(), st.getStd_name(), 
              st.getStd_surname(), st.getGender(), st.getNationality(), 
              fmt.format(st.getBirthday().getTime()));
      }
      draw_line(90);
        
    }
    
    
    public static void backup_student() throws IOException
    {
     File outfile  = new File("students.dat");
     FileOutputStream outfilestream = new FileOutputStream(outfile);
     ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream);
     
     outObjectStream.writeObject(students);
     outObjectStream.close();
     
    }
    
    public static void retrieve_student() throws IOException, ClassNotFoundException
    {
     File infile  = new File("students.dat");
     FileInputStream infilestream = new FileInputStream(infile);
     ObjectInputStream inObjectStream = new ObjectInputStream(infilestream);
     students = (ArrayList)inObjectStream.readObject();
     
     inObjectStream.close();
     
    }
    
    public static GregorianCalendar strToGregorianCalendar(String stDate){
        GregorianCalendar bdate;
        
        bdate = new GregorianCalendar(
                Integer.parseInt(stDate.substring(6,10)),
                Integer.parseInt(stDate.substring(3,5))-1,
                Integer.parseInt(stDate.substring(0,2)));
        return bdate;       
    }
    
    public static void test_students() {
        
        try {
        System.out.printf("\n Tests for Class Student\n\n");
        System.out.printf("\n Add_student()\n\n");
        
        add_student(1,"189222", "Ayse","Cengiz",'F',"Turkey",
                    strToGregorianCalendar("28/03/2002"));
        add_student(2,"193342","Philip","Udoye",'M',"Nigeri",
                    strToGregorianCalendar("16/09/2003"));
        add_student(3,"189931","Kemal","Salih",'M',"TRNC",
                    strToGregorianCalendar("17/05/2002"));
        add_student(4,"188883","Fathima","Mohammad",'F',"Syria",
                    strToGregorianCalendar("22/11/2001"));                
        add_student(5,"189447","Jasmin","Faruq",'F',"Egypt",
                    strToGregorianCalendar("19/02/2002"));                

        System.out.printf("\n List_student()\n\n");
        list_students();
        
        System.out.printf("\n Edit_student()\n\n");
        edit_student(3,"189931","Kemal","Salih",'M',"Turkey",
                    strToGregorianCalendar("17/04/2002"));
        System.out.printf("\n List_student()\n\n");
        list_students();

        backup_student();
        
        System.out.printf("\n Delete_student()\n\n");
        delete_student(3);
        System.out.printf("\n List_student()\n\n");
        list_students();
        
        retrieve_student();
        System.out.printf("\n List_student()\n\n");
        list_students();
        }
        catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error");
                }
    }
    
    public static void create_students() {
        
        System.out.printf("\n Add_student()\n\n");
        
        add_student(1,"189222", "Ayse","Cengiz",'F',"Turkey",
                    strToGregorianCalendar("28/03/2002"));
        add_student(2,"193342","Philip","Udoye",'M',"Nigeri",
                    strToGregorianCalendar("16/09/2003"));
        add_student(3,"189931","Kemal","Salih",'M',"TRNC",
                    strToGregorianCalendar("17/05/2002"));
        add_student(4,"188883","Fathima","Mohammad",'F',"Syria",
                    strToGregorianCalendar("22/11/2001"));                
        add_student(5,"189447","Jasmin","Faruq",'F',"Egypt",
                    strToGregorianCalendar("19/02/2002"));                

        System.out.printf("\n List_student()\n\n");
        list_students();
    }
} // end of class StudentGradingSystemProject
