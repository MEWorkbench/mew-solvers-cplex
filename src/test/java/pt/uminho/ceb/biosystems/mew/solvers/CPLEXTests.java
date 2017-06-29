package pt.uminho.ceb.biosystems.mew.solvers;

import org.junit.Test;

import pt.uminho.ceb.biosystems.mew.solvers.builders.CPLEX3SolverBuilder;
import pt.uminho.ceb.biosystems.mew.solvers.builders.CPLEXSolverBuilder;
import utils.test.AssertProblemUtils;

public class CPLEXTests {

	@Test
	public void testCPLEX3LPProblem(){
		AssertProblemUtils.assertLPProblem(CPLEX3SolverBuilder.ID);
	}
	
	@Test
	public void testCPLEXLPProblem(){
		AssertProblemUtils.assertLPProblem(CPLEXSolverBuilder.ID);
	}
	
	@Test
	public void testCPLEX3LPInfeasible(){
		AssertProblemUtils.assertLPInfeasible(CPLEX3SolverBuilder.ID);
	}
	
	@Test
	public void testCPLEXLPInfeasible(){
		AssertProblemUtils.assertLPInfeasible(CPLEXSolverBuilder.ID);
	}

}
