package test.unit.com.bitdubai.fermat_api.layer._1_definition.crypto.asymmetric.AsymmectricCryptography;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Ignore;
import org.junit.Test;

import com.bitdubai.fermat_api.layer._1_definition.crypto.asymmetric.AsymmectricCryptography;

public class EncryptMessagePublicKeyTest extends AsymmetricCryptographyUnitTest{
	
	@Ignore
	@Test
	public void EncryptMessagePublicKey_ValidParameters_NotNull() {
		assertNotNull(AsymmectricCryptography.encryptMessagePublicKey(testPlainMessage, testPublicKey));		
	}
	
	@Ignore
	@Test
	public void EncryptMessagePublicKey_ValidParameters_BigIntegerBytesValue() {
		BigInteger encryptedMessage = new BigInteger(AsymmectricCryptography.encryptMessagePublicKey(testPlainMessage, testPublicKey),16);
		assertNotNull(encryptedMessage);
	}
	
	@Ignore
	@Test
	public void EncryptMessagePublicKey_ValidParameters_DifferentThanPlainMessage() {
		String encryptedMessage = AsymmectricCryptography.encryptMessagePublicKey(testPlainMessage, testPublicKey);
		assertNotEquals(testPlainMessage, encryptedMessage);		
	}
	
	@Ignore
	@Test
	public void EncryptMessagePublicKey_MultipleExecutions_DifferentEncryptedMessages() {
		String encryptedMessage1 = AsymmectricCryptography.encryptMessagePublicKey(testPlainMessage, testPublicKey);
		String encryptedMessage2 = AsymmectricCryptography.encryptMessagePublicKey(testPlainMessage, testPublicKey);
		assertNotEquals(encryptedMessage1, encryptedMessage2);		
	}

}
