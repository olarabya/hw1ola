

	package test;

	import static org.junit.Assert.*;

	import org.junit.Test;

import softhw1.carditclass;
import softhw1.muyclassshop;

	public class classtest {

		@Test
		public void test() {
			carditclass bookobjs=new carditclass ();
			//bkobjs.addlist_book(120, "java");
			assertEquals(0,bookobjs.getcount(), 0);}
			@Test
			public void test2() {
				carditclass  bookobjs=new carditclass ();
				bookobjs.addlist_book(127, "java");
				assertEquals(1,bookobjs.getcount(), 0);
			    assertEquals(127,bookobjs.getprice(), 0);
			}
			@Test
			public void test3() {
				carditclass  bookobjs=new carditclass ();
		    bookobjs.addlist_book(127, "java");
			bookobjs.addlist_book(100, "wep");
			assertEquals(2,bookobjs.getcount(), 0);
		    assertEquals(227,bookobjs.getprice(), 0);
			}


		}



