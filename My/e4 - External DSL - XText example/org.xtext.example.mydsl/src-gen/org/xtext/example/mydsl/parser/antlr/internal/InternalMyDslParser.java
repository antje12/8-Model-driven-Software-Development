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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'external'", "'('", "','", "')'", "'entity'", "'attribute'", "'as'", "'require'", "'=='", "'>'", "'>='", "'+'", "'-'", "'*'", "'string'", "'number'", "'relation'", "'is'", "'a'", "'many'", "'has'", "'have'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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
        	return "EntitySystem";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEntitySystem"
    // InternalMyDsl.g:64:1: entryRuleEntitySystem returns [EObject current=null] : iv_ruleEntitySystem= ruleEntitySystem EOF ;
    public final EObject entryRuleEntitySystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntitySystem = null;


        try {
            // InternalMyDsl.g:64:53: (iv_ruleEntitySystem= ruleEntitySystem EOF )
            // InternalMyDsl.g:65:2: iv_ruleEntitySystem= ruleEntitySystem EOF
            {
             newCompositeNode(grammarAccess.getEntitySystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntitySystem=ruleEntitySystem();

            state._fsp--;

             current =iv_ruleEntitySystem; 
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
    // $ANTLR end "entryRuleEntitySystem"


    // $ANTLR start "ruleEntitySystem"
    // InternalMyDsl.g:71:1: ruleEntitySystem returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternalDefinition ) )* ( ( (lv_elements_3_1= ruleRelation | lv_elements_3_2= ruleEntity ) ) )+ ) ;
    public final EObject ruleEntitySystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_externals_2_0 = null;

        EObject lv_elements_3_1 = null;

        EObject lv_elements_3_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternalDefinition ) )* ( ( (lv_elements_3_1= ruleRelation | lv_elements_3_2= ruleEntity ) ) )+ ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternalDefinition ) )* ( ( (lv_elements_3_1= ruleRelation | lv_elements_3_2= ruleEntity ) ) )+ )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternalDefinition ) )* ( ( (lv_elements_3_1= ruleRelation | lv_elements_3_2= ruleEntity ) ) )+ )
            // InternalMyDsl.g:79:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_externals_2_0= ruleExternalDefinition ) )* ( ( (lv_elements_3_1= ruleRelation | lv_elements_3_2= ruleEntity ) ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntitySystemAccess().getSystemKeyword_0());
            		
            // InternalMyDsl.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntitySystemAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntitySystemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:101:3: ( (lv_externals_2_0= ruleExternalDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:102:4: (lv_externals_2_0= ruleExternalDefinition )
            	    {
            	    // InternalMyDsl.g:102:4: (lv_externals_2_0= ruleExternalDefinition )
            	    // InternalMyDsl.g:103:5: lv_externals_2_0= ruleExternalDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getEntitySystemAccess().getExternalsExternalDefinitionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_externals_2_0=ruleExternalDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntitySystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"externals",
            	    						lv_externals_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.ExternalDefinition");
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

                if ( (LA3_0==16||LA3_0==28) ) {
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

            	    if ( (LA2_0==28) ) {
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

            	            						newCompositeNode(grammarAccess.getEntitySystemAccess().getElementsRelationParserRuleCall_3_0_0());
            	            					
            	            pushFollow(FOLLOW_5);
            	            lv_elements_3_1=ruleRelation();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getEntitySystemRule());
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

            	            						newCompositeNode(grammarAccess.getEntitySystemAccess().getElementsEntityParserRuleCall_3_0_1());
            	            					
            	            pushFollow(FOLLOW_5);
            	            lv_elements_3_2=ruleEntity();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getEntitySystemRule());
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
    // $ANTLR end "ruleEntitySystem"


    // $ANTLR start "entryRuleExternalDefinition"
    // InternalMyDsl.g:161:1: entryRuleExternalDefinition returns [EObject current=null] : iv_ruleExternalDefinition= ruleExternalDefinition EOF ;
    public final EObject entryRuleExternalDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalDefinition = null;


        try {
            // InternalMyDsl.g:161:59: (iv_ruleExternalDefinition= ruleExternalDefinition EOF )
            // InternalMyDsl.g:162:2: iv_ruleExternalDefinition= ruleExternalDefinition EOF
            {
             newCompositeNode(grammarAccess.getExternalDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalDefinition=ruleExternalDefinition();

            state._fsp--;

             current =iv_ruleExternalDefinition; 
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
    // $ANTLR end "entryRuleExternalDefinition"


    // $ANTLR start "ruleExternalDefinition"
    // InternalMyDsl.g:168:1: ruleExternalDefinition returns [EObject current=null] : (otherlv_0= 'external' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_types_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleType ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleExternalDefinition() throws RecognitionException {
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

            			newLeafNode(otherlv_0, grammarAccess.getExternalDefinitionAccess().getExternalKeyword_0());
            		
            // InternalMyDsl.g:180:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:181:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:181:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:182:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExternalDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalDefinitionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMyDsl.g:202:3: ( ( (lv_types_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleType ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=26 && LA5_0<=27)) ) {
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

                    						newCompositeNode(grammarAccess.getExternalDefinitionAccess().getTypesTypeParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_types_3_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalDefinitionRule());
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

                    	    					newLeafNode(otherlv_4, grammarAccess.getExternalDefinitionAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalMyDsl.g:227:5: ( (lv_types_5_0= ruleType ) )
                    	    // InternalMyDsl.g:228:6: (lv_types_5_0= ruleType )
                    	    {
                    	    // InternalMyDsl.g:228:6: (lv_types_5_0= ruleType )
                    	    // InternalMyDsl.g:229:7: lv_types_5_0= ruleType
                    	    {

                    	    							newCompositeNode(grammarAccess.getExternalDefinitionAccess().getTypesTypeParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_types_5_0=ruleType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExternalDefinitionRule());
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

            			newLeafNode(otherlv_6, grammarAccess.getExternalDefinitionAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleExternalDefinition"


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
    // InternalMyDsl.g:405:1: ruleRequire returns [EObject current=null] : (otherlv_0= 'require' ( ( (lv_require_1_1= ruleFunctionCall | lv_require_1_2= ruleVarExp ) ) ) ) ;
    public final EObject ruleRequire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_require_1_1 = null;

        EObject lv_require_1_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:411:2: ( (otherlv_0= 'require' ( ( (lv_require_1_1= ruleFunctionCall | lv_require_1_2= ruleVarExp ) ) ) ) )
            // InternalMyDsl.g:412:2: (otherlv_0= 'require' ( ( (lv_require_1_1= ruleFunctionCall | lv_require_1_2= ruleVarExp ) ) ) )
            {
            // InternalMyDsl.g:412:2: (otherlv_0= 'require' ( ( (lv_require_1_1= ruleFunctionCall | lv_require_1_2= ruleVarExp ) ) ) )
            // InternalMyDsl.g:413:3: otherlv_0= 'require' ( ( (lv_require_1_1= ruleFunctionCall | lv_require_1_2= ruleVarExp ) ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRequireAccess().getRequireKeyword_0());
            		
            // InternalMyDsl.g:417:3: ( ( (lv_require_1_1= ruleFunctionCall | lv_require_1_2= ruleVarExp ) ) )
            // InternalMyDsl.g:418:4: ( (lv_require_1_1= ruleFunctionCall | lv_require_1_2= ruleVarExp ) )
            {
            // InternalMyDsl.g:418:4: ( (lv_require_1_1= ruleFunctionCall | lv_require_1_2= ruleVarExp ) )
            // InternalMyDsl.g:419:5: (lv_require_1_1= ruleFunctionCall | lv_require_1_2= ruleVarExp )
            {
            // InternalMyDsl.g:419:5: (lv_require_1_1= ruleFunctionCall | lv_require_1_2= ruleVarExp )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( ((LA8_1>=20 && LA8_1<=22)) ) {
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
                    // InternalMyDsl.g:420:6: lv_require_1_1= ruleFunctionCall
                    {

                    						newCompositeNode(grammarAccess.getRequireAccess().getRequireFunctionCallParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_require_1_1=ruleFunctionCall();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequireRule());
                    						}
                    						set(
                    							current,
                    							"require",
                    							lv_require_1_1,
                    							"org.xtext.example.mydsl.MyDsl.FunctionCall");
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


    // $ANTLR start "entryRuleFunctionCall"
    // InternalMyDsl.g:458:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // InternalMyDsl.g:458:53: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // InternalMyDsl.g:459:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
             newCompositeNode(grammarAccess.getFunctionCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;

             current =iv_ruleFunctionCall; 
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
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // InternalMyDsl.g:465:1: ruleFunctionCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:471:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? otherlv_5= ')' ) )
            // InternalMyDsl.g:472:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? otherlv_5= ')' )
            {
            // InternalMyDsl.g:472:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? otherlv_5= ')' )
            // InternalMyDsl.g:473:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '(' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? otherlv_5= ')'
            {
            // InternalMyDsl.g:473:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:474:4: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:474:4: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:475:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionCallRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_0, grammarAccess.getFunctionCallAccess().getFunctionExternalDefinitionCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:490:3: ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:491:4: ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
                    {
                    // InternalMyDsl.g:491:4: ( (otherlv_2= RULE_ID ) )
                    // InternalMyDsl.g:492:5: (otherlv_2= RULE_ID )
                    {
                    // InternalMyDsl.g:492:5: (otherlv_2= RULE_ID )
                    // InternalMyDsl.g:493:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFunctionCallRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getVariablesAttributeCrossReference_2_0_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:504:4: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalMyDsl.g:505:5: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getFunctionCallAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalMyDsl.g:509:5: ( (otherlv_4= RULE_ID ) )
                    	    // InternalMyDsl.g:510:6: (otherlv_4= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:510:6: (otherlv_4= RULE_ID )
                    	    // InternalMyDsl.g:511:7: otherlv_4= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFunctionCallRule());
                    	    							}
                    	    						
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_8); 

                    	    							newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getVariablesAttributeCrossReference_2_1_1_0());
                    	    						

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

            			newLeafNode(otherlv_5, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRuleVarExp"
    // InternalMyDsl.g:532:1: entryRuleVarExp returns [EObject current=null] : iv_ruleVarExp= ruleVarExp EOF ;
    public final EObject entryRuleVarExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarExp = null;


        try {
            // InternalMyDsl.g:532:47: (iv_ruleVarExp= ruleVarExp EOF )
            // InternalMyDsl.g:533:2: iv_ruleVarExp= ruleVarExp EOF
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
    // InternalMyDsl.g:539:1: ruleVarExp returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_op_1_1= '==' | lv_op_1_2= '>' | lv_op_1_3= '>=' ) ) ) ( (lv_exp_2_0= ruleExp ) ) ) ;
    public final EObject ruleVarExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_op_1_1=null;
        Token lv_op_1_2=null;
        Token lv_op_1_3=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:545:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_op_1_1= '==' | lv_op_1_2= '>' | lv_op_1_3= '>=' ) ) ) ( (lv_exp_2_0= ruleExp ) ) ) )
            // InternalMyDsl.g:546:2: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_op_1_1= '==' | lv_op_1_2= '>' | lv_op_1_3= '>=' ) ) ) ( (lv_exp_2_0= ruleExp ) ) )
            {
            // InternalMyDsl.g:546:2: ( ( (otherlv_0= RULE_ID ) ) ( ( (lv_op_1_1= '==' | lv_op_1_2= '>' | lv_op_1_3= '>=' ) ) ) ( (lv_exp_2_0= ruleExp ) ) )
            // InternalMyDsl.g:547:3: ( (otherlv_0= RULE_ID ) ) ( ( (lv_op_1_1= '==' | lv_op_1_2= '>' | lv_op_1_3= '>=' ) ) ) ( (lv_exp_2_0= ruleExp ) )
            {
            // InternalMyDsl.g:547:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:548:4: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:548:4: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:549:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarExpRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_0, grammarAccess.getVarExpAccess().getVarRefAttributeCrossReference_0_0());
            				

            }


            }

            // InternalMyDsl.g:560:3: ( ( (lv_op_1_1= '==' | lv_op_1_2= '>' | lv_op_1_3= '>=' ) ) )
            // InternalMyDsl.g:561:4: ( (lv_op_1_1= '==' | lv_op_1_2= '>' | lv_op_1_3= '>=' ) )
            {
            // InternalMyDsl.g:561:4: ( (lv_op_1_1= '==' | lv_op_1_2= '>' | lv_op_1_3= '>=' ) )
            // InternalMyDsl.g:562:5: (lv_op_1_1= '==' | lv_op_1_2= '>' | lv_op_1_3= '>=' )
            {
            // InternalMyDsl.g:562:5: (lv_op_1_1= '==' | lv_op_1_2= '>' | lv_op_1_3= '>=' )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt11=1;
                }
                break;
            case 21:
                {
                alt11=2;
                }
                break;
            case 22:
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
                    // InternalMyDsl.g:563:6: lv_op_1_1= '=='
                    {
                    lv_op_1_1=(Token)match(input,20,FOLLOW_14); 

                    						newLeafNode(lv_op_1_1, grammarAccess.getVarExpAccess().getOpEqualsSignEqualsSignKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVarExpRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:574:6: lv_op_1_2= '>'
                    {
                    lv_op_1_2=(Token)match(input,21,FOLLOW_14); 

                    						newLeafNode(lv_op_1_2, grammarAccess.getVarExpAccess().getOpGreaterThanSignKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVarExpRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:585:6: lv_op_1_3= '>='
                    {
                    lv_op_1_3=(Token)match(input,22,FOLLOW_14); 

                    						newLeafNode(lv_op_1_3, grammarAccess.getVarExpAccess().getOpGreaterThanSignEqualsSignKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVarExpRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_1_3, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalMyDsl.g:598:3: ( (lv_exp_2_0= ruleExp ) )
            // InternalMyDsl.g:599:4: (lv_exp_2_0= ruleExp )
            {
            // InternalMyDsl.g:599:4: (lv_exp_2_0= ruleExp )
            // InternalMyDsl.g:600:5: lv_exp_2_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getVarExpAccess().getExpExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_2_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarExpRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"org.xtext.example.mydsl.MyDsl.Exp");
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
    // $ANTLR end "ruleVarExp"


    // $ANTLR start "entryRuleExp"
    // InternalMyDsl.g:621:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalMyDsl.g:621:44: (iv_ruleExp= ruleExp EOF )
            // InternalMyDsl.g:622:2: iv_ruleExp= ruleExp EOF
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
    // InternalMyDsl.g:628:1: ruleExp returns [EObject current=null] : this_PlusOrMinus_0= rulePlusOrMinus ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        EObject this_PlusOrMinus_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:634:2: (this_PlusOrMinus_0= rulePlusOrMinus )
            // InternalMyDsl.g:635:2: this_PlusOrMinus_0= rulePlusOrMinus
            {

            		newCompositeNode(grammarAccess.getExpAccess().getPlusOrMinusParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;


            		current = this_PlusOrMinus_0;
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


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalMyDsl.g:646:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalMyDsl.g:646:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalMyDsl.g:647:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
             newCompositeNode(grammarAccess.getPlusOrMinusRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlusOrMinus=rulePlusOrMinus();

            state._fsp--;

             current =iv_rulePlusOrMinus; 
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
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalMyDsl.g:653:1: rulePlusOrMinus returns [EObject current=null] : (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Term_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:659:2: ( (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* ) )
            // InternalMyDsl.g:660:2: (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* )
            {
            // InternalMyDsl.g:660:2: (this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )* )
            // InternalMyDsl.g:661:3: this_Term_0= ruleTerm ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getTermParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_Term_0=ruleTerm();

            state._fsp--;


            			current = this_Term_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:669:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=23 && LA13_0<=24)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:670:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleTerm ) )
            	    {
            	    // InternalMyDsl.g:670:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==23) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==24) ) {
            	        alt12=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // InternalMyDsl.g:671:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalMyDsl.g:671:5: ( () otherlv_2= '+' )
            	            // InternalMyDsl.g:672:6: () otherlv_2= '+'
            	            {
            	            // InternalMyDsl.g:672:6: ()
            	            // InternalMyDsl.g:673:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,23,FOLLOW_14); 

            	            						newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:685:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalMyDsl.g:685:5: ( () otherlv_4= '-' )
            	            // InternalMyDsl.g:686:6: () otherlv_4= '-'
            	            {
            	            // InternalMyDsl.g:686:6: ()
            	            // InternalMyDsl.g:687:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,24,FOLLOW_14); 

            	            						newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:699:4: ( (lv_right_5_0= ruleTerm ) )
            	    // InternalMyDsl.g:700:5: (lv_right_5_0= ruleTerm )
            	    {
            	    // InternalMyDsl.g:700:5: (lv_right_5_0= ruleTerm )
            	    // InternalMyDsl.g:701:6: lv_right_5_0= ruleTerm
            	    {

            	    						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightTermParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_right_5_0=ruleTerm();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"org.xtext.example.mydsl.MyDsl.Term");
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
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleTerm"
    // InternalMyDsl.g:723:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalMyDsl.g:723:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalMyDsl.g:724:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalMyDsl.g:730:1: ruleTerm returns [EObject current=null] : (this_Factor_0= ruleFactor ( () otherlv_2= '*' ( (lv_right_3_0= ruleFactor ) ) )* ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Factor_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:736:2: ( (this_Factor_0= ruleFactor ( () otherlv_2= '*' ( (lv_right_3_0= ruleFactor ) ) )* ) )
            // InternalMyDsl.g:737:2: (this_Factor_0= ruleFactor ( () otherlv_2= '*' ( (lv_right_3_0= ruleFactor ) ) )* )
            {
            // InternalMyDsl.g:737:2: (this_Factor_0= ruleFactor ( () otherlv_2= '*' ( (lv_right_3_0= ruleFactor ) ) )* )
            // InternalMyDsl.g:738:3: this_Factor_0= ruleFactor ( () otherlv_2= '*' ( (lv_right_3_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getTermAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:746:3: ( () otherlv_2= '*' ( (lv_right_3_0= ruleFactor ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:747:4: () otherlv_2= '*' ( (lv_right_3_0= ruleFactor ) )
            	    {
            	    // InternalMyDsl.g:747:4: ()
            	    // InternalMyDsl.g:748:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getTermAccess().getMultLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,25,FOLLOW_14); 

            	    				newLeafNode(otherlv_2, grammarAccess.getTermAccess().getAsteriskKeyword_1_1());
            	    			
            	    // InternalMyDsl.g:758:4: ( (lv_right_3_0= ruleFactor ) )
            	    // InternalMyDsl.g:759:5: (lv_right_3_0= ruleFactor )
            	    {
            	    // InternalMyDsl.g:759:5: (lv_right_3_0= ruleFactor )
            	    // InternalMyDsl.g:760:6: lv_right_3_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getTermAccess().getRightFactorParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_right_3_0=ruleFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTermRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl.MyDsl.Factor");
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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleFactor"
    // InternalMyDsl.g:782:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalMyDsl.g:782:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalMyDsl.g:783:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalMyDsl.g:789:1: ruleFactor returns [EObject current=null] : this_Atomic_0= ruleAtomic ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        EObject this_Atomic_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:795:2: (this_Atomic_0= ruleAtomic )
            // InternalMyDsl.g:796:2: this_Atomic_0= ruleAtomic
            {

            		newCompositeNode(grammarAccess.getFactorAccess().getAtomicParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Atomic_0=ruleAtomic();

            state._fsp--;


            		current = this_Atomic_0;
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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleAtomic"
    // InternalMyDsl.g:807:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalMyDsl.g:807:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalMyDsl.g:808:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalMyDsl.g:814:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () otherlv_3= '(' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= ')' ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exp_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:820:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () otherlv_3= '(' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= ')' ) ) )
            // InternalMyDsl.g:821:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () otherlv_3= '(' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= ')' ) )
            {
            // InternalMyDsl.g:821:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () otherlv_3= '(' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= ')' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT) ) {
                alt15=1;
            }
            else if ( (LA15_0==13) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:822:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalMyDsl.g:822:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalMyDsl.g:823:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalMyDsl.g:823:4: ()
                    // InternalMyDsl.g:824:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getNumberAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMyDsl.g:830:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalMyDsl.g:831:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalMyDsl.g:831:5: (lv_value_1_0= RULE_INT )
                    // InternalMyDsl.g:832:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
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
                    // InternalMyDsl.g:850:3: ( () otherlv_3= '(' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= ')' )
                    {
                    // InternalMyDsl.g:850:3: ( () otherlv_3= '(' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= ')' )
                    // InternalMyDsl.g:851:4: () otherlv_3= '(' ( (lv_exp_4_0= ruleExp ) ) otherlv_5= ')'
                    {
                    // InternalMyDsl.g:851:4: ()
                    // InternalMyDsl.g:852:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getParenthesisAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,13,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getAtomicAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalMyDsl.g:862:4: ( (lv_exp_4_0= ruleExp ) )
                    // InternalMyDsl.g:863:5: (lv_exp_4_0= ruleExp )
                    {
                    // InternalMyDsl.g:863:5: (lv_exp_4_0= ruleExp )
                    // InternalMyDsl.g:864:6: lv_exp_4_0= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getAtomicAccess().getExpExpParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_exp_4_0=ruleExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtomicRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_4_0,
                    							"org.xtext.example.mydsl.MyDsl.Exp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getAtomicAccess().getRightParenthesisKeyword_1_3());
                    			

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
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:890:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalMyDsl.g:890:44: (iv_ruleType= ruleType EOF )
            // InternalMyDsl.g:891:2: iv_ruleType= ruleType EOF
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
    // InternalMyDsl.g:897:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'string' | kw= 'number' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:903:2: ( (kw= 'string' | kw= 'number' ) )
            // InternalMyDsl.g:904:2: (kw= 'string' | kw= 'number' )
            {
            // InternalMyDsl.g:904:2: (kw= 'string' | kw= 'number' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            else if ( (LA16_0==27) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:905:3: kw= 'string'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getStringKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:911:3: kw= 'number'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

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
    // InternalMyDsl.g:920:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalMyDsl.g:920:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalMyDsl.g:921:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalMyDsl.g:927:1: ruleRelation returns [EObject current=null] : ( ( () otherlv_1= 'relation' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'is' ( (otherlv_4= RULE_ID ) ) ) | ( () otherlv_6= 'relation' (otherlv_7= 'a' | ( (lv_manyFrom_8_0= 'many' ) ) )? ( (otherlv_9= RULE_ID ) ) (otherlv_10= 'has' | otherlv_11= 'have' ) (otherlv_12= 'a' | ( (lv_manyTo_13_0= 'many' ) ) )? ( (otherlv_14= RULE_ID ) ) ) ) ;
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
            // InternalMyDsl.g:933:2: ( ( ( () otherlv_1= 'relation' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'is' ( (otherlv_4= RULE_ID ) ) ) | ( () otherlv_6= 'relation' (otherlv_7= 'a' | ( (lv_manyFrom_8_0= 'many' ) ) )? ( (otherlv_9= RULE_ID ) ) (otherlv_10= 'has' | otherlv_11= 'have' ) (otherlv_12= 'a' | ( (lv_manyTo_13_0= 'many' ) ) )? ( (otherlv_14= RULE_ID ) ) ) ) )
            // InternalMyDsl.g:934:2: ( ( () otherlv_1= 'relation' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'is' ( (otherlv_4= RULE_ID ) ) ) | ( () otherlv_6= 'relation' (otherlv_7= 'a' | ( (lv_manyFrom_8_0= 'many' ) ) )? ( (otherlv_9= RULE_ID ) ) (otherlv_10= 'has' | otherlv_11= 'have' ) (otherlv_12= 'a' | ( (lv_manyTo_13_0= 'many' ) ) )? ( (otherlv_14= RULE_ID ) ) ) )
            {
            // InternalMyDsl.g:934:2: ( ( () otherlv_1= 'relation' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'is' ( (otherlv_4= RULE_ID ) ) ) | ( () otherlv_6= 'relation' (otherlv_7= 'a' | ( (lv_manyFrom_8_0= 'many' ) ) )? ( (otherlv_9= RULE_ID ) ) (otherlv_10= 'has' | otherlv_11= 'have' ) (otherlv_12= 'a' | ( (lv_manyTo_13_0= 'many' ) ) )? ( (otherlv_14= RULE_ID ) ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                int LA20_1 = input.LA(2);

                if ( ((LA20_1>=30 && LA20_1<=31)) ) {
                    alt20=2;
                }
                else if ( (LA20_1==RULE_ID) ) {
                    int LA20_3 = input.LA(3);

                    if ( ((LA20_3>=32 && LA20_3<=33)) ) {
                        alt20=2;
                    }
                    else if ( (LA20_3==29) ) {
                        alt20=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:935:3: ( () otherlv_1= 'relation' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'is' ( (otherlv_4= RULE_ID ) ) )
                    {
                    // InternalMyDsl.g:935:3: ( () otherlv_1= 'relation' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'is' ( (otherlv_4= RULE_ID ) ) )
                    // InternalMyDsl.g:936:4: () otherlv_1= 'relation' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'is' ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalMyDsl.g:936:4: ()
                    // InternalMyDsl.g:937:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationAccess().getInheritanceAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getRelationAccess().getRelationKeyword_0_1());
                    			
                    // InternalMyDsl.g:947:4: ( (otherlv_2= RULE_ID ) )
                    // InternalMyDsl.g:948:5: (otherlv_2= RULE_ID )
                    {
                    // InternalMyDsl.g:948:5: (otherlv_2= RULE_ID )
                    // InternalMyDsl.g:949:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getBaseEntityEntityCrossReference_0_2_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getIsKeyword_0_3());
                    			
                    // InternalMyDsl.g:964:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMyDsl.g:965:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMyDsl.g:965:5: (otherlv_4= RULE_ID )
                    // InternalMyDsl.g:966:6: otherlv_4= RULE_ID
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
                    // InternalMyDsl.g:979:3: ( () otherlv_6= 'relation' (otherlv_7= 'a' | ( (lv_manyFrom_8_0= 'many' ) ) )? ( (otherlv_9= RULE_ID ) ) (otherlv_10= 'has' | otherlv_11= 'have' ) (otherlv_12= 'a' | ( (lv_manyTo_13_0= 'many' ) ) )? ( (otherlv_14= RULE_ID ) ) )
                    {
                    // InternalMyDsl.g:979:3: ( () otherlv_6= 'relation' (otherlv_7= 'a' | ( (lv_manyFrom_8_0= 'many' ) ) )? ( (otherlv_9= RULE_ID ) ) (otherlv_10= 'has' | otherlv_11= 'have' ) (otherlv_12= 'a' | ( (lv_manyTo_13_0= 'many' ) ) )? ( (otherlv_14= RULE_ID ) ) )
                    // InternalMyDsl.g:980:4: () otherlv_6= 'relation' (otherlv_7= 'a' | ( (lv_manyFrom_8_0= 'many' ) ) )? ( (otherlv_9= RULE_ID ) ) (otherlv_10= 'has' | otherlv_11= 'have' ) (otherlv_12= 'a' | ( (lv_manyTo_13_0= 'many' ) ) )? ( (otherlv_14= RULE_ID ) )
                    {
                    // InternalMyDsl.g:980:4: ()
                    // InternalMyDsl.g:981:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationAccess().getAssociationAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,28,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getRelationAccess().getRelationKeyword_1_1());
                    			
                    // InternalMyDsl.g:991:4: (otherlv_7= 'a' | ( (lv_manyFrom_8_0= 'many' ) ) )?
                    int alt17=3;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==30) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==31) ) {
                        alt17=2;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalMyDsl.g:992:5: otherlv_7= 'a'
                            {
                            otherlv_7=(Token)match(input,30,FOLLOW_3); 

                            					newLeafNode(otherlv_7, grammarAccess.getRelationAccess().getAKeyword_1_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:997:5: ( (lv_manyFrom_8_0= 'many' ) )
                            {
                            // InternalMyDsl.g:997:5: ( (lv_manyFrom_8_0= 'many' ) )
                            // InternalMyDsl.g:998:6: (lv_manyFrom_8_0= 'many' )
                            {
                            // InternalMyDsl.g:998:6: (lv_manyFrom_8_0= 'many' )
                            // InternalMyDsl.g:999:7: lv_manyFrom_8_0= 'many'
                            {
                            lv_manyFrom_8_0=(Token)match(input,31,FOLLOW_3); 

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

                    // InternalMyDsl.g:1012:4: ( (otherlv_9= RULE_ID ) )
                    // InternalMyDsl.g:1013:5: (otherlv_9= RULE_ID )
                    {
                    // InternalMyDsl.g:1013:5: (otherlv_9= RULE_ID )
                    // InternalMyDsl.g:1014:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_20); 

                    						newLeafNode(otherlv_9, grammarAccess.getRelationAccess().getFromEntityCrossReference_1_3_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:1025:4: (otherlv_10= 'has' | otherlv_11= 'have' )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==32) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==33) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalMyDsl.g:1026:5: otherlv_10= 'has'
                            {
                            otherlv_10=(Token)match(input,32,FOLLOW_19); 

                            					newLeafNode(otherlv_10, grammarAccess.getRelationAccess().getHasKeyword_1_4_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:1031:5: otherlv_11= 'have'
                            {
                            otherlv_11=(Token)match(input,33,FOLLOW_19); 

                            					newLeafNode(otherlv_11, grammarAccess.getRelationAccess().getHaveKeyword_1_4_1());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:1036:4: (otherlv_12= 'a' | ( (lv_manyTo_13_0= 'many' ) ) )?
                    int alt19=3;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==30) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==31) ) {
                        alt19=2;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalMyDsl.g:1037:5: otherlv_12= 'a'
                            {
                            otherlv_12=(Token)match(input,30,FOLLOW_3); 

                            					newLeafNode(otherlv_12, grammarAccess.getRelationAccess().getAKeyword_1_5_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:1042:5: ( (lv_manyTo_13_0= 'many' ) )
                            {
                            // InternalMyDsl.g:1042:5: ( (lv_manyTo_13_0= 'many' ) )
                            // InternalMyDsl.g:1043:6: (lv_manyTo_13_0= 'many' )
                            {
                            // InternalMyDsl.g:1043:6: (lv_manyTo_13_0= 'many' )
                            // InternalMyDsl.g:1044:7: lv_manyTo_13_0= 'many'
                            {
                            lv_manyTo_13_0=(Token)match(input,31,FOLLOW_3); 

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

                    // InternalMyDsl.g:1057:4: ( (otherlv_14= RULE_ID ) )
                    // InternalMyDsl.g:1058:5: (otherlv_14= RULE_ID )
                    {
                    // InternalMyDsl.g:1058:5: (otherlv_14= RULE_ID )
                    // InternalMyDsl.g:1059:6: otherlv_14= RULE_ID
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000010011000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000010011002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000C008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000A0002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000C0000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000300000000L});

}