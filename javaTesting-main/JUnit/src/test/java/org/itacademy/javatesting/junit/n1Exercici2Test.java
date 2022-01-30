/*Exercici 2. Crea una classe anomenada CalculoDni que calculi la lletra del DNI en rebre el número 
 * com a paràmetre. Crea una classe jUnit que verifiqui el seu correcte funcionament, 
 * parametritzant-la perquè el test rebi un espectre de dades ampli i validi si el càlcul és 
 * correcte per a 10 números de DNI predefinits.
 */
package org.itacademy.javatesting.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(value = Parameterized.class)
class n1Exercici2Test {
	
	
    @ParameterizedTest
    @CsvSource({
            "29165189Q, 29165189",
            "8986985B, 8986985",
            "1234567L, 1234567",
            "67903463B,67903463",
            "67903461D, 67903461",
            "67403461Y,67403461",
            "25403461F,25403461",
            "45403461N,45403461",
            "45489461S,45489461",
    })
    void test_csv(String dni1, int dni2) {
    	n1Exercici2 c = new n1Exercici2();
    	assertEquals(dni1, c.Calculo_DNI(dni2),()->"ERROR" );
    }

}