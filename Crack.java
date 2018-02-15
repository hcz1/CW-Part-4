import java.io.*;
import java.security.*;
import java.security.interfaces.*;
import java.security.spec.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import java.math.BigInteger;
import javax.xml.bind.DatatypeConverter;
import java.util.*;

public class Crack{

	public static void main(String args[]) throws Exception{
		ObjectInputStream pubkeyFile = new ObjectInputStream(new FileInputStream("winston.pub"));

		PublicKey pubKey = (PublicKey)pubkeyFile.readObject();

		//RSAPublicKey r = (RSAPublicKey)pubKey;

	    // BigInteger n = r.getModulus();
	    // System.out.println("n = " + n);
	    // BigInteger e = r.getPublicExponent();
	    // System.out.println("e = " + e);

		
		KeyFactory kf = KeyFactory.getInstance("RSA");
		RSAPublicKeySpec pubspec = (RSAPublicKeySpec)kf.getKeySpec(pubKey, 
           RSAPublicKeySpec.class);

		System.out.println("modulus: " + pubspec.getModulus());
		System.out.println("public key exponent: " + pubspec.getPublicExponent());

	   
	    // BigInteger nSqrt = new BigInteger(sqrt(n).toString());
	    // System.out.println(nSqrt);
	    // boolean isPrime = probablePrime(nSqrt);
	    // System.out.println(isPrime);


		}

	// public static BigInteger sqrt(BigInteger n) {
	// 	BigInteger a = BigInteger.ONE;
	// 	BigInteger b = n.shiftRight(5).add(BigInteger.valueOf(8));
	// 	while (b.compareTo(a) >= 0) {
	// 	BigInteger mid = a.add(b).shiftRight(1);
	// 	if (mid.multiply(mid).compareTo(n) > 0) {
	// 				b = mid.subtract(BigInteger.ONE);
	// 		}else{
	// 				a = mid.add(BigInteger.ONE);
	// 			}
	// 		}
	// 	return a.subtract(BigInteger.ONE);
	// }
}