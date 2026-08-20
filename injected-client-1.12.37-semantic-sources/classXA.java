import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import net.runelite.mapping.ObfuscatedName;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@ObfuscatedName("xa")
public @interface classXA {
}
