package prgram6CaHap05;

public class PhoneTest {
	   public static void main(String[] args) {
	        Phone[] phones = {
	            new Telephone("길동이", "내일"),
	            new Smartphone("민국이", "갤러그")
	        };

	        for (Phone i : phones) {
	            if (i instanceof Smartphone) {
	                ((Smartphone) i).playGame();
	            }
	            i.talk();
	        }
	    }
	}