package pack1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Pro2 {

	static Scanner sc=new Scanner(System.in);
	public static void method1(String[] m){
		String line1=null;
		String line2=null;
			try{
				if(m[0].toLowerCase().equals("read") || m[0].toLowerCase().equals("write"))
				{
					File f=new File("C:\\Users\\JAY\\Desktop\\myfiles");
				String[] filelist=f.list();
				for(int i=0;i<filelist.length;i++)
				{
		FileReader filee=new FileReader("C:\\Users\\JAY\\Desktop\\myfiles\\"+filelist[i]);
			BufferedReader b=new BufferedReader(filee);
					String l=b.readLine();
					b.close();
				String[] a=l.split(";");
				if(a[0].equals(m[1].toLowerCase()))
				{
					String name=filelist[i];
					FileReader f1=new FileReader("C:\\Users\\JAY\\Desktop\\myfiles\\"+name);
					if(m[0].toLowerCase().equals("read"))
					{
						String sss=a[3];
						//String h=sss.replace(",", "	");
						System.out.println(sss);
						BufferedReader b2=new BufferedReader(f1);	
						b2.readLine();
						while((line1 = b2.readLine())!= null)
						{	line2=line1.replace(";", "	");
							System.out.println(line2);
							}
						b2.close();
					}
						else if(m[0].toLowerCase().equals("write"))
						{
					
						
							String pp="";
							String p=null;
							FileWriter fileee=new FileWriter("C:\\Users\\JAY\\Desktop\\myfiles\\"+name, true);
							BufferedWriter w=new BufferedWriter(fileee);
							fileee.append(System.getProperty("line.separator"));
							String jj=a[3];
							String[] aar2=jj.split(",");
							for(int j=0;j<aar2.length;j++){
							System.out.println("enter "+aar2[j]);
							if(aar2[j].contains("0"))
							{
							pp=pp+";"+sc.nextInt();
							}
							else if(aar2[j].contains("1"))
							{
								pp=pp+";"+sc.next();
							}
							}
							 p=pp.replaceFirst(";", "");
							w.append(p);
							w.close();	
						}
						
						else{
							System.out.println("invalid argument");
						}
						break;
					}
				}
				
				}else{
					System.out.println("invalid arguments");
				}
			}
				
			catch(Exception f)	
			{
				System.out.println(f);
			}
			}
	public static void main(String[] args) {
		System.out.println("enter the operation to perform");
		String s=sc.nextLine();
		String[] s1=s.split(" ");
		method1(s1);
	}

	}


