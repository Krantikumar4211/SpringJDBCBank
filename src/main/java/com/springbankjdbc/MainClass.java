package com.springbankjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springbankjdbc.config.AppConfig;
import com.springbankjdbc.dao.BankDao;

public class MainClass {
	
	 public static void main( String[] args )
	    {
	        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	        
	        BankDao  bdao = context.getBean(BankDao.class);
	        
	        bdao.insertBank("SBI", "Deccon Gymkhana", "Pune", "SBIN0001110");
	        bdao.insertBank("IDFC FIRST", "Navi Peth", "Pune", "IDFC000153");
	        bdao.insertBank("ICICI Bank", "MG Road", "Mumbai", "ICIC0003345");
	        bdao.insertBank("Axis Bank", "Baner", "Pune", "UTIB0004456");
	        bdao.insertBank("Bank of Baroda", "Andheri East", "Mumbai", "BARB0ANDHER");
	        bdao.insertBank("Punjab National Bank", "Camp", "Pune", "PUNB0123456");
	        bdao.insertBank("Canara Bank", "Vashi", "Navi Mumbai", "CNRB0005678");
	        bdao.insertBank("Maharastra bank", "Kurla", "Navi Mumbai", "MHB0005678");
	        
	    }

}
