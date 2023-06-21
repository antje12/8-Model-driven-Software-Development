package org.xtext.ui23.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.ui23.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'title'", "'function'", "'('", "','", "')'", "':'", "'form'", "'{'", "'}'", "'row'", "'column'", "'label'", "'input'", "'button'", "'*'", "'boolean'", "'string'", "'number'", "'&&'", "'||'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'&'", "'+'", "'-'", "'/'", "'!'", "'#'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

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
        	return "UI23";
       	}

       	@Override
       	protected DslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleUI23"
    // InternalDsl.g:64:1: entryRuleUI23 returns [EObject current=null] : iv_ruleUI23= ruleUI23 EOF ;
    public final EObject entryRuleUI23() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUI23 = null;


        try {
            // InternalDsl.g:64:45: (iv_ruleUI23= ruleUI23 EOF )
            // InternalDsl.g:65:2: iv_ruleUI23= ruleUI23 EOF
            {
             newCompositeNode(grammarAccess.getUI23Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUI23=ruleUI23();

            state._fsp--;

             current =iv_ruleUI23; 
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
    // $ANTLR end "entryRuleUI23"


    // $ANTLR start "ruleUI23"
    // InternalDsl.g:71:1: ruleUI23 returns [EObject current=null] : (otherlv_0= 'title' ( (lv_name_1_0= RULE_ID ) ) ( (lv_functions_2_0= ruleFunction ) )* ( (lv_forms_3_0= ruleForm ) )* ) ;
    public final EObject ruleUI23() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_functions_2_0 = null;

        EObject lv_forms_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:77:2: ( (otherlv_0= 'title' ( (lv_name_1_0= RULE_ID ) ) ( (lv_functions_2_0= ruleFunction ) )* ( (lv_forms_3_0= ruleForm ) )* ) )
            // InternalDsl.g:78:2: (otherlv_0= 'title' ( (lv_name_1_0= RULE_ID ) ) ( (lv_functions_2_0= ruleFunction ) )* ( (lv_forms_3_0= ruleForm ) )* )
            {
            // InternalDsl.g:78:2: (otherlv_0= 'title' ( (lv_name_1_0= RULE_ID ) ) ( (lv_functions_2_0= ruleFunction ) )* ( (lv_forms_3_0= ruleForm ) )* )
            // InternalDsl.g:79:3: otherlv_0= 'title' ( (lv_name_1_0= RULE_ID ) ) ( (lv_functions_2_0= ruleFunction ) )* ( (lv_forms_3_0= ruleForm ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUI23Access().getTitleKeyword_0());
            		
            // InternalDsl.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getUI23Access().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUI23Rule());
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

            	    					newCompositeNode(grammarAccess.getUI23Access().getFunctionsFunctionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_functions_2_0=ruleFunction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUI23Rule());
            	    					}
            	    					add(
            	    						current,
            	    						"functions",
            	    						lv_functions_2_0,
            	    						"org.xtext.ui23.Dsl.Function");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalDsl.g:120:3: ( (lv_forms_3_0= ruleForm ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDsl.g:121:4: (lv_forms_3_0= ruleForm )
            	    {
            	    // InternalDsl.g:121:4: (lv_forms_3_0= ruleForm )
            	    // InternalDsl.g:122:5: lv_forms_3_0= ruleForm
            	    {

            	    					newCompositeNode(grammarAccess.getUI23Access().getFormsFormParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_forms_3_0=ruleForm();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUI23Rule());
            	    					}
            	    					add(
            	    						current,
            	    						"forms",
            	    						lv_forms_3_0,
            	    						"org.xtext.ui23.Dsl.Form");
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
    // $ANTLR end "ruleUI23"


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

            if ( ((LA4_0>=26 && LA4_0<=28)) ) {
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
                    							"org.xtext.ui23.Dsl.Type");
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
                    	    								"org.xtext.ui23.Dsl.Type");
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
            						"org.xtext.ui23.Dsl.Type");
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


    // $ANTLR start "entryRuleForm"
    // InternalDsl.g:261:1: entryRuleForm returns [EObject current=null] : iv_ruleForm= ruleForm EOF ;
    public final EObject entryRuleForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForm = null;


        try {
            // InternalDsl.g:261:45: (iv_ruleForm= ruleForm EOF )
            // InternalDsl.g:262:2: iv_ruleForm= ruleForm EOF
            {
             newCompositeNode(grammarAccess.getFormRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForm=ruleForm();

            state._fsp--;

             current =iv_ruleForm; 
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
    // $ANTLR end "entryRuleForm"


    // $ANTLR start "ruleForm"
    // InternalDsl.g:268:1: ruleForm returns [EObject current=null] : (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_layout_8_0= ruleLayout ) ) otherlv_9= '}' ) ;
    public final EObject ruleForm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_layout_8_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:274:2: ( (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_layout_8_0= ruleLayout ) ) otherlv_9= '}' ) )
            // InternalDsl.g:275:2: (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_layout_8_0= ruleLayout ) ) otherlv_9= '}' )
            {
            // InternalDsl.g:275:2: (otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_layout_8_0= ruleLayout ) ) otherlv_9= '}' )
            // InternalDsl.g:276:3: otherlv_0= 'form' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( (lv_layout_8_0= ruleLayout ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFormAccess().getFormKeyword_0());
            		
            // InternalDsl.g:280:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:281:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:281:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:282:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFormAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormRule());
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

                    				newLeafNode(otherlv_2, grammarAccess.getFormAccess().getLeftParenthesisKeyword_2_0());
                    			
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

                            							newCompositeNode(grammarAccess.getFormAccess().getParametersParameterParserRuleCall_2_1_0_0());
                            						
                            pushFollow(FOLLOW_8);
                            lv_parameters_3_0=ruleParameter();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getFormRule());
                            							}
                            							add(
                            								current,
                            								"parameters",
                            								lv_parameters_3_0,
                            								"org.xtext.ui23.Dsl.Parameter");
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

                            	    						newLeafNode(otherlv_4, grammarAccess.getFormAccess().getCommaKeyword_2_1_1_0());
                            	    					
                            	    // InternalDsl.g:328:6: ( (lv_parameters_5_0= ruleParameter ) )
                            	    // InternalDsl.g:329:7: (lv_parameters_5_0= ruleParameter )
                            	    {
                            	    // InternalDsl.g:329:7: (lv_parameters_5_0= ruleParameter )
                            	    // InternalDsl.g:330:8: lv_parameters_5_0= ruleParameter
                            	    {

                            	    								newCompositeNode(grammarAccess.getFormAccess().getParametersParameterParserRuleCall_2_1_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_8);
                            	    lv_parameters_5_0=ruleParameter();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getFormRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"parameters",
                            	    									lv_parameters_5_0,
                            	    									"org.xtext.ui23.Dsl.Parameter");
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

                    				newLeafNode(otherlv_6, grammarAccess.getFormAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getFormAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDsl.g:358:3: ( (lv_layout_8_0= ruleLayout ) )
            // InternalDsl.g:359:4: (lv_layout_8_0= ruleLayout )
            {
            // InternalDsl.g:359:4: (lv_layout_8_0= ruleLayout )
            // InternalDsl.g:360:5: lv_layout_8_0= ruleLayout
            {

            					newCompositeNode(grammarAccess.getFormAccess().getLayoutLayoutParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_layout_8_0=ruleLayout();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFormRule());
            					}
            					set(
            						current,
            						"layout",
            						lv_layout_8_0,
            						"org.xtext.ui23.Dsl.Layout");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getFormAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleForm"


    // $ANTLR start "entryRuleLayout"
    // InternalDsl.g:385:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // InternalDsl.g:385:47: (iv_ruleLayout= ruleLayout EOF )
            // InternalDsl.g:386:2: iv_ruleLayout= ruleLayout EOF
            {
             newCompositeNode(grammarAccess.getLayoutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayout=ruleLayout();

            state._fsp--;

             current =iv_ruleLayout; 
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
    // $ANTLR end "entryRuleLayout"


    // $ANTLR start "ruleLayout"
    // InternalDsl.g:392:1: ruleLayout returns [EObject current=null] : ( () ( ( (lv_axis_1_1= 'row' | lv_axis_1_2= 'column' ) ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* otherlv_4= '}' ) ;
    public final EObject ruleLayout() throws RecognitionException {
        EObject current = null;

        Token lv_axis_1_1=null;
        Token lv_axis_1_2=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_components_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:398:2: ( ( () ( ( (lv_axis_1_1= 'row' | lv_axis_1_2= 'column' ) ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* otherlv_4= '}' ) )
            // InternalDsl.g:399:2: ( () ( ( (lv_axis_1_1= 'row' | lv_axis_1_2= 'column' ) ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* otherlv_4= '}' )
            {
            // InternalDsl.g:399:2: ( () ( ( (lv_axis_1_1= 'row' | lv_axis_1_2= 'column' ) ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* otherlv_4= '}' )
            // InternalDsl.g:400:3: () ( ( (lv_axis_1_1= 'row' | lv_axis_1_2= 'column' ) ) ) otherlv_2= '{' ( (lv_components_3_0= ruleComponent ) )* otherlv_4= '}'
            {
            // InternalDsl.g:400:3: ()
            // InternalDsl.g:401:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLayoutAccess().getLayoutAction_0(),
            					current);
            			

            }

            // InternalDsl.g:407:3: ( ( (lv_axis_1_1= 'row' | lv_axis_1_2= 'column' ) ) )
            // InternalDsl.g:408:4: ( (lv_axis_1_1= 'row' | lv_axis_1_2= 'column' ) )
            {
            // InternalDsl.g:408:4: ( (lv_axis_1_1= 'row' | lv_axis_1_2= 'column' ) )
            // InternalDsl.g:409:5: (lv_axis_1_1= 'row' | lv_axis_1_2= 'column' )
            {
            // InternalDsl.g:409:5: (lv_axis_1_1= 'row' | lv_axis_1_2= 'column' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            else if ( (LA8_0==21) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDsl.g:410:6: lv_axis_1_1= 'row'
                    {
                    lv_axis_1_1=(Token)match(input,20,FOLLOW_13); 

                    						newLeafNode(lv_axis_1_1, grammarAccess.getLayoutAccess().getAxisRowKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLayoutRule());
                    						}
                    						setWithLastConsumed(current, "axis", lv_axis_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalDsl.g:421:6: lv_axis_1_2= 'column'
                    {
                    lv_axis_1_2=(Token)match(input,21,FOLLOW_13); 

                    						newLeafNode(lv_axis_1_2, grammarAccess.getLayoutAccess().getAxisColumnKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLayoutRule());
                    						}
                    						setWithLastConsumed(current, "axis", lv_axis_1_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDsl.g:438:3: ( (lv_components_3_0= ruleComponent ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||(LA9_0>=20 && LA9_0<=24)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDsl.g:439:4: (lv_components_3_0= ruleComponent )
            	    {
            	    // InternalDsl.g:439:4: (lv_components_3_0= ruleComponent )
            	    // InternalDsl.g:440:5: lv_components_3_0= ruleComponent
            	    {

            	    					newCompositeNode(grammarAccess.getLayoutAccess().getComponentsComponentParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_components_3_0=ruleComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLayoutRule());
            	    					}
            	    					add(
            	    						current,
            	    						"components",
            	    						lv_components_3_0,
            	    						"org.xtext.ui23.Dsl.Component");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLayoutAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleLayout"


    // $ANTLR start "entryRuleComponent"
    // InternalDsl.g:465:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalDsl.g:465:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalDsl.g:466:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalDsl.g:472:1: ruleComponent returns [EObject current=null] : (this_Layout_0= ruleLayout | this_Element_1= ruleElement | this_FormUse_2= ruleFormUse ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Layout_0 = null;

        EObject this_Element_1 = null;

        EObject this_FormUse_2 = null;



        	enterRule();

        try {
            // InternalDsl.g:478:2: ( (this_Layout_0= ruleLayout | this_Element_1= ruleElement | this_FormUse_2= ruleFormUse ) )
            // InternalDsl.g:479:2: (this_Layout_0= ruleLayout | this_Element_1= ruleElement | this_FormUse_2= ruleFormUse )
            {
            // InternalDsl.g:479:2: (this_Layout_0= ruleLayout | this_Element_1= ruleElement | this_FormUse_2= ruleFormUse )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 20:
            case 21:
                {
                alt10=1;
                }
                break;
            case 22:
            case 23:
            case 24:
                {
                alt10=2;
                }
                break;
            case RULE_ID:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalDsl.g:480:3: this_Layout_0= ruleLayout
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getLayoutParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Layout_0=ruleLayout();

                    state._fsp--;


                    			current = this_Layout_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:489:3: this_Element_1= ruleElement
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getElementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Element_1=ruleElement();

                    state._fsp--;


                    			current = this_Element_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:498:3: this_FormUse_2= ruleFormUse
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getFormUseParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FormUse_2=ruleFormUse();

                    state._fsp--;


                    			current = this_FormUse_2;
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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleElement"
    // InternalDsl.g:510:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalDsl.g:510:48: (iv_ruleElement= ruleElement EOF )
            // InternalDsl.g:511:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalDsl.g:517:1: ruleElement returns [EObject current=null] : (this_Label_0= ruleLabel | this_InputText_1= ruleInputText | this_Button_2= ruleButton ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Label_0 = null;

        EObject this_InputText_1 = null;

        EObject this_Button_2 = null;



        	enterRule();

        try {
            // InternalDsl.g:523:2: ( (this_Label_0= ruleLabel | this_InputText_1= ruleInputText | this_Button_2= ruleButton ) )
            // InternalDsl.g:524:2: (this_Label_0= ruleLabel | this_InputText_1= ruleInputText | this_Button_2= ruleButton )
            {
            // InternalDsl.g:524:2: (this_Label_0= ruleLabel | this_InputText_1= ruleInputText | this_Button_2= ruleButton )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt11=1;
                }
                break;
            case 23:
                {
                alt11=2;
                }
                break;
            case 24:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalDsl.g:525:3: this_Label_0= ruleLabel
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getLabelParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Label_0=ruleLabel();

                    state._fsp--;


                    			current = this_Label_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:534:3: this_InputText_1= ruleInputText
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getInputTextParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_InputText_1=ruleInputText();

                    state._fsp--;


                    			current = this_InputText_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:543:3: this_Button_2= ruleButton
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getButtonParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Button_2=ruleButton();

                    state._fsp--;


                    			current = this_Button_2;
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleLabel"
    // InternalDsl.g:555:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // InternalDsl.g:555:46: (iv_ruleLabel= ruleLabel EOF )
            // InternalDsl.g:556:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalDsl.g:562:1: ruleLabel returns [EObject current=null] : (otherlv_0= 'label' otherlv_1= ':' ( (lv_exp_2_0= ruleExp ) ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:568:2: ( (otherlv_0= 'label' otherlv_1= ':' ( (lv_exp_2_0= ruleExp ) ) ) )
            // InternalDsl.g:569:2: (otherlv_0= 'label' otherlv_1= ':' ( (lv_exp_2_0= ruleExp ) ) )
            {
            // InternalDsl.g:569:2: (otherlv_0= 'label' otherlv_1= ':' ( (lv_exp_2_0= ruleExp ) ) )
            // InternalDsl.g:570:3: otherlv_0= 'label' otherlv_1= ':' ( (lv_exp_2_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getLabelAccess().getLabelKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getLabelAccess().getColonKeyword_1());
            		
            // InternalDsl.g:578:3: ( (lv_exp_2_0= ruleExp ) )
            // InternalDsl.g:579:4: (lv_exp_2_0= ruleExp )
            {
            // InternalDsl.g:579:4: (lv_exp_2_0= ruleExp )
            // InternalDsl.g:580:5: lv_exp_2_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLabelAccess().getExpExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_2_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLabelRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"org.xtext.ui23.Dsl.Exp");
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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleInputText"
    // InternalDsl.g:601:1: entryRuleInputText returns [EObject current=null] : iv_ruleInputText= ruleInputText EOF ;
    public final EObject entryRuleInputText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputText = null;


        try {
            // InternalDsl.g:601:50: (iv_ruleInputText= ruleInputText EOF )
            // InternalDsl.g:602:2: iv_ruleInputText= ruleInputText EOF
            {
             newCompositeNode(grammarAccess.getInputTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputText=ruleInputText();

            state._fsp--;

             current =iv_ruleInputText; 
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
    // $ANTLR end "entryRuleInputText"


    // $ANTLR start "ruleInputText"
    // InternalDsl.g:608:1: ruleInputText returns [EObject current=null] : (otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_exp_3_0= ruleExp ) ) ) ;
    public final EObject ruleInputText() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_exp_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:614:2: ( (otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_exp_3_0= ruleExp ) ) ) )
            // InternalDsl.g:615:2: (otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_exp_3_0= ruleExp ) ) )
            {
            // InternalDsl.g:615:2: (otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_exp_3_0= ruleExp ) ) )
            // InternalDsl.g:616:3: otherlv_0= 'input' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_exp_3_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getInputTextAccess().getInputKeyword_0());
            		
            // InternalDsl.g:620:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDsl.g:621:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDsl.g:621:4: (lv_name_1_0= RULE_ID )
            // InternalDsl.g:622:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInputTextAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInputTextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getInputTextAccess().getColonKeyword_2());
            		
            // InternalDsl.g:642:3: ( (lv_exp_3_0= ruleExp ) )
            // InternalDsl.g:643:4: (lv_exp_3_0= ruleExp )
            {
            // InternalDsl.g:643:4: (lv_exp_3_0= ruleExp )
            // InternalDsl.g:644:5: lv_exp_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getInputTextAccess().getExpExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputTextRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_3_0,
            						"org.xtext.ui23.Dsl.Exp");
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
    // $ANTLR end "ruleInputText"


    // $ANTLR start "entryRuleButton"
    // InternalDsl.g:665:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalDsl.g:665:47: (iv_ruleButton= ruleButton EOF )
            // InternalDsl.g:666:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
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
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalDsl.g:672:1: ruleButton returns [EObject current=null] : (otherlv_0= 'button' ( (lv_validate_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_exp_4_0= ruleExp ) ) ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_validate_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_exp_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:678:2: ( (otherlv_0= 'button' ( (lv_validate_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_exp_4_0= ruleExp ) ) ) )
            // InternalDsl.g:679:2: (otherlv_0= 'button' ( (lv_validate_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_exp_4_0= ruleExp ) ) )
            {
            // InternalDsl.g:679:2: (otherlv_0= 'button' ( (lv_validate_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_exp_4_0= ruleExp ) ) )
            // InternalDsl.g:680:3: otherlv_0= 'button' ( (lv_validate_1_0= '*' ) )? ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_exp_4_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
            		
            // InternalDsl.g:684:3: ( (lv_validate_1_0= '*' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDsl.g:685:4: (lv_validate_1_0= '*' )
                    {
                    // InternalDsl.g:685:4: (lv_validate_1_0= '*' )
                    // InternalDsl.g:686:5: lv_validate_1_0= '*'
                    {
                    lv_validate_1_0=(Token)match(input,25,FOLLOW_3); 

                    					newLeafNode(lv_validate_1_0, grammarAccess.getButtonAccess().getValidateAsteriskKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getButtonRule());
                    					}
                    					setWithLastConsumed(current, "validate", lv_validate_1_0, "*");
                    				

                    }


                    }
                    break;

            }

            // InternalDsl.g:698:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDsl.g:699:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDsl.g:699:4: (lv_name_2_0= RULE_ID )
            // InternalDsl.g:700:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_2_0, grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getButtonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getButtonAccess().getColonKeyword_3());
            		
            // InternalDsl.g:720:3: ( (lv_exp_4_0= ruleExp ) )
            // InternalDsl.g:721:4: (lv_exp_4_0= ruleExp )
            {
            // InternalDsl.g:721:4: (lv_exp_4_0= ruleExp )
            // InternalDsl.g:722:5: lv_exp_4_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getButtonAccess().getExpExpParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_4_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getButtonRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_4_0,
            						"org.xtext.ui23.Dsl.Exp");
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
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleFormUse"
    // InternalDsl.g:743:1: entryRuleFormUse returns [EObject current=null] : iv_ruleFormUse= ruleFormUse EOF ;
    public final EObject entryRuleFormUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormUse = null;


        try {
            // InternalDsl.g:743:48: (iv_ruleFormUse= ruleFormUse EOF )
            // InternalDsl.g:744:2: iv_ruleFormUse= ruleFormUse EOF
            {
             newCompositeNode(grammarAccess.getFormUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormUse=ruleFormUse();

            state._fsp--;

             current =iv_ruleFormUse; 
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
    // $ANTLR end "entryRuleFormUse"


    // $ANTLR start "ruleFormUse"
    // InternalDsl.g:750:1: ruleFormUse returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_exps_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_exps_4_0= ruleExp ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleFormUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exps_2_0 = null;

        EObject lv_exps_4_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:756:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_exps_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_exps_4_0= ruleExp ) ) )* )? otherlv_5= ')' ) )
            // InternalDsl.g:757:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_exps_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_exps_4_0= ruleExp ) ) )* )? otherlv_5= ')' )
            {
            // InternalDsl.g:757:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_exps_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_exps_4_0= ruleExp ) ) )* )? otherlv_5= ')' )
            // InternalDsl.g:758:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_exps_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_exps_4_0= ruleExp ) ) )* )? otherlv_5= ')'
            {
            // InternalDsl.g:758:3: ( (otherlv_0= RULE_ID ) )
            // InternalDsl.g:759:4: (otherlv_0= RULE_ID )
            {
            // InternalDsl.g:759:4: (otherlv_0= RULE_ID )
            // InternalDsl.g:760:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFormUseRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_0, grammarAccess.getFormUseAccess().getFormFormCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getFormUseAccess().getLeftParenthesisKeyword_1());
            		
            // InternalDsl.g:775:3: ( ( (lv_exps_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_exps_4_0= ruleExp ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_STRING)||LA14_0==13||(LA14_0>=26 && LA14_0<=28)||(LA14_0>=41 && LA14_0<=42)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDsl.g:776:4: ( (lv_exps_2_0= ruleExp ) ) (otherlv_3= ',' ( (lv_exps_4_0= ruleExp ) ) )*
                    {
                    // InternalDsl.g:776:4: ( (lv_exps_2_0= ruleExp ) )
                    // InternalDsl.g:777:5: (lv_exps_2_0= ruleExp )
                    {
                    // InternalDsl.g:777:5: (lv_exps_2_0= ruleExp )
                    // InternalDsl.g:778:6: lv_exps_2_0= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getFormUseAccess().getExpsExpParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_exps_2_0=ruleExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFormUseRule());
                    						}
                    						add(
                    							current,
                    							"exps",
                    							lv_exps_2_0,
                    							"org.xtext.ui23.Dsl.Exp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDsl.g:795:4: (otherlv_3= ',' ( (lv_exps_4_0= ruleExp ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalDsl.g:796:5: otherlv_3= ',' ( (lv_exps_4_0= ruleExp ) )
                    	    {
                    	    otherlv_3=(Token)match(input,14,FOLLOW_17); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getFormUseAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalDsl.g:800:5: ( (lv_exps_4_0= ruleExp ) )
                    	    // InternalDsl.g:801:6: (lv_exps_4_0= ruleExp )
                    	    {
                    	    // InternalDsl.g:801:6: (lv_exps_4_0= ruleExp )
                    	    // InternalDsl.g:802:7: lv_exps_4_0= ruleExp
                    	    {

                    	    							newCompositeNode(grammarAccess.getFormUseAccess().getExpsExpParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_exps_4_0=ruleExp();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFormUseRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"exps",
                    	    								lv_exps_4_0,
                    	    								"org.xtext.ui23.Dsl.Exp");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFormUseAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleFormUse"


    // $ANTLR start "entryRuleParameter"
    // InternalDsl.g:829:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalDsl.g:829:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalDsl.g:830:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalDsl.g:836:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:842:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) )
            // InternalDsl.g:843:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            {
            // InternalDsl.g:843:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            // InternalDsl.g:844:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) )
            {
            // InternalDsl.g:844:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalDsl.g:845:4: (lv_name_0_0= RULE_ID )
            {
            // InternalDsl.g:845:4: (lv_name_0_0= RULE_ID )
            // InternalDsl.g:846:5: lv_name_0_0= RULE_ID
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
            		
            // InternalDsl.g:866:3: ( (lv_type_2_0= ruleType ) )
            // InternalDsl.g:867:4: (lv_type_2_0= ruleType )
            {
            // InternalDsl.g:867:4: (lv_type_2_0= ruleType )
            // InternalDsl.g:868:5: lv_type_2_0= ruleType
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
            						"org.xtext.ui23.Dsl.Type");
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
    // InternalDsl.g:889:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalDsl.g:889:44: (iv_ruleType= ruleType EOF )
            // InternalDsl.g:890:2: iv_ruleType= ruleType EOF
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
    // InternalDsl.g:896:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'boolean' | kw= 'string' | kw= 'number' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDsl.g:902:2: ( (kw= 'boolean' | kw= 'string' | kw= 'number' ) )
            // InternalDsl.g:903:2: (kw= 'boolean' | kw= 'string' | kw= 'number' )
            {
            // InternalDsl.g:903:2: (kw= 'boolean' | kw= 'string' | kw= 'number' )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt15=1;
                }
                break;
            case 27:
                {
                alt15=2;
                }
                break;
            case 28:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalDsl.g:904:3: kw= 'boolean'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getBooleanKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDsl.g:910:3: kw= 'string'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getStringKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDsl.g:916:3: kw= 'number'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

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
    // InternalDsl.g:925:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalDsl.g:925:44: (iv_ruleExp= ruleExp EOF )
            // InternalDsl.g:926:2: iv_ruleExp= ruleExp EOF
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
    // InternalDsl.g:932:1: ruleExp returns [EObject current=null] : this_Boolean_0= ruleBoolean ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        EObject this_Boolean_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:938:2: (this_Boolean_0= ruleBoolean )
            // InternalDsl.g:939:2: this_Boolean_0= ruleBoolean
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
    // InternalDsl.g:950:1: entryRuleBoolean returns [EObject current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final EObject entryRuleBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolean = null;


        try {
            // InternalDsl.g:950:48: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalDsl.g:951:2: iv_ruleBoolean= ruleBoolean EOF
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
    // InternalDsl.g:957:1: ruleBoolean returns [EObject current=null] : (this_Equal_0= ruleEqual ( () ( ( (lv_op_2_1= '&&' | lv_op_2_2= '||' ) ) ) ( (lv_right_3_0= ruleEqual ) ) )* ) ;
    public final EObject ruleBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Equal_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:963:2: ( (this_Equal_0= ruleEqual ( () ( ( (lv_op_2_1= '&&' | lv_op_2_2= '||' ) ) ) ( (lv_right_3_0= ruleEqual ) ) )* ) )
            // InternalDsl.g:964:2: (this_Equal_0= ruleEqual ( () ( ( (lv_op_2_1= '&&' | lv_op_2_2= '||' ) ) ) ( (lv_right_3_0= ruleEqual ) ) )* )
            {
            // InternalDsl.g:964:2: (this_Equal_0= ruleEqual ( () ( ( (lv_op_2_1= '&&' | lv_op_2_2= '||' ) ) ) ( (lv_right_3_0= ruleEqual ) ) )* )
            // InternalDsl.g:965:3: this_Equal_0= ruleEqual ( () ( ( (lv_op_2_1= '&&' | lv_op_2_2= '||' ) ) ) ( (lv_right_3_0= ruleEqual ) ) )*
            {

            			newCompositeNode(grammarAccess.getBooleanAccess().getEqualParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_Equal_0=ruleEqual();

            state._fsp--;


            			current = this_Equal_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:973:3: ( () ( ( (lv_op_2_1= '&&' | lv_op_2_2= '||' ) ) ) ( (lv_right_3_0= ruleEqual ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=29 && LA17_0<=30)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDsl.g:974:4: () ( ( (lv_op_2_1= '&&' | lv_op_2_2= '||' ) ) ) ( (lv_right_3_0= ruleEqual ) )
            	    {
            	    // InternalDsl.g:974:4: ()
            	    // InternalDsl.g:975:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getBooleanAccess().getBooleanLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDsl.g:981:4: ( ( (lv_op_2_1= '&&' | lv_op_2_2= '||' ) ) )
            	    // InternalDsl.g:982:5: ( (lv_op_2_1= '&&' | lv_op_2_2= '||' ) )
            	    {
            	    // InternalDsl.g:982:5: ( (lv_op_2_1= '&&' | lv_op_2_2= '||' ) )
            	    // InternalDsl.g:983:6: (lv_op_2_1= '&&' | lv_op_2_2= '||' )
            	    {
            	    // InternalDsl.g:983:6: (lv_op_2_1= '&&' | lv_op_2_2= '||' )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==29) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==30) ) {
            	        alt16=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalDsl.g:984:7: lv_op_2_1= '&&'
            	            {
            	            lv_op_2_1=(Token)match(input,29,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getBooleanAccess().getOpAmpersandAmpersandKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getBooleanRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalDsl.g:995:7: lv_op_2_2= '||'
            	            {
            	            lv_op_2_2=(Token)match(input,30,FOLLOW_17); 

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

            	    // InternalDsl.g:1008:4: ( (lv_right_3_0= ruleEqual ) )
            	    // InternalDsl.g:1009:5: (lv_right_3_0= ruleEqual )
            	    {
            	    // InternalDsl.g:1009:5: (lv_right_3_0= ruleEqual )
            	    // InternalDsl.g:1010:6: lv_right_3_0= ruleEqual
            	    {

            	    						newCompositeNode(grammarAccess.getBooleanAccess().getRightEqualParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_right_3_0=ruleEqual();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBooleanRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.ui23.Dsl.Equal");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalDsl.g:1032:1: entryRuleEqual returns [EObject current=null] : iv_ruleEqual= ruleEqual EOF ;
    public final EObject entryRuleEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqual = null;


        try {
            // InternalDsl.g:1032:46: (iv_ruleEqual= ruleEqual EOF )
            // InternalDsl.g:1033:2: iv_ruleEqual= ruleEqual EOF
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
    // InternalDsl.g:1039:1: ruleEqual returns [EObject current=null] : (this_Compare_0= ruleCompare ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleCompare ) ) )* ) ;
    public final EObject ruleEqual() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Compare_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1045:2: ( (this_Compare_0= ruleCompare ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleCompare ) ) )* ) )
            // InternalDsl.g:1046:2: (this_Compare_0= ruleCompare ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleCompare ) ) )* )
            {
            // InternalDsl.g:1046:2: (this_Compare_0= ruleCompare ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleCompare ) ) )* )
            // InternalDsl.g:1047:3: this_Compare_0= ruleCompare ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleCompare ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualAccess().getCompareParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_Compare_0=ruleCompare();

            state._fsp--;


            			current = this_Compare_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:1055:3: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleCompare ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=31 && LA19_0<=32)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDsl.g:1056:4: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleCompare ) )
            	    {
            	    // InternalDsl.g:1056:4: ()
            	    // InternalDsl.g:1057:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualAccess().getEqualLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDsl.g:1063:4: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // InternalDsl.g:1064:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // InternalDsl.g:1064:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // InternalDsl.g:1065:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // InternalDsl.g:1065:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==31) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==32) ) {
            	        alt18=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalDsl.g:1066:7: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,31,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getEqualAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalDsl.g:1077:7: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,32,FOLLOW_17); 

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

            	    // InternalDsl.g:1090:4: ( (lv_right_3_0= ruleCompare ) )
            	    // InternalDsl.g:1091:5: (lv_right_3_0= ruleCompare )
            	    {
            	    // InternalDsl.g:1091:5: (lv_right_3_0= ruleCompare )
            	    // InternalDsl.g:1092:6: lv_right_3_0= ruleCompare
            	    {

            	    						newCompositeNode(grammarAccess.getEqualAccess().getRightCompareParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_right_3_0=ruleCompare();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.ui23.Dsl.Compare");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalDsl.g:1114:1: entryRuleCompare returns [EObject current=null] : iv_ruleCompare= ruleCompare EOF ;
    public final EObject entryRuleCompare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompare = null;


        try {
            // InternalDsl.g:1114:48: (iv_ruleCompare= ruleCompare EOF )
            // InternalDsl.g:1115:2: iv_ruleCompare= ruleCompare EOF
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
    // InternalDsl.g:1121:1: ruleCompare returns [EObject current=null] : (this_Concat_0= ruleConcat ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleConcat ) ) )* ) ;
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
            // InternalDsl.g:1127:2: ( (this_Concat_0= ruleConcat ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleConcat ) ) )* ) )
            // InternalDsl.g:1128:2: (this_Concat_0= ruleConcat ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleConcat ) ) )* )
            {
            // InternalDsl.g:1128:2: (this_Concat_0= ruleConcat ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleConcat ) ) )* )
            // InternalDsl.g:1129:3: this_Concat_0= ruleConcat ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleConcat ) ) )*
            {

            			newCompositeNode(grammarAccess.getCompareAccess().getConcatParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_Concat_0=ruleConcat();

            state._fsp--;


            			current = this_Concat_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:1137:3: ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleConcat ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=33 && LA21_0<=36)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDsl.g:1138:4: () ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleConcat ) )
            	    {
            	    // InternalDsl.g:1138:4: ()
            	    // InternalDsl.g:1139:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getCompareAccess().getCompareLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDsl.g:1145:4: ( ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) ) )
            	    // InternalDsl.g:1146:5: ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) )
            	    {
            	    // InternalDsl.g:1146:5: ( (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' ) )
            	    // InternalDsl.g:1147:6: (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' )
            	    {
            	    // InternalDsl.g:1147:6: (lv_op_2_1= '<' | lv_op_2_2= '>' | lv_op_2_3= '<=' | lv_op_2_4= '>=' )
            	    int alt20=4;
            	    switch ( input.LA(1) ) {
            	    case 33:
            	        {
            	        alt20=1;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt20=2;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt20=3;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt20=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt20) {
            	        case 1 :
            	            // InternalDsl.g:1148:7: lv_op_2_1= '<'
            	            {
            	            lv_op_2_1=(Token)match(input,33,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getCompareAccess().getOpLessThanSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getCompareRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalDsl.g:1159:7: lv_op_2_2= '>'
            	            {
            	            lv_op_2_2=(Token)match(input,34,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_2, grammarAccess.getCompareAccess().getOpGreaterThanSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getCompareRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalDsl.g:1170:7: lv_op_2_3= '<='
            	            {
            	            lv_op_2_3=(Token)match(input,35,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_3, grammarAccess.getCompareAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getCompareRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalDsl.g:1181:7: lv_op_2_4= '>='
            	            {
            	            lv_op_2_4=(Token)match(input,36,FOLLOW_17); 

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

            	    // InternalDsl.g:1194:4: ( (lv_right_3_0= ruleConcat ) )
            	    // InternalDsl.g:1195:5: (lv_right_3_0= ruleConcat )
            	    {
            	    // InternalDsl.g:1195:5: (lv_right_3_0= ruleConcat )
            	    // InternalDsl.g:1196:6: lv_right_3_0= ruleConcat
            	    {

            	    						newCompositeNode(grammarAccess.getCompareAccess().getRightConcatParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_right_3_0=ruleConcat();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompareRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.ui23.Dsl.Concat");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalDsl.g:1218:1: entryRuleConcat returns [EObject current=null] : iv_ruleConcat= ruleConcat EOF ;
    public final EObject entryRuleConcat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcat = null;


        try {
            // InternalDsl.g:1218:47: (iv_ruleConcat= ruleConcat EOF )
            // InternalDsl.g:1219:2: iv_ruleConcat= ruleConcat EOF
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
    // InternalDsl.g:1225:1: ruleConcat returns [EObject current=null] : (this_PlusMinus_0= rulePlusMinus ( () otherlv_2= '&' ( (lv_right_3_0= rulePlusMinus ) ) )* ) ;
    public final EObject ruleConcat() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PlusMinus_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1231:2: ( (this_PlusMinus_0= rulePlusMinus ( () otherlv_2= '&' ( (lv_right_3_0= rulePlusMinus ) ) )* ) )
            // InternalDsl.g:1232:2: (this_PlusMinus_0= rulePlusMinus ( () otherlv_2= '&' ( (lv_right_3_0= rulePlusMinus ) ) )* )
            {
            // InternalDsl.g:1232:2: (this_PlusMinus_0= rulePlusMinus ( () otherlv_2= '&' ( (lv_right_3_0= rulePlusMinus ) ) )* )
            // InternalDsl.g:1233:3: this_PlusMinus_0= rulePlusMinus ( () otherlv_2= '&' ( (lv_right_3_0= rulePlusMinus ) ) )*
            {

            			newCompositeNode(grammarAccess.getConcatAccess().getPlusMinusParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_PlusMinus_0=rulePlusMinus();

            state._fsp--;


            			current = this_PlusMinus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:1241:3: ( () otherlv_2= '&' ( (lv_right_3_0= rulePlusMinus ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==37) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDsl.g:1242:4: () otherlv_2= '&' ( (lv_right_3_0= rulePlusMinus ) )
            	    {
            	    // InternalDsl.g:1242:4: ()
            	    // InternalDsl.g:1243:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getConcatAccess().getConcatLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,37,FOLLOW_17); 

            	    				newLeafNode(otherlv_2, grammarAccess.getConcatAccess().getAmpersandKeyword_1_1());
            	    			
            	    // InternalDsl.g:1253:4: ( (lv_right_3_0= rulePlusMinus ) )
            	    // InternalDsl.g:1254:5: (lv_right_3_0= rulePlusMinus )
            	    {
            	    // InternalDsl.g:1254:5: (lv_right_3_0= rulePlusMinus )
            	    // InternalDsl.g:1255:6: lv_right_3_0= rulePlusMinus
            	    {

            	    						newCompositeNode(grammarAccess.getConcatAccess().getRightPlusMinusParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_right_3_0=rulePlusMinus();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getConcatRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.ui23.Dsl.PlusMinus");
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
    // $ANTLR end "ruleConcat"


    // $ANTLR start "entryRulePlusMinus"
    // InternalDsl.g:1277:1: entryRulePlusMinus returns [EObject current=null] : iv_rulePlusMinus= rulePlusMinus EOF ;
    public final EObject entryRulePlusMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusMinus = null;


        try {
            // InternalDsl.g:1277:50: (iv_rulePlusMinus= rulePlusMinus EOF )
            // InternalDsl.g:1278:2: iv_rulePlusMinus= rulePlusMinus EOF
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
    // InternalDsl.g:1284:1: rulePlusMinus returns [EObject current=null] : (this_MultDiv_0= ruleMultDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultDiv ) ) )* ) ;
    public final EObject rulePlusMinus() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_MultDiv_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1290:2: ( (this_MultDiv_0= ruleMultDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultDiv ) ) )* ) )
            // InternalDsl.g:1291:2: (this_MultDiv_0= ruleMultDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultDiv ) ) )* )
            {
            // InternalDsl.g:1291:2: (this_MultDiv_0= ruleMultDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultDiv ) ) )* )
            // InternalDsl.g:1292:3: this_MultDiv_0= ruleMultDiv ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultDiv ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusMinusAccess().getMultDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_24);
            this_MultDiv_0=ruleMultDiv();

            state._fsp--;


            			current = this_MultDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:1300:3: ( () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultDiv ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=38 && LA24_0<=39)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalDsl.g:1301:4: () ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) ) ( (lv_right_3_0= ruleMultDiv ) )
            	    {
            	    // InternalDsl.g:1301:4: ()
            	    // InternalDsl.g:1302:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPlusMinusAccess().getPlusMinusLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDsl.g:1308:4: ( ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) ) )
            	    // InternalDsl.g:1309:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    {
            	    // InternalDsl.g:1309:5: ( (lv_op_2_1= '+' | lv_op_2_2= '-' ) )
            	    // InternalDsl.g:1310:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    {
            	    // InternalDsl.g:1310:6: (lv_op_2_1= '+' | lv_op_2_2= '-' )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==38) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==39) ) {
            	        alt23=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalDsl.g:1311:7: lv_op_2_1= '+'
            	            {
            	            lv_op_2_1=(Token)match(input,38,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getPlusMinusAccess().getOpPlusSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getPlusMinusRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalDsl.g:1322:7: lv_op_2_2= '-'
            	            {
            	            lv_op_2_2=(Token)match(input,39,FOLLOW_17); 

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

            	    // InternalDsl.g:1335:4: ( (lv_right_3_0= ruleMultDiv ) )
            	    // InternalDsl.g:1336:5: (lv_right_3_0= ruleMultDiv )
            	    {
            	    // InternalDsl.g:1336:5: (lv_right_3_0= ruleMultDiv )
            	    // InternalDsl.g:1337:6: lv_right_3_0= ruleMultDiv
            	    {

            	    						newCompositeNode(grammarAccess.getPlusMinusAccess().getRightMultDivParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_24);
            	    lv_right_3_0=ruleMultDiv();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlusMinusRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.ui23.Dsl.MultDiv");
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
    // $ANTLR end "rulePlusMinus"


    // $ANTLR start "entryRuleMultDiv"
    // InternalDsl.g:1359:1: entryRuleMultDiv returns [EObject current=null] : iv_ruleMultDiv= ruleMultDiv EOF ;
    public final EObject entryRuleMultDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultDiv = null;


        try {
            // InternalDsl.g:1359:48: (iv_ruleMultDiv= ruleMultDiv EOF )
            // InternalDsl.g:1360:2: iv_ruleMultDiv= ruleMultDiv EOF
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
    // InternalDsl.g:1366:1: ruleMultDiv returns [EObject current=null] : (this_Primitive_0= rulePrimitive ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimitive ) ) )* ) ;
    public final EObject ruleMultDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Primitive_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1372:2: ( (this_Primitive_0= rulePrimitive ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimitive ) ) )* ) )
            // InternalDsl.g:1373:2: (this_Primitive_0= rulePrimitive ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimitive ) ) )* )
            {
            // InternalDsl.g:1373:2: (this_Primitive_0= rulePrimitive ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimitive ) ) )* )
            // InternalDsl.g:1374:3: this_Primitive_0= rulePrimitive ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimitive ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultDivAccess().getPrimitiveParserRuleCall_0());
            		
            pushFollow(FOLLOW_25);
            this_Primitive_0=rulePrimitive();

            state._fsp--;


            			current = this_Primitive_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalDsl.g:1382:3: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimitive ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==25||LA26_0==40) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalDsl.g:1383:4: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimitive ) )
            	    {
            	    // InternalDsl.g:1383:4: ()
            	    // InternalDsl.g:1384:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultDivAccess().getMultDivLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalDsl.g:1390:4: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // InternalDsl.g:1391:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // InternalDsl.g:1391:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // InternalDsl.g:1392:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // InternalDsl.g:1392:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==25) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==40) ) {
            	        alt25=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // InternalDsl.g:1393:7: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,25,FOLLOW_17); 

            	            							newLeafNode(lv_op_2_1, grammarAccess.getMultDivAccess().getOpAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultDivRule());
            	            							}
            	            							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalDsl.g:1404:7: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,40,FOLLOW_17); 

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

            	    // InternalDsl.g:1417:4: ( (lv_right_3_0= rulePrimitive ) )
            	    // InternalDsl.g:1418:5: (lv_right_3_0= rulePrimitive )
            	    {
            	    // InternalDsl.g:1418:5: (lv_right_3_0= rulePrimitive )
            	    // InternalDsl.g:1419:6: lv_right_3_0= rulePrimitive
            	    {

            	    						newCompositeNode(grammarAccess.getMultDivAccess().getRightPrimitiveParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_right_3_0=rulePrimitive();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultDivRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.ui23.Dsl.Primitive");
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
    // $ANTLR end "ruleMultDiv"


    // $ANTLR start "entryRulePrimitive"
    // InternalDsl.g:1441:1: entryRulePrimitive returns [EObject current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final EObject entryRulePrimitive() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitive = null;


        try {
            // InternalDsl.g:1441:50: (iv_rulePrimitive= rulePrimitive EOF )
            // InternalDsl.g:1442:2: iv_rulePrimitive= rulePrimitive EOF
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
    // InternalDsl.g:1448:1: rulePrimitive returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () otherlv_5= '!' ( (lv_exp_6_0= rulePrimitive ) ) ) | ( () otherlv_8= '#' ( (lv_exp_9_0= rulePrimitive ) ) ) | ( () ( (lv_type_11_0= ruleType ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) ) | ( () ( (otherlv_15= RULE_ID ) ) otherlv_16= '(' ( ( (lv_exps_17_0= ruleExp ) ) (otherlv_18= ',' ( (lv_exps_19_0= ruleExp ) ) )* )? otherlv_20= ')' ) | ( () otherlv_22= '(' ( (lv_exp_23_0= ruleExp ) ) otherlv_24= ')' ) ) ;
    public final EObject rulePrimitive() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        EObject lv_exp_6_0 = null;

        EObject lv_exp_9_0 = null;

        AntlrDatatypeRuleToken lv_type_11_0 = null;

        EObject lv_exps_17_0 = null;

        EObject lv_exps_19_0 = null;

        EObject lv_exp_23_0 = null;



        	enterRule();

        try {
            // InternalDsl.g:1454:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () otherlv_5= '!' ( (lv_exp_6_0= rulePrimitive ) ) ) | ( () otherlv_8= '#' ( (lv_exp_9_0= rulePrimitive ) ) ) | ( () ( (lv_type_11_0= ruleType ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) ) | ( () ( (otherlv_15= RULE_ID ) ) otherlv_16= '(' ( ( (lv_exps_17_0= ruleExp ) ) (otherlv_18= ',' ( (lv_exps_19_0= ruleExp ) ) )* )? otherlv_20= ')' ) | ( () otherlv_22= '(' ( (lv_exp_23_0= ruleExp ) ) otherlv_24= ')' ) ) )
            // InternalDsl.g:1455:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () otherlv_5= '!' ( (lv_exp_6_0= rulePrimitive ) ) ) | ( () otherlv_8= '#' ( (lv_exp_9_0= rulePrimitive ) ) ) | ( () ( (lv_type_11_0= ruleType ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) ) | ( () ( (otherlv_15= RULE_ID ) ) otherlv_16= '(' ( ( (lv_exps_17_0= ruleExp ) ) (otherlv_18= ',' ( (lv_exps_19_0= ruleExp ) ) )* )? otherlv_20= ')' ) | ( () otherlv_22= '(' ( (lv_exp_23_0= ruleExp ) ) otherlv_24= ')' ) )
            {
            // InternalDsl.g:1455:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () otherlv_5= '!' ( (lv_exp_6_0= rulePrimitive ) ) ) | ( () otherlv_8= '#' ( (lv_exp_9_0= rulePrimitive ) ) ) | ( () ( (lv_type_11_0= ruleType ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) ) | ( () ( (otherlv_15= RULE_ID ) ) otherlv_16= '(' ( ( (lv_exps_17_0= ruleExp ) ) (otherlv_18= ',' ( (lv_exps_19_0= ruleExp ) ) )* )? otherlv_20= ')' ) | ( () otherlv_22= '(' ( (lv_exp_23_0= ruleExp ) ) otherlv_24= ')' ) )
            int alt29=8;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // InternalDsl.g:1456:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalDsl.g:1456:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalDsl.g:1457:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalDsl.g:1457:4: ()
                    // InternalDsl.g:1458:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimitiveAccess().getIntConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalDsl.g:1464:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalDsl.g:1465:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalDsl.g:1465:5: (lv_value_1_0= RULE_INT )
                    // InternalDsl.g:1466:6: lv_value_1_0= RULE_INT
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
                    // InternalDsl.g:1484:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalDsl.g:1484:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalDsl.g:1485:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalDsl.g:1485:4: ()
                    // InternalDsl.g:1486:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimitiveAccess().getStringConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDsl.g:1492:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalDsl.g:1493:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalDsl.g:1493:5: (lv_value_3_0= RULE_STRING )
                    // InternalDsl.g:1494:6: lv_value_3_0= RULE_STRING
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
                    // InternalDsl.g:1512:3: ( () otherlv_5= '!' ( (lv_exp_6_0= rulePrimitive ) ) )
                    {
                    // InternalDsl.g:1512:3: ( () otherlv_5= '!' ( (lv_exp_6_0= rulePrimitive ) ) )
                    // InternalDsl.g:1513:4: () otherlv_5= '!' ( (lv_exp_6_0= rulePrimitive ) )
                    {
                    // InternalDsl.g:1513:4: ()
                    // InternalDsl.g:1514:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimitiveAccess().getNotAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,41,FOLLOW_17); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimitiveAccess().getExclamationMarkKeyword_2_1());
                    			
                    // InternalDsl.g:1524:4: ( (lv_exp_6_0= rulePrimitive ) )
                    // InternalDsl.g:1525:5: (lv_exp_6_0= rulePrimitive )
                    {
                    // InternalDsl.g:1525:5: (lv_exp_6_0= rulePrimitive )
                    // InternalDsl.g:1526:6: lv_exp_6_0= rulePrimitive
                    {

                    						newCompositeNode(grammarAccess.getPrimitiveAccess().getExpPrimitiveParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_exp_6_0=rulePrimitive();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimitiveRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_6_0,
                    							"org.xtext.ui23.Dsl.Primitive");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:1545:3: ( () otherlv_8= '#' ( (lv_exp_9_0= rulePrimitive ) ) )
                    {
                    // InternalDsl.g:1545:3: ( () otherlv_8= '#' ( (lv_exp_9_0= rulePrimitive ) ) )
                    // InternalDsl.g:1546:4: () otherlv_8= '#' ( (lv_exp_9_0= rulePrimitive ) )
                    {
                    // InternalDsl.g:1546:4: ()
                    // InternalDsl.g:1547:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimitiveAccess().getLengthAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_8=(Token)match(input,42,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getPrimitiveAccess().getNumberSignKeyword_3_1());
                    			
                    // InternalDsl.g:1557:4: ( (lv_exp_9_0= rulePrimitive ) )
                    // InternalDsl.g:1558:5: (lv_exp_9_0= rulePrimitive )
                    {
                    // InternalDsl.g:1558:5: (lv_exp_9_0= rulePrimitive )
                    // InternalDsl.g:1559:6: lv_exp_9_0= rulePrimitive
                    {

                    						newCompositeNode(grammarAccess.getPrimitiveAccess().getExpPrimitiveParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_exp_9_0=rulePrimitive();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimitiveRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_9_0,
                    							"org.xtext.ui23.Dsl.Primitive");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:1578:3: ( () ( (lv_type_11_0= ruleType ) ) )
                    {
                    // InternalDsl.g:1578:3: ( () ( (lv_type_11_0= ruleType ) ) )
                    // InternalDsl.g:1579:4: () ( (lv_type_11_0= ruleType ) )
                    {
                    // InternalDsl.g:1579:4: ()
                    // InternalDsl.g:1580:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimitiveAccess().getTypeConstantAction_4_0(),
                    						current);
                    				

                    }

                    // InternalDsl.g:1586:4: ( (lv_type_11_0= ruleType ) )
                    // InternalDsl.g:1587:5: (lv_type_11_0= ruleType )
                    {
                    // InternalDsl.g:1587:5: (lv_type_11_0= ruleType )
                    // InternalDsl.g:1588:6: lv_type_11_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getPrimitiveAccess().getTypeTypeParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_11_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimitiveRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_11_0,
                    							"org.xtext.ui23.Dsl.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:1607:3: ( () ( (otherlv_13= RULE_ID ) ) )
                    {
                    // InternalDsl.g:1607:3: ( () ( (otherlv_13= RULE_ID ) ) )
                    // InternalDsl.g:1608:4: () ( (otherlv_13= RULE_ID ) )
                    {
                    // InternalDsl.g:1608:4: ()
                    // InternalDsl.g:1609:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimitiveAccess().getVarRefAction_5_0(),
                    						current);
                    				

                    }

                    // InternalDsl.g:1615:4: ( (otherlv_13= RULE_ID ) )
                    // InternalDsl.g:1616:5: (otherlv_13= RULE_ID )
                    {
                    // InternalDsl.g:1616:5: (otherlv_13= RULE_ID )
                    // InternalDsl.g:1617:6: otherlv_13= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimitiveRule());
                    						}
                    					
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_13, grammarAccess.getPrimitiveAccess().getRefCrossRefCrossReference_5_1_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:1630:3: ( () ( (otherlv_15= RULE_ID ) ) otherlv_16= '(' ( ( (lv_exps_17_0= ruleExp ) ) (otherlv_18= ',' ( (lv_exps_19_0= ruleExp ) ) )* )? otherlv_20= ')' )
                    {
                    // InternalDsl.g:1630:3: ( () ( (otherlv_15= RULE_ID ) ) otherlv_16= '(' ( ( (lv_exps_17_0= ruleExp ) ) (otherlv_18= ',' ( (lv_exps_19_0= ruleExp ) ) )* )? otherlv_20= ')' )
                    // InternalDsl.g:1631:4: () ( (otherlv_15= RULE_ID ) ) otherlv_16= '(' ( ( (lv_exps_17_0= ruleExp ) ) (otherlv_18= ',' ( (lv_exps_19_0= ruleExp ) ) )* )? otherlv_20= ')'
                    {
                    // InternalDsl.g:1631:4: ()
                    // InternalDsl.g:1632:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimitiveAccess().getFuncCallAction_6_0(),
                    						current);
                    				

                    }

                    // InternalDsl.g:1638:4: ( (otherlv_15= RULE_ID ) )
                    // InternalDsl.g:1639:5: (otherlv_15= RULE_ID )
                    {
                    // InternalDsl.g:1639:5: (otherlv_15= RULE_ID )
                    // InternalDsl.g:1640:6: otherlv_15= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimitiveRule());
                    						}
                    					
                    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_15, grammarAccess.getPrimitiveAccess().getRefFunctionCrossReference_6_1_0());
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,13,FOLLOW_19); 

                    				newLeafNode(otherlv_16, grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_6_2());
                    			
                    // InternalDsl.g:1655:4: ( ( (lv_exps_17_0= ruleExp ) ) (otherlv_18= ',' ( (lv_exps_19_0= ruleExp ) ) )* )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_STRING)||LA28_0==13||(LA28_0>=26 && LA28_0<=28)||(LA28_0>=41 && LA28_0<=42)) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalDsl.g:1656:5: ( (lv_exps_17_0= ruleExp ) ) (otherlv_18= ',' ( (lv_exps_19_0= ruleExp ) ) )*
                            {
                            // InternalDsl.g:1656:5: ( (lv_exps_17_0= ruleExp ) )
                            // InternalDsl.g:1657:6: (lv_exps_17_0= ruleExp )
                            {
                            // InternalDsl.g:1657:6: (lv_exps_17_0= ruleExp )
                            // InternalDsl.g:1658:7: lv_exps_17_0= ruleExp
                            {

                            							newCompositeNode(grammarAccess.getPrimitiveAccess().getExpsExpParserRuleCall_6_3_0_0());
                            						
                            pushFollow(FOLLOW_8);
                            lv_exps_17_0=ruleExp();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPrimitiveRule());
                            							}
                            							add(
                            								current,
                            								"exps",
                            								lv_exps_17_0,
                            								"org.xtext.ui23.Dsl.Exp");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalDsl.g:1675:5: (otherlv_18= ',' ( (lv_exps_19_0= ruleExp ) ) )*
                            loop27:
                            do {
                                int alt27=2;
                                int LA27_0 = input.LA(1);

                                if ( (LA27_0==14) ) {
                                    alt27=1;
                                }


                                switch (alt27) {
                            	case 1 :
                            	    // InternalDsl.g:1676:6: otherlv_18= ',' ( (lv_exps_19_0= ruleExp ) )
                            	    {
                            	    otherlv_18=(Token)match(input,14,FOLLOW_17); 

                            	    						newLeafNode(otherlv_18, grammarAccess.getPrimitiveAccess().getCommaKeyword_6_3_1_0());
                            	    					
                            	    // InternalDsl.g:1680:6: ( (lv_exps_19_0= ruleExp ) )
                            	    // InternalDsl.g:1681:7: (lv_exps_19_0= ruleExp )
                            	    {
                            	    // InternalDsl.g:1681:7: (lv_exps_19_0= ruleExp )
                            	    // InternalDsl.g:1682:8: lv_exps_19_0= ruleExp
                            	    {

                            	    								newCompositeNode(grammarAccess.getPrimitiveAccess().getExpsExpParserRuleCall_6_3_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_8);
                            	    lv_exps_19_0=ruleExp();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getPrimitiveRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"exps",
                            	    									lv_exps_19_0,
                            	    									"org.xtext.ui23.Dsl.Exp");
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
                            break;

                    }

                    otherlv_20=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_20, grammarAccess.getPrimitiveAccess().getRightParenthesisKeyword_6_4());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalDsl.g:1707:3: ( () otherlv_22= '(' ( (lv_exp_23_0= ruleExp ) ) otherlv_24= ')' )
                    {
                    // InternalDsl.g:1707:3: ( () otherlv_22= '(' ( (lv_exp_23_0= ruleExp ) ) otherlv_24= ')' )
                    // InternalDsl.g:1708:4: () otherlv_22= '(' ( (lv_exp_23_0= ruleExp ) ) otherlv_24= ')'
                    {
                    // InternalDsl.g:1708:4: ()
                    // InternalDsl.g:1709:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimitiveAccess().getParenthesisAction_7_0(),
                    						current);
                    				

                    }

                    otherlv_22=(Token)match(input,13,FOLLOW_17); 

                    				newLeafNode(otherlv_22, grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_7_1());
                    			
                    // InternalDsl.g:1719:4: ( (lv_exp_23_0= ruleExp ) )
                    // InternalDsl.g:1720:5: (lv_exp_23_0= ruleExp )
                    {
                    // InternalDsl.g:1720:5: (lv_exp_23_0= ruleExp )
                    // InternalDsl.g:1721:6: lv_exp_23_0= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getPrimitiveAccess().getExpExpParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_exp_23_0=ruleExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimitiveRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_23_0,
                    							"org.xtext.ui23.Dsl.Exp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_24=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_24, grammarAccess.getPrimitiveAccess().getRightParenthesisKeyword_7_3());
                    			

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


    protected DFA29 dfa29 = new DFA29(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\6\uffff\1\10\3\uffff";
    static final String dfa_3s = "\1\4\5\uffff\1\4\3\uffff";
    static final String dfa_4s = "\1\52\5\uffff\1\50\3\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\10\1\6\1\7";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\6\1\1\1\2\6\uffff\1\7\14\uffff\3\5\14\uffff\1\3\1\4",
            "",
            "",
            "",
            "",
            "",
            "\1\10\10\uffff\1\11\2\10\3\uffff\7\10\3\uffff\14\10",
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

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1455:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () otherlv_5= '!' ( (lv_exp_6_0= rulePrimitive ) ) ) | ( () otherlv_8= '#' ( (lv_exp_9_0= rulePrimitive ) ) ) | ( () ( (lv_type_11_0= ruleType ) ) ) | ( () ( (otherlv_13= RULE_ID ) ) ) | ( () ( (otherlv_15= RULE_ID ) ) otherlv_16= '(' ( ( (lv_exps_17_0= ruleExp ) ) (otherlv_18= ',' ( (lv_exps_19_0= ruleExp ) ) )* )? otherlv_20= ')' ) | ( () otherlv_22= '(' ( (lv_exp_23_0= ruleExp ) ) otherlv_24= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000021002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000001C008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001F80010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000006001C002070L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000006001C00A070L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001E00000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000010002000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000008000L});

}