/*
 * generated by Xtext 2.25.0
 */
package lsi.us.es.mis.xtext.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyStateMachineGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class StateMachineElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "lsi.us.es.mis.xtext.MyStateMachine.StateMachine");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStatesKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cStatesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cStatesStateParserRuleCall_1_0 = (RuleCall)cStatesAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cStatesAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cStatesStateParserRuleCall_2_1_0 = (RuleCall)cStatesAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cTransitionsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cTransitionsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cTransitionsTransitionParserRuleCall_3_1_0 = (RuleCall)cTransitionsAssignment_3_1.eContents().get(0);
		
		//StateMachine:
		//'states:'
		//    (states+=State) (',' states+=State)*
		//('transitions:'
		//    transitions+= Transition+)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'states:'
		//    (states+=State) (',' states+=State)*
		//('transitions:'
		//    transitions+= Transition+)?
		public Group getGroup() { return cGroup; }
		
		//'states:'
		public Keyword getStatesKeyword_0() { return cStatesKeyword_0; }
		
		//(states+=State)
		public Assignment getStatesAssignment_1() { return cStatesAssignment_1; }
		
		//State
		public RuleCall getStatesStateParserRuleCall_1_0() { return cStatesStateParserRuleCall_1_0; }
		
		//(',' states+=State)*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//states+=State
		public Assignment getStatesAssignment_2_1() { return cStatesAssignment_2_1; }
		
		//State
		public RuleCall getStatesStateParserRuleCall_2_1_0() { return cStatesStateParserRuleCall_2_1_0; }
		
		//('transitions:'
		//    transitions+= Transition+)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'transitions:'
		public Keyword getTransitionsKeyword_3_0() { return cTransitionsKeyword_3_0; }
		
		//transitions+= Transition+
		public Assignment getTransitionsAssignment_3_1() { return cTransitionsAssignment_3_1; }
		
		//Transition
		public RuleCall getTransitionsTransitionParserRuleCall_3_1_0() { return cTransitionsTransitionParserRuleCall_3_1_0; }
	}
	public class StateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "lsi.us.es.mis.xtext.MyStateMachine.State");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//State:
		//    name=ID ;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class TransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "lsi.us.es.mis.xtext.MyStateMachine.Transition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFromAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cFromStateCrossReference_0_0 = (CrossReference)cFromAssignment_0.eContents().get(0);
		private final RuleCall cFromStateIDTerminalRuleCall_0_0_1 = (RuleCall)cFromStateCrossReference_0_0.eContents().get(1);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cToAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cToStateCrossReference_2_0 = (CrossReference)cToAssignment_2.eContents().get(0);
		private final RuleCall cToStateIDTerminalRuleCall_2_0_1 = (RuleCall)cToStateCrossReference_2_0.eContents().get(1);
		
		//Transition:
		//    from=[State]'->'to=[State]
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//from=[State]'->'to=[State]
		public Group getGroup() { return cGroup; }
		
		//from=[State]
		public Assignment getFromAssignment_0() { return cFromAssignment_0; }
		
		//[State]
		public CrossReference getFromStateCrossReference_0_0() { return cFromStateCrossReference_0_0; }
		
		//ID
		public RuleCall getFromStateIDTerminalRuleCall_0_0_1() { return cFromStateIDTerminalRuleCall_0_0_1; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_1() { return cHyphenMinusGreaterThanSignKeyword_1; }
		
		//to=[State]
		public Assignment getToAssignment_2() { return cToAssignment_2; }
		
		//[State]
		public CrossReference getToStateCrossReference_2_0() { return cToStateCrossReference_2_0; }
		
		//ID
		public RuleCall getToStateIDTerminalRuleCall_2_0_1() { return cToStateIDTerminalRuleCall_2_0_1; }
	}
	
	
	private final StateMachineElements pStateMachine;
	private final StateElements pState;
	private final TransitionElements pTransition;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyStateMachineGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pStateMachine = new StateMachineElements();
		this.pState = new StateElements();
		this.pTransition = new TransitionElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("lsi.us.es.mis.xtext.MyStateMachine".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//StateMachine:
	//'states:'
	//    (states+=State) (',' states+=State)*
	//('transitions:'
	//    transitions+= Transition+)?
	//;
	public StateMachineElements getStateMachineAccess() {
		return pStateMachine;
	}
	
	public ParserRule getStateMachineRule() {
		return getStateMachineAccess().getRule();
	}
	
	//State:
	//    name=ID ;
	public StateElements getStateAccess() {
		return pState;
	}
	
	public ParserRule getStateRule() {
		return getStateAccess().getRule();
	}
	
	//Transition:
	//    from=[State]'->'to=[State]
	//;
	public TransitionElements getTransitionAccess() {
		return pTransition;
	}
	
	public ParserRule getTransitionRule() {
		return getTransitionAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
