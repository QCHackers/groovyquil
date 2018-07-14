package groovyquil

import jquil.QVM
import jquil.g
import jquil.Program

class Main {
    static void main(String[] args) {
	println(QVM.wavefunction(new Program(g.H(0), g.CNOT(0, 1)),  [1]))
    }
}
