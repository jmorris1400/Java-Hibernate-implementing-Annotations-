package com.file.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
public class TestClient {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	/*Configuration conf=new AnnotationConfiguration()();
	conf=conf.configure();
	// conf.configure("oracle.cfg.xml");

SessionFactory factory =conf.buildSessionFactory();// build session factory, it builds connection pool
*/
		AnnotationConfiguration conf=new AnnotationConfiguration();
		conf.configure("hibernate.cfg.xml");
		SessionFactory factory=conf.buildSessionFactory();
	
		Session ses=factory.openSession();
Transaction tx=null;
try
{
 tx= ses.beginTransaction();

// Object creatoin with data
/*e1.setNo(3);
e1.setFname("Parimala");
e1.setLname("student");
e1.setEmail("parimala@gmail.com");
*/// record insertoin

/*Integer i1=(Integer) ses.save(e1);
System.out.println("Id vlaue is"+i1.intValue());*/

//ses.persist(e1);
// update data
/*e1.setNo(1);
e1.setFname("john-New");
e1.setLname("stu");
e1.setEmail("maru@gmail.com");

ses.update(e1);
e1.setEmail("john@mail.com");
ses.update(e1);*/

/*// merge
e1.setNo(4);
e1.setFname("Raj");
e1.setLname("Trainer");
e1.setEmail("raj@gmail.com");
Employee e2=(Employee) ses.merge(e1);
System.out.println(e2.getEmail());
e2.setEmail("rajjava@gmail.com");
ses.update(e2);*/
/*// delete
e1.setNo(1);
ses.delete(e1);
*/
// get methods
Employee e2=(Employee) ses.get(Employee.class, new Integer(900));
System.out.println("Records are");
System.out.println(e2.getNo()+"\t"+e2.getFname()+"\t"+e2.getLname()+"\t"+e2.getEmail());

tx.commit(); // commited transcation
}
catch(Exception e)
{
	System.out.println("got exception due to some reason"+e);
	tx.rollback();
	
}
ses.close(); // session has been closed
factory.close(); // pool destoryed
System.out.println("data inserted successfully");
	}

}
