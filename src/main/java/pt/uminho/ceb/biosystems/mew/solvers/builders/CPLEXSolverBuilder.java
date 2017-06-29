package pt.uminho.ceb.biosystems.mew.solvers.builders;

import pt.uminho.ceb.biosystems.mew.solvers.ISolverBuilder;
import pt.uminho.ceb.biosystems.mew.solvers.lp.CLPLPSolver;
import pt.uminho.ceb.biosystems.mew.solvers.lp.CPLEXSolver;
import pt.uminho.ceb.biosystems.mew.solvers.lp.ILPSolver;
import pt.uminho.ceb.biosystems.mew.solvers.lp.LPProblem;
import pt.uminho.ceb.biosystems.mew.solvers.lp.exceptions.SolverDefinitionException;
import pt.uminho.ceb.biosystems.mew.solvers.qp.CLPQPSolver;
import pt.uminho.ceb.biosystems.mew.solvers.qp.IQPSolver;
import pt.uminho.ceb.biosystems.mew.solvers.qp.QPProblem;

public class CPLEXSolverBuilder implements ISolverBuilder{

	public static String ID = "CPLEX";
	
	@Override
	public boolean isLP() {
		return true;
	}

	@Override
	public boolean isMIP() {
		return true;
	}

	@Override
	public boolean isQP() {
		return true;
	}

	@Override
	public boolean supportsPersistentModel() {
		return false;
	}

	@Override
	public ILPSolver lpSolver(LPProblem problem) {
		try {
			return new CPLEXSolver(problem);
		}catch (Error e) {
			throw new SolverDefinitionException(getId());
		}  catch (Exception e) {
			throw new SolverDefinitionException(getId());
		}
	}

	@Override
	public ILPSolver lpSolver(LPProblem problem, int totalTime) {
		return lpSolver(problem);
	}

	@Override
	public IQPSolver qpSolver(QPProblem problem) {
		return (IQPSolver)lpSolver(problem);
	}

	@Override
	public String getId() {
		return ID;
	}

}
