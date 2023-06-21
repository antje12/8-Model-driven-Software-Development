package org.xtext.exam22.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.exam22.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'story'", "'function'", "'('", "','", "')'", "':'", "'scenario'", "'{'", "'}'", "'var'", "'announce'", "'question'", "'as'", "'in'", "'end'", "'to'", "'if'", "'on'", "'boolean'", "'text'", "'number'", "'&&'", "'||'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'&'", "'+'", "'-'", "'*'", "'/'", "'true'", "'false'", "'!'", "'this'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDsl.g"; }



     	private DslGrammarAccess grammarAccess;

        public InternalDslParser(TokenStream input, DslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDsl.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'story' ( (lv_name_1_0= RULE_ID ) ) ( (lv_functions_2_0= ruleFunction ) )* ( (lv_scenarios_3_0= ruleScenario ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_functions_2_0 = null;

        EObject lv_scenarios_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( (otherlv_0= 'story' ( (lv_name_1_0= RULE_ID ) ) ( (lv_functions_2_0= ruleFunction ) )* ( (lv_scenarios_3_0= ruleScenario ) )* ) )
            // InternalDsl.g:78:2: (otherlv_0= 'story' ( (lv_name_1_0= RULE_ID ) ) ( (lv_functions_2_0= ruleFunction ) )* ( (lv_scenarios_3_0= ruleScenario ) )* )
            {
            // InternalDsl.g:78:2: (otherlv_0= 'story' ( (lv_name_1_0= RULE_ID ) ) ( (lv_functions_2_0= ruleFunction ) )* ( (lv_scenarios_3_0= ruleScenario ) )* )
            // InternalDsl.g:79:3: otherlv_0= 'story' ( (lv_name_1_0= RULE_ID ) ) ( (lv_functions_2_0= ruleFunction ) )* ( (lv_scenarios_3_0= ruleScenario ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getStoryKeyword_0());
            		
            // InternalDsl.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDsl.g:101:3: ( (lv_functions_2_0= ruleFunction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDsl.g:102:4: (lv_functions_2_0= ruleFunction )
            	    {
            	    // InternalDsl.g:102:4: (lv_functions_2_0= ruleFunction )
            	    // InternalDsl.g:103:5: lv_functions_2_0= ruleFunction
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getFunctionsFunctionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_functions_2_0=ruleFunction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"functions",
            	    						lv_functions_2_0,
            	    						"org.xtext.exam22.Dsl.Function");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalDsl.g:120:3: ( (lv_scenarios_3_0= ruleScenario ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDsl.g:121:4: (lv_scenarios_3_0= ruleScenario )
            	    {
            	    // InternalDsl.g:121:4: (lv_scenarios_3_0= ruleScenario )
            	    // InternalDsl.g:122:5: lv_scenarios_3_0= ruleScenario
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getScenariosScenarioParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_scenarios_3_0=ruleScenario();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"scenarios",
            	    						lv_scenarios_3_0,
            	    						"org.xtext.exam22.Dsl.Scenario");
            	    					afterParserOrEnumRuleCall();
            	    				

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFunction"
    // InternalDsl.g:143:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalDsl.g:143:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalDsl.g:144:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalDsl.g:150:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_types_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleType ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnType_8_0= ruleType ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_types_3_0 = null;

        AntlrDatatypeRuleToken lv_types_5_0 = null;

        AntlrDatatypeRuleToken lv_returnType_8_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:156:2: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_types_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleType ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnType_8_0= ruleType ) ) ) )
            // InternalDsl.g:157:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_types_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleType ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnType_8_0= ruleType ) ) )
            {
            // InternalDsl.g:157:2: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_types_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleType ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnType_8_0= ruleType ) ) )
            // InternalDsl.g:158:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_types_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleType ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnType_8_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
            		
            // InternalDsl.g:162:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:163:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:163:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:164:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalDsl.g:184:3: ( ( (lv_types_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleType ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=29 && LA4_0<=31)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDsl.g:185:4: ( (lv_types_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleType ) ) )*
                    {
                    // InternalDsl.g:185:4: ( (lv_types_3_0= ruleType ) )
                    // InternalDsl.g:186:5: (lv_types_3_0= ruleType )
                    {
                    // InternalDsl.g:186:5: (lv_types_3_0= ruleType )
                    // InternalDsl.g:187:6: lv_types_3_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getFunctionAccess().getTypesTypeParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_types_3_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionRule());
                    						}
                    						add(
                    							current,
                    							"types",
                    							lv_types_3_0,
                    							"org.xtext.exam22.Dsl.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:204:4: (otherlv_4= ',' ( (lv_types_5_0= ruleType ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalDsl.g:205:5: otherlv_4= ',' ( (lv_types_5_0= ruleType ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalDsl.g:209:5: ( (lv_types_5_0= ruleType ) )
                    	    // InternalDsl.g:210:6: (lv_types_5_0= ruleType )
                    	    {
                    	    // InternalDsl.g:210:6: (lv_types_5_0= ruleType )
                    	    // InternalDsl.g:211:7: lv_types_5_0= ruleType
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionAccess().getTypesTypeParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_types_5_0=ruleType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"types",
                    	    								lv_types_5_0,
                    	    								"org.xtext.exam22.Dsl.Type");
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
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getFunctionAccess().getColonKeyword_5());
            		
            // InternalDsl.g:238:3: ( (lv_returnType_8_0= ruleType ) )
            // InternalDsl.g:239:4: (lv_returnType_8_0= ruleType )
            {
            // InternalDsl.g:239:4: (lv_returnType_8_0= ruleType )
            // InternalDsl.g:240:5: lv_returnType_8_0= ruleType
            {

            					newCompositeNode(grammarAccess.getFunctionAccess().getReturnTypeTypeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_returnType_8_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionRule());
            					}
            					set(
            						current,
            						"returnType",
            						lv_returnType_8_0,
            						"org.xtext.exam22.Dsl.Type");
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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleScenario"
    // InternalDsl.g:261:1: entryRuleScenario returns [EObject current=null] : iv_ruleScenario= ruleScenario EOF ;
    public final EObject entryRuleScenario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario = null;


        try {
            // InternalDsl.g:261:49: (iv_ruleScenario= ruleScenario EOF )
            // InternalDsl.g:262:2: iv_ruleScenario= ruleScenario EOF
            {
             newCompositeNode(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScenario=ruleScenario();

            state._fsp--;

             current =iv_ruleScenario; 
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
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // InternalDsl.g:268:1: ruleScenario returns [EObject current=null] : (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( ( (lv_variables_8_0= ruleVariableDef ) ) | ( (lv_statements_9_0= ruleStatement ) ) )* otherlv_10= '}' ) ;
    public final EObject ruleScenario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_variables_8_0 = null;

        EObject lv_statements_9_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:274:2: ( (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( ( (lv_variables_8_0= ruleVariableDef ) ) | ( (lv_statements_9_0= ruleStatement ) ) )* otherlv_10= '}' ) )
            // InternalDsl.g:275:2: (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( ( (lv_variables_8_0= ruleVariableDef ) ) | ( (lv_statements_9_0= ruleStatement ) ) )* otherlv_10= '}' )
            {
            // InternalDsl.g:275:2: (otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( ( (lv_variables_8_0= ruleVariableDef ) ) | ( (lv_statements_9_0= ruleStatement ) ) )* otherlv_10= '}' )
            // InternalDsl.g:276:3: otherlv_0= 'scenario' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( ( (lv_variables_8_0= ruleVariableDef ) ) | ( (lv_statements_9_0= ruleStatement ) ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScenarioAccess().getScenarioKeyword_0());
            		
            // InternalDsl.g:280:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:281:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:281:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:282:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getScenarioAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScenarioRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDsl.g:298:3: (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDsl.g:299:4: otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_12); 

                    				newLeafNode(otherlv_2, grammarAccess.getScenarioAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalDsl.g:303:4: ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_ID) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalDsl.g:304:5: ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                            {
                            // InternalDsl.g:304:5: ( (lv_parameters_3_0= ruleParameter ) )
                            // InternalDsl.g:305:6: (lv_parameters_3_0= ruleParameter )
                            {
                            // InternalDsl.g:305:6: (lv_parameters_3_0= ruleParameter )
                            // InternalDsl.g:306:7: lv_parameters_3_0= ruleParameter
                            {

                            							newCompositeNode(grammarAccess.getScenarioAccess().getParametersParameterParserRuleCall_2_1_0_0());
                            						
                            pushFollow(FOLLOW_8);
                            lv_parameters_3_0=ruleParameter();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getScenarioRule());
                            							}
                            							add(
                            								current,
                            								"parameters",
                            								lv_parameters_3_0,
                            								"org.xtext.exam22.Dsl.Parameter");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalDsl.g:323:5: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( (LA5_0==14) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // InternalDsl.g:324:6: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                            	    {
                            	    otherlv_4=(Token)match(input,14,FOLLOW_3); 

                            	    						newLeafNode(otherlv_4, grammarAccess.getScenarioAccess().getCommaKeyword_2_1_1_0());
                            	    					
                            	    // InternalDsl.g:328:6: ( (lv_parameters_5_0= ruleParameter ) )
                            	    // InternalDsl.g:329:7: (lv_parameters_5_0= ruleParameter )
                            	    {
                            	    // InternalDsl.g:329:7: (lv_parameters_5_0= ruleParameter )
                            	    // InternalDsl.g:330:8: lv_parameters_5_0= ruleParameter
                            	    {

                            	    								newCompositeNode(grammarAccess.getScenarioAccess().getParametersParameterParserRuleCall_2_1_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_8);
                            	    lv_parameters_5_0=ruleParameter();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getScenarioRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"parameters",
                            	    									lv_parameters_5_0,
                            	    									"org.xtext.exam22.Dsl.Parameter");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop5;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getScenarioAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:358:3: ( ( (lv_variables_8_0= ruleVariableDef ) ) | ( (lv_statements_9_0= ruleStatement ) ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }
                else if ( ((LA8_0>=21 && LA8_0<=22)||LA8_0==25) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDsl.g:359:4: ( (lv_variables_8_0= ruleVariableDef ) )
            	    {
            	    // InternalDsl.g:359:4: ( (lv_variables_8_0= ruleVariableDef ) )
            	    // InternalDsl.g:360:5: (lv_variables_8_0= ruleVariableDef )
            	    {
            	    // InternalDsl.g:360:5: (lv_variables_8_0= ruleVariableDef )
            	    // InternalDsl.g:361:6: lv_variables_8_0= ruleVariableDef
            	    {

            	    						newCompositeNode(grammarAccess.getScenarioAccess().getVariablesVariableDefParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_variables_8_0=ruleVariableDef();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenarioRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variables",
            	    							lv_variables_8_0,
            	    							"org.xtext.exam22.Dsl.VariableDef");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDsl.g:379:4: ( (lv_statements_9_0= ruleStatement ) )
            	    {
            	    // InternalDsl.g:379:4: ( (lv_statements_9_0= ruleStatement ) )
            	    // InternalDsl.g:380:5: (lv_statements_9_0= ruleStatement )
            	    {
            	    // InternalDsl.g:380:5: (lv_statements_9_0= ruleStatement )
            	    // InternalDsl.g:381:6: lv_statements_9_0= ruleStatement
            	    {

            	    						newCompositeNode(grammarAccess.getScenarioAccess().getStatementsStatementParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_statements_9_0=ruleStatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenarioRule());
            	    						}
            	    						add(
            	    							current,
            	    							"statements",
            	    							lv_statements_9_0,
            	    							"org.xtext.exam22.Dsl.Statement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_10=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleStatement"
    // InternalDsl.g:407:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalDsl.g:407:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalDsl.g:408:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalDsl.g:414:1: ruleStatement returns [EObject current=null] : (this_Announce_0= ruleAnnounce | this_Question_1= ruleQuestion | this_End_2= ruleEnd ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Announce_0 = null;

        EObject this_Question_1 = null;

        EObject this_End_2 = null;



        	enterRule();

        try {
            // InternalDsl.g:420:2: ( (this_Announce_0= ruleAnnounce | this_Question_1= ruleQuestion | this_End_2= ruleEnd ) )
            // InternalDsl.g:421:2: (this_Announce_0= ruleAnnounce | this_Question_1= ruleQuestion | this_End_2= ruleEnd )
            {
            // InternalDsl.g:421:2: (this_Announce_0= ruleAnnounce | this_Question_1= ruleQuestion | this_End_2= ruleEnd )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt9=1;
                }
                break;
            case 22:
                {
                alt9=2;
                }
                break;
            case 25:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalDsl.g:422:3: this_Announce_0= ruleAnnounce
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getAnnounceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Announce_0=ruleAnnounce();

                    state._fsp--;


                    			current = this_Announce_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:431:3: this_Question_1= ruleQuestion
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getQuestionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Question_1=ruleQuestion();

                    state._fsp--;


                    			current = this_Question_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:440:3: this_End_2= ruleEnd
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getEndParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_End_2=ruleEnd();

                    state._fsp--;


                    			current = this_End_2;
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleVariableDef"
    // InternalDsl.g:452:1: entryRuleVariableDef returns [EObject current=null] : iv_ruleVariableDef= ruleVariableDef EOF ;
    public final EObject entryRuleVariableDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDef = null;


        try {
            // InternalDsl.g:452:52: (iv_ruleVariableDef= ruleVariableDef EOF )
            // InternalDsl.g:453:2: iv_ruleVariableDef= ruleVariableDef EOF
            {
             newCompositeNode(grammarAccess.getVariableDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDef=ruleVariableDef();

            state._fsp--;

             current =iv_ruleVariableDef; 
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
    // $ANTLR end "entryRuleVariableDef"


    // $ANTLR start "ruleVariableDef"
    // InternalDsl.g:459:1: ruleVariableDef returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruleVariableDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:465:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) )
            // InternalDsl.g:466:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            {
            // InternalDsl.g:466:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            // InternalDsl.g:467:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableDefAccess().getVarKeyword_0());
            		
            // InternalDsl.g:471:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:472:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:472:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:473:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableDefAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableDefAccess().getColonKeyword_2());
            		
            // InternalDsl.g:493:3: ( (lv_type_3_0= ruleType ) )
            // InternalDsl.g:494:4: (lv_type_3_0= ruleType )
            {
            // InternalDsl.g:494:4: (lv_type_3_0= ruleType )
            // InternalDsl.g:495:5: lv_type_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getVariableDefAccess().getTypeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableDefRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.exam22.Dsl.Type");
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
    // $ANTLR end "ruleVariableDef"


    // $ANTLR start "entryRuleAnnounce"
    // InternalDsl.g:516:1: entryRuleAnnounce returns [EObject current=null] : iv_ruleAnnounce= ruleAnnounce EOF ;
    public final EObject entryRuleAnnounce() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnounce = null;


        try {
            // InternalDsl.g:516:49: (iv_ruleAnnounce= ruleAnnounce EOF )
            // InternalDsl.g:517:2: iv_ruleAnnounce= ruleAnnounce EOF
            {
             newCompositeNode(grammarAccess.getAnnounceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnounce=ruleAnnounce();

            state._fsp--;

             current =iv_ruleAnnounce; 
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
    // $ANTLR end "entryRuleAnnounce"


    // $ANTLR start "ruleAnnounce"
    // InternalDsl.g:523:1: ruleAnnounce returns [EObject current=null] : (otherlv_0= 'announce' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expression_2_0= ruleExp ) ) ( (lv_targets_3_0= ruleTarget ) )+ ) ;
    public final EObject ruleAnnounce() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_expression_2_0 = null;

        EObject lv_targets_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:529:2: ( (otherlv_0= 'announce' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expression_2_0= ruleExp ) ) ( (lv_targets_3_0= ruleTarget ) )+ ) )
            // InternalDsl.g:530:2: (otherlv_0= 'announce' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expression_2_0= ruleExp ) ) ( (lv_targets_3_0= ruleTarget ) )+ )
            {
            // InternalDsl.g:530:2: (otherlv_0= 'announce' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expression_2_0= ruleExp ) ) ( (lv_targets_3_0= ruleTarget ) )+ )
            // InternalDsl.g:531:3: otherlv_0= 'announce' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expression_2_0= ruleExp ) ) ( (lv_targets_3_0= ruleTarget ) )+
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAnnounceAccess().getAnnounceKeyword_0());
            		
            // InternalDsl.g:535:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:536:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:536:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:537:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAnnounceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAnnounceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDsl.g:553:3: ( (lv_expression_2_0= ruleExp ) )
            // InternalDsl.g:554:4: (lv_expression_2_0= ruleExp )
            {
            // InternalDsl.g:554:4: (lv_expression_2_0= ruleExp )
            // InternalDsl.g:555:5: lv_expression_2_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getAnnounceAccess().getExpressionExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_expression_2_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnnounceRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"org.xtext.exam22.Dsl.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:572:3: ( (lv_targets_3_0= ruleTarget ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==26) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDsl.g:573:4: (lv_targets_3_0= ruleTarget )
            	    {
            	    // InternalDsl.g:573:4: (lv_targets_3_0= ruleTarget )
            	    // InternalDsl.g:574:5: lv_targets_3_0= ruleTarget
            	    {

            	    					newCompositeNode(grammarAccess.getAnnounceAccess().getTargetsTargetParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_targets_3_0=ruleTarget();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAnnounceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"targets",
            	    						lv_targets_3_0,
            	    						"org.xtext.exam22.Dsl.Target");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
    // $ANTLR end "ruleAnnounce"


    // $ANTLR start "entryRuleQuestion"
    // InternalDsl.g:595:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // InternalDsl.g:595:49: (iv_ruleQuestion= ruleQuestion EOF )
            // InternalDsl.g:596:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
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
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // InternalDsl.g:602:1: ruleQuestion returns [EObject current=null] : (otherlv_0= 'question' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expression_2_0= ruleExp ) ) otherlv_3= 'as' ( (lv_output_4_0= ruleExp ) ) (otherlv_5= 'in' ( (otherlv_6= RULE_ID ) ) )? ( (lv_targets_7_0= ruleTarget ) )+ ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_expression_2_0 = null;

        EObject lv_output_4_0 = null;

        EObject lv_targets_7_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:608:2: ( (otherlv_0= 'question' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expression_2_0= ruleExp ) ) otherlv_3= 'as' ( (lv_output_4_0= ruleExp ) ) (otherlv_5= 'in' ( (otherlv_6= RULE_ID ) ) )? ( (lv_targets_7_0= ruleTarget ) )+ ) )
            // InternalDsl.g:609:2: (otherlv_0= 'question' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expression_2_0= ruleExp ) ) otherlv_3= 'as' ( (lv_output_4_0= ruleExp ) ) (otherlv_5= 'in' ( (otherlv_6= RULE_ID ) ) )? ( (lv_targets_7_0= ruleTarget ) )+ )
            {
            // InternalDsl.g:609:2: (otherlv_0= 'question' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expression_2_0= ruleExp ) ) otherlv_3= 'as' ( (lv_output_4_0= ruleExp ) ) (otherlv_5= 'in' ( (otherlv_6= RULE_ID ) ) )? ( (lv_targets_7_0= ruleTarget ) )+ )
            // InternalDsl.g:610:3: otherlv_0= 'question' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expression_2_0= ruleExp ) ) otherlv_3= 'as' ( (lv_output_4_0= ruleExp ) ) (otherlv_5= 'in' ( (otherlv_6= RULE_ID ) ) )? ( (lv_targets_7_0= ruleTarget ) )+
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getQuestionAccess().getQuestionKeyword_0());
            		
            // InternalDsl.g:614:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:615:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:615:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:616:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getQuestionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQuestionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDsl.g:632:3: ( (lv_expression_2_0= ruleExp ) )
            // InternalDsl.g:633:4: (lv_expression_2_0= ruleExp )
            {
            // InternalDsl.g:633:4: (lv_expression_2_0= ruleExp )
            // InternalDsl.g:634:5: lv_expression_2_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getQuestionAccess().getExpressionExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_expression_2_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuestionRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"org.xtext.exam22.Dsl.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getQuestionAccess().getAsKeyword_3());
            		
            // InternalDsl.g:655:3: ( (lv_output_4_0= ruleExp ) )
            // InternalDsl.g:656:4: (lv_output_4_0= ruleExp )
            {
            // InternalDsl.g:656:4: (lv_output_4_0= ruleExp )
            // InternalDsl.g:657:5: lv_output_4_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getQuestionAccess().getOutputExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_19);
            lv_output_4_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuestionRule());
            					}
            					set(
            						current,
            						"output",
            						lv_output_4_0,
            						"org.xtext.exam22.Dsl.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDsl.g:674:3: (otherlv_5= 'in' ( (otherlv_6= RULE_ID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDsl.g:675:4: otherlv_5= 'in' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getQuestionAccess().getInKeyword_5_0());
                    			
                    // InternalDsl.g:679:4: ( (otherlv_6= RULE_ID ) )
                    // InternalDsl.g:680:5: (otherlv_6= RULE_ID )
                    {
                    // InternalDsl.g:680:5: (otherlv_6= RULE_ID )
                    // InternalDsl.g:681:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getQuestionRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(otherlv_6, grammarAccess.getQuestionAccess().getVariableVariableDefCrossReference_5_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:693:3: ( (lv_targets_7_0= ruleTarget ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:694:4: (lv_targets_7_0= ruleTarget )
            	    {
            	    // InternalDsl.g:694:4: (lv_targets_7_0= ruleTarget )
            	    // InternalDsl.g:695:5: lv_targets_7_0= ruleTarget
            	    {

            	    					newCompositeNode(grammarAccess.getQuestionAccess().getTargetsTargetParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_targets_7_0=ruleTarget();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"targets",
            	    						lv_targets_7_0,
            	    						"org.xtext.exam22.Dsl.Target");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleEnd"
    // InternalDsl.g:716:1: entryRuleEnd returns [EObject current=null] : iv_ruleEnd= ruleEnd EOF ;
    public final EObject entryRuleEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnd = null;


        try {
            // InternalDsl.g:716:44: (iv_ruleEnd= ruleEnd EOF )
            // InternalDsl.g:717:2: iv_ruleEnd= ruleEnd EOF
            {
             newCompositeNode(grammarAccess.getEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnd=ruleEnd();

            state._fsp--;

             current =iv_ruleEnd; 
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
    // $ANTLR end "entryRuleEnd"


    // $ANTLR start "ruleEnd"
    // InternalDsl.g:723:1: ruleEnd returns [EObject current=null] : (otherlv_0= 'end' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expression_2_0= ruleExp ) )? ) ;
    public final EObject ruleEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:729:2: ( (otherlv_0= 'end' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expression_2_0= ruleExp ) )? ) )
            // InternalDsl.g:730:2: (otherlv_0= 'end' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expression_2_0= ruleExp ) )? )
            {
            // InternalDsl.g:730:2: (otherlv_0= 'end' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expression_2_0= ruleExp ) )? )
            // InternalDsl.g:731:3: otherlv_0= 'end' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expression_2_0= ruleExp ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEndAccess().getEndKeyword_0());
            		
            // InternalDsl.g:735:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:736:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:736:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:737:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEndAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEndRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDsl.g:753:3: ( (lv_expression_2_0= ruleExp ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_STRING)||LA13_0==13||(LA13_0>=29 && LA13_0<=31)||(LA13_0>=45 && LA13_0<=48)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:754:4: (lv_expression_2_0= ruleExp )
                    {
                    // InternalDsl.g:754:4: (lv_expression_2_0= ruleExp )
                    // InternalDsl.g:755:5: lv_expression_2_0= ruleExp
                    {

                    					newCompositeNode(grammarAccess.getEndAccess().getExpressionExpParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_expression_2_0=ruleExp();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEndRule());
                    					}
                    					set(
                    						current,
                    						"expression",
                    						lv_expression_2_0,
                    						"org.xtext.exam22.Dsl.Exp");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleEnd"


    // $ANTLR start "entryRuleTarget"
    // InternalDsl.g:776:1: entryRuleTarget returns [EObject current=null] : iv_ruleTarget= ruleTarget EOF ;
    public final EObject entryRuleTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTarget = null;


        try {
            // InternalDsl.g:776:47: (iv_ruleTarget= ruleTarget EOF )
            // InternalDsl.g:777:2: iv_ruleTarget= ruleTarget EOF
            {
             newCompositeNode(grammarAccess.getTargetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTarget=ruleTarget();

            state._fsp--;

             current =iv_ruleTarget; 
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
    // $ANTLR end "entryRuleTarget"


    // $ANTLR start "ruleTarget"
    // InternalDsl.g:783:1: ruleTarget returns [EObject current=null] : (otherlv_0= 'to' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_expressions_3_0= ruleExp ) ) (otherlv_4= ',' ( (lv_expressions_5_0= ruleExp ) ) )* )? otherlv_6= ')' )? (otherlv_7= 'if' ( (lv_condition_8_0= ruleExp ) ) )? (otherlv_9= '{' ( (lv_endingTargets_10_0= ruleEndingTarget ) )+ otherlv_11= '}' )? ) ;
    public final EObject ruleTarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_expressions_3_0 = null;

        EObject lv_expressions_5_0 = null;

        EObject lv_condition_8_0 = null;

        EObject lv_endingTargets_10_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:789:2: ( (otherlv_0= 'to' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_expressions_3_0= ruleExp ) ) (otherlv_4= ',' ( (lv_expressions_5_0= ruleExp ) ) )* )? otherlv_6= ')' )? (otherlv_7= 'if' ( (lv_condition_8_0= ruleExp ) ) )? (otherlv_9= '{' ( (lv_endingTargets_10_0= ruleEndingTarget ) )+ otherlv_11= '}' )? ) )
            // InternalDsl.g:790:2: (otherlv_0= 'to' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_expressions_3_0= ruleExp ) ) (otherlv_4= ',' ( (lv_expressions_5_0= ruleExp ) ) )* )? otherlv_6= ')' )? (otherlv_7= 'if' ( (lv_condition_8_0= ruleExp ) ) )? (otherlv_9= '{' ( (lv_endingTargets_10_0= ruleEndingTarget ) )+ otherlv_11= '}' )? )
            {
            // InternalDsl.g:790:2: (otherlv_0= 'to' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_expressions_3_0= ruleExp ) ) (otherlv_4= ',' ( (lv_expressions_5_0= ruleExp ) ) )* )? otherlv_6= ')' )? (otherlv_7= 'if' ( (lv_condition_8_0= ruleExp ) ) )? (otherlv_9= '{' ( (lv_endingTargets_10_0= ruleEndingTarget ) )+ otherlv_11= '}' )? )
            // InternalDsl.g:791:3: otherlv_0= 'to' ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_expressions_3_0= ruleExp ) ) (otherlv_4= ',' ( (lv_expressions_5_0= ruleExp ) ) )* )? otherlv_6= ')' )? (otherlv_7= 'if' ( (lv_condition_8_0= ruleExp ) ) )? (otherlv_9= '{' ( (lv_endingTargets_10_0= ruleEndingTarget ) )+ otherlv_11= '}' )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTargetAccess().getToKeyword_0());
            		
            // InternalDsl.g:795:3: ( (otherlv_1= RULE_ID ) )
            // InternalDsl.g:796:4: (otherlv_1= RULE_ID )
            {
            // InternalDsl.g:796:4: (otherlv_1= RULE_ID )
            // InternalDsl.g:797:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTargetRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_1, grammarAccess.getTargetAccess().getToCrossRefCrossReference_1_0());
            				

            }


            }

            // InternalDsl.g:808:3: (otherlv_2= '(' ( ( (lv_expressions_3_0= ruleExp ) ) (otherlv_4= ',' ( (lv_expressions_5_0= ruleExp ) ) )* )? otherlv_6= ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==13) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDsl.g:809:4: otherlv_2= '(' ( ( (lv_expressions_3_0= ruleExp ) ) (otherlv_4= ',' ( (lv_expressions_5_0= ruleExp ) ) )* )? otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_22); 

                    				newLeafNode(otherlv_2, grammarAccess.getTargetAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalDsl.g:813:4: ( ( (lv_expressions_3_0= ruleExp ) ) (otherlv_4= ',' ( (lv_expressions_5_0= ruleExp ) ) )* )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_STRING)||LA15_0==13||(LA15_0>=29 && LA15_0<=31)||(LA15_0>=45 && LA15_0<=48)) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalDsl.g:814:5: ( (lv_expressions_3_0= ruleExp ) ) (otherlv_4= ',' ( (lv_expressions_5_0= ruleExp ) ) )*
                            {
                            // InternalDsl.g:814:5: ( (lv_expressions_3_0= ruleExp ) )
                            // InternalDsl.g:815:6: (lv_expressions_3_0= ruleExp )
                            {
                            // InternalDsl.g:815:6: (lv_expressions_3_0= ruleExp )
                            // InternalDsl.g:816:7: lv_expressions_3_0= ruleExp
                            {

                            							newCompositeNode(grammarAccess.getTargetAccess().getExpressionsExpParserRuleCall_2_1_0_0());
                            						
                            pushFollow(FOLLOW_8);
                            lv_expressions_3_0=ruleExp();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getTargetRule());
                            							}
                            							add(
                            								current,
                            								"expressions",
                            								lv_expressions_3_0,
                            								"org.xtext.exam22.Dsl.Exp");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalDsl.g:833:5: (otherlv_4= ',' ( (lv_expressions_5_0= ruleExp ) ) )*
                            loop14:
                            do {
                                int alt14=2;
                                int LA14_0 = input.LA(1);

                                if ( (LA14_0==14) ) {
                                    alt14=1;
                                }


                                switch (alt14) {
                            	case 1 :
                            	    // InternalDsl.g:834:6: otherlv_4= ',' ( (lv_expressions_5_0= ruleExp ) )
                            	    {
                            	    otherlv_4=(Token)match(input,14,FOLLOW_15); 

                            	    						newLeafNode(otherlv_4, grammarAccess.getTargetAccess().getCommaKeyword_2_1_1_0());
                            	    					
                            	    // InternalDsl.g:838:6: ( (lv_expressions_5_0= ruleExp ) )
                            	    // InternalDsl.g:839:7: (lv_expressions_5_0= ruleExp )
                            	    {
                            	    // InternalDsl.g:839:7: (lv_expressions_5_0= ruleExp )
                            	    // InternalDsl.g:840:8: lv_expressions_5_0= ruleExp
                            	    {

                            	    								newCompositeNode(grammarAccess.getTargetAccess().getExpressionsExpParserRuleCall_2_1_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_8);
                            	    lv_expressions_5_0=ruleExp();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getTargetRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"expressions",
                            	    									lv_expressions_5_0,
                            	    									"org.xtext.exam22.Dsl.Exp");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop14;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_23); 

                    				newLeafNode(otherlv_6, grammarAccess.getTargetAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalDsl.g:864:3: (otherlv_7= 'if' ( (lv_condition_8_0= ruleExp ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDsl.g:865:4: otherlv_7= 'if' ( (lv_condition_8_0= ruleExp ) )
                    {
                    otherlv_7=(Token)match(input,27,FOLLOW_15); 

                    				newLeafNode(otherlv_7, grammarAccess.getTargetAccess().getIfKeyword_3_0());
                    			
                    // InternalDsl.g:869:4: ( (lv_condition_8_0= ruleExp ) )
                    // InternalDsl.g:870:5: (lv_condition_8_0= ruleExp )
                    {
                    // InternalDsl.g:870:5: (lv_condition_8_0= ruleExp )
                    // InternalDsl.g:871:6: lv_condition_8_0= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getTargetAccess().getConditionExpParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_condition_8_0=ruleExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTargetRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_8_0,
                    							"org.xtext.exam22.Dsl.Exp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDsl.g:889:3: (otherlv_9= '{' ( (lv_endingTargets_10_0= ruleEndingTarget ) )+ otherlv_11= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==18) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDsl.g:890:4: otherlv_9= '{' ( (lv_endingTargets_10_0= ruleEndingTarget ) )+ otherlv_11= '}'
                    {
                    otherlv_9=(Token)match(input,18,FOLLOW_25); 

                    				newLeafNode(otherlv_9, grammarAccess.getTargetAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalDsl.g:894:4: ( (lv_endingTargets_10_0= ruleEndingTarget ) )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==28) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalDsl.g:895:5: (lv_endingTargets_10_0= ruleEndingTarget )
                    	    {
                    	    // InternalDsl.g:895:5: (lv_endingTargets_10_0= ruleEndingTarget )
                    	    // InternalDsl.g:896:6: lv_endingTargets_10_0= ruleEndingTarget
                    	    {

                    	    						newCompositeNode(grammarAccess.getTargetAccess().getEndingTargetsEndingTargetParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_26);
                    	    lv_endingTargets_10_0=ruleEndingTarget();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTargetRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"endingTargets",
                    	    							lv_endingTargets_10_0,
                    	    							"org.xtext.exam22.Dsl.EndingTarget");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);

                    otherlv_11=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getTargetAccess().getRightCurlyBracketKeyword_4_2());
                    			

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
    // $ANTLR end "ruleTarget"


    // $ANTLR start "entryRuleEndingTarget"
    // InternalDsl.g:922:1: entryRuleEndingTarget returns [EObject current=null] : iv_ruleEndingTarget= ruleEndingTarget EOF ;
    public final EObject entryRuleEndingTarget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEndingTarget = null;


        try {
            // InternalDsl.g:922:53: (iv_ruleEndingTarget= ruleEndingTarget EOF )
            // InternalDsl.g:923:2: iv_ruleEndingTarget= ruleEndingTarget EOF
            {
             newCompositeNode(grammarAccess.getEndingTargetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndingTarget=ruleEndingTarget();

            state._fsp--;

             current =iv_ruleEndingTarget; 
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
    // $ANTLR end "entryRuleEndingTarget"


    // $ANTLR start "ruleEndingTarget"
    // InternalDsl.g:929:1: ruleEndingTarget returns [EObject current=null] : (otherlv_0= 'on' ( (otherlv_1= RULE_ID ) ) ( (lv_target_2_0= ruleTarget ) ) ) ;
    public final EObject ruleEndingTarget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_target_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:935:2: ( (otherlv_0= 'on' ( (otherlv_1= RULE_ID ) ) ( (lv_target_2_0= ruleTarget ) ) ) )
            // InternalDsl.g:936:2: (otherlv_0= 'on' ( (otherlv_1= RULE_ID ) ) ( (lv_target_2_0= ruleTarget ) ) )
            {
            // InternalDsl.g:936:2: (otherlv_0= 'on' ( (otherlv_1= RULE_ID ) ) ( (lv_target_2_0= ruleTarget ) ) )
            // InternalDsl.g:937:3: otherlv_0= 'on' ( (otherlv_1= RULE_ID ) ) ( (lv_target_2_0= ruleTarget ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEndingTargetAccess().getOnKeyword_0());
            		
            // InternalDsl.g:941:3: ( (otherlv_1= RULE_ID ) )
            // InternalDsl.g:942:4: (otherlv_1= RULE_ID )
            {
            // InternalDsl.g:942:4: (otherlv_1= RULE_ID )
            // InternalDsl.g:943:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEndingTargetRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_1, grammarAccess.getEndingTargetAccess().getEndEndCrossReference_1_0());
            				

            }


            }

            // InternalDsl.g:954:3: ( (lv_target_2_0= ruleTarget ) )
            // InternalDsl.g:955:4: (lv_target_2_0= ruleTarget )
            {
            // InternalDsl.g:955:4: (lv_target_2_0= ruleTarget )
            // InternalDsl.g:956:5: lv_target_2_0= ruleTarget
            {

            					newCompositeNode(grammarAccess.getEndingTargetAccess().getTargetTargetParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_target_2_0=ruleTarget();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEndingTargetRule());
            					}
            					set(
            						current,
            						"target",
            						lv_target_2_0,
            						"org.xtext.exam22.Dsl.Target");
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
    // $ANTLR end "ruleEndingTarget"


    // $ANTLR start "entryRuleParameter"
    // InternalDsl.g:977:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalDsl.g:977:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalDsl.g:978:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalDsl.g:984:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:990:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) )
            // InternalDsl.g:991:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            {
            // InternalDsl.g:991:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            // InternalDsl.g:992:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) )
            {
            // InternalDsl.g:992:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDsl.g:993:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDsl.g:993:4: (lv_name_0_0= RULE_ID )
            // InternalDsl.g:994:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
            		
            // InternalDsl.g:1014:3: ( (lv_type_2_0= ruleType ) )
            // InternalDsl.g:1015:4: (lv_type_2_0= ruleType )
            {
            // InternalDsl.g:1015:4: (lv_type_2_0= ruleType )
            // InternalDsl.g:1016:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.exam22.Dsl.Type");
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleType"
    // InternalDsl.g:1037:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalDsl.g:1037:44: (iv_ruleType= ruleType EOF )
            // InternalDsl.g:1038:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalDsl.g:1044:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'boolean' | kw= 'text' | kw= 'number' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:1050:2: ( (kw= 'boolean' | kw= 'text' | kw= 'number' ) )
            // InternalDsl.g:1051:2: (kw= 'boolean' | kw= 'text' | kw= 'number' )
            {
            // InternalDsl.g:1051:2: (kw= 'boolean' | kw= 'text' | kw= 'number' )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt20=1;
                }
                break;
            case 30:
                {
                alt20=2;
                }
                break;
            case 31:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalDsl.g:1052:3: kw= 'boolean'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getBooleanKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:1058:3: kw= 'text'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getTextKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:1064:3: kw= 'number'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getNumberKeyword_2());
                    		

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleExp"
    // InternalDsl.g:1073:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalDsl.g:1073:44: (iv_ruleExp= ruleExp EOF )
            // InternalDsl.g:1074:2: iv_ruleExp= ruleExp EOF
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
    // InternalDsl.g:1080:1: ruleExp returns [EObject current=null] : this_Boolean_0= ruleBoolean ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        EObject this_Boolean_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1086:2: (this_Boolean_0= ruleBoolean )
            // InternalDsl.g:1087:2: this_Boolean_0= ruleBoolean
            {

            		newCompositeNode(grammarAccess.getExpAccess().getBooleanParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Boolean_0=ruleBoolean();

            state._fsp--;


            		current = this_Boolean_0;
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


    // $ANTLR start "entryRuleBoolean"
    // InternalDsl.g:1098:1: entryRuleBoolean returns [EObject current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final EObject entryRuleBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolean = null;


        try {
            // InternalDsl.g:1098:48: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalDsl.g:1099:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean; 
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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalDsl.g:1105:1: ruleBoolean returns [EObject current=null] : (this_Equal_0= ruleEqual ( () ( ( (lv_op_2_1= '&&' | lv_op_2_2= '||' ) ) ) ( (lv_right_3_0= ruleEqual ) ) )* ) ;
    public final EObject ruleBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Equal_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1111:2: ( (this_Equal_0= ruleEqual ( () ( ( (lv_op_2_1= '&&' | lv_op_2_2= '||' ) ) ) ( (lv_right_3_0= ruleEqual ) ) )* ) )
            // InternalDsl.g:1112:2: (this_Equal_0= ruleEqual ( () ( ( (lv_op_2_1= '&&' | lv_op_2_2= '||' ) ) ) ( (lv_right_3_0= ruleEqual ) ) )* )
            {
            // InternalDsl.g:1112:2: (this_Equal_0= ruleEqual ( () ( ( (lv_op_2_1= '&&' | lv_op_2_2= '||' ) ) ) ( (lv_right_3_0= ruleEqual ) ) )* )
            // InternalDsl.g:1113:3: this_Equal_0= ruleEqual ( () ( ( (lv_op_2_1= '&&' | lv_op_2_2= '||' ) ) ) ( (lv_right_3_0= ruleEqual ) ) )*
            {

            			newCompositeNode(grammarAccess.getBooleanAccess().getEqualParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            this_Equal_0=ruleEqual();

            state._fsp--;


            			current = this_Equal_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:1121:3: ( () ( ( (lv_op_2_1= '&&' | lv_op_2_2= '||' ) ) ) ( (lv_right_3_0= ruleEqual ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=32 && LA22_0<=33)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDsl.g:1122:4: () ( ( (lv_op_2_1= '&&' | lv_op_2_2= '||' ) ) ) ( (lv_right_3_0= ruleEqual ) )
            	    {
            	    // InternalDsl.g:1122:4: ()
            	    // InternalDsl.g:1123:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getBooleanAccess().getBooleanLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDsl.g:1129:4: ( ( (lv_op_2_1= '&&' | lv_op_2_2= '||' ) ) )
            	    // InternalDsl.g:1130:5: ( (lv_op_2_1= '&&' | lv_op_2_2= '||' ) )
            	    {
            	    // InternalDsl.g:1130:5: ( (lv_op_2_1= '&&' | lv_op_2_2= '||' ) )
            	    // InternalDsl.g:1131:6: (lv_op_2_1= '&&' | lv_op_2_2= '||' )
            	    {
            	    // InternalDsl.g:1131:6: (lv_op_2_1= '&&' | lv_op_2_2= '||' )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==32) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==33) ) {
            	        alt21=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalDsl.g:1132:7: lv_op_2_1= '&&'
            	            {
            	            lv_op_2_1=(Token)match(input,32,FOLLOW_15); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getBooleanAccess().getOpAmpersandAmpersandKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getBooleanRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalDsl.g:1143:7: lv_op_2_2= '||'
            	            {
            	            lv_op_2_2=(Token)match(input,33,FOLLOW_15); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getBooleanAccess().getOpVerticalLineVerticalLineKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getBooleanRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalDsl.g:1156:4: ( (lv_right_3_0= ruleEqual ) )
            	    // InternalDsl.g:1157:5: (lv_right_3_0= ruleEqual )
            	    {
            	    // InternalDsl.g:1157:5: (lv_right_3_0= ruleEqual )
            	    // InternalDsl.g:1158:6: lv_right_3_0= ruleEqual
            	    {

            	    						newCompositeNode(grammarAccess.getBooleanAccess().getRightEqualParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_right_3_0=ruleEqual();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBooleanRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.exam22.Dsl.Equal");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleEqual"
    // InternalDsl.g:1180:1: entryRuleEqual returns [EObject current=null] : iv_ruleEqual= ruleEqual EOF ;
    public final EObject entryRuleEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqual = null;


        try {
            // InternalDsl.g:1180:46: (iv_ruleEqual= ruleEqual EOF )
            // InternalDsl.g:1181:2: iv_ruleEqual= ruleEqual EOF
            {
             newCompositeNode(grammarAccess.getEqualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqual=ruleEqual();

            state._fsp--;

             current =iv_ruleEqual; 
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
    // $ANTLR end "entryRuleEqual"


    // $ANTLR start "ruleEqual"
    // InternalDsl.g:1187:1: ruleEqual returns [EObject current=null] : (this_Compare_0= ruleCompare ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleCompare ) ) )* ) ;
    public final EObject ruleEqual() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Compare_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1193:2: ( (this_Compare_0= ruleCompare ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleCompare ) ) )* ) )
            // InternalDsl.g:1194:2: (this_Compare_0= ruleCompare ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleCompare ) ) )* )
            {
            // InternalDsl.g:1194:2: (this_Compare_0= ruleCompare ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleCompare ) ) )* )
            // InternalDsl.g:1195:3: this_Compare_0= ruleCompare ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleCompare ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualAccess().getCompareParserRuleCall_0());
            		
            pushFollow(FOLLOW_28);
            this_Compare_0=ruleCompare();

            state._fsp--;


            			current = this_Compare_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:1203:3: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleCompare ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=34 && LA24_0<=35)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalDsl.g:1204:4: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleCompare ) )
            	    {
            	    // InternalDsl.g:1204:4: ()
            	    // InternalDsl.g:1205:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualAccess().getEqualLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDsl.g:1211:4: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // InternalDsl.g:1212:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // InternalDsl.g:1212:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // InternalDsl.g:1213:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // InternalDsl.g:1213:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==34) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==35) ) {
            	        alt23=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalDsl.g:1214:7: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,34,FOLLOW_15); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getEqualAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalDsl.g:1225:7: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,35,FOLLOW_15); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getEqualAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalDsl.g:1238:4: ( (lv_right_3_0= ruleCompare ) )
            	    // InternalDsl.g:1239:5: (lv_right_3_0= ruleCompare )
            	    {
            	    // InternalDsl.g:1239:5: (lv_right_3_0= ruleCompare )
            	    // InternalDsl.g:1240:6: lv_right_3_0= ruleCompare
            	    {

            	    						newCompositeNode(grammarAccess.getEqualAccess().getRightCompareParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_right_3_0=ruleCompare();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.exam22.Dsl.Compare");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // $ANTLR end "ruleEqual"


    // $ANTLR start "entryRuleCompare"
    // InternalDsl.g:1262:1: entryRuleCompare returns [EObject current=null] : iv_ruleCompare= ruleCompare EOF ;
    public final EObject entryRuleCompare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompare = null;


        try {
            // InternalDsl.g:1262:48: (iv_ruleCompare= ruleCompare EOF )
            // InternalDsl.g:1263:2: iv_ruleCompare= ruleCompare EOF
            {
             newCompositeNode(grammarAccess.getCompareRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompare=ruleCompare();

            state._fsp--;

             current =iv_ruleCompare; 
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
    // $ANTLR end "entryRuleCompare"


    // $ANTLR start "ruleCompare"
    // InternalDsl.g:1269:1: ruleCompare returns [EObject current=null] : (this_Concat_0= ruleConcat ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleConcat ) ) )* ) ;
    public final EObject ruleCompare() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_Concat_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1275:2: ( (this_Concat_0= ruleConcat ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleConcat ) ) )* ) )
            // InternalDsl.g:1276:2: (this_Concat_0= ruleConcat ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleConcat ) ) )* )
            {
            // InternalDsl.g:1276:2: (this_Concat_0= ruleConcat ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleConcat ) ) )* )
            // InternalDsl.g:1277:3: this_Concat_0= ruleConcat ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleConcat ) ) )*
            {

            			newCompositeNode(grammarAccess.getCompareAccess().getConcatParserRuleCall_0());
            		
            pushFollow(FOLLOW_29);
            this_Concat_0=ruleConcat();

            state._fsp--;


            			current = this_Concat_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:1285:3: ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleConcat ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=36 && LA26_0<=39)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalDsl.g:1286:4: () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleConcat ) )
            	    {
            	    // InternalDsl.g:1286:4: ()
            	    // InternalDsl.g:1287:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getCompareAccess().getCompareLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDsl.g:1293:4: ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) )
            	    // InternalDsl.g:1294:5: ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) )
            	    {
            	    // InternalDsl.g:1294:5: ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) )
            	    // InternalDsl.g:1295:6: (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' )
            	    {
            	    // InternalDsl.g:1295:6: (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' )
            	    int alt25=4;
            	    switch ( input.LA(1) ) {
            	    case 36:
            	        {
            	        alt25=1;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt25=2;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt25=3;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt25=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt25) {
            	        case 1 :
            	            // InternalDsl.g:1296:7: lv_op_2_1= '<'
            	            {
            	            lv_op_2_1=(Token)match(input,36,FOLLOW_15); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getCompareAccess().getOpLessThanSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getCompareRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalDsl.g:1307:7: lv_op_2_2= '>'
            	            {
            	            lv_op_2_2=(Token)match(input,37,FOLLOW_15); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getCompareAccess().getOpGreaterThanSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getCompareRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalDsl.g:1318:7: lv_op_2_3= '<='
            	            {
            	            lv_op_2_3=(Token)match(input,38,FOLLOW_15); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getCompareAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getCompareRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalDsl.g:1329:7: lv_op_2_4= '>='
            	            {
            	            lv_op_2_4=(Token)match(input,39,FOLLOW_15); 

            	            							newLeafNode(lv_op_2_4, grammarAccess.getCompareAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_3());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getCompareRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_4, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalDsl.g:1342:4: ( (lv_right_3_0= ruleConcat ) )
            	    // InternalDsl.g:1343:5: (lv_right_3_0= ruleConcat )
            	    {
            	    // InternalDsl.g:1343:5: (lv_right_3_0= ruleConcat )
            	    // InternalDsl.g:1344:6: lv_right_3_0= ruleConcat
            	    {

            	    						newCompositeNode(grammarAccess.getCompareAccess().getRightConcatParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_right_3_0=ruleConcat();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompareRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.exam22.Dsl.Concat");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // $ANTLR end "ruleCompare"


    // $ANTLR start "entryRuleConcat"
    // InternalDsl.g:1366:1: entryRuleConcat returns [EObject current=null] : iv_ruleConcat= ruleConcat EOF ;
    public final EObject entryRuleConcat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcat = null;


        try {
            // InternalDsl.g:1366:47: (iv_ruleConcat= ruleConcat EOF )
            // InternalDsl.g:1367:2: iv_ruleConcat= ruleConcat EOF
            {
             newCompositeNode(grammarAccess.getConcatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConcat=ruleConcat();

            state._fsp--;

             current =iv_ruleConcat; 
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
    // $ANTLR end "entryRuleConcat"


    // $ANTLR start "ruleConcat"
    // InternalDsl.g:1373:1: ruleConcat returns [EObject current=null] : (this_PlusMinus_0= rulePlusMinus ( () otherlv_2= '&' ( (lv_right_3_0= rulePlusMinus ) ) )* ) ;
    public final EObject ruleConcat() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PlusMinus_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1379:2: ( (this_PlusMinus_0= rulePlusMinus ( () otherlv_2= '&' ( (lv_right_3_0= rulePlusMinus ) ) )* ) )
            // InternalDsl.g:1380:2: (this_PlusMinus_0= rulePlusMinus ( () otherlv_2= '&' ( (lv_right_3_0= rulePlusMinus ) ) )* )
            {
            // InternalDsl.g:1380:2: (this_PlusMinus_0= rulePlusMinus ( () otherlv_2= '&' ( (lv_right_3_0= rulePlusMinus ) ) )* )
            // InternalDsl.g:1381:3: this_PlusMinus_0= rulePlusMinus ( () otherlv_2= '&' ( (lv_right_3_0= rulePlusMinus ) ) )*
            {

            			newCompositeNode(grammarAccess.getConcatAccess().getPlusMinusParserRuleCall_0());
            		
            pushFollow(FOLLOW_30);
            this_PlusMinus_0=rulePlusMinus();

            state._fsp--;


            			current = this_PlusMinus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:1389:3: ( () otherlv_2= '&' ( (lv_right_3_0= rulePlusMinus ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==40) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalDsl.g:1390:4: () otherlv_2= '&' ( (lv_right_3_0= rulePlusMinus ) )
            	    {
            	    // InternalDsl.g:1390:4: ()
            	    // InternalDsl.g:1391:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConcatAccess().getConcatLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,40,FOLLOW_15); 

            	    				newLeafNode(otherlv_2, grammarAccess.getConcatAccess().getAmpersandKeyword_1_1());
            	    			
            	    // InternalDsl.g:1401:4: ( (lv_right_3_0= rulePlusMinus ) )
            	    // InternalDsl.g:1402:5: (lv_right_3_0= rulePlusMinus )
            	    {
            	    // InternalDsl.g:1402:5: (lv_right_3_0= rulePlusMinus )
            	    // InternalDsl.g:1403:6: lv_right_3_0= rulePlusMinus
            	    {

            	    						newCompositeNode(grammarAccess.getConcatAccess().getRightPlusMinusParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_30);
            	    lv_right_3_0=rulePlusMinus();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConcatRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.exam22.Dsl.PlusMinus");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // $ANTLR end "ruleConcat"


    // $ANTLR start "entryRulePlusMinus"
    // InternalDsl.g:1425:1: entryRulePlusMinus returns [EObject current=null] : iv_rulePlusMinus= rulePlusMinus EOF ;
    public final EObject entryRulePlusMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusMinus = null;


        try {
            // InternalDsl.g:1425:50: (iv_rulePlusMinus= rulePlusMinus EOF )
            // InternalDsl.g:1426:2: iv_rulePlusMinus= rulePlusMinus EOF
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
    // InternalDsl.g:1432:1: rulePlusMinus returns [EObject current=null] : (this_MultDiv_0= ruleMultDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultDiv ) ) )* ) ;
    public final EObject rulePlusMinus() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_MultDiv_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1438:2: ( (this_MultDiv_0= ruleMultDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultDiv ) ) )* ) )
            // InternalDsl.g:1439:2: (this_MultDiv_0= ruleMultDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultDiv ) ) )* )
            {
            // InternalDsl.g:1439:2: (this_MultDiv_0= ruleMultDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultDiv ) ) )* )
            // InternalDsl.g:1440:3: this_MultDiv_0= ruleMultDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultDiv ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusMinusAccess().getMultDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_31);
            this_MultDiv_0=ruleMultDiv();

            state._fsp--;


            			current = this_MultDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:1448:3: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultDiv ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=41 && LA29_0<=42)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalDsl.g:1449:4: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultDiv ) )
            	    {
            	    // InternalDsl.g:1449:4: ()
            	    // InternalDsl.g:1450:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPlusMinusAccess().getPlusMinusLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDsl.g:1456:4: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // InternalDsl.g:1457:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // InternalDsl.g:1457:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // InternalDsl.g:1458:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // InternalDsl.g:1458:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==41) ) {
            	        alt28=1;
            	    }
            	    else if ( (LA28_0==42) ) {
            	        alt28=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // InternalDsl.g:1459:7: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,41,FOLLOW_15); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getPlusMinusAccess().getOpPlusSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getPlusMinusRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalDsl.g:1470:7: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,42,FOLLOW_15); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getPlusMinusAccess().getOpHyphenMinusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getPlusMinusRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalDsl.g:1483:4: ( (lv_right_3_0= ruleMultDiv ) )
            	    // InternalDsl.g:1484:5: (lv_right_3_0= ruleMultDiv )
            	    {
            	    // InternalDsl.g:1484:5: (lv_right_3_0= ruleMultDiv )
            	    // InternalDsl.g:1485:6: lv_right_3_0= ruleMultDiv
            	    {

            	    						newCompositeNode(grammarAccess.getPlusMinusAccess().getRightMultDivParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_right_3_0=ruleMultDiv();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlusMinusRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.exam22.Dsl.MultDiv");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalDsl.g:1507:1: entryRuleMultDiv returns [EObject current=null] : iv_ruleMultDiv= ruleMultDiv EOF ;
    public final EObject entryRuleMultDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultDiv = null;


        try {
            // InternalDsl.g:1507:48: (iv_ruleMultDiv= ruleMultDiv EOF )
            // InternalDsl.g:1508:2: iv_ruleMultDiv= ruleMultDiv EOF
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
    // InternalDsl.g:1514:1: ruleMultDiv returns [EObject current=null] : (this_Primitive_0= rulePrimitive ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimitive ) ) )* ) ;
    public final EObject ruleMultDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Primitive_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1520:2: ( (this_Primitive_0= rulePrimitive ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimitive ) ) )* ) )
            // InternalDsl.g:1521:2: (this_Primitive_0= rulePrimitive ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimitive ) ) )* )
            {
            // InternalDsl.g:1521:2: (this_Primitive_0= rulePrimitive ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimitive ) ) )* )
            // InternalDsl.g:1522:3: this_Primitive_0= rulePrimitive ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimitive ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultDivAccess().getPrimitiveParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_Primitive_0=rulePrimitive();

            state._fsp--;


            			current = this_Primitive_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:1530:3: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimitive ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=43 && LA31_0<=44)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalDsl.g:1531:4: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimitive ) )
            	    {
            	    // InternalDsl.g:1531:4: ()
            	    // InternalDsl.g:1532:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultDivAccess().getMultDivLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDsl.g:1538:4: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // InternalDsl.g:1539:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // InternalDsl.g:1539:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // InternalDsl.g:1540:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // InternalDsl.g:1540:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==43) ) {
            	        alt30=1;
            	    }
            	    else if ( (LA30_0==44) ) {
            	        alt30=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 30, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // InternalDsl.g:1541:7: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,43,FOLLOW_15); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getMultDivAccess().getOpAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultDivRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalDsl.g:1552:7: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,44,FOLLOW_15); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getMultDivAccess().getOpSolidusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultDivRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalDsl.g:1565:4: ( (lv_right_3_0= rulePrimitive ) )
            	    // InternalDsl.g:1566:5: (lv_right_3_0= rulePrimitive )
            	    {
            	    // InternalDsl.g:1566:5: (lv_right_3_0= rulePrimitive )
            	    // InternalDsl.g:1567:6: lv_right_3_0= rulePrimitive
            	    {

            	    						newCompositeNode(grammarAccess.getMultDivAccess().getRightPrimitiveParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_right_3_0=rulePrimitive();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultDivRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.exam22.Dsl.Primitive");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
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


    // $ANTLR start "entryRulePrimitive"
    // InternalDsl.g:1589:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // InternalDsl.g:1589:50: (iv_rulePrimitive= rulePrimitive EOF )
            // InternalDsl.g:1590:2: iv_rulePrimitive= rulePrimitive EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;

             current =iv_rulePrimitive; 
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
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // InternalDsl.g:1596:1: rulePrimitive returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= '!' ( (lv_exp_8_0= rulePrimitive ) ) ) | ( () ( (lv_type_10_0= ruleType ) ) ) | ( () otherlv_12= 'this' ) | ( () ( (otherlv_14= RULE_ID ) ) ) | ( () ( (otherlv_16= RULE_ID ) ) otherlv_17= '(' ( ( (lv_expressions_18_0= ruleExp ) ) (otherlv_19= ',' ( (lv_expressions_20_0= ruleExp ) ) )* )? otherlv_21= ')' ) | ( () otherlv_23= '(' ( (lv_exp_24_0= ruleExp ) ) otherlv_25= ')' ) ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;
        Token otherlv_7=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        EObject lv_exp_8_0 = null;

        AntlrDatatypeRuleToken lv_type_10_0 = null;

        EObject lv_expressions_18_0 = null;

        EObject lv_expressions_20_0 = null;

        EObject lv_exp_24_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1602:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= '!' ( (lv_exp_8_0= rulePrimitive ) ) ) | ( () ( (lv_type_10_0= ruleType ) ) ) | ( () otherlv_12= 'this' ) | ( () ( (otherlv_14= RULE_ID ) ) ) | ( () ( (otherlv_16= RULE_ID ) ) otherlv_17= '(' ( ( (lv_expressions_18_0= ruleExp ) ) (otherlv_19= ',' ( (lv_expressions_20_0= ruleExp ) ) )* )? otherlv_21= ')' ) | ( () otherlv_23= '(' ( (lv_exp_24_0= ruleExp ) ) otherlv_25= ')' ) ) )
            // InternalDsl.g:1603:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= '!' ( (lv_exp_8_0= rulePrimitive ) ) ) | ( () ( (lv_type_10_0= ruleType ) ) ) | ( () otherlv_12= 'this' ) | ( () ( (otherlv_14= RULE_ID ) ) ) | ( () ( (otherlv_16= RULE_ID ) ) otherlv_17= '(' ( ( (lv_expressions_18_0= ruleExp ) ) (otherlv_19= ',' ( (lv_expressions_20_0= ruleExp ) ) )* )? otherlv_21= ')' ) | ( () otherlv_23= '(' ( (lv_exp_24_0= ruleExp ) ) otherlv_25= ')' ) )
            {
            // InternalDsl.g:1603:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= '!' ( (lv_exp_8_0= rulePrimitive ) ) ) | ( () ( (lv_type_10_0= ruleType ) ) ) | ( () otherlv_12= 'this' ) | ( () ( (otherlv_14= RULE_ID ) ) ) | ( () ( (otherlv_16= RULE_ID ) ) otherlv_17= '(' ( ( (lv_expressions_18_0= ruleExp ) ) (otherlv_19= ',' ( (lv_expressions_20_0= ruleExp ) ) )* )? otherlv_21= ')' ) | ( () otherlv_23= '(' ( (lv_exp_24_0= ruleExp ) ) otherlv_25= ')' ) )
            int alt35=9;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // InternalDsl.g:1604:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalDsl.g:1604:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalDsl.g:1605:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalDsl.g:1605:4: ()
                    // InternalDsl.g:1606:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimitiveAccess().getIntConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalDsl.g:1612:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalDsl.g:1613:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalDsl.g:1613:5: (lv_value_1_0= RULE_INT )
                    // InternalDsl.g:1614:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getPrimitiveAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimitiveRule());
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
                    break;
                case 2 :
                    // InternalDsl.g:1632:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalDsl.g:1632:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalDsl.g:1633:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalDsl.g:1633:4: ()
                    // InternalDsl.g:1634:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimitiveAccess().getStringConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDsl.g:1640:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalDsl.g:1641:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalDsl.g:1641:5: (lv_value_3_0= RULE_STRING )
                    // InternalDsl.g:1642:6: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getPrimitiveAccess().getValueSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimitiveRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:1660:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    {
                    // InternalDsl.g:1660:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    // InternalDsl.g:1661:4: () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    {
                    // InternalDsl.g:1661:4: ()
                    // InternalDsl.g:1662:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimitiveAccess().getBoolConstantAction_2_0(),
                    						current);
                    				

                    }

                    // InternalDsl.g:1668:4: ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    // InternalDsl.g:1669:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    {
                    // InternalDsl.g:1669:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    // InternalDsl.g:1670:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    {
                    // InternalDsl.g:1670:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==45) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==46) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalDsl.g:1671:7: lv_value_5_1= 'true'
                            {
                            lv_value_5_1=(Token)match(input,45,FOLLOW_2); 

                            							newLeafNode(lv_value_5_1, grammarAccess.getPrimitiveAccess().getValueTrueKeyword_2_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPrimitiveRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_5_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalDsl.g:1682:7: lv_value_5_2= 'false'
                            {
                            lv_value_5_2=(Token)match(input,46,FOLLOW_2); 

                            							newLeafNode(lv_value_5_2, grammarAccess.getPrimitiveAccess().getValueFalseKeyword_2_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getPrimitiveRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_5_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:1697:3: ( () otherlv_7= '!' ( (lv_exp_8_0= rulePrimitive ) ) )
                    {
                    // InternalDsl.g:1697:3: ( () otherlv_7= '!' ( (lv_exp_8_0= rulePrimitive ) ) )
                    // InternalDsl.g:1698:4: () otherlv_7= '!' ( (lv_exp_8_0= rulePrimitive ) )
                    {
                    // InternalDsl.g:1698:4: ()
                    // InternalDsl.g:1699:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimitiveAccess().getNotAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,47,FOLLOW_15); 

                    				newLeafNode(otherlv_7, grammarAccess.getPrimitiveAccess().getExclamationMarkKeyword_3_1());
                    			
                    // InternalDsl.g:1709:4: ( (lv_exp_8_0= rulePrimitive ) )
                    // InternalDsl.g:1710:5: (lv_exp_8_0= rulePrimitive )
                    {
                    // InternalDsl.g:1710:5: (lv_exp_8_0= rulePrimitive )
                    // InternalDsl.g:1711:6: lv_exp_8_0= rulePrimitive
                    {

                    						newCompositeNode(grammarAccess.getPrimitiveAccess().getExpPrimitiveParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_exp_8_0=rulePrimitive();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimitiveRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_8_0,
                    							"org.xtext.exam22.Dsl.Primitive");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:1730:3: ( () ( (lv_type_10_0= ruleType ) ) )
                    {
                    // InternalDsl.g:1730:3: ( () ( (lv_type_10_0= ruleType ) ) )
                    // InternalDsl.g:1731:4: () ( (lv_type_10_0= ruleType ) )
                    {
                    // InternalDsl.g:1731:4: ()
                    // InternalDsl.g:1732:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimitiveAccess().getTypeConstantAction_4_0(),
                    						current);
                    				

                    }

                    // InternalDsl.g:1738:4: ( (lv_type_10_0= ruleType ) )
                    // InternalDsl.g:1739:5: (lv_type_10_0= ruleType )
                    {
                    // InternalDsl.g:1739:5: (lv_type_10_0= ruleType )
                    // InternalDsl.g:1740:6: lv_type_10_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getPrimitiveAccess().getTypeTypeParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_10_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimitiveRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_10_0,
                    							"org.xtext.exam22.Dsl.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:1759:3: ( () otherlv_12= 'this' )
                    {
                    // InternalDsl.g:1759:3: ( () otherlv_12= 'this' )
                    // InternalDsl.g:1760:4: () otherlv_12= 'this'
                    {
                    // InternalDsl.g:1760:4: ()
                    // InternalDsl.g:1761:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimitiveAccess().getThisAction_5_0(),
                    						current);
                    				

                    }

                    otherlv_12=(Token)match(input,48,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getPrimitiveAccess().getThisKeyword_5_1());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:1773:3: ( () ( (otherlv_14= RULE_ID ) ) )
                    {
                    // InternalDsl.g:1773:3: ( () ( (otherlv_14= RULE_ID ) ) )
                    // InternalDsl.g:1774:4: () ( (otherlv_14= RULE_ID ) )
                    {
                    // InternalDsl.g:1774:4: ()
                    // InternalDsl.g:1775:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimitiveAccess().getVarRefAction_6_0(),
                    						current);
                    				

                    }

                    // InternalDsl.g:1781:4: ( (otherlv_14= RULE_ID ) )
                    // InternalDsl.g:1782:5: (otherlv_14= RULE_ID )
                    {
                    // InternalDsl.g:1782:5: (otherlv_14= RULE_ID )
                    // InternalDsl.g:1783:6: otherlv_14= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimitiveRule());
                    						}
                    					
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_14, grammarAccess.getPrimitiveAccess().getRefCrossRefCrossReference_6_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalDsl.g:1796:3: ( () ( (otherlv_16= RULE_ID ) ) otherlv_17= '(' ( ( (lv_expressions_18_0= ruleExp ) ) (otherlv_19= ',' ( (lv_expressions_20_0= ruleExp ) ) )* )? otherlv_21= ')' )
                    {
                    // InternalDsl.g:1796:3: ( () ( (otherlv_16= RULE_ID ) ) otherlv_17= '(' ( ( (lv_expressions_18_0= ruleExp ) ) (otherlv_19= ',' ( (lv_expressions_20_0= ruleExp ) ) )* )? otherlv_21= ')' )
                    // InternalDsl.g:1797:4: () ( (otherlv_16= RULE_ID ) ) otherlv_17= '(' ( ( (lv_expressions_18_0= ruleExp ) ) (otherlv_19= ',' ( (lv_expressions_20_0= ruleExp ) ) )* )? otherlv_21= ')'
                    {
                    // InternalDsl.g:1797:4: ()
                    // InternalDsl.g:1798:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimitiveAccess().getFuncCallAction_7_0(),
                    						current);
                    				

                    }

                    // InternalDsl.g:1804:4: ( (otherlv_16= RULE_ID ) )
                    // InternalDsl.g:1805:5: (otherlv_16= RULE_ID )
                    {
                    // InternalDsl.g:1805:5: (otherlv_16= RULE_ID )
                    // InternalDsl.g:1806:6: otherlv_16= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimitiveRule());
                    						}
                    					
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_16, grammarAccess.getPrimitiveAccess().getRefFunctionCrossReference_7_1_0());
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,13,FOLLOW_22); 

                    				newLeafNode(otherlv_17, grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_7_2());
                    			
                    // InternalDsl.g:1821:4: ( ( (lv_expressions_18_0= ruleExp ) ) (otherlv_19= ',' ( (lv_expressions_20_0= ruleExp ) ) )* )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_STRING)||LA34_0==13||(LA34_0>=29 && LA34_0<=31)||(LA34_0>=45 && LA34_0<=48)) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalDsl.g:1822:5: ( (lv_expressions_18_0= ruleExp ) ) (otherlv_19= ',' ( (lv_expressions_20_0= ruleExp ) ) )*
                            {
                            // InternalDsl.g:1822:5: ( (lv_expressions_18_0= ruleExp ) )
                            // InternalDsl.g:1823:6: (lv_expressions_18_0= ruleExp )
                            {
                            // InternalDsl.g:1823:6: (lv_expressions_18_0= ruleExp )
                            // InternalDsl.g:1824:7: lv_expressions_18_0= ruleExp
                            {

                            							newCompositeNode(grammarAccess.getPrimitiveAccess().getExpressionsExpParserRuleCall_7_3_0_0());
                            						
                            pushFollow(FOLLOW_8);
                            lv_expressions_18_0=ruleExp();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPrimitiveRule());
                            							}
                            							add(
                            								current,
                            								"expressions",
                            								lv_expressions_18_0,
                            								"org.xtext.exam22.Dsl.Exp");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalDsl.g:1841:5: (otherlv_19= ',' ( (lv_expressions_20_0= ruleExp ) ) )*
                            loop33:
                            do {
                                int alt33=2;
                                int LA33_0 = input.LA(1);

                                if ( (LA33_0==14) ) {
                                    alt33=1;
                                }


                                switch (alt33) {
                            	case 1 :
                            	    // InternalDsl.g:1842:6: otherlv_19= ',' ( (lv_expressions_20_0= ruleExp ) )
                            	    {
                            	    otherlv_19=(Token)match(input,14,FOLLOW_15); 

                            	    						newLeafNode(otherlv_19, grammarAccess.getPrimitiveAccess().getCommaKeyword_7_3_1_0());
                            	    					
                            	    // InternalDsl.g:1846:6: ( (lv_expressions_20_0= ruleExp ) )
                            	    // InternalDsl.g:1847:7: (lv_expressions_20_0= ruleExp )
                            	    {
                            	    // InternalDsl.g:1847:7: (lv_expressions_20_0= ruleExp )
                            	    // InternalDsl.g:1848:8: lv_expressions_20_0= ruleExp
                            	    {

                            	    								newCompositeNode(grammarAccess.getPrimitiveAccess().getExpressionsExpParserRuleCall_7_3_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_8);
                            	    lv_expressions_20_0=ruleExp();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getPrimitiveRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"expressions",
                            	    									lv_expressions_20_0,
                            	    									"org.xtext.exam22.Dsl.Exp");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop33;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_21=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_21, grammarAccess.getPrimitiveAccess().getRightParenthesisKeyword_7_4());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalDsl.g:1873:3: ( () otherlv_23= '(' ( (lv_exp_24_0= ruleExp ) ) otherlv_25= ')' )
                    {
                    // InternalDsl.g:1873:3: ( () otherlv_23= '(' ( (lv_exp_24_0= ruleExp ) ) otherlv_25= ')' )
                    // InternalDsl.g:1874:4: () otherlv_23= '(' ( (lv_exp_24_0= ruleExp ) ) otherlv_25= ')'
                    {
                    // InternalDsl.g:1874:4: ()
                    // InternalDsl.g:1875:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimitiveAccess().getParenthesisAction_8_0(),
                    						current);
                    				

                    }

                    otherlv_23=(Token)match(input,13,FOLLOW_15); 

                    				newLeafNode(otherlv_23, grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalDsl.g:1885:4: ( (lv_exp_24_0= ruleExp ) )
                    // InternalDsl.g:1886:5: (lv_exp_24_0= ruleExp )
                    {
                    // InternalDsl.g:1886:5: (lv_exp_24_0= ruleExp )
                    // InternalDsl.g:1887:6: lv_exp_24_0= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getPrimitiveAccess().getExpExpParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_exp_24_0=ruleExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimitiveRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_24_0,
                    							"org.xtext.exam22.Dsl.Exp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_25=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_25, grammarAccess.getPrimitiveAccess().getRightParenthesisKeyword_8_3());
                    			

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
    // $ANTLR end "rulePrimitive"

    // Delegated rules


    protected DFA35 dfa35 = new DFA35(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\7\uffff\1\12\3\uffff";
    static final String dfa_3s = "\1\4\6\uffff\1\15\3\uffff";
    static final String dfa_4s = "\1\60\6\uffff\1\54\3\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\11\1\10\1\7";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\7\1\1\1\2\6\uffff\1\10\17\uffff\3\5\15\uffff\2\3\1\4\1\6",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\11\2\12\2\uffff\11\12\1\uffff\1\12\3\uffff\15\12",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1603:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= '!' ( (lv_exp_8_0= rulePrimitive ) ) ) | ( () ( (lv_type_10_0= ruleType ) ) ) | ( () otherlv_12= 'this' ) | ( () ( (otherlv_14= RULE_ID ) ) ) | ( () ( (otherlv_16= RULE_ID ) ) otherlv_17= '(' ( ( (lv_expressions_18_0= ruleExp ) ) (otherlv_19= ',' ( (lv_expressions_20_0= ruleExp ) ) )* )? otherlv_21= ')' ) | ( () otherlv_23= '(' ( (lv_exp_24_0= ruleExp ) ) otherlv_25= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000021002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000E0008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002780000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0001E000E0002070L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0001E000E0002072L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008042002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0001E000E000A070L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008040002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010080000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000F000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000008000L});

}