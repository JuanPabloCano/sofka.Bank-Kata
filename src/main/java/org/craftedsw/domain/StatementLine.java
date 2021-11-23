package org.craftedsw.domain;

import java.io.PrintStream;

public class StatementLine {

	private Transaction transaction;
	private Amount currentBalance;

	// Constructor de clase
	public StatementLine(Transaction transaction, Amount currentBalance) {
		this.transaction = transaction;
		this.currentBalance = currentBalance;
	}
	// Método para imprimir el crédito
	public void printTo(PrintStream printer) {
		this.transaction.printTo(printer, currentBalance);
	}

}
