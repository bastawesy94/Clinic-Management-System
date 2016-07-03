
package barcodeclinic;

import java.util.Date;
import javax.swing.JOptionPane;

public class Nurse {
private int id;
private String name;
private String pass;
private String mobile;
private double salary;
private double bonus;
private String shift;
private Date date;

    public Nurse(String name, String pass, String mobile, double salary, double bonus, String shift, Date date) {
        this.name = name;
        this.pass = pass;
        this.mobile = mobile;
        this.salary = salary;
        this.bonus = bonus;
        this.shift = shift;
        this.date = date;
    }

    public void setName(String name) {
       try{
           if(name.isEmpty())
               JOptionPane.showMessageDialog(null, "من فضلك أدخل أسم الممرض !");
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

    public void setMobile(String mobile) {
        try{
           if(mobile.isEmpty())
               JOptionPane.showMessageDialog(null, "من فضلك أدخل رقم الموبايل");
          else
        this.mobile = mobile;
           }
       catch(Exception ex){
       ex.printStackTrace();
       JOptionPane.showMessageDialog(null, "يوجد جطأ في التسجيل !");
       }
    }

    public void setSalary(double salary) {
        try{
            if(salary <=0)
                JOptionPane.showMessageDialog(null, "من فضلك أدخل قيمة صحيحة للراتب!");
            else
        this.salary = salary;
            }
        catch(Exception ex){
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "يوجد جطأ في التسجيل !");

        }
              
    }

    public void setBonus(double bonus) {
        try{
            if(bonus <=0)
                JOptionPane.showMessageDialog(null,"من فضلك أدخل قيمة صحيحة للحافز!");
            else
        this.bonus = bonus;
            }
        catch(Exception ex){
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "يوجد جطأ في التسجيل !");

        }
    }

    public void setShift(String shift) {
        try{
           if(shift.isEmpty())
               JOptionPane.showMessageDialog(null, "من فضلك أدخل مدة العمل اليومية");
          else
        this.shift = shift;
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

    public String getMobile() {
        return mobile;
    }

    public double getSalary() {
        return salary;
    }

    public double getBonus() {
        return bonus;
    }

    public String getShift() {
        return shift;
    }

    public Date getDate() {
        return date;
    }



}
