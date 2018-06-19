/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resultgeneration;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import cancerdetection.jdbcconnection.JDBCTemplate;
import java.util.Date;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import javax.swing.JOptionPane;

import resultgeneration.Border;
//import mailsending.email1;
//import windows.Login;
/**
 *
 * @author sharmeen
 */

public class result extends PdfPageEventHelper {
    
	String name,gen,email,dob,id;
        String que[]=new String[100];
        String ans[]=new String[100];
        int age;
        int i=1;
    public result(String ID) throws IOException, DocumentException
    {
        id=new String(ID);
        System.out.println("\nEmail from report "+id);
        this.createPdf(id+".pdf");
    }
    
    public void onEndPage(PdfWriter writer, Document document)
    {
    PdfContentByte cb = writer.getDirectContent();
    Rectangle pageSize = writer.getPageSize();
    
    Rectangle rect=new Rectangle(pageSize.getLeft() + 10, pageSize.getBottom() + 10,
      pageSize.getWidth() - 20, pageSize.getHeight() - 20);
    
    rect.setBorder(Rectangle.BOX);
   
    rect.setBorderWidth(10);
    rect.setBorderColor(BaseColor.BLACK);
    
    //cb.rectangle(pageSize.getLeft() + 10, pageSize.getBottom() + 10,pageSize.getWidth() - 20, pageSize.getHeight() - 20);
    cb.rectangle(rect);
    cb.stroke();
  
  }
    
    public static void main(String args[]) throws IOException, DocumentException
    {
        
                new result("koli.nimba93@gmail.com");
    }

