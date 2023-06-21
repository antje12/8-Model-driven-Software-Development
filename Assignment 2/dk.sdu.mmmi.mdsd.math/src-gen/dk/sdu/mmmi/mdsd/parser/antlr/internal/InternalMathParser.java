package dk.sdu.mmmi.mdsd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "'='", "'let'", "'in'", "'end'", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMathParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMathParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMathParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMath.g"; }



     	private MathGrammarAccess grammarAccess;

        public InternalMathParser(TokenStream input, MathGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MathExp";
       	}

       	@Override
       	protected MathGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMathExp"
    // InternalMath.g:64:1: entryRuleMathExp returns [EObject current=null] : iv_ruleMathExp= ruleMathExp EOF ;
    public final EObject entryRuleMathExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExp = null;


        try {
            // InternalMath.g:64:48: (iv_ruleMathExp= ruleMathExp EOF )
            // InternalMath.g:65:2: iv_ruleMathExp= ruleMathExp EOF
            {
             newCompositeNode(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathExp=ruleMathExp();

            state._fsp--;

             current =iv_ruleMathExp; 
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
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMath.g:71:1: ruleMathExp returns [EObject current=null] : ( (lv_variables_0_0= ruleVariable ) )* ;
    public final EObject ruleMathExp() throws RecognitionException {
        EObject current = null;

        EObject lv_variables_0_0 = null;



        	enterRule();

        try {
            // InternalMath.g:77:2: ( ( (lv_variables_0_0= ruleVariable ) )* )
            // InternalMath.g:78:2: ( (lv_variables_0_0= ruleVariable ) )*
            {
            // InternalMath.g:78:2: ( (lv_variables_0_0= ruleVariable ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMath.g:79:3: (lv_variables_0_0= ruleVariable )
            	    {
            	    // InternalMath.g:79:3: (lv_variables_0_0= ruleVariable )
            	    // InternalMath.g:80:4: lv_variables_0_0= ruleVariable
            	    {

            	    				newCompositeNode(grammarAccess.getMathExpAccess().getVariablesVariableParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_variables_0_0=ruleVariable();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getMathExpRule());
            	    				}
            	    				add(
            	    					current,
            	    					"variables",
            	    					lv_variables_0_0,
            	    					"dk.sdu.mmmi.mdsd.Math.Variable");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleVariable"
    // InternalMath.g:100:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMath.g:100:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMath.g:101:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMath.g:107:1: ruleVariable returns [EObject current=null] : ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExp ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalMath.g:113:2: ( ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExp ) ) ) )
            // InternalMath.g:114:2: ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExp ) ) )
            {
            // InternalMath.g:114:2: ( () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExp ) ) )
            // InternalMath.g:115:3: () otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExp ) )
            {
            // InternalMath.g:115:3: ()
            // InternalMath.g:116:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableAccess().getVarAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getVarKeyword_1());
            		
            // InternalMath.g:126:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMath.g:127:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMath.g:127:4: (lv_name_2_0= RULE_ID )
            // InternalMath.g:128:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getEqualsSignKeyword_3());
            		
            // InternalMath.g:148:3: ( (lv_value_4_0= ruleExp ) )
            // InternalMath.g:149:4: (lv_value_4_0= ruleExp )
            {
            // InternalMath.g:149:4: (lv_value_4_0= ruleExp )
            // InternalMath.g:150:5: lv_value_4_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getValueExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_4_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_4_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleLet"
    // InternalMath.g:171:1: entryRuleLet returns [EObject current=null] : iv_ruleLet= ruleLet EOF ;
    public final EObject entryRuleLet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLet = null;


        try {
            // InternalMath.g:171:44: (iv_ruleLet= ruleLet EOF )
            // InternalMath.g:172:2: iv_ruleLet= ruleLet EOF
            {
             newCompositeNode(grammarAccess.getLetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLet=ruleLet();

            state._fsp--;

             current =iv_ruleLet; 
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
    // $ANTLR end "entryRuleLet"


    // $ANTLR start "ruleLet"
    // InternalMath.g:178:1: ruleLet returns [EObject current=null] : ( () otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_in_6_0= ruleExp ) ) otherlv_7= 'end' ) ;
    public final EObject ruleLet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_value_4_0 = null;

        EObject lv_in_6_0 = null;



        	enterRule();

        try {
            // InternalMath.g:184:2: ( ( () otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_in_6_0= ruleExp ) ) otherlv_7= 'end' ) )
            // InternalMath.g:185:2: ( () otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_in_6_0= ruleExp ) ) otherlv_7= 'end' )
            {
            // InternalMath.g:185:2: ( () otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_in_6_0= ruleExp ) ) otherlv_7= 'end' )
            // InternalMath.g:186:3: () otherlv_1= 'let' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_value_4_0= ruleExp ) ) otherlv_5= 'in' ( (lv_in_6_0= ruleExp ) ) otherlv_7= 'end'
            {
            // InternalMath.g:186:3: ()
            // InternalMath.g:187:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLetAccess().getLetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLetAccess().getLetKeyword_1());
            		
            // InternalMath.g:197:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMath.g:198:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMath.g:198:4: (lv_name_2_0= RULE_ID )
            // InternalMath.g:199:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getLetAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLetRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getLetAccess().getEqualsSignKeyword_3());
            		
            // InternalMath.g:219:3: ( (lv_value_4_0= ruleExp ) )
            // InternalMath.g:220:4: (lv_value_4_0= ruleExp )
            {
            // InternalMath.g:220:4: (lv_value_4_0= ruleExp )
            // InternalMath.g:221:5: lv_value_4_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLetAccess().getValueExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_value_4_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_4_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getLetAccess().getInKeyword_5());
            		
            // InternalMath.g:242:3: ( (lv_in_6_0= ruleExp ) )
            // InternalMath.g:243:4: (lv_in_6_0= ruleExp )
            {
            // InternalMath.g:243:4: (lv_in_6_0= ruleExp )
            // InternalMath.g:244:5: lv_in_6_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLetAccess().getInExpParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_in_6_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetRule());
            					}
            					set(
            						current,
            						"in",
            						lv_in_6_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getLetAccess().getEndKeyword_7());
            		

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
    // $ANTLR end "ruleLet"


    // $ANTLR start "entryRuleExp"
    // InternalMath.g:269:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalMath.g:269:44: (iv_ruleExp= ruleExp EOF )
            // InternalMath.g:270:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalMath.g:276:1: ruleExp returns [EObject current=null] : this_PlusMinus_0= rulePlusMinus ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        EObject this_PlusMinus_0 = null;



        	enterRule();

        try {
            // InternalMath.g:282:2: (this_PlusMinus_0= rulePlusMinus )
            // InternalMath.g:283:2: this_PlusMinus_0= rulePlusMinus
            {

            		newCompositeNode(grammarAccess.getExpAccess().getPlusMinusParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_PlusMinus_0=rulePlusMinus();

            state._fsp--;


            		current = this_PlusMinus_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRulePlusMinus"
    // InternalMath.g:294:1: entryRulePlusMinus returns [EObject current=null] : iv_rulePlusMinus= rulePlusMinus EOF ;
    public final EObject entryRulePlusMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusMinus = null;


        try {
            // InternalMath.g:294:50: (iv_rulePlusMinus= rulePlusMinus EOF )
            // InternalMath.g:295:2: iv_rulePlusMinus= rulePlusMinus EOF
            {
             newCompositeNode(grammarAccess.getPlusMinusRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlusMinus=rulePlusMinus();

            state._fsp--;

             current =iv_rulePlusMinus; 
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
    // $ANTLR end "entryRulePlusMinus"


    // $ANTLR start "rulePlusMinus"
    // InternalMath.g:301:1: rulePlusMinus returns [EObject current=null] : (this_MultDiv_0= ruleMultDiv ( () ( (lv_operator_2_0= ruleOpPlusMinus ) ) ( (lv_right_3_0= ruleMultDiv ) ) )* ) ;
    public final EObject rulePlusMinus() throws RecognitionException {
        EObject current = null;

        EObject this_MultDiv_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMath.g:307:2: ( (this_MultDiv_0= ruleMultDiv ( () ( (lv_operator_2_0= ruleOpPlusMinus ) ) ( (lv_right_3_0= ruleMultDiv ) ) )* ) )
            // InternalMath.g:308:2: (this_MultDiv_0= ruleMultDiv ( () ( (lv_operator_2_0= ruleOpPlusMinus ) ) ( (lv_right_3_0= ruleMultDiv ) ) )* )
            {
            // InternalMath.g:308:2: (this_MultDiv_0= ruleMultDiv ( () ( (lv_operator_2_0= ruleOpPlusMinus ) ) ( (lv_right_3_0= ruleMultDiv ) ) )* )
            // InternalMath.g:309:3: this_MultDiv_0= ruleMultDiv ( () ( (lv_operator_2_0= ruleOpPlusMinus ) ) ( (lv_right_3_0= ruleMultDiv ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusMinusAccess().getMultDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_MultDiv_0=ruleMultDiv();

            state._fsp--;


            			current = this_MultDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:317:3: ( () ( (lv_operator_2_0= ruleOpPlusMinus ) ) ( (lv_right_3_0= ruleMultDiv ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=16 && LA2_0<=17)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMath.g:318:4: () ( (lv_operator_2_0= ruleOpPlusMinus ) ) ( (lv_right_3_0= ruleMultDiv ) )
            	    {
            	    // InternalMath.g:318:4: ()
            	    // InternalMath.g:319:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPlusMinusAccess().getPlusMinusLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMath.g:325:4: ( (lv_operator_2_0= ruleOpPlusMinus ) )
            	    // InternalMath.g:326:5: (lv_operator_2_0= ruleOpPlusMinus )
            	    {
            	    // InternalMath.g:326:5: (lv_operator_2_0= ruleOpPlusMinus )
            	    // InternalMath.g:327:6: lv_operator_2_0= ruleOpPlusMinus
            	    {

            	    						newCompositeNode(grammarAccess.getPlusMinusAccess().getOperatorOpPlusMinusParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_operator_2_0=ruleOpPlusMinus();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlusMinusRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"dk.sdu.mmmi.mdsd.Math.OpPlusMinus");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMath.g:344:4: ( (lv_right_3_0= ruleMultDiv ) )
            	    // InternalMath.g:345:5: (lv_right_3_0= ruleMultDiv )
            	    {
            	    // InternalMath.g:345:5: (lv_right_3_0= ruleMultDiv )
            	    // InternalMath.g:346:6: lv_right_3_0= ruleMultDiv
            	    {

            	    						newCompositeNode(grammarAccess.getPlusMinusAccess().getRightMultDivParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_right_3_0=ruleMultDiv();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlusMinusRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"dk.sdu.mmmi.mdsd.Math.MultDiv");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "rulePlusMinus"


    // $ANTLR start "entryRuleMultDiv"
    // InternalMath.g:368:1: entryRuleMultDiv returns [EObject current=null] : iv_ruleMultDiv= ruleMultDiv EOF ;
    public final EObject entryRuleMultDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultDiv = null;


        try {
            // InternalMath.g:368:48: (iv_ruleMultDiv= ruleMultDiv EOF )
            // InternalMath.g:369:2: iv_ruleMultDiv= ruleMultDiv EOF
            {
             newCompositeNode(grammarAccess.getMultDivRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultDiv=ruleMultDiv();

            state._fsp--;

             current =iv_ruleMultDiv; 
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
    // $ANTLR end "entryRuleMultDiv"


    // $ANTLR start "ruleMultDiv"
    // InternalMath.g:375:1: ruleMultDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= ruleOpMultDiv ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMultDiv() throws RecognitionException {
        EObject current = null;

        EObject this_Primary_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMath.g:381:2: ( (this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= ruleOpMultDiv ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalMath.g:382:2: (this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= ruleOpMultDiv ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalMath.g:382:2: (this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= ruleOpMultDiv ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalMath.g:383:3: this_Primary_0= rulePrimary ( () ( (lv_operator_2_0= ruleOpMultDiv ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:391:3: ( () ( (lv_operator_2_0= ruleOpMultDiv ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=18 && LA3_0<=19)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMath.g:392:4: () ( (lv_operator_2_0= ruleOpMultDiv ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalMath.g:392:4: ()
            	    // InternalMath.g:393:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultDivAccess().getMultDivLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMath.g:399:4: ( (lv_operator_2_0= ruleOpMultDiv ) )
            	    // InternalMath.g:400:5: (lv_operator_2_0= ruleOpMultDiv )
            	    {
            	    // InternalMath.g:400:5: (lv_operator_2_0= ruleOpMultDiv )
            	    // InternalMath.g:401:6: lv_operator_2_0= ruleOpMultDiv
            	    {

            	    						newCompositeNode(grammarAccess.getMultDivAccess().getOperatorOpMultDivParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_operator_2_0=ruleOpMultDiv();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultDivRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"dk.sdu.mmmi.mdsd.Math.OpMultDiv");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalMath.g:418:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalMath.g:419:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalMath.g:419:5: (lv_right_3_0= rulePrimary )
            	    // InternalMath.g:420:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMultDivAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultDivRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"dk.sdu.mmmi.mdsd.Math.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


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
    // $ANTLR end "ruleMultDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalMath.g:442:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMath.g:442:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMath.g:443:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMath.g:449:1: rulePrimary returns [EObject current=null] : (this_Parenthesis_0= ruleParenthesis | this_Number_1= ruleNumber | this_Let_2= ruleLet | this_VariableUse_3= ruleVariableUse ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_Parenthesis_0 = null;

        EObject this_Number_1 = null;

        EObject this_Let_2 = null;

        EObject this_VariableUse_3 = null;



        	enterRule();

        try {
            // InternalMath.g:455:2: ( (this_Parenthesis_0= ruleParenthesis | this_Number_1= ruleNumber | this_Let_2= ruleLet | this_VariableUse_3= ruleVariableUse ) )
            // InternalMath.g:456:2: (this_Parenthesis_0= ruleParenthesis | this_Number_1= ruleNumber | this_Let_2= ruleLet | this_VariableUse_3= ruleVariableUse )
            {
            // InternalMath.g:456:2: (this_Parenthesis_0= ruleParenthesis | this_Number_1= ruleNumber | this_Let_2= ruleLet | this_VariableUse_3= ruleVariableUse )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt4=1;
                }
                break;
            case RULE_INT:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case RULE_ID:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMath.g:457:3: this_Parenthesis_0= ruleParenthesis
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parenthesis_0=ruleParenthesis();

                    state._fsp--;


                    			current = this_Parenthesis_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMath.g:466:3: this_Number_1= ruleNumber
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Number_1=ruleNumber();

                    state._fsp--;


                    			current = this_Number_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMath.g:475:3: this_Let_2= ruleLet
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getLetParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Let_2=ruleLet();

                    state._fsp--;


                    			current = this_Let_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMath.g:484:3: this_VariableUse_3= ruleVariableUse
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableUse_3=ruleVariableUse();

                    state._fsp--;


                    			current = this_VariableUse_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleOpPlusMinus"
    // InternalMath.g:496:1: entryRuleOpPlusMinus returns [EObject current=null] : iv_ruleOpPlusMinus= ruleOpPlusMinus EOF ;
    public final EObject entryRuleOpPlusMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpPlusMinus = null;


        try {
            // InternalMath.g:496:52: (iv_ruleOpPlusMinus= ruleOpPlusMinus EOF )
            // InternalMath.g:497:2: iv_ruleOpPlusMinus= ruleOpPlusMinus EOF
            {
             newCompositeNode(grammarAccess.getOpPlusMinusRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpPlusMinus=ruleOpPlusMinus();

            state._fsp--;

             current =iv_ruleOpPlusMinus; 
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
    // $ANTLR end "entryRuleOpPlusMinus"


    // $ANTLR start "ruleOpPlusMinus"
    // InternalMath.g:503:1: ruleOpPlusMinus returns [EObject current=null] : ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) ) ;
    public final EObject ruleOpPlusMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMath.g:509:2: ( ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) ) )
            // InternalMath.g:510:2: ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) )
            {
            // InternalMath.g:510:2: ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMath.g:511:3: ( () otherlv_1= '+' )
                    {
                    // InternalMath.g:511:3: ( () otherlv_1= '+' )
                    // InternalMath.g:512:4: () otherlv_1= '+'
                    {
                    // InternalMath.g:512:4: ()
                    // InternalMath.g:513:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOpPlusMinusAccess().getPlusAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getOpPlusMinusAccess().getPlusSignKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:525:3: ( () otherlv_3= '-' )
                    {
                    // InternalMath.g:525:3: ( () otherlv_3= '-' )
                    // InternalMath.g:526:4: () otherlv_3= '-'
                    {
                    // InternalMath.g:526:4: ()
                    // InternalMath.g:527:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOpPlusMinusAccess().getMinusAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getOpPlusMinusAccess().getHyphenMinusKeyword_1_1());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleOpPlusMinus"


    // $ANTLR start "entryRuleOpMultDiv"
    // InternalMath.g:542:1: entryRuleOpMultDiv returns [EObject current=null] : iv_ruleOpMultDiv= ruleOpMultDiv EOF ;
    public final EObject entryRuleOpMultDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpMultDiv = null;


        try {
            // InternalMath.g:542:50: (iv_ruleOpMultDiv= ruleOpMultDiv EOF )
            // InternalMath.g:543:2: iv_ruleOpMultDiv= ruleOpMultDiv EOF
            {
             newCompositeNode(grammarAccess.getOpMultDivRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOpMultDiv=ruleOpMultDiv();

            state._fsp--;

             current =iv_ruleOpMultDiv; 
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
    // $ANTLR end "entryRuleOpMultDiv"


    // $ANTLR start "ruleOpMultDiv"
    // InternalMath.g:549:1: ruleOpMultDiv returns [EObject current=null] : ( ( () otherlv_1= '*' ) | ( () otherlv_3= '/' ) ) ;
    public final EObject ruleOpMultDiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMath.g:555:2: ( ( ( () otherlv_1= '*' ) | ( () otherlv_3= '/' ) ) )
            // InternalMath.g:556:2: ( ( () otherlv_1= '*' ) | ( () otherlv_3= '/' ) )
            {
            // InternalMath.g:556:2: ( ( () otherlv_1= '*' ) | ( () otherlv_3= '/' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMath.g:557:3: ( () otherlv_1= '*' )
                    {
                    // InternalMath.g:557:3: ( () otherlv_1= '*' )
                    // InternalMath.g:558:4: () otherlv_1= '*'
                    {
                    // InternalMath.g:558:4: ()
                    // InternalMath.g:559:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOpMultDivAccess().getMultAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getOpMultDivAccess().getAsteriskKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:571:3: ( () otherlv_3= '/' )
                    {
                    // InternalMath.g:571:3: ( () otherlv_3= '/' )
                    // InternalMath.g:572:4: () otherlv_3= '/'
                    {
                    // InternalMath.g:572:4: ()
                    // InternalMath.g:573:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getOpMultDivAccess().getDivAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getOpMultDivAccess().getSolidusKeyword_1_1());
                    			

                    }


                    }
                    break;

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
    // $ANTLR end "ruleOpMultDiv"


    // $ANTLR start "entryRuleNumber"
    // InternalMath.g:588:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalMath.g:588:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalMath.g:589:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalMath.g:595:1: ruleNumber returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalMath.g:601:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalMath.g:602:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalMath.g:602:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalMath.g:603:3: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalMath.g:603:3: ()
            // InternalMath.g:604:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNumberAccess().getNumberAction_0(),
            					current);
            			

            }

            // InternalMath.g:610:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalMath.g:611:4: (lv_value_1_0= RULE_INT )
            {
            // InternalMath.g:611:4: (lv_value_1_0= RULE_INT )
            // InternalMath.g:612:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleParenthesis"
    // InternalMath.g:632:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalMath.g:632:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalMath.g:633:2: iv_ruleParenthesis= ruleParenthesis EOF
            {
             newCompositeNode(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesis=ruleParenthesis();

            state._fsp--;

             current =iv_ruleParenthesis; 
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
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalMath.g:639:1: ruleParenthesis returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_exp_2_0= ruleExp ) ) otherlv_3= ')' ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalMath.g:645:2: ( ( () otherlv_1= '(' ( (lv_exp_2_0= ruleExp ) ) otherlv_3= ')' ) )
            // InternalMath.g:646:2: ( () otherlv_1= '(' ( (lv_exp_2_0= ruleExp ) ) otherlv_3= ')' )
            {
            // InternalMath.g:646:2: ( () otherlv_1= '(' ( (lv_exp_2_0= ruleExp ) ) otherlv_3= ')' )
            // InternalMath.g:647:3: () otherlv_1= '(' ( (lv_exp_2_0= ruleExp ) ) otherlv_3= ')'
            {
            // InternalMath.g:647:3: ()
            // InternalMath.g:648:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParenthesisAccess().getParenthesisAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMath.g:658:3: ( (lv_exp_2_0= ruleExp ) )
            // InternalMath.g:659:4: (lv_exp_2_0= ruleExp )
            {
            // InternalMath.g:659:4: (lv_exp_2_0= ruleExp )
            // InternalMath.g:660:5: lv_exp_2_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_exp_2_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParenthesisRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleVariableUse"
    // InternalMath.g:685:1: entryRuleVariableUse returns [EObject current=null] : iv_ruleVariableUse= ruleVariableUse EOF ;
    public final EObject entryRuleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableUse = null;


        try {
            // InternalMath.g:685:52: (iv_ruleVariableUse= ruleVariableUse EOF )
            // InternalMath.g:686:2: iv_ruleVariableUse= ruleVariableUse EOF
            {
             newCompositeNode(grammarAccess.getVariableUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableUse=ruleVariableUse();

            state._fsp--;

             current =iv_ruleVariableUse; 
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
    // $ANTLR end "entryRuleVariableUse"


    // $ANTLR start "ruleVariableUse"
    // InternalMath.g:692:1: ruleVariableUse returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleVariableUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMath.g:698:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMath.g:699:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMath.g:699:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalMath.g:700:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalMath.g:700:3: ()
            // InternalMath.g:701:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableUseAccess().getVariableUseAction_0(),
            					current);
            			

            }

            // InternalMath.g:707:3: ( (otherlv_1= RULE_ID ) )
            // InternalMath.g:708:4: (otherlv_1= RULE_ID )
            {
            // InternalMath.g:708:4: (otherlv_1= RULE_ID )
            // InternalMath.g:709:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableUseRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getVariableUseAccess().getRefDeclarationCrossReference_1_0());
            				

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
    // $ANTLR end "ruleVariableUse"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000102030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});

}