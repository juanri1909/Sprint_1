package n2Exercici1;

import java.lang.annotation.*;

@Target(value={ElementType.FIELD} )
@Retention(RetentionPolicy.RUNTIME)

public @interface miAnotacion {
	public String directorio();
}

