package pt.uminho.ceb.biosystems.mew.solvers;

import org.junit.Test;

import pt.uminho.ceb.biosystems.mew.solvers.builders.CPLEX3SolverBuilder;
import pt.uminho.ceb.biosystems.mew.solvers.builders.CPLEXSolverBuilder;

public class CPLEXTests {

	@Test
	public void testCPLEX3LPProblem(){
		SolversTests.assertLPProblem(CPLEX3SolverBuilder.ID);
	}
	
	@Test
	public void testCPLEXLPProblem(){
		SolversTests.assertLPProblem(CPLEXSolverBuilder.ID);
	}
	
	@Test
	public void testCPLEX3LPInfeasible(){
		SolversTests.assertLPInfeasible(CPLEX3SolverBuilder.ID);
	}
	
	@Test
	public void testCPLEXLPInfeasible(){
		SolversTests.assertLPInfeasible(CPLEXSolverBuilder.ID);
	}
	
//	
//	@Test
//	public void testCPLEXSolverDefinition(){
//		CPLEXSolver cplex = new CPLEXSolver(new LPProblem());
//		try{
//			cplex.solve();
//		}catch(Error e){
//			throw new SolverDefinitionException(CPLEXSolver.class);
//		}catch(Exception e){
//			if(SolverDefinitionException.class.isAssignableFrom(e.getClass()))
//				throw e;
//			throw new SolverException(CPLEXSolver.class, e);
//		}
//	}
	
//	@Test
//	public void testCLPLPSolverDefinition(){
//		CLPLPSolver clplp = new CLPLPSolver(Problems.getLPProblem());
//		LPSolution res = clplp.solve();
//		Assert.assertNotNull(res);
//	}
//	
//	@Test
//	public void testGLPKSolverDefinition(){
//		GLPKSolver glpk = new GLPKSolver(Problems.getLPProblem());
//		LPSolution res = glpk.solve();
//		Assert.assertNotNull(res);
//	}
//	
//	
//	@Test
//	public void testCLPLPInfeasible(){
//		CLPLPSolver clplp = new CLPLPSolver(Problems.getInfeasibleLPProblem());
//		
//		LPSolution res = null;
//		try {
//			res = clplp.solve();
//		} catch (InfeasibleProblemException e) {
//			e.printStackTrace();
//			return;
//		}
//		
//		Assert.assertNotNull(res);
//		Assert.assertTrue(res.getSolutionType().equals(LPSolutionType.INFEASIBLE));
//	}
//	
//	@Test
//	public void testGLPKLPInfeasible(){
//		GLPKSolver glpk = new GLPKSolver(Problems.getInfeasibleLPProblem());
//		LPSolution res = null;
//		try {
//			res = glpk.solve();
//		} catch (InfeasibleProblemException e) {
//			e.printStackTrace();
//			return;
//		}
//		
//		Assert.assertNotNull(res);
//		Assert.assertTrue(res.getSolutionType().equals(LPSolutionType.INFEASIBLE));
//	}

}