    public void createPdf(String dest) throws IOException, DocumentException {
    Document document = new Document();
    PdfWriter writer=PdfWriter.getInstance(document, new FileOutputStream(dest));
    
    writer.setPageEvent(new Border());
    
    document.open();
    
    Font font1=new Font(Font.FontFamily.TIMES_ROMAN,20,Font.UNDERLINE,BaseColor.BLACK);
    Font font2=new Font(Font.FontFamily.TIMES_ROMAN,16,Font.UNDERLINE,BaseColor.BLACK);
    Font font3=new Font(Font.FontFamily.TIMES_ROMAN,14,Font.NORMAL,BaseColor.BLACK);
    Font linef=new Font(Font.FontFamily.TIMES_ROMAN,15,Font.NORMAL,BaseColor.BLACK);
    Paragraph line=new Paragraph("--------------------------------------------------------------------------------------------------------",linef);
    
    
    
    Paragraph title=new Paragraph("DIAGNOSIS REPORT OF MEDICAL EXPERT SYSTEM",font1);
    title.setAlignment(Paragraph.ALIGN_CENTER);
    document.add(title);
    document.add(Chunk.NEWLINE);
    
    
    document.add(line);
    Paragraph subtitle1=new Paragraph("PETIENT PROFILE:",font2);
    subtitle1.setAlignment(Paragraph.ALIGN_LEFT);
    document.add(subtitle1);
    
    
    try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT * FROM user where email='"+id+"'");
                    
                     
		    while(rs3.next())
		      {
                         name=rs3.getString(1);
                         dob=rs3.getString(2);
                         gen=rs3.getString(7);
                         age=Integer.parseInt(rs3.getString(3));
                         email=rs3.getString(4);
                         System.out.println("name = "+name+"  dob = "+dob+"  gender = "+gen+"  age = "+age+" email = "+email);
                       
                      }
                   
                    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
    Paragraph head1=new Paragraph("Name: "+name+"          DOB: "+dob+"\nGender: "+gen+"          Age: "+age+"\nEmail: "+email+"",font3);
    head1.setAlignment(Paragraph.ALIGN_LEFT);
    document.add(head1);
    document.add(Chunk.NEWLINE);
    
    
    
    document.add(line);
    Paragraph subtitle2=new Paragraph("YOU RESPONDED QUESTIONS OF MEDICAL EXPERT SYSTEM:",font2);
    subtitle2.setAlignment(Paragraph.ALIGN_LEFT);
    Paragraph head2=new Paragraph("question => Responce:",font3);
    head2.setAlignment(Paragraph.ALIGN_LEFT);
    document.add(subtitle2);
    document.add(head2);
    try
		    {
		     java.sql.Connection c=null;
		     c=JDBCTemplate.getConnection();
		     java.sql.Statement str=c.createStatement();
                     
                     
                     java.sql.ResultSet rs3=str.executeQuery("SELECT quetion FROM dataset");
                    
                     
		    while(rs3.next())
		      {
                         que[i]=rs3.getString(1);
                         System.out.println(que[i]);
                         i++;
                        
                      }
                   
                    
                    java.sql.ResultSet rs4=str.executeQuery("SELECT * FROM result where email='"+id+"'");
                    
                     
		    if(rs4.next())
		      {
                        ans[1]=rs4.getString(2);
                        ans[2]=rs4.getString(3);
                        ans[3]=rs4.getString(4);
                        ans[4]=rs4.getString(5);
                        ans[5]=rs4.getString(6);
                        ans[6]=rs4.getString(7);
                        ans[7]=rs4.getString(8);
                        ans[8]=rs4.getString(9);
                        ans[9]=rs4.getString(10);
                        ans[10]=rs4.getString(11);
                        ans[11]=rs4.getString(12);
                        ans[12]=rs4.getString(13);
                        ans[13]=rs4.getString(14);
                        ans[14]=rs4.getString(15);
                        ans[15]=rs4.getString(16);
                        ans[16]=rs4.getString(17);
                        ans[17]=rs4.getString(18);
                        ans[18]=rs4.getString(19);
                        ans[19]=rs4.getString(20);
                        ans[20]=rs4.getString(21);
                        ans[21]=rs4.getString(22);
                        ans[22]=rs4.getString(23);
                        ans[23]=rs4.getString(24);
                        ans[24]=rs4.getString(25);
                        ans[25]=rs4.getString(26);
                        ans[26]=rs4.getString(27);
                        ans[27]=rs4.getString(28);
                        ans[28]=rs4.getString(29);
                        ans[29]=rs4.getString(30);
                        ans[30]=rs4.getString(31);
                        ans[31]=rs4.getString(32);
                        ans[32]=rs4.getString(33);
                        ans[33]=rs4.getString(34);
                        ans[34]=rs4.getString(35);
                        ans[35]=rs4.getString(36);
                        ans[36]=rs4.getString(37);
                        ans[37]=rs4.getString(38);
                        ans[38]=rs4.getString(39);
                        ans[39]=rs4.getString(40);
                        ans[40]=rs4.getString(41);
                        ans[41]=rs4.getString(42);
                        ans[42]=rs4.getString(43);
                        ans[43]=rs4.getString(44);
                        ans[44]=rs4.getString(45);
                        ans[45]=rs4.getString(46);
                        ans[46]=rs4.getString(47);
                        ans[47]=rs4.getString(48);
                        ans[48]=rs4.getString(49);
                        ans[49]=rs4.getString(50);
                        ans[50]=rs4.getString(51);
                        ans[51]=rs4.getString(52);
                      }
                    
                    for(i=1;i<52;i++)
                         System.out.println(ans[i]);
                   
		    }
		    catch(Exception e)
		    {
                         System.out.println(e);  
		    }
    Paragraph head3[]=new Paragraph[100];
    for(i=1;i<=36;i++)
    {
       head3[i]=new Paragraph(""+que[i]+" => "+ans[i]+"",font3);
       head3[i].setAlignment(Paragraph.ALIGN_LEFT);
       document.add(head3[i]);
    }
    
    document.add(Chunk.NEWLINE);
    document.add(line);
    Paragraph subtitle3=new Paragraph("MEDICAL TEST REPORT:",font2);
    subtitle2.setAlignment(Paragraph.ALIGN_LEFT);
    Paragraph head4=new Paragraph("Test => Result:",font3);
    head4.setAlignment(Paragraph.ALIGN_LEFT);
    document.add(subtitle3);
    document.add(head4);
    Paragraph head5[]=new Paragraph[100];
    for(i=37;i<=48;i++)
    {
       head5[i]=new Paragraph(""+que[i]+" => "+ans[i]+"",font3);
       head5[i].setAlignment(Paragraph.ALIGN_LEFT);
       document.add(head5[i]);
    }
    
    
    document.add(Chunk.NEWLINE);
    document.add(line);
    Paragraph subtitle4=new Paragraph("FINAL RESULTS:",font2);
    subtitle4.setAlignment(Paragraph.ALIGN_LEFT);
    Paragraph head6=new Paragraph("Result => "+ans[51]+"\nType => "+ans[50]+"\nStage => "+ans[49]+"",font3);
    head4.setAlignment(Paragraph.ALIGN_LEFT);
    document.add(subtitle4);
    document.add(head6);
    /*
    document.add(Chunk.NEWLINE);
    document.add(line);
    Paragraph subtitle5=new Paragraph("TREATMENT:",font2);
    subtitle5.setAlignment(Paragraph.ALIGN_LEFT);
    Paragraph head7=new Paragraph("",font3);
    head7.setAlignment(Paragraph.ALIGN_LEFT);
    document.add(subtitle5);
    document.add(head7);
    */
    /*document.add(Chunk.NEWLINE);
    document.add(line);
    Paragraph subtitle6=new Paragraph("PRECAUTIONS:",font2);
    subtitle6.setAlignment(Paragraph.ALIGN_LEFT);
    Paragraph head8=new Paragraph("1.Try to limit your sun exposure between 10:00 am and 3:00 pm, which is when the sun's rays are strongest.",font3);
    head8.setAlignment(Paragraph.ALIGN_LEFT);
    document.add(subtitle6);
    document.add(head8);
    */
    Date ob=new Date();
    document.add(Chunk.NEWLINE);
    document.add(line);
    Paragraph head9=new Paragraph("\n\nDate: "+ob+"",font3);
    head9.setAlignment(Paragraph.ALIGN_LEFT);
    document.add(head9);
    
    document.close();
   }
   
    
}
