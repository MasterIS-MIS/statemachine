/*
 * generated by Xtext 2.30.0
 */
grammar InternalMyStateMachine;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package lsi.us.es.mis.xtext.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package lsi.us.es.mis.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import lsi.us.es.mis.xtext.services.MyStateMachineGrammarAccess;

}
@parser::members {
	private MyStateMachineGrammarAccess grammarAccess;

	public void setGrammarAccess(MyStateMachineGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleStateMachine
entryRuleStateMachine
:
{ before(grammarAccess.getStateMachineRule()); }
	 ruleStateMachine
{ after(grammarAccess.getStateMachineRule()); } 
	 EOF 
;

// Rule StateMachine
ruleStateMachine 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStateMachineAccess().getGroup()); }
		(rule__StateMachine__Group__0)
		{ after(grammarAccess.getStateMachineAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleState
entryRuleState
:
{ before(grammarAccess.getStateRule()); }
	 ruleState
{ after(grammarAccess.getStateRule()); } 
	 EOF 
;

// Rule State
ruleState 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStateAccess().getNameAssignment()); }
		(rule__State__NameAssignment)
		{ after(grammarAccess.getStateAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTransition
entryRuleTransition
:
{ before(grammarAccess.getTransitionRule()); }
	 ruleTransition
{ after(grammarAccess.getTransitionRule()); } 
	 EOF 
;

// Rule Transition
ruleTransition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTransitionAccess().getGroup()); }
		(rule__Transition__Group__0)
		{ after(grammarAccess.getTransitionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateMachine__Group__0__Impl
	rule__StateMachine__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateMachineAccess().getStatesKeyword_0()); }
	'states:'
	{ after(grammarAccess.getStateMachineAccess().getStatesKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateMachine__Group__1__Impl
	rule__StateMachine__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateMachineAccess().getStatesAssignment_1()); }
	(rule__StateMachine__StatesAssignment_1)
	{ after(grammarAccess.getStateMachineAccess().getStatesAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateMachine__Group__2__Impl
	rule__StateMachine__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateMachineAccess().getGroup_2()); }
	(rule__StateMachine__Group_2__0)*
	{ after(grammarAccess.getStateMachineAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateMachine__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateMachineAccess().getGroup_3()); }
	(rule__StateMachine__Group_3__0)?
	{ after(grammarAccess.getStateMachineAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StateMachine__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateMachine__Group_2__0__Impl
	rule__StateMachine__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateMachineAccess().getCommaKeyword_2_0()); }
	','
	{ after(grammarAccess.getStateMachineAccess().getCommaKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateMachine__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateMachineAccess().getStatesAssignment_2_1()); }
	(rule__StateMachine__StatesAssignment_2_1)
	{ after(grammarAccess.getStateMachineAccess().getStatesAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StateMachine__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateMachine__Group_3__0__Impl
	rule__StateMachine__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateMachineAccess().getTransitionsKeyword_3_0()); }
	'transitions:'
	{ after(grammarAccess.getStateMachineAccess().getTransitionsKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateMachine__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getStateMachineAccess().getTransitionsAssignment_3_1()); }
		(rule__StateMachine__TransitionsAssignment_3_1)
		{ after(grammarAccess.getStateMachineAccess().getTransitionsAssignment_3_1()); }
	)
	(
		{ before(grammarAccess.getStateMachineAccess().getTransitionsAssignment_3_1()); }
		(rule__StateMachine__TransitionsAssignment_3_1)*
		{ after(grammarAccess.getStateMachineAccess().getTransitionsAssignment_3_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Transition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__0__Impl
	rule__Transition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getFromAssignment_0()); }
	(rule__Transition__FromAssignment_0)
	{ after(grammarAccess.getTransitionAccess().getFromAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__1__Impl
	rule__Transition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1()); }
	'->'
	{ after(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getToAssignment_2()); }
	(rule__Transition__ToAssignment_2)
	{ after(grammarAccess.getTransitionAccess().getToAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StateMachine__StatesAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_1_0()); }
		ruleState
		{ after(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__StatesAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_2_1_0()); }
		ruleState
		{ after(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__TransitionsAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_3_1_0()); }
		ruleTransition
		{ after(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__FromAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getFromStateCrossReference_0_0()); }
		(
			{ before(grammarAccess.getTransitionAccess().getFromStateIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getTransitionAccess().getFromStateIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getTransitionAccess().getFromStateCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__ToAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getToStateCrossReference_2_0()); }
		(
			{ before(grammarAccess.getTransitionAccess().getToStateIDTerminalRuleCall_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getTransitionAccess().getToStateIDTerminalRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getTransitionAccess().getToStateCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
