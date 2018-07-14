package groovyquil

import org.junit.Test
import jquil.QVM
import jquil.g
import jquil.Program

import static org.junit.Assert.assertEquals
import static org.junit.Assert.assertNotNull

class GroovQuilTest {
    @Test public void testEpr() {
        assertEquals(QVM.wavefunction(new Program(g.H(0), g.CNOT(0, 1)),  [1]), "0.71|00> + 0.71|11>")
    }

}

