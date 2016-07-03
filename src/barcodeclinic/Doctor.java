
package barcodeclinic;

import java.util.Date;
import javax.swing.JOptionPane;

public class Doctor {
    private int id;
    private String name;
    private String pass;
    private Date date;

    public Doctor(int id , String name, String pass, Date date) {
        this.name = name;
        this.pass = pass;
        this.date = date;
    }

    public void setName(String name) {
       try{
           if(name.isEmpty())
               JOptionPane.showMessageDialog(null, "من فضلك أدخل أسم الدكتور !");
          else
        this.name = name;
           }
       catch(Exception ex){
       ex.printStackTrace();
       JOptionPane.showMessageDialog(null, "يوجد جطأ في التسجيل !");
       }
    }

     public void setPass(String pass) {
      try{
           if(pass.isEmpty())
               JOptionPane.showMessageDialog(null, "من فضلك أدخل كلمة السر !");
          else
        this.pass = pass;
           }
       catch(Exception ex){
       ex.printStackTrace();
       JOptionPane.showMessageDialog(null, "يوجد جطأ في التسجيل !");
       }
    }

    public void setDate(Date date) {
        try{
        this.date = date;
        }
        catch(Exception ex){
            ex.printStackTrace();
             JOptionPane.showMessageDialog(null, "يوجد جطأ في التسجيل !");
        }
               
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    public Date getDate() {
        return date;
    }
    
    
    
    
}
