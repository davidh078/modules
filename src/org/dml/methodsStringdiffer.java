package org.dml;

public class methodsStringdiffer {
public static void main(String[] args) {
	System.out.println("this is demo class for gitup2");
	System.out.println("this is demo class for gitup3");

	String a="javaselenium";
String b="muhulaknowledge";
String c="moonkilms";
System.out.println(System.identityHashCode(a));
System.out.println(System.identityHashCode(b));
System.out.println(System.identityHashCode(c));
String x=b.concat(c);
System.out.println(""+System.identityHashCode(x));


System.out.println("default constructor");

	
	System.out.println("this is demo class for gitup");
	
	
	System.out.println("this is demo class for gitup3");
	System.out.println("this is demo class for gitup2");
	System.out.println("this is demo class for gitup3");
	System.out.println("this is demo class for gitup2");
	System.out.println("this is demo class for gitup3");
	


System.out.println("sringbuffer method/heap method");
StringBuffer s1=new StringBuffer("java");
StringBuffer s2=new StringBuffer("javaselenium");
StringBuffer s3=new StringBuffer("javaAutomation");

System.out.println(System.identityHashCode(s1));
System.out.println(System.identityHashCode(s2));
System.out.println(System.identityHashCode(s3));
StringBuffer gm=s2.append(s3);
System.out.println(""+System.identityHashCode(gm));


StringBuffer s11=new StringBuffer("java");
StringBuffer s21=new StringBuffer("javaselenium");
StringBuffer s31=new StringBuffer("javaAutomation");

System.out.println(System.identityHashCode(s11));
System.out.println(System.identityHashCode(s21));
System.out.println(System.identityHashCode(s31));
StringBuffer gm1=s21.append(s31);
System.out.println(""+System.identityHashCode(gm1));


System.out.println("stringbuilder");
StringBuilder s4=new StringBuilder("java");
StringBuilder s5=new StringBuilder("javascript");
StringBuilder s6=new StringBuilder("javaseleniuum");


System.out.println(System.identityHashCode(s11));
System.out.println(System.identityHashCode(s21));
System.out.println(System.identityHashCode(s31));
StringBuilder qr=s4.append(s5);
System.out.println(""+System.identityHashCode(qr));





}
}
