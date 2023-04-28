import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UniqueRefGeneratorTest {
    @Test
    public void testGenerateUniqueRef() {
        UniqueRefGenerator refGenerator = new UniqueRefGenerator();
        Set<String> generatedRefs = new HashSet<>();
        int numOfRefsToGenerate = 100000;

        for (int i = 0; i < numOfRefsToGenerate; i++) {
            String ref = refGenerator.generateUniqueRef();
            assertEquals(14, ref.length()); // check length of generated ref
            assertTrue(generatedRefs.add(ref)); // check that the ref is unique
        }
    }
}