package lsi.us.es.mis.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import lsi.us.es.mis.xtext.services.MyStateMachineGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyStateMachineParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'states:'", "','", "'transitions:'", "'->'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyStateMachineParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyStateMachineParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyStateMachineParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyStateMachine.g"; }



     	private MyStateMachineGrammarAccess grammarAccess;

        public InternalMyStateMachineParser(TokenStream input, MyStateMachineGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "StateMachine";
       	}

       	@Override
       	protected MyStateMachineGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleStateMachine"
    // InternalMyStateMachine.g:64:1: entryRuleStateMachine returns [EObject current=null] : iv_ruleStateMachine= ruleStateMachine EOF ;
    public final EObject entryRuleStateMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMachine = null;


        try {
            // InternalMyStateMachine.g:64:53: (iv_ruleStateMachine= ruleStateMachine EOF )
            // InternalMyStateMachine.g:65:2: iv_ruleStateMachine= ruleStateMachine EOF
            {
             newCompositeNode(grammarAccess.getStateMachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateMachine=ruleStateMachine();

            state._fsp--;

             current =iv_ruleStateMachine; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // InternalMyStateMachine.g:71:1: ruleStateMachine returns [EObject current=null] : (otherlv_0= 'states:' ( (lv_states_1_0= ruleState ) ) (otherlv_2= ',' ( (lv_states_3_0= ruleState ) ) )* (otherlv_4= 'transitions:' ( (lv_transitions_5_0= ruleTransition ) )+ )? ) ;
    public final EObject ruleStateMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_states_1_0 = null;

        EObject lv_states_3_0 = null;

        EObject lv_transitions_5_0 = null;



        	enterRule();

        try {
            // InternalMyStateMachine.g:77:2: ( (otherlv_0= 'states:' ( (lv_states_1_0= ruleState ) ) (otherlv_2= ',' ( (lv_states_3_0= ruleState ) ) )* (otherlv_4= 'transitions:' ( (lv_transitions_5_0= ruleTransition ) )+ )? ) )
            // InternalMyStateMachine.g:78:2: (otherlv_0= 'states:' ( (lv_states_1_0= ruleState ) ) (otherlv_2= ',' ( (lv_states_3_0= ruleState ) ) )* (otherlv_4= 'transitions:' ( (lv_transitions_5_0= ruleTransition ) )+ )? )
            {
            // InternalMyStateMachine.g:78:2: (otherlv_0= 'states:' ( (lv_states_1_0= ruleState ) ) (otherlv_2= ',' ( (lv_states_3_0= ruleState ) ) )* (otherlv_4= 'transitions:' ( (lv_transitions_5_0= ruleTransition ) )+ )? )
            // InternalMyStateMachine.g:79:3: otherlv_0= 'states:' ( (lv_states_1_0= ruleState ) ) (otherlv_2= ',' ( (lv_states_3_0= ruleState ) ) )* (otherlv_4= 'transitions:' ( (lv_transitions_5_0= ruleTransition ) )+ )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStateMachineAccess().getStatesKeyword_0());
            		
            // InternalMyStateMachine.g:83:3: ( (lv_states_1_0= ruleState ) )
            // InternalMyStateMachine.g:84:4: (lv_states_1_0= ruleState )
            {
            // InternalMyStateMachine.g:84:4: (lv_states_1_0= ruleState )
            // InternalMyStateMachine.g:85:5: lv_states_1_0= ruleState
            {

            					newCompositeNode(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_states_1_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateMachineRule());
            					}
            					add(
            						current,
            						"states",
            						lv_states_1_0,
            						"lsi.us.es.mis.xtext.MyStateMachine.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyStateMachine.g:102:3: (otherlv_2= ',' ( (lv_states_3_0= ruleState ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyStateMachine.g:103:4: otherlv_2= ',' ( (lv_states_3_0= ruleState ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getStateMachineAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMyStateMachine.g:107:4: ( (lv_states_3_0= ruleState ) )
            	    // InternalMyStateMachine.g:108:5: (lv_states_3_0= ruleState )
            	    {
            	    // InternalMyStateMachine.g:108:5: (lv_states_3_0= ruleState )
            	    // InternalMyStateMachine.g:109:6: lv_states_3_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_states_3_0=ruleState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"states",
            	    							lv_states_3_0,
            	    							"lsi.us.es.mis.xtext.MyStateMachine.State");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyStateMachine.g:127:3: (otherlv_4= 'transitions:' ( (lv_transitions_5_0= ruleTransition ) )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyStateMachine.g:128:4: otherlv_4= 'transitions:' ( (lv_transitions_5_0= ruleTransition ) )+
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getStateMachineAccess().getTransitionsKeyword_3_0());
                    			
                    // InternalMyStateMachine.g:132:4: ( (lv_transitions_5_0= ruleTransition ) )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_ID) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalMyStateMachine.g:133:5: (lv_transitions_5_0= ruleTransition )
                    	    {
                    	    // InternalMyStateMachine.g:133:5: (lv_transitions_5_0= ruleTransition )
                    	    // InternalMyStateMachine.g:134:6: lv_transitions_5_0= ruleTransition
                    	    {

                    	    						newCompositeNode(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FOLLOW_5);
                    	    lv_transitions_5_0=ruleTransition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"transitions",
                    	    							lv_transitions_5_0,
                    	    							"lsi.us.es.mis.xtext.MyStateMachine.Transition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleState"
    // InternalMyStateMachine.g:156:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalMyStateMachine.g:156:46: (iv_ruleState= ruleState EOF )
            // InternalMyStateMachine.g:157:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalMyStateMachine.g:163:1: ruleState returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMyStateMachine.g:169:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMyStateMachine.g:170:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMyStateMachine.g:170:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyStateMachine.g:171:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMyStateMachine.g:171:3: (lv_name_0_0= RULE_ID )
            // InternalMyStateMachine.g:172:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStateRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalMyStateMachine.g:191:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalMyStateMachine.g:191:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalMyStateMachine.g:192:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalMyStateMachine.g:198:1: ruleTransition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyStateMachine.g:204:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalMyStateMachine.g:205:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalMyStateMachine.g:205:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )
            // InternalMyStateMachine.g:206:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) )
            {
            // InternalMyStateMachine.g:206:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyStateMachine.g:207:4: (otherlv_0= RULE_ID )
            {
            // InternalMyStateMachine.g:207:4: (otherlv_0= RULE_ID )
            // InternalMyStateMachine.g:208:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getFromStateCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalMyStateMachine.g:223:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyStateMachine.g:224:4: (otherlv_2= RULE_ID )
            {
            // InternalMyStateMachine.g:224:4: (otherlv_2= RULE_ID )
            // InternalMyStateMachine.g:225:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getToStateCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});

}