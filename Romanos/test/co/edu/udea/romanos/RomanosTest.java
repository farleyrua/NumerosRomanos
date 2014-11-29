package co.edu.udea.romanos;
import static org.junit.Assert.*;
import org.junit.Test;
import co.edu.udea.romanos.Romanos;

public class RomanosTest 
{
	Romanos romanos = new Romanos();
	
	@Test
	public void testEntraCero() 
	{
		String result = this.romanos.convertirAromanos(0);
		assertEquals("Error", result);
	}
	@Test
	public void testNumeroNegativo() 
	{
		String result = this.romanos.convertirAromanos(-1);
		assertEquals("Error", result);
	}
	@Test
	public void testNumeroUno() 
	{
		String result = this.romanos.convertirAromanos(1);
		assertEquals("I", result);
	}
	@Test
	public void testNumeroMenorQueDiez() 
	{
		String result = this.romanos.convertirAromanos(8);
		assertEquals("VIII", result);
	}
	@Test
	public void testNumeroDiez() 
	{
		String result = this.romanos.convertirAromanos(10);
		assertEquals("X", result);
	}
	@Test
	public void testNumeroMenorQueCienMayorQueDiez() 
	{
		String result = this.romanos.convertirAromanos(99);
		assertEquals("XCIX", result);
	}
	@Test
	public void testNumeroCien() 
	{
		String result = this.romanos.convertirAromanos(100);
		assertEquals("C", result);
	}
	@Test
	public void testNumeroMayorQueCienMenorQueMil() 
	{
		String result = this.romanos.convertirAromanos(999);
		assertEquals("CMXCIX", result);
	}
	@Test
	public void testNumeroMil() 
	{
		String result = this.romanos.convertirAromanos(1000);
		assertEquals("M", result);
	}
	@Test
	public void testNumeroMayorQueMil() 
	{
		String result = this.romanos.convertirAromanos(1001);
		assertEquals("Error", result);
	}
}