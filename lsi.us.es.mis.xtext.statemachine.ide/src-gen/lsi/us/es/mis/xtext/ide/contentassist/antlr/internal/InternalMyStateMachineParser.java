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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyStateMachineParser extends AbstractInternalContentAssistParser {
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



    // $ANTLR start "entryRuleStateMachine"
    // InternalMyStateMachine.g:53:1: entryRuleStateMachine : ruleStateMachine EOF ;
    public final void entryRuleStateMachine() throws RecognitionException {
        try {
            // InternalMyStateMachine.g:54:1: ( ruleStateMachine EOF )
            // InternalMyStateMachine.g:55:1: ruleStateMachine EOF
            {
             before(grammarAccess.getStateMachineRule()); 
            pushFollow(FOLLOW_1);
            ruleStateMachine();

            state._fsp--;

             after(grammarAccess.getStateMachineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // InternalMyStateMachine.g:62:1: ruleStateMachine : ( ( rule__StateMachine__Group__0 ) ) ;
    public final void ruleStateMachine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyStateMachine.g:66:2: ( ( ( rule__StateMachine__Group__0 ) ) )
            // InternalMyStateMachine.g:67:2: ( ( rule__StateMachine__Group__0 ) )
            {
            // InternalMyStateMachine.g:67:2: ( ( rule__StateMachine__Group__0 ) )
            // InternalMyStateMachine.g:68:3: ( rule__StateMachine__Group__0 )
            {
             before(grammarAccess.getStateMachineAccess().getGroup()); 
            // InternalMyStateMachine.g:69:3: ( rule__StateMachine__Group__0 )
            // InternalMyStateMachine.g:69:4: rule__StateMachine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleState"
    // InternalMyStateMachine.g:78:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalMyStateMachine.g:79:1: ( ruleState EOF )
            // InternalMyStateMachine.g:80:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalMyStateMachine.g:87:1: ruleState : ( ( rule__State__NameAssignment ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyStateMachine.g:91:2: ( ( ( rule__State__NameAssignment ) ) )
            // InternalMyStateMachine.g:92:2: ( ( rule__State__NameAssignment ) )
            {
            // InternalMyStateMachine.g:92:2: ( ( rule__State__NameAssignment ) )
            // InternalMyStateMachine.g:93:3: ( rule__State__NameAssignment )
            {
             before(grammarAccess.getStateAccess().getNameAssignment()); 
            // InternalMyStateMachine.g:94:3: ( rule__State__NameAssignment )
            // InternalMyStateMachine.g:94:4: rule__State__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__State__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // InternalMyStateMachine.g:103:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalMyStateMachine.g:104:1: ( ruleTransition EOF )
            // InternalMyStateMachine.g:105:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalMyStateMachine.g:112:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyStateMachine.g:116:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalMyStateMachine.g:117:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalMyStateMachine.g:117:2: ( ( rule__Transition__Group__0 ) )
            // InternalMyStateMachine.g:118:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalMyStateMachine.g:119:3: ( rule__Transition__Group__0 )
            // InternalMyStateMachine.g:119:4: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "rule__StateMachine__Group__0"
    // InternalMyStateMachine.g:127:1: rule__StateMachine__Group__0 : rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1 ;
    public final void rule__StateMachine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyStateMachine.g:131:1: ( rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1 )
            // InternalMyStateMachine.g:132:2: rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__StateMachine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__0"


    // $ANTLR start "rule__StateMachine__Group__0__Impl"
    // InternalMyStateMachine.g:139:1: rule__StateMachine__Group__0__Impl : ( 'states:' ) ;
    public final void rule__StateMachine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyStateMachine.g:143:1: ( ( 'states:' ) )
            // InternalMyStateMachine.g:144:1: ( 'states:' )
            {
            // InternalMyStateMachine.g:144:1: ( 'states:' )
            // InternalMyStateMachine.g:145:2: 'states:'
            {
             before(grammarAccess.getStateMachineAccess().getStatesKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getStatesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__0__Impl"


    // $ANTLR start "rule__StateMachine__Group__1"
    // InternalMyStateMachine.g:154:1: rule__StateMachine__Group__1 : rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2 ;
    public final void rule__StateMachine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyStateMachine.g:158:1: ( rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2 )
            // InternalMyStateMachine.g:159:2: rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__StateMachine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__1"


    // $ANTLR start "rule__StateMachine__Group__1__Impl"
    // InternalMyStateMachine.g:166:1: rule__StateMachine__Group__1__Impl : ( ( rule__StateMachine__StatesAssignment_1 ) ) ;
    public final void rule__StateMachine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyStateMachine.g:170:1: ( ( ( rule__StateMachine__StatesAssignment_1 ) ) )
            // InternalMyStateMachine.g:171:1: ( ( rule__StateMachine__StatesAssignment_1 ) )
            {
            // InternalMyStateMachine.g:171:1: ( ( rule__StateMachine__StatesAssignment_1 ) )
            // InternalMyStateMachine.g:172:2: ( rule__StateMachine__StatesAssignment_1 )
            {
             before(grammarAccess.getStateMachineAccess().getStatesAssignment_1()); 
            // InternalMyStateMachine.g:173:2: ( rule__StateMachine__StatesAssignment_1 )
            // InternalMyStateMachine.g:173:3: rule__StateMachine__StatesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__StatesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getStatesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__1__Impl"


    // $ANTLR start "rule__StateMachine__Group__2"
    // InternalMyStateMachine.g:181:1: rule__StateMachine__Group__2 : rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3 ;
    public final void rule__StateMachine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyStateMachine.g:185:1: ( rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3 )
            // InternalMyStateMachine.g:186:2: rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__StateMachine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__2"


    // $ANTLR start "rule__StateMachine__Group__2__Impl"
    // InternalMyStateMachine.g:193:1: rule__StateMachine__Group__2__Impl : ( ( rule__StateMachine__Group_2__0 )* ) ;
    public final void rule__StateMachine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyStateMachine.g:197:1: ( ( ( rule__StateMachine__Group_2__0 )* ) )
            // InternalMyStateMachine.g:198:1: ( ( rule__StateMachine__Group_2__0 )* )
            {
            // InternalMyStateMachine.g:198:1: ( ( rule__StateMachine__Group_2__0 )* )
            // InternalMyStateMachine.g:199:2: ( rule__StateMachine__Group_2__0 )*
            {
             before(grammarAccess.getStateMachineAccess().getGroup_2()); 
            // InternalMyStateMachine.g:200:2: ( rule__StateMachine__Group_2__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyStateMachine.g:200:3: rule__StateMachine__Group_2__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__StateMachine__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__2__Impl"


    // $ANTLR start "rule__StateMachine__Group__3"
    // InternalMyStateMachine.g:208:1: rule__StateMachine__Group__3 : rule__StateMachine__Group__3__Impl ;
    public final void rule__StateMachine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyStateMachine.g:212:1: ( rule__StateMachine__Group__3__Impl )
            // InternalMyStateMachine.g:213:2: rule__StateMachine__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__3"


    // $ANTLR start "rule__StateMachine__Group__3__Impl"
    // InternalMyStateMachine.g:219:1: rule__StateMachine__Group__3__Impl : ( ( rule__StateMachine__Group_3__0 )? ) ;
    public final void rule__StateMachine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyStateMachine.g:223:1: ( ( ( rule__StateMachine__Group_3__0 )? ) )
            // InternalMyStateMachine.g:224:1: ( ( rule__StateMachine__Group_3__0 )? )
            {
            // InternalMyStateMachine.g:224:1: ( ( rule__StateMachine__Group_3__0 )? )
            // InternalMyStateMachine.g:225:2: ( rule__StateMachine__Group_3__0 )?
            {
             before(grammarAccess.getStateMachineAccess().getGroup_3()); 
            // InternalMyStateMachine.g:226:2: ( rule__StateMachine__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyStateMachine.g:226:3: rule__StateMachine__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StateMachine__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateMachineAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__3__Impl"


    // $ANTLR start "rule__StateMachine__Group_2__0"
    // InternalMyStateMachine.g:235:1: rule__StateMachine__Group_2__0 : rule__StateMachine__Group_2__0__Impl rule__StateMachine__Group_2__1 ;
    public final void rule__StateMachine__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyStateMachine.g:239:1: ( rule__StateMachine__Group_2__0__Impl rule__StateMachine__Group_2__1 )
            // InternalMyStateMachine.g:240:2: rule__StateMachine__Group_2__0__Impl rule__StateMachine__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__StateMachine__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_2__0"


    // $ANTLR start "rule__StateMachine__Group_2__0__Impl"
    // InternalMyStateMachine.g:247:1: rule__StateMachine__Group_2__0__Impl : ( ',' ) ;
    public final void rule__StateMachine__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyStateMachine.g:251:1: ( ( ',' ) )
            // InternalMyStateMachine.g:252:1: ( ',' )
            {
            // InternalMyStateMachine.g:252:1: ( ',' )
            // InternalMyStateMachine.g:253:2: ','
            {
             before(grammarAccess.getStateMachineAccess().getCommaKeyword_2_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_2__0__Impl"


    // $ANTLR start "rule__StateMachine__Group_2__1"
    // InternalMyStateMachine.g:262:1: rule__StateMachine__Group_2__1 : rule__StateMachine__Group_2__1__Impl ;
    public final void rule__StateMachine__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyStateMachine.g:266:1: ( rule__StateMachine__Group_2__1__Impl )
            // InternalMyStateMachine.g:267:2: rule__StateMachine__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_2__1"


    // $ANTLR start "rule__StateMachine__Group_2__1__Impl"
    // InternalMyStateMachine.g:273:1: rule__StateMachine__Group_2__1__Impl : ( ( rule__StateMachine__StatesAssignment_2_1 ) ) ;
    public final void rule__StateMachine__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyStateMachine.g:277:1: ( ( ( rule__StateMachine__StatesAssignment_2_1 ) ) )
            // InternalMyStateMachine.g:278:1: ( ( rule__StateMachine__StatesAssignment_2_1 ) )
            {
            // InternalMyStateMachine.g:278:1: ( ( rule__StateMachine__StatesAssignment_2_1 ) )
            // InternalMyStateMachine.g:279:2: ( rule__StateMachine__StatesAssignment_2_1 )
            {
             before(grammarAccess.getStateMachineAccess().getStatesAssignment_2_1()); 
            // InternalMyStateMachine.g:280:2: ( rule__StateMachine__StatesAssignment_2_1 )
            // InternalMyStateMachine.g:280:3: rule__StateMachine__StatesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__StatesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getStatesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_2__1__Impl"


    // $ANTLR start "rule__StateMachine__Group_3__0"
    // InternalMyStateMachine.g:289:1: rule__StateMachine__Group_3__0 : rule__StateMachine__Group_3__0__Impl rule__StateMachine__Group_3__1 ;
    public final void rule__StateMachine__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyStateMachine.g:293:1: ( rule__StateMachine__Group_3__0__Impl rule__StateMachine__Group_3__1 )
            // InternalMyStateMachine.g:294:2: rule__StateMachine__Group_3__0__Impl rule__StateMachine__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__StateMachine__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_3__0"


    // $ANTLR start "rule__StateMachine__Group_3__0__Impl"
    // InternalMyStateMachine.g:301:1: rule__StateMachine__Group_3__0__Impl : ( 'transitions:' ) ;
    public final void rule__StateMachine__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyStateMachine.g:305:1: ( ( 'transitions:' ) )
            // InternalMyStateMachine.g:306:1: ( 'transitions:' )
            {
            // InternalMyStateMachine.g:306:1: ( 'transitions:' )
            // InternalMyStateMachine.g:307:2: 'transitions:'
            {
             before(grammarAccess.getStateMachineAccess().getTransitionsKeyword_3_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getTransitionsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_3__0__Impl"


    // $ANTLR start "rule__StateMachine__Group_3__1"
    // InternalMyStateMachine.g:316:1: rule__StateMachine__Group_3__1 : rule__StateMachine__Group_3__1__Impl ;
    public final void rule__StateMachine__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyStateMachine.g:320:1: ( rule__StateMachine__Group_3__1__Impl )
            // InternalMyStateMachine.g:321:2: rule__StateMachine__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_3__1"


    // $ANTLR start "rule__StateMachine__Group_3__1__Impl"
    // InternalMyStateMachine.g:327:1: rule__StateMachine__Group_3__1__Impl : ( ( ( rule__StateMachine__TransitionsAssignment_3_1 ) ) ( ( rule__StateMachine__TransitionsAssignment_3_1 )* ) ) ;
    public final void rule__StateMachine__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyStateMachine.g:331:1: ( ( ( ( rule__StateMachine__TransitionsAssignment_3_1 ) ) ( ( rule__StateMachine__TransitionsAssignment_3_1 )* ) ) )
            // InternalMyStateMachine.g:332:1: ( ( ( rule__StateMachine__TransitionsAssignment_3_1 ) ) ( ( rule__StateMachine__TransitionsAssignment_3_1 )* ) )
            {
            // InternalMyStateMachine.g:332:1: ( ( ( rule__StateMachine__TransitionsAssignment_3_1 ) ) ( ( rule__StateMachine__TransitionsAssignment_3_1 )* ) )
            // InternalMyStateMachine.g:333:2: ( ( rule__StateMachine__TransitionsAssignment_3_1 ) ) ( ( rule__StateMachine__TransitionsAssignment_3_1 )* )
            {
            // InternalMyStateMachine.g:333:2: ( ( rule__StateMachine__TransitionsAssignment_3_1 ) )
            // InternalMyStateMachine.g:334:3: ( rule__StateMachine__TransitionsAssignment_3_1 )
            {
             before(grammarAccess.getStateMachineAccess().getTransitionsAssignment_3_1()); 
            // InternalMyStateMachine.g:335:3: ( rule__StateMachine__TransitionsAssignment_3_1 )
            // InternalMyStateMachine.g:335:4: rule__StateMachine__TransitionsAssignment_3_1
            {
            pushFollow(FOLLOW_6);
            rule__StateMachine__TransitionsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getTransitionsAssignment_3_1()); 

            }

            // InternalMyStateMachine.g:338:2: ( ( rule__StateMachine__TransitionsAssignment_3_1 )* )
            // InternalMyStateMachine.g:339:3: ( rule__StateMachine__TransitionsAssignment_3_1 )*
            {
             before(grammarAccess.getStateMachineAccess().getTransitionsAssignment_3_1()); 
            // InternalMyStateMachine.g:340:3: ( rule__StateMachine__TransitionsAssignment_3_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyStateMachine.g:340:4: rule__StateMachine__TransitionsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__StateMachine__TransitionsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getTransitionsAssignment_3_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_3__1__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // InternalMyStateMachine.g:350:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyStateMachine.g:354:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalMyStateMachine.g:355:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // InternalMyStateMachine.g:362:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__FromAssignment_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyStateMachine.g:366:1: ( ( ( rule__Transition__FromAssignment_0 ) ) )
            // InternalMyStateMachine.g:367:1: ( ( rule__Transition__FromAssignment_0 ) )
            {
            // InternalMyStateMachine.g:367:1: ( ( rule__Transition__FromAssignment_0 ) )
            // InternalMyStateMachine.g:368:2: ( rule__Transition__FromAssignment_0 )
            {
             before(grammarAccess.getTransitionAccess().getFromAssignment_0()); 
            // InternalMyStateMachine.g:369:2: ( rule__Transition__FromAssignment_0 )
            // InternalMyStateMachine.g:369:3: rule__Transition__FromAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__FromAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getFromAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // InternalMyStateMachine.g:377:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyStateMachine.g:381:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalMyStateMachine.g:382:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // InternalMyStateMachine.g:389:1: rule__Transition__Group__1__Impl : ( '->' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyStateMachine.g:393:1: ( ( '->' ) )
            // InternalMyStateMachine.g:394:1: ( '->' )
            {
            // InternalMyStateMachine.g:394:1: ( '->' )
            // InternalMyStateMachine.g:395:2: '->'
            {
             before(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // InternalMyStateMachine.g:404:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyStateMachine.g:408:1: ( rule__Transition__Group__2__Impl )
            // InternalMyStateMachine.g:409:2: rule__Transition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // InternalMyStateMachine.g:415:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__ToAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyStateMachine.g:419:1: ( ( ( rule__Transition__ToAssignment_2 ) ) )
            // InternalMyStateMachine.g:420:1: ( ( rule__Transition__ToAssignment_2 ) )
            {
            // InternalMyStateMachine.g:420:1: ( ( rule__Transition__ToAssignment_2 ) )
            // InternalMyStateMachine.g:421:2: ( rule__Transition__ToAssignment_2 )
            {
             before(grammarAccess.getTransitionAccess().getToAssignment_2()); 
            // InternalMyStateMachine.g:422:2: ( rule__Transition__ToAssignment_2 )
            // InternalMyStateMachine.g:422:3: rule__Transition__ToAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Transition__ToAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getToAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__StateMachine__StatesAssignment_1"
    // InternalMyStateMachine.g:431:1: rule__StateMachine__StatesAssignment_1 : ( ruleState ) ;
    public final void rule__StateMachine__StatesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyStateMachine.g:435:1: ( ( ruleState ) )
            // InternalMyStateMachine.g:436:2: ( ruleState )
            {
            // InternalMyStateMachine.g:436:2: ( ruleState )
            // InternalMyStateMachine.g:437:3: ruleState
            {
             before(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__StatesAssignment_1"


    // $ANTLR start "rule__StateMachine__StatesAssignment_2_1"
    // InternalMyStateMachine.g:446:1: rule__StateMachine__StatesAssignment_2_1 : ( ruleState ) ;
    public final void rule__StateMachine__StatesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyStateMachine.g:450:1: ( ( ruleState ) )
            // InternalMyStateMachine.g:451:2: ( ruleState )
            {
            // InternalMyStateMachine.g:451:2: ( ruleState )
            // InternalMyStateMachine.g:452:3: ruleState
            {
             before(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__StatesAssignment_2_1"


    // $ANTLR start "rule__StateMachine__TransitionsAssignment_3_1"
    // InternalMyStateMachine.g:461:1: rule__StateMachine__TransitionsAssignment_3_1 : ( ruleTransition ) ;
    public final void rule__StateMachine__TransitionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyStateMachine.g:465:1: ( ( ruleTransition ) )
            // InternalMyStateMachine.g:466:2: ( ruleTransition )
            {
            // InternalMyStateMachine.g:466:2: ( ruleTransition )
            // InternalMyStateMachine.g:467:3: ruleTransition
            {
             before(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__TransitionsAssignment_3_1"


    // $ANTLR start "rule__State__NameAssignment"
    // InternalMyStateMachine.g:476:1: rule__State__NameAssignment : ( RULE_ID ) ;
    public final void rule__State__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyStateMachine.g:480:1: ( ( RULE_ID ) )
            // InternalMyStateMachine.g:481:2: ( RULE_ID )
            {
            // InternalMyStateMachine.g:481:2: ( RULE_ID )
            // InternalMyStateMachine.g:482:3: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment"


    // $ANTLR start "rule__Transition__FromAssignment_0"
    // InternalMyStateMachine.g:491:1: rule__Transition__FromAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyStateMachine.g:495:1: ( ( ( RULE_ID ) ) )
            // InternalMyStateMachine.g:496:2: ( ( RULE_ID ) )
            {
            // InternalMyStateMachine.g:496:2: ( ( RULE_ID ) )
            // InternalMyStateMachine.g:497:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getFromStateCrossReference_0_0()); 
            // InternalMyStateMachine.g:498:3: ( RULE_ID )
            // InternalMyStateMachine.g:499:4: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getFromStateIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getFromStateIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getFromStateCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__FromAssignment_0"


    // $ANTLR start "rule__Transition__ToAssignment_2"
    // InternalMyStateMachine.g:510:1: rule__Transition__ToAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyStateMachine.g:514:1: ( ( ( RULE_ID ) ) )
            // InternalMyStateMachine.g:515:2: ( ( RULE_ID ) )
            {
            // InternalMyStateMachine.g:515:2: ( ( RULE_ID ) )
            // InternalMyStateMachine.g:516:3: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getToStateCrossReference_2_0()); 
            // InternalMyStateMachine.g:517:3: ( RULE_ID )
            // InternalMyStateMachine.g:518:4: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getToStateIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getToStateIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getToStateCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ToAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});

}