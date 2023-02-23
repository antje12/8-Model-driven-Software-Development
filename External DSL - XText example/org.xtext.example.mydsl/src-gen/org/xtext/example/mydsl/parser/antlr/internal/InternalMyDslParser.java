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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'entity'", "'attribute'", "'as'", "'string'", "'number'", "'relation'", "'is'", "'a'", "'many'", "'has'", "'have'"
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
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
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
    // InternalMyDsl.g:71:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntity ) )* ( (lv_relations_3_0= ruleRelation ) )* ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_entities_2_0 = null;

        EObject lv_relations_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntity ) )* ( (lv_relations_3_0= ruleRelation ) )* ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntity ) )* ( (lv_relations_3_0= ruleRelation ) )* )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntity ) )* ( (lv_relations_3_0= ruleRelation ) )* )
            // InternalMyDsl.g:79:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_entities_2_0= ruleEntity ) )* ( (lv_relations_3_0= ruleRelation ) )*
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

            // InternalMyDsl.g:101:3: ( (lv_entities_2_0= ruleEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:102:4: (lv_entities_2_0= ruleEntity )
            	    {
            	    // InternalMyDsl.g:102:4: (lv_entities_2_0= ruleEntity )
            	    // InternalMyDsl.g:103:5: lv_entities_2_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getSystemAccess().getEntitiesEntityParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_entities_2_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entities",
            	    						lv_entities_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyDsl.g:120:3: ( (lv_relations_3_0= ruleRelation ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:121:4: (lv_relations_3_0= ruleRelation )
            	    {
            	    // InternalMyDsl.g:121:4: (lv_relations_3_0= ruleRelation )
            	    // InternalMyDsl.g:122:5: lv_relations_3_0= ruleRelation
            	    {

            	    					newCompositeNode(grammarAccess.getSystemAccess().getRelationsRelationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_relations_3_0=ruleRelation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"relations",
            	    						lv_relations_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.Relation");
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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleEntity"
    // InternalMyDsl.g:143:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalMyDsl.g:143:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalMyDsl.g:144:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalMyDsl.g:150:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributess_2_0= ruleAttribute ) )* ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_attributess_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:156:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributess_2_0= ruleAttribute ) )* ) )
            // InternalMyDsl.g:157:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributess_2_0= ruleAttribute ) )* )
            {
            // InternalMyDsl.g:157:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributess_2_0= ruleAttribute ) )* )
            // InternalMyDsl.g:158:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributess_2_0= ruleAttribute ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalMyDsl.g:162:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:163:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:163:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:164:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

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

            // InternalMyDsl.g:180:3: ( (lv_attributess_2_0= ruleAttribute ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:181:4: (lv_attributess_2_0= ruleAttribute )
            	    {
            	    // InternalMyDsl.g:181:4: (lv_attributess_2_0= ruleAttribute )
            	    // InternalMyDsl.g:182:5: lv_attributess_2_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getAttributessAttributeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_attributess_2_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributess",
            	    						lv_attributess_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyDsl.g:203:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalMyDsl.g:203:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalMyDsl.g:204:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalMyDsl.g:210:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ruleType ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:216:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ruleType ) )
            // InternalMyDsl.g:217:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ruleType )
            {
            // InternalMyDsl.g:217:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ruleType )
            // InternalMyDsl.g:218:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ruleType
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalMyDsl.g:222:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:223:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:223:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:224:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getAsKeyword_2());
            		

            			newCompositeNode(grammarAccess.getAttributeAccess().getTypeParserRuleCall_3());
            		
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		

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


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:255:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalMyDsl.g:255:44: (iv_ruleType= ruleType EOF )
            // InternalMyDsl.g:256:2: iv_ruleType= ruleType EOF
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
    // InternalMyDsl.g:262:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'string' | kw= 'number' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:268:2: ( (kw= 'string' | kw= 'number' ) )
            // InternalMyDsl.g:269:2: (kw= 'string' | kw= 'number' )
            {
            // InternalMyDsl.g:269:2: (kw= 'string' | kw= 'number' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:270:3: kw= 'string'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getStringKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:276:3: kw= 'number'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

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
    // InternalMyDsl.g:285:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalMyDsl.g:285:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalMyDsl.g:286:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalMyDsl.g:292:1: ruleRelation returns [EObject current=null] : ( (otherlv_0= 'relation' ( (lv_from_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_to_3_0= RULE_ID ) ) ) | (otherlv_4= 'relation' (otherlv_5= 'a' | otherlv_6= 'many' )? ( (lv_from_7_0= RULE_ID ) ) (otherlv_8= 'has' | otherlv_9= 'have' ) (otherlv_10= 'a' | otherlv_11= 'many' )? ( (lv_to_12_0= RULE_ID ) ) ) ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_from_1_0=null;
        Token otherlv_2=null;
        Token lv_to_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_from_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_to_12_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:298:2: ( ( (otherlv_0= 'relation' ( (lv_from_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_to_3_0= RULE_ID ) ) ) | (otherlv_4= 'relation' (otherlv_5= 'a' | otherlv_6= 'many' )? ( (lv_from_7_0= RULE_ID ) ) (otherlv_8= 'has' | otherlv_9= 'have' ) (otherlv_10= 'a' | otherlv_11= 'many' )? ( (lv_to_12_0= RULE_ID ) ) ) ) )
            // InternalMyDsl.g:299:2: ( (otherlv_0= 'relation' ( (lv_from_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_to_3_0= RULE_ID ) ) ) | (otherlv_4= 'relation' (otherlv_5= 'a' | otherlv_6= 'many' )? ( (lv_from_7_0= RULE_ID ) ) (otherlv_8= 'has' | otherlv_9= 'have' ) (otherlv_10= 'a' | otherlv_11= 'many' )? ( (lv_to_12_0= RULE_ID ) ) ) )
            {
            // InternalMyDsl.g:299:2: ( (otherlv_0= 'relation' ( (lv_from_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_to_3_0= RULE_ID ) ) ) | (otherlv_4= 'relation' (otherlv_5= 'a' | otherlv_6= 'many' )? ( (lv_from_7_0= RULE_ID ) ) (otherlv_8= 'has' | otherlv_9= 'have' ) (otherlv_10= 'a' | otherlv_11= 'many' )? ( (lv_to_12_0= RULE_ID ) ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                int LA8_1 = input.LA(2);

                if ( ((LA8_1>=19 && LA8_1<=20)) ) {
                    alt8=2;
                }
                else if ( (LA8_1==RULE_ID) ) {
                    int LA8_3 = input.LA(3);

                    if ( ((LA8_3>=21 && LA8_3<=22)) ) {
                        alt8=2;
                    }
                    else if ( (LA8_3==18) ) {
                        alt8=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 3, input);

                        throw nvae;
                    }
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
                    // InternalMyDsl.g:300:3: (otherlv_0= 'relation' ( (lv_from_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_to_3_0= RULE_ID ) ) )
                    {
                    // InternalMyDsl.g:300:3: (otherlv_0= 'relation' ( (lv_from_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_to_3_0= RULE_ID ) ) )
                    // InternalMyDsl.g:301:4: otherlv_0= 'relation' ( (lv_from_1_0= RULE_ID ) ) otherlv_2= 'is' ( (lv_to_3_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getRelationAccess().getRelationKeyword_0_0());
                    			
                    // InternalMyDsl.g:305:4: ( (lv_from_1_0= RULE_ID ) )
                    // InternalMyDsl.g:306:5: (lv_from_1_0= RULE_ID )
                    {
                    // InternalMyDsl.g:306:5: (lv_from_1_0= RULE_ID )
                    // InternalMyDsl.g:307:6: lv_from_1_0= RULE_ID
                    {
                    lv_from_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(lv_from_1_0, grammarAccess.getRelationAccess().getFromIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"from",
                    							lv_from_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getIsKeyword_0_2());
                    			
                    // InternalMyDsl.g:327:4: ( (lv_to_3_0= RULE_ID ) )
                    // InternalMyDsl.g:328:5: (lv_to_3_0= RULE_ID )
                    {
                    // InternalMyDsl.g:328:5: (lv_to_3_0= RULE_ID )
                    // InternalMyDsl.g:329:6: lv_to_3_0= RULE_ID
                    {
                    lv_to_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_to_3_0, grammarAccess.getRelationAccess().getToIDTerminalRuleCall_0_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"to",
                    							lv_to_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:347:3: (otherlv_4= 'relation' (otherlv_5= 'a' | otherlv_6= 'many' )? ( (lv_from_7_0= RULE_ID ) ) (otherlv_8= 'has' | otherlv_9= 'have' ) (otherlv_10= 'a' | otherlv_11= 'many' )? ( (lv_to_12_0= RULE_ID ) ) )
                    {
                    // InternalMyDsl.g:347:3: (otherlv_4= 'relation' (otherlv_5= 'a' | otherlv_6= 'many' )? ( (lv_from_7_0= RULE_ID ) ) (otherlv_8= 'has' | otherlv_9= 'have' ) (otherlv_10= 'a' | otherlv_11= 'many' )? ( (lv_to_12_0= RULE_ID ) ) )
                    // InternalMyDsl.g:348:4: otherlv_4= 'relation' (otherlv_5= 'a' | otherlv_6= 'many' )? ( (lv_from_7_0= RULE_ID ) ) (otherlv_8= 'has' | otherlv_9= 'have' ) (otherlv_10= 'a' | otherlv_11= 'many' )? ( (lv_to_12_0= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getRelationAccess().getRelationKeyword_1_0());
                    			
                    // InternalMyDsl.g:352:4: (otherlv_5= 'a' | otherlv_6= 'many' )?
                    int alt5=3;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==19) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==20) ) {
                        alt5=2;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalMyDsl.g:353:5: otherlv_5= 'a'
                            {
                            otherlv_5=(Token)match(input,19,FOLLOW_3); 

                            					newLeafNode(otherlv_5, grammarAccess.getRelationAccess().getAKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:358:5: otherlv_6= 'many'
                            {
                            otherlv_6=(Token)match(input,20,FOLLOW_3); 

                            					newLeafNode(otherlv_6, grammarAccess.getRelationAccess().getManyKeyword_1_1_1());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:363:4: ( (lv_from_7_0= RULE_ID ) )
                    // InternalMyDsl.g:364:5: (lv_from_7_0= RULE_ID )
                    {
                    // InternalMyDsl.g:364:5: (lv_from_7_0= RULE_ID )
                    // InternalMyDsl.g:365:6: lv_from_7_0= RULE_ID
                    {
                    lv_from_7_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(lv_from_7_0, grammarAccess.getRelationAccess().getFromIDTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"from",
                    							lv_from_7_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalMyDsl.g:381:4: (otherlv_8= 'has' | otherlv_9= 'have' )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==21) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==22) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalMyDsl.g:382:5: otherlv_8= 'has'
                            {
                            otherlv_8=(Token)match(input,21,FOLLOW_10); 

                            					newLeafNode(otherlv_8, grammarAccess.getRelationAccess().getHasKeyword_1_3_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:387:5: otherlv_9= 'have'
                            {
                            otherlv_9=(Token)match(input,22,FOLLOW_10); 

                            					newLeafNode(otherlv_9, grammarAccess.getRelationAccess().getHaveKeyword_1_3_1());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:392:4: (otherlv_10= 'a' | otherlv_11= 'many' )?
                    int alt7=3;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==19) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==20) ) {
                        alt7=2;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalMyDsl.g:393:5: otherlv_10= 'a'
                            {
                            otherlv_10=(Token)match(input,19,FOLLOW_3); 

                            					newLeafNode(otherlv_10, grammarAccess.getRelationAccess().getAKeyword_1_4_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:398:5: otherlv_11= 'many'
                            {
                            otherlv_11=(Token)match(input,20,FOLLOW_3); 

                            					newLeafNode(otherlv_11, grammarAccess.getRelationAccess().getManyKeyword_1_4_1());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:403:4: ( (lv_to_12_0= RULE_ID ) )
                    // InternalMyDsl.g:404:5: (lv_to_12_0= RULE_ID )
                    {
                    // InternalMyDsl.g:404:5: (lv_to_12_0= RULE_ID )
                    // InternalMyDsl.g:405:6: lv_to_12_0= RULE_ID
                    {
                    lv_to_12_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_to_12_0, grammarAccess.getRelationAccess().getToIDTerminalRuleCall_1_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"to",
                    							lv_to_12_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000021002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000180010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000600000L});

}