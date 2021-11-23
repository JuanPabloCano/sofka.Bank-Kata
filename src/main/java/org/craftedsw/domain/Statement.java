package org.craftedsw.domain;

import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;

public class Statement {

	private static final int TOP_OF_THE_LIST = 0;

	public static final String STATEMENT_HEADER = "date       | credit   | debit    | balance";

	// Creación de lista tipo Objeto de clase StatementLine para guardar la información como colección
	private List<StatementLine> statementLines = new LinkedList<StatementLine>();

	// Método para imprimir los datos como el crédito, el débito
	public void addLineContaining(Transaction transaction, Amount currentBalance) {
		statementLines.add(TOP_OF_THE_LIST, new StatementLine(transaction, currentBalance));
	}

	// Método que imprime el STATEMENT HEADER
	public void printTo(PrintStream printer) {
		printer.println(STATEMENT_HEADER);
		printStatementLines(printer);
	}

	private void printStatementLines(PrintStream printer) {
		for (StatementLine statementLine : statementLines) {
			statementLine.printTo(printer);
		}
	}

}
