import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.neu.myapp.dao.DAO;
import com.neu.myapp.pojo.University;

public class test {

	public test() {
		// TODO Auto-generated constructor stub
	}
//	static Configuration cfg = new Configuration();
//	static SessionFactory sf = cfg.configure().buildSessionFactory();
//    static Session hibsession = sf.openSession();
//    static Transaction tx =hibsession.beginTransaction();
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		
////		Session session = getSessionFactory().openSession();
////		session.beginTransaction();
//		
////		Configuration cfg = new Configuration();
////	    SessionFactory sf = cfg.configure().buildSessionFactory();
////	    Session hibsession = sf.openSession();
////	    Transaction tx =hibsession.beginTransaction();
//		
//		University university1 = new University();
//		university1.setUniversityName("Northeastern University");
//		university1.setUniversityLocation("Boston");
//		university1.setReputationRating(8);
//		university1.setPopularityRating(8);
//		university1.setPlacementRating(9);
//		university1.setFeeRating(7);
//		university1.setExpenseRating(8);
//		university1.setLocationRating(10);
//		university1.setWeatherRating(6);
//		
//		hibsession.save(university1);
//		
//		tx.commit();
//		System.out.println("Done");
//		
//	}
	

}
