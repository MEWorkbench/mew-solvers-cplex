package pt.uminho.ceb.biosystems.mew.solvers.builders;

import pt.uminho.ceb.biosystems.mew.solvers.ISolverBuilder;
import pt.uminho.ceb.biosystems.mew.solvers.SolverFactory;
import pt.uminho.ceb.biosystems.mew.solvers.lp.ILPSolver;
import pt.uminho.ceb.biosystems.mew.solvers.lp.LPProblem;
import pt.uminho.ceb.biosystems.mew.solvers.persistent.CPLEXSolver3;
import pt.uminho.ceb.biosystems.mew.solvers.qp.IQPSolver;
import pt.uminho.ceb.biosystems.mew.solvers.qp.QPProblem;

public class CPLEX3SolverBuilder implements ISolverBuilder{

	
	public static String ID = "CPLEX3";
	static{
		SolverFactory.getInstance().registSolver(new CPLEX3SolverBuilder());
	}
	
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
		return true;
	}

	@Override
	public ILPSolver lpSolver(LPProblem problem) {
		return new CPLEXSolver3(problem,true);
	}

	@Override
	public ILPSolver lpSolver(LPProblem problem, int totalTime) {
		return new CPLEXSolver3(problem);
	}

	@Override
	public IQPSolver qpSolver(QPProblem problem) {
		return new CPLEXSolver3(problem);
	}

	@Override
	public String getId() {
		return ID;
	}

}
