package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'external'", "'('", "','", "')'", "'entity'", "'attribute'", "'as'", "'require'", "'=='", "'string'", "'number'", "'relation'", "'is'", "'a'", "'many'", "'has'", "'have'"
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
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "System";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSystem"
    // InternalMyDsl.g:64:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalMyDsl.g:64:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalMyDsl.g:65:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalMyDsl.g:71:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternalDefinitions ) )* ( ( (lv_elements_3_1= ruleRelation | lv_elements_3_2= ruleEntity ) ) )+ ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_externals_2_0 = null;

        EObject lv_elements_3_1 = null;

        EObject lv_elements_3_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternalDefinitions ) )* ( ( (lv_elements_3_1= ruleRelation | lv_elements_3_2= ruleEntity ) ) )+ ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternalDefinitions ) )* ( ( (lv_elements_3_1= ruleRelation | lv_elements_3_2= ruleEntity ) ) )+ )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternalDefinitions ) )* ( ( (lv_elements_3_1= ruleRelation | lv_elements_3_2= ruleEntity ) ) )+ )
            // InternalMyDsl.g:79:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternalDefinitions ) )* ( ( (lv_elements_3_1= ruleRelation | lv_elements_3_2= ruleEntity ) ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
            		
            // InternalMyDsl.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:101:3: ( (lv_externals_2_0= ruleExternalDefinitions ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:102:4: (lv_externals_2_0= ruleExternalDefinitions )
            	    {
            	    // InternalMyDsl.g:102:4: (lv_externals_2_0= ruleExternalDefinitions )
            	    // InternalMyDsl.g:103:5: lv_externals_2_0= ruleExternalDefinitions
            	    {

            	    					newCompositeNode(grammarAccess.getSystemAccess().getExternalsExternalDefinitionsParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_externals_2_0=ruleExternalDefinitions();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"externals",
            	    						lv_externals_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.ExternalDefinitions");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyDsl.g:120:3: ( ( (lv_elements_3_1= ruleRelation | lv_elements_3_2= ruleEntity ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16||LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:121:4: ( (lv_elements_3_1= ruleRelation | lv_elements_3_2= ruleEntity ) )
            	    {
            	    // InternalMyDsl.g:121:4: ( (lv_elements_3_1= ruleRelation | lv_elements_3_2= ruleEntity ) )
            	    // InternalMyDsl.g:122:5: (lv_elements_3_1= ruleRelation | lv_elements_3_2= ruleEntity )
            	    {
            	    // InternalMyDsl.g:122:5: (lv_elements_3_1= ruleRelation | lv_elements_3_2= ruleEntity )
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==23) ) {
            	        alt2=1;
            	    }
            	    else if ( (LA2_0==16) ) {
            	        alt2=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // InternalMyDsl.g:123:6: lv_elements_3_1= ruleRelation
            	            {

            	            						newCompositeNode(grammarAccess.getSystemAccess().getElementsRelationParserRuleCall_3_0_0());
            	            					
            	            pushFollow(FOLLOW_5);
            	            lv_elements_3_1=ruleRelation();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getSystemRule());
            	            						}
            	            						add(
            	            							current,
            	            							"elements",
            	            							lv_elements_3_1,
            	            							"org.xtext.example.mydsl.MyDsl.Relation");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:139:6: lv_elements_3_2= ruleEntity
            	            {

            	            						newCompositeNode(grammarAccess.getSystemAccess().getElementsEntityParserRuleCall_3_0_1());
            	            					
            	            pushFollow(FOLLOW_5);
            	            lv_elements_3_2=ruleEntity();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getSystemRule());
            	            						}
            	            						add(
            	            							current,
            	            							"elements",
            	            							lv_elements_3_2,
            	            							"org.xtext.example.mydsl.MyDsl.Entity");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleExternalDefinitions"
    // InternalMyDsl.g:161:1: entryRuleExternalDefinitions returns [EObject current=null] : iv_ruleExternalDefinitions= ruleExternalDefinitions EOF ;
    public final EObject entryRuleExternalDefinitions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalDefinitions = null;


        try {
            // InternalMyDsl.g:161:60: (iv_ruleExternalDefinitions= ruleExternalDefinitions EOF )
            // InternalMyDsl.g:162:2: iv_ruleExternalDefinitions= ruleExternalDefinitions EOF
            {
             newCompositeNode(grammarAccess.getExternalDefinitionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalDefinitions=ruleExternalDefinitions();

            state._fsp--;

             current =iv_ruleExternalDefinitions; 
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
    // $ANTLR end "entryRuleExternalDefinitions"


    // $ANTLR start "ruleExternalDefinitions"
    // InternalMyDsl.g:168:1: ruleExternalDefinitions returns [EObject current=null] : (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_types_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleType ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleExternalDefinitions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_types_3_0 = null;

        AntlrDatatypeRuleToken lv_types_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:174:2: ( (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_types_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleType ) ) )* )? otherlv_6= ')' ) )
            // InternalMyDsl.g:175:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_types_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleType ) ) )* )? otherlv_6= ')' )
            {
            // InternalMyDsl.g:175:2: (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_types_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleType ) ) )* )? otherlv_6= ')' )
            // InternalMyDsl.g:176:3: otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_types_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleType ) ) )* )? otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalDefinitionsAccess().getExternalKeyword_0());
            		
            // InternalMyDsl.g:180:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:181:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:181:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:182:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExternalDefinitionsAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalDefinitionsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalDefinitionsAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyDsl.g:202:3: ( ( (lv_types_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleType ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=21 && LA5_0<=22)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:203:4: ( (lv_types_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleType ) ) )*
                    {
                    // InternalMyDsl.g:203:4: ( (lv_types_3_0= ruleType ) )
                    // InternalMyDsl.g:204:5: (lv_types_3_0= ruleType )
                    {
                    // InternalMyDsl.g:204:5: (lv_types_3_0= ruleType )
                    // InternalMyDsl.g:205:6: lv_types_3_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getExternalDefinitionsAccess().getTypesTypeParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_types_3_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalDefinitionsRule());
                    						}
                    						add(
                    							current,
                    							"types",
                    							lv_types_3_0,
                    							"org.xtext.example.mydsl.MyDsl.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:222:4: (otherlv_4= ',' ( (lv_types_5_0= ruleType ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==14) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:223:5: otherlv_4= ',' ( (lv_types_5_0= ruleType ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getExternalDefinitionsAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalMyDsl.g:227:5: ( (lv_types_5_0= ruleType ) )
                    	    // InternalMyDsl.g:228:6: (lv_types_5_0= ruleType )
                    	    {
                    	    // InternalMyDsl.g:228:6: (lv_types_5_0= ruleType )
                    	    // InternalMyDsl.g:229:7: lv_types_5_0= ruleType
                    	    {

                    	    							newCompositeNode(grammarAccess.getExternalDefinitionsAccess().getTypesTypeParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_types_5_0=ruleType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExternalDefinitionsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"types",
                    	    								lv_types_5_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Type");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getExternalDefinitionsAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleExternalDefinitions"


    // $ANTLR start "entryRuleEntity"
    // InternalMyDsl.g:256:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalMyDsl.g:256:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalMyDsl.g:257:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalMyDsl.g:263:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_elements_2_1= ruleAttribute | lv_elements_2_2= ruleRequire ) ) )* ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_elements_2_1 = null;

        EObject lv_elements_2_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:269:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_elements_2_1= ruleAttribute | lv_elements_2_2= ruleRequire ) ) )* ) )
            // InternalMyDsl.g:270:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_elements_2_1= ruleAttribute | lv_elements_2_2= ruleRequire ) ) )* )
            {
            // InternalMyDsl.g:270:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_elements_2_1= ruleAttribute | lv_elements_2_2= ruleRequire ) ) )* )
            // InternalMyDsl.g:271:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_elements_2_1= ruleAttribute | lv_elements_2_2= ruleRequire ) ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalMyDsl.g:275:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:276:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:276:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:277:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:293:3: ( ( (lv_elements_2_1= ruleAttribute | lv_elements_2_2= ruleRequire ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17||LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:294:4: ( (lv_elements_2_1= ruleAttribute | lv_elements_2_2= ruleRequire ) )
            	    {
            	    // InternalMyDsl.g:294:4: ( (lv_elements_2_1= ruleAttribute | lv_elements_2_2= ruleRequire ) )
            	    // InternalMyDsl.g:295:5: (lv_elements_2_1= ruleAttribute | lv_elements_2_2= ruleRequire )
            	    {
            	    // InternalMyDsl.g:295:5: (lv_elements_2_1= ruleAttribute | lv_elements_2_2= ruleRequire )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==17) ) {
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
            	            // InternalMyDsl.g:296:6: lv_elements_2_1= ruleAttribute
            	            {

            	            						newCompositeNode(grammarAccess.getEntityAccess().getElementsAttributeParserRuleCall_2_0_0());
            	            					
            	            pushFollow(FOLLOW_10);
            	            lv_elements_2_1=ruleAttribute();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getEntityRule());
            	            						}
            	            						add(
            	            							current,
            	            							"elements",
            	            							lv_elements_2_1,
            	            							"org.xtext.example.mydsl.MyDsl.Attribute");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:312:6: lv_elements_2_2= ruleRequire
            	            {

            	            						newCompositeNode(grammarAccess.getEntityAccess().getElementsRequireParserRuleCall_2_0_1());
            	            					
            	            pushFollow(FOLLOW_10);
            	            lv_elements_2_2=ruleRequire();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getEntityRule());
            	            						}
            	            						add(
            	            							current,
            	            							"elements",
            	            							lv_elements_2_2,
            	            							"org.xtext.example.mydsl.MyDsl.Require");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyDsl.g:334:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalMyDsl.g:334:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalMyDsl.g:335:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyDsl.g:341:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:347:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_type_3_0= ruleType ) ) ) )
            // InternalMyDsl.g:348:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_type_3_0= ruleType ) ) )
            {
            // InternalMyDsl.g:348:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_type_3_0= ruleType ) ) )
            // InternalMyDsl.g:349:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_type_3_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalMyDsl.g:353:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:354:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:354:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:355:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getAsKeyword_2());
            		
            // InternalMyDsl.g:375:3: ( (lv_type_3_0= ruleType ) )
            // InternalMyDsl.g:376:4: (lv_type_3_0= ruleType )
            {
            // InternalMyDsl.g:376:4: (lv_type_3_0= ruleType )
            // InternalMyDsl.g:377:5: lv_type_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"org.xtext.example.mydsl.MyDsl.Type");
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRequire"
    // InternalMyDsl.g:398:1: entryRuleRequire returns [EObject current=null] : iv_ruleRequire= ruleRequire EOF ;
    public final EObject entryRuleRequire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequire = null;


        try {
            // InternalMyDsl.g:398:48: (iv_ruleRequire= ruleRequire EOF )
            // InternalMyDsl.g:399:2: iv_ruleRequire= ruleRequire EOF
            {
             newCompositeNode(grammarAccess.getRequireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequire=ruleRequire();

            state._fsp--;

             current =iv_ruleRequire; 
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
    // $ANTLR end "entryRuleRequire"


    // $ANTLR start "ruleRequire"
    // InternalMyDsl.g:405:1: ruleRequire returns [EObject current=null] : (otherlv_0= 'require' ( ( (lv_require_1_1= ruleFunCall | lv_require_1_2= ruleVarExp ) ) ) ) ;
    public final EObject ruleRequire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_require_1_1 = null;

        EObject lv_require_1_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:411:2: ( (otherlv_0= 'require' ( ( (lv_require_1_1= ruleFunCall | lv_require_1_2= ruleVarExp ) ) ) ) )
            // InternalMyDsl.g:412:2: (otherlv_0= 'require' ( ( (lv_require_1_1= ruleFunCall | lv_require_1_2= ruleVarExp ) ) ) )
            {
            // InternalMyDsl.g:412:2: (otherlv_0= 'require' ( ( (lv_require_1_1= ruleFunCall | lv_require_1_2= ruleVarExp ) ) ) )
            // InternalMyDsl.g:413:3: otherlv_0= 'require' ( ( (lv_require_1_1= ruleFunCall | lv_require_1_2= ruleVarExp ) ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRequireAccess().getRequireKeyword_0());
            		
            // InternalMyDsl.g:417:3: ( ( (lv_require_1_1= ruleFunCall | lv_require_1_2= ruleVarExp ) ) )
            // InternalMyDsl.g:418:4: ( (lv_require_1_1= ruleFunCall | lv_require_1_2= ruleVarExp ) )
            {
            // InternalMyDsl.g:418:4: ( (lv_require_1_1= ruleFunCall | lv_require_1_2= ruleVarExp ) )
            // InternalMyDsl.g:419:5: (lv_require_1_1= ruleFunCall | lv_require_1_2= ruleVarExp )
            {
            // InternalMyDsl.g:419:5: (lv_require_1_1= ruleFunCall | lv_require_1_2= ruleVarExp )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==20) ) {
                    alt8=2;
                }
                else if ( (LA8_1==13) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:420:6: lv_require_1_1= ruleFunCall
                    {

                    						newCompositeNode(grammarAccess.getRequireAccess().getRequireFunCallParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_require_1_1=ruleFunCall();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequireRule());
                    						}
                    						set(
                    							current,
                    							"require",
                    							lv_require_1_1,
                    							"org.xtext.example.mydsl.MyDsl.FunCall");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:436:6: lv_require_1_2= ruleVarExp
                    {

                    						newCompositeNode(grammarAccess.getRequireAccess().getRequireVarExpParserRuleCall_1_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_require_1_2=ruleVarExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequireRule());
                    						}
                    						set(
                    							current,
                    							"require",
                    							lv_require_1_2,
                    							"org.xtext.example.mydsl.MyDsl.VarExp");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleRequire"


    // $ANTLR start "entryRuleVarExp"
    // InternalMyDsl.g:458:1: entryRuleVarExp returns [EObject current=null] : iv_ruleVarExp= ruleVarExp EOF ;
    public final EObject entryRuleVarExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarExp = null;


        try {
            // InternalMyDsl.g:458:47: (iv_ruleVarExp= ruleVarExp EOF )
            // InternalMyDsl.g:459:2: iv_ruleVarExp= ruleVarExp EOF
            {
             newCompositeNode(grammarAccess.getVarExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarExp=ruleVarExp();

            state._fsp--;

             current =iv_ruleVarExp; 
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
    // $ANTLR end "entryRuleVarExp"


    // $ANTLR start "ruleVarExp"
    // InternalMyDsl.g:465:1: ruleVarExp returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '==' ( (lv_exp_2_0= RULE_INT ) ) ) ;
    public final EObject ruleVarExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_exp_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:471:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '==' ( (lv_exp_2_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:472:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '==' ( (lv_exp_2_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:472:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '==' ( (lv_exp_2_0= RULE_INT ) ) )
            // InternalMyDsl.g:473:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '==' ( (lv_exp_2_0= RULE_INT ) )
            {
            // InternalMyDsl.g:473:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:474:4: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:474:4: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:475:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarExpRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_0, grammarAccess.getVarExpAccess().getVarRefAttributeCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getVarExpAccess().getEqualsSignEqualsSignKeyword_1());
            		
            // InternalMyDsl.g:490:3: ( (lv_exp_2_0= RULE_INT ) )
            // InternalMyDsl.g:491:4: (lv_exp_2_0= RULE_INT )
            {
            // InternalMyDsl.g:491:4: (lv_exp_2_0= RULE_INT )
            // InternalMyDsl.g:492:5: lv_exp_2_0= RULE_INT
            {
            lv_exp_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_exp_2_0, grammarAccess.getVarExpAccess().getExpINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarExpRule());
            					}
            					setWithLastConsumed(
            						current,
            						"exp",
            						lv_exp_2_0,
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
    // $ANTLR end "ruleVarExp"


    // $ANTLR start "entryRuleFunCall"
    // InternalMyDsl.g:512:1: entryRuleFunCall returns [EObject current=null] : iv_ruleFunCall= ruleFunCall EOF ;
    public final EObject entryRuleFunCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunCall = null;


        try {
            // InternalMyDsl.g:512:48: (iv_ruleFunCall= ruleFunCall EOF )
            // InternalMyDsl.g:513:2: iv_ruleFunCall= ruleFunCall EOF
            {
             newCompositeNode(grammarAccess.getFunCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunCall=ruleFunCall();

            state._fsp--;

             current =iv_ruleFunCall; 
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
    // $ANTLR end "entryRuleFunCall"


    // $ANTLR start "ruleFunCall"
    // InternalMyDsl.g:519:1: ruleFunCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleFunCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:525:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? otherlv_5= ')' ) )
            // InternalMyDsl.g:526:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? otherlv_5= ')' )
            {
            // InternalMyDsl.g:526:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? otherlv_5= ')' )
            // InternalMyDsl.g:527:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? otherlv_5= ')'
            {
            // InternalMyDsl.g:527:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:528:4: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:528:4: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:529:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunCallRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_0, grammarAccess.getFunCallAccess().getFunctionExternalDefinitionsCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getFunCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:544:3: ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:545:4: ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
                    {
                    // InternalMyDsl.g:545:4: ( (otherlv_2= RULE_ID ) )
                    // InternalMyDsl.g:546:5: (otherlv_2= RULE_ID )
                    {
                    // InternalMyDsl.g:546:5: (otherlv_2= RULE_ID )
                    // InternalMyDsl.g:547:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFunCallRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(otherlv_2, grammarAccess.getFunCallAccess().getVariablesAttributeCrossReference_2_0_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:558:4: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalMyDsl.g:559:5: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getFunCallAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalMyDsl.g:563:5: ( (otherlv_4= RULE_ID ) )
                    	    // InternalMyDsl.g:564:6: (otherlv_4= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:564:6: (otherlv_4= RULE_ID )
                    	    // InternalMyDsl.g:565:7: otherlv_4= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFunCallRule());
                    	    							}
                    	    						
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_8); 

                    	    							newLeafNode(otherlv_4, grammarAccess.getFunCallAccess().getVariablesAttributeCrossReference_2_1_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFunCallAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleFunCall"


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:586:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalMyDsl.g:586:44: (iv_ruleType= ruleType EOF )
            // InternalMyDsl.g:587:2: iv_ruleType= ruleType EOF
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
    // InternalMyDsl.g:593:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'string' | kw= 'number' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:599:2: ( (kw= 'string' | kw= 'number' ) )
            // InternalMyDsl.g:600:2: (kw= 'string' | kw= 'number' )
            {
            // InternalMyDsl.g:600:2: (kw= 'string' | kw= 'number' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            else if ( (LA11_0==22) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:601:3: kw= 'string'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getStringKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:607:3: kw= 'number'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getNumberKeyword_1());
                    		

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


    // $ANTLR start "entryRuleRelation"
    // InternalMyDsl.g:616:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalMyDsl.g:616:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalMyDsl.g:617:2: iv_ruleRelation= ruleRelation EOF
            {
             newCompositeNode(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelation=ruleRelation();

            state._fsp--;

             current =iv_ruleRelation; 
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
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalMyDsl.g:623:1: ruleRelation returns [EObject current=null] : ( ( () otherlv_1= 'relation' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'is' ( (otherlv_4= RULE_ID ) ) ) | ( () otherlv_6= 'relation' (otherlv_7= 'a' | ( (lv_manyFrom_8_0= 'many' ) ) )? ( (otherlv_9= RULE_ID ) ) (otherlv_10= 'has' | otherlv_11= 'have' ) (otherlv_12= 'a' | ( (lv_manyTo_13_0= 'many' ) ) )? ( (otherlv_14= RULE_ID ) ) ) ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_manyFrom_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_manyTo_13_0=null;
        Token otherlv_14=null;


        	enterRule();

        try {
            // InternalMyDsl.g:629:2: ( ( ( () otherlv_1= 'relation' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'is' ( (otherlv_4= RULE_ID ) ) ) | ( () otherlv_6= 'relation' (otherlv_7= 'a' | ( (lv_manyFrom_8_0= 'many' ) ) )? ( (otherlv_9= RULE_ID ) ) (otherlv_10= 'has' | otherlv_11= 'have' ) (otherlv_12= 'a' | ( (lv_manyTo_13_0= 'many' ) ) )? ( (otherlv_14= RULE_ID ) ) ) ) )
            // InternalMyDsl.g:630:2: ( ( () otherlv_1= 'relation' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'is' ( (otherlv_4= RULE_ID ) ) ) | ( () otherlv_6= 'relation' (otherlv_7= 'a' | ( (lv_manyFrom_8_0= 'many' ) ) )? ( (otherlv_9= RULE_ID ) ) (otherlv_10= 'has' | otherlv_11= 'have' ) (otherlv_12= 'a' | ( (lv_manyTo_13_0= 'many' ) ) )? ( (otherlv_14= RULE_ID ) ) ) )
            {
            // InternalMyDsl.g:630:2: ( ( () otherlv_1= 'relation' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'is' ( (otherlv_4= RULE_ID ) ) ) | ( () otherlv_6= 'relation' (otherlv_7= 'a' | ( (lv_manyFrom_8_0= 'many' ) ) )? ( (otherlv_9= RULE_ID ) ) (otherlv_10= 'has' | otherlv_11= 'have' ) (otherlv_12= 'a' | ( (lv_manyTo_13_0= 'many' ) ) )? ( (otherlv_14= RULE_ID ) ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                int LA15_1 = input.LA(2);

                if ( ((LA15_1>=25 && LA15_1<=26)) ) {
                    alt15=2;
                }
                else if ( (LA15_1==RULE_ID) ) {
                    int LA15_3 = input.LA(3);

                    if ( ((LA15_3>=27 && LA15_3<=28)) ) {
                        alt15=2;
                    }
                    else if ( (LA15_3==24) ) {
                        alt15=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:631:3: ( () otherlv_1= 'relation' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'is' ( (otherlv_4= RULE_ID ) ) )
                    {
                    // InternalMyDsl.g:631:3: ( () otherlv_1= 'relation' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'is' ( (otherlv_4= RULE_ID ) ) )
                    // InternalMyDsl.g:632:4: () otherlv_1= 'relation' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'is' ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalMyDsl.g:632:4: ()
                    // InternalMyDsl.g:633:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationAccess().getInheritanceAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getRelationAccess().getRelationKeyword_0_1());
                    			
                    // InternalMyDsl.g:643:4: ( (otherlv_2= RULE_ID ) )
                    // InternalMyDsl.g:644:5: (otherlv_2= RULE_ID )
                    {
                    // InternalMyDsl.g:644:5: (otherlv_2= RULE_ID )
                    // InternalMyDsl.g:645:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_15); 

                    						newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getBaseEntityEntityCrossReference_0_2_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getIsKeyword_0_3());
                    			
                    // InternalMyDsl.g:660:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMyDsl.g:661:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMyDsl.g:661:5: (otherlv_4= RULE_ID )
                    // InternalMyDsl.g:662:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_4, grammarAccess.getRelationAccess().getSuperEntityEntityCrossReference_0_4_0());
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:675:3: ( () otherlv_6= 'relation' (otherlv_7= 'a' | ( (lv_manyFrom_8_0= 'many' ) ) )? ( (otherlv_9= RULE_ID ) ) (otherlv_10= 'has' | otherlv_11= 'have' ) (otherlv_12= 'a' | ( (lv_manyTo_13_0= 'many' ) ) )? ( (otherlv_14= RULE_ID ) ) )
                    {
                    // InternalMyDsl.g:675:3: ( () otherlv_6= 'relation' (otherlv_7= 'a' | ( (lv_manyFrom_8_0= 'many' ) ) )? ( (otherlv_9= RULE_ID ) ) (otherlv_10= 'has' | otherlv_11= 'have' ) (otherlv_12= 'a' | ( (lv_manyTo_13_0= 'many' ) ) )? ( (otherlv_14= RULE_ID ) ) )
                    // InternalMyDsl.g:676:4: () otherlv_6= 'relation' (otherlv_7= 'a' | ( (lv_manyFrom_8_0= 'many' ) ) )? ( (otherlv_9= RULE_ID ) ) (otherlv_10= 'has' | otherlv_11= 'have' ) (otherlv_12= 'a' | ( (lv_manyTo_13_0= 'many' ) ) )? ( (otherlv_14= RULE_ID ) )
                    {
                    // InternalMyDsl.g:676:4: ()
                    // InternalMyDsl.g:677:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationAccess().getAssociationAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,23,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getRelationAccess().getRelationKeyword_1_1());
                    			
                    // InternalMyDsl.g:687:4: (otherlv_7= 'a' | ( (lv_manyFrom_8_0= 'many' ) ) )?
                    int alt12=3;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==25) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==26) ) {
                        alt12=2;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalMyDsl.g:688:5: otherlv_7= 'a'
                            {
                            otherlv_7=(Token)match(input,25,FOLLOW_3); 

                            					newLeafNode(otherlv_7, grammarAccess.getRelationAccess().getAKeyword_1_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:693:5: ( (lv_manyFrom_8_0= 'many' ) )
                            {
                            // InternalMyDsl.g:693:5: ( (lv_manyFrom_8_0= 'many' ) )
                            // InternalMyDsl.g:694:6: (lv_manyFrom_8_0= 'many' )
                            {
                            // InternalMyDsl.g:694:6: (lv_manyFrom_8_0= 'many' )
                            // InternalMyDsl.g:695:7: lv_manyFrom_8_0= 'many'
                            {
                            lv_manyFrom_8_0=(Token)match(input,26,FOLLOW_3); 

                            							newLeafNode(lv_manyFrom_8_0, grammarAccess.getRelationAccess().getManyFromManyKeyword_1_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRelationRule());
                            							}
                            							setWithLastConsumed(current, "manyFrom", lv_manyFrom_8_0 != null, "many");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalMyDsl.g:708:4: ( (otherlv_9= RULE_ID ) )
                    // InternalMyDsl.g:709:5: (otherlv_9= RULE_ID )
                    {
                    // InternalMyDsl.g:709:5: (otherlv_9= RULE_ID )
                    // InternalMyDsl.g:710:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(otherlv_9, grammarAccess.getRelationAccess().getFromEntityCrossReference_1_3_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:721:4: (otherlv_10= 'has' | otherlv_11= 'have' )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==27) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==28) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalMyDsl.g:722:5: otherlv_10= 'has'
                            {
                            otherlv_10=(Token)match(input,27,FOLLOW_16); 

                            					newLeafNode(otherlv_10, grammarAccess.getRelationAccess().getHasKeyword_1_4_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:727:5: otherlv_11= 'have'
                            {
                            otherlv_11=(Token)match(input,28,FOLLOW_16); 

                            					newLeafNode(otherlv_11, grammarAccess.getRelationAccess().getHaveKeyword_1_4_1());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:732:4: (otherlv_12= 'a' | ( (lv_manyTo_13_0= 'many' ) ) )?
                    int alt14=3;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==25) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==26) ) {
                        alt14=2;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalMyDsl.g:733:5: otherlv_12= 'a'
                            {
                            otherlv_12=(Token)match(input,25,FOLLOW_3); 

                            					newLeafNode(otherlv_12, grammarAccess.getRelationAccess().getAKeyword_1_5_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:738:5: ( (lv_manyTo_13_0= 'many' ) )
                            {
                            // InternalMyDsl.g:738:5: ( (lv_manyTo_13_0= 'many' ) )
                            // InternalMyDsl.g:739:6: (lv_manyTo_13_0= 'many' )
                            {
                            // InternalMyDsl.g:739:6: (lv_manyTo_13_0= 'many' )
                            // InternalMyDsl.g:740:7: lv_manyTo_13_0= 'many'
                            {
                            lv_manyTo_13_0=(Token)match(input,26,FOLLOW_3); 

                            							newLeafNode(lv_manyTo_13_0, grammarAccess.getRelationAccess().getManyToManyKeyword_1_5_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getRelationRule());
                            							}
                            							setWithLastConsumed(current, "manyTo", lv_manyTo_13_0 != null, "many");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalMyDsl.g:753:4: ( (otherlv_14= RULE_ID ) )
                    // InternalMyDsl.g:754:5: (otherlv_14= RULE_ID )
                    {
                    // InternalMyDsl.g:754:5: (otherlv_14= RULE_ID )
                    // InternalMyDsl.g:755:6: otherlv_14= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationRule());
                    						}
                    					
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_14, grammarAccess.getRelationAccess().getToEntityCrossReference_1_6_0());
                    					

                    }


                    }


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
    // $ANTLR end "ruleRelation"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000811000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000811002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000608000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000A0002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000006000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000018000000L});

}