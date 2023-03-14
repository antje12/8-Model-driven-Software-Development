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
    // InternalMyDsl.g:71:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_elements_2_1= ruleRelation | lv_elements_2_2= ruleEntity ) ) )+ ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_elements_2_1 = null;

        EObject lv_elements_2_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_elements_2_1= ruleRelation | lv_elements_2_2= ruleEntity ) ) )+ ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_elements_2_1= ruleRelation | lv_elements_2_2= ruleEntity ) ) )+ )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_elements_2_1= ruleRelation | lv_elements_2_2= ruleEntity ) ) )+ )
            // InternalMyDsl.g:79:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_elements_2_1= ruleRelation | lv_elements_2_2= ruleEntity ) ) )+
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

            // InternalMyDsl.g:101:3: ( ( (lv_elements_2_1= ruleRelation | lv_elements_2_2= ruleEntity ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12||LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:102:4: ( (lv_elements_2_1= ruleRelation | lv_elements_2_2= ruleEntity ) )
            	    {
            	    // InternalMyDsl.g:102:4: ( (lv_elements_2_1= ruleRelation | lv_elements_2_2= ruleEntity ) )
            	    // InternalMyDsl.g:103:5: (lv_elements_2_1= ruleRelation | lv_elements_2_2= ruleEntity )
            	    {
            	    // InternalMyDsl.g:103:5: (lv_elements_2_1= ruleRelation | lv_elements_2_2= ruleEntity )
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==17) ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0==12) ) {
            	        alt1=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalMyDsl.g:104:6: lv_elements_2_1= ruleRelation
            	            {

            	            						newCompositeNode(grammarAccess.getSystemAccess().getElementsRelationParserRuleCall_2_0_0());
            	            					
            	            pushFollow(FOLLOW_5);
            	            lv_elements_2_1=ruleRelation();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getSystemRule());
            	            						}
            	            						add(
            	            							current,
            	            							"elements",
            	            							lv_elements_2_1,
            	            							"org.xtext.example.mydsl.MyDsl.Relation");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:120:6: lv_elements_2_2= ruleEntity
            	            {

            	            						newCompositeNode(grammarAccess.getSystemAccess().getElementsEntityParserRuleCall_2_0_1());
            	            					
            	            pushFollow(FOLLOW_5);
            	            lv_elements_2_2=ruleEntity();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getSystemRule());
            	            						}
            	            						add(
            	            							current,
            	            							"elements",
            	            							lv_elements_2_2,
            	            							"org.xtext.example.mydsl.MyDsl.Entity");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


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
    // InternalMyDsl.g:142:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalMyDsl.g:142:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalMyDsl.g:143:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalMyDsl.g:149:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleAttribute ) )* ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_attributes_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:155:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleAttribute ) )* ) )
            // InternalMyDsl.g:156:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleAttribute ) )* )
            {
            // InternalMyDsl.g:156:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleAttribute ) )* )
            // InternalMyDsl.g:157:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( (lv_attributes_2_0= ruleAttribute ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalMyDsl.g:161:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:162:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:162:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:163:5: lv_name_1_0= RULE_ID
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

            // InternalMyDsl.g:179:3: ( (lv_attributes_2_0= ruleAttribute ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:180:4: (lv_attributes_2_0= ruleAttribute )
            	    {
            	    // InternalMyDsl.g:180:4: (lv_attributes_2_0= ruleAttribute )
            	    // InternalMyDsl.g:181:5: lv_attributes_2_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_attributes_2_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_2_0,
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
    // InternalMyDsl.g:202:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalMyDsl.g:202:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalMyDsl.g:203:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalMyDsl.g:209:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:215:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_type_3_0= ruleType ) ) ) )
            // InternalMyDsl.g:216:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_type_3_0= ruleType ) ) )
            {
            // InternalMyDsl.g:216:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_type_3_0= ruleType ) ) )
            // InternalMyDsl.g:217:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'as' ( (lv_type_3_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalMyDsl.g:221:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:222:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:222:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:223:5: lv_name_1_0= RULE_ID
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
            		
            // InternalMyDsl.g:243:3: ( (lv_type_3_0= ruleType ) )
            // InternalMyDsl.g:244:4: (lv_type_3_0= ruleType )
            {
            // InternalMyDsl.g:244:4: (lv_type_3_0= ruleType )
            // InternalMyDsl.g:245:5: lv_type_3_0= ruleType
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


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:266:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalMyDsl.g:266:44: (iv_ruleType= ruleType EOF )
            // InternalMyDsl.g:267:2: iv_ruleType= ruleType EOF
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
    // InternalMyDsl.g:273:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'string' | kw= 'number' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:279:2: ( (kw= 'string' | kw= 'number' ) )
            // InternalMyDsl.g:280:2: (kw= 'string' | kw= 'number' )
            {
            // InternalMyDsl.g:280:2: (kw= 'string' | kw= 'number' )
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
                    // InternalMyDsl.g:281:3: kw= 'string'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTypeAccess().getStringKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:287:3: kw= 'number'
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
    // InternalMyDsl.g:296:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // InternalMyDsl.g:296:49: (iv_ruleRelation= ruleRelation EOF )
            // InternalMyDsl.g:297:2: iv_ruleRelation= ruleRelation EOF
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
    // InternalMyDsl.g:303:1: ruleRelation returns [EObject current=null] : ( ( () otherlv_1= 'relation' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'is' ( (otherlv_4= RULE_ID ) ) ) | ( () otherlv_6= 'relation' (otherlv_7= 'a' | ( (lv_manyFrom_8_0= 'many' ) ) )? ( (otherlv_9= RULE_ID ) ) (otherlv_10= 'has' | otherlv_11= 'have' ) (otherlv_12= 'a' | ( (lv_manyTo_13_0= 'many' ) ) )? ( (otherlv_14= RULE_ID ) ) ) ) ;
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
            // InternalMyDsl.g:309:2: ( ( ( () otherlv_1= 'relation' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'is' ( (otherlv_4= RULE_ID ) ) ) | ( () otherlv_6= 'relation' (otherlv_7= 'a' | ( (lv_manyFrom_8_0= 'many' ) ) )? ( (otherlv_9= RULE_ID ) ) (otherlv_10= 'has' | otherlv_11= 'have' ) (otherlv_12= 'a' | ( (lv_manyTo_13_0= 'many' ) ) )? ( (otherlv_14= RULE_ID ) ) ) ) )
            // InternalMyDsl.g:310:2: ( ( () otherlv_1= 'relation' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'is' ( (otherlv_4= RULE_ID ) ) ) | ( () otherlv_6= 'relation' (otherlv_7= 'a' | ( (lv_manyFrom_8_0= 'many' ) ) )? ( (otherlv_9= RULE_ID ) ) (otherlv_10= 'has' | otherlv_11= 'have' ) (otherlv_12= 'a' | ( (lv_manyTo_13_0= 'many' ) ) )? ( (otherlv_14= RULE_ID ) ) ) )
            {
            // InternalMyDsl.g:310:2: ( ( () otherlv_1= 'relation' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'is' ( (otherlv_4= RULE_ID ) ) ) | ( () otherlv_6= 'relation' (otherlv_7= 'a' | ( (lv_manyFrom_8_0= 'many' ) ) )? ( (otherlv_9= RULE_ID ) ) (otherlv_10= 'has' | otherlv_11= 'have' ) (otherlv_12= 'a' | ( (lv_manyTo_13_0= 'many' ) ) )? ( (otherlv_14= RULE_ID ) ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                int LA8_1 = input.LA(2);

                if ( ((LA8_1>=19 && LA8_1<=20)) ) {
                    alt8=2;
                }
                else if ( (LA8_1==RULE_ID) ) {
                    int LA8_3 = input.LA(3);

                    if ( (LA8_3==18) ) {
                        alt8=1;
                    }
                    else if ( ((LA8_3>=21 && LA8_3<=22)) ) {
                        alt8=2;
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
                    // InternalMyDsl.g:311:3: ( () otherlv_1= 'relation' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'is' ( (otherlv_4= RULE_ID ) ) )
                    {
                    // InternalMyDsl.g:311:3: ( () otherlv_1= 'relation' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'is' ( (otherlv_4= RULE_ID ) ) )
                    // InternalMyDsl.g:312:4: () otherlv_1= 'relation' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'is' ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalMyDsl.g:312:4: ()
                    // InternalMyDsl.g:313:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationAccess().getInheritanceAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getRelationAccess().getRelationKeyword_0_1());
                    			
                    // InternalMyDsl.g:323:4: ( (otherlv_2= RULE_ID ) )
                    // InternalMyDsl.g:324:5: (otherlv_2= RULE_ID )
                    {
                    // InternalMyDsl.g:324:5: (otherlv_2= RULE_ID )
                    // InternalMyDsl.g:325:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_2, grammarAccess.getRelationAccess().getBaseEntityEntityCrossReference_0_2_0());
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRelationAccess().getIsKeyword_0_3());
                    			
                    // InternalMyDsl.g:340:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMyDsl.g:341:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMyDsl.g:341:5: (otherlv_4= RULE_ID )
                    // InternalMyDsl.g:342:6: otherlv_4= RULE_ID
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
                    // InternalMyDsl.g:355:3: ( () otherlv_6= 'relation' (otherlv_7= 'a' | ( (lv_manyFrom_8_0= 'many' ) ) )? ( (otherlv_9= RULE_ID ) ) (otherlv_10= 'has' | otherlv_11= 'have' ) (otherlv_12= 'a' | ( (lv_manyTo_13_0= 'many' ) ) )? ( (otherlv_14= RULE_ID ) ) )
                    {
                    // InternalMyDsl.g:355:3: ( () otherlv_6= 'relation' (otherlv_7= 'a' | ( (lv_manyFrom_8_0= 'many' ) ) )? ( (otherlv_9= RULE_ID ) ) (otherlv_10= 'has' | otherlv_11= 'have' ) (otherlv_12= 'a' | ( (lv_manyTo_13_0= 'many' ) ) )? ( (otherlv_14= RULE_ID ) ) )
                    // InternalMyDsl.g:356:4: () otherlv_6= 'relation' (otherlv_7= 'a' | ( (lv_manyFrom_8_0= 'many' ) ) )? ( (otherlv_9= RULE_ID ) ) (otherlv_10= 'has' | otherlv_11= 'have' ) (otherlv_12= 'a' | ( (lv_manyTo_13_0= 'many' ) ) )? ( (otherlv_14= RULE_ID ) )
                    {
                    // InternalMyDsl.g:356:4: ()
                    // InternalMyDsl.g:357:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRelationAccess().getAssociationAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getRelationAccess().getRelationKeyword_1_1());
                    			
                    // InternalMyDsl.g:367:4: (otherlv_7= 'a' | ( (lv_manyFrom_8_0= 'many' ) ) )?
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
                            // InternalMyDsl.g:368:5: otherlv_7= 'a'
                            {
                            otherlv_7=(Token)match(input,19,FOLLOW_3); 

                            					newLeafNode(otherlv_7, grammarAccess.getRelationAccess().getAKeyword_1_2_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:373:5: ( (lv_manyFrom_8_0= 'many' ) )
                            {
                            // InternalMyDsl.g:373:5: ( (lv_manyFrom_8_0= 'many' ) )
                            // InternalMyDsl.g:374:6: (lv_manyFrom_8_0= 'many' )
                            {
                            // InternalMyDsl.g:374:6: (lv_manyFrom_8_0= 'many' )
                            // InternalMyDsl.g:375:7: lv_manyFrom_8_0= 'many'
                            {
                            lv_manyFrom_8_0=(Token)match(input,20,FOLLOW_3); 

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

                    // InternalMyDsl.g:388:4: ( (otherlv_9= RULE_ID ) )
                    // InternalMyDsl.g:389:5: (otherlv_9= RULE_ID )
                    {
                    // InternalMyDsl.g:389:5: (otherlv_9= RULE_ID )
                    // InternalMyDsl.g:390:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_9, grammarAccess.getRelationAccess().getFromEntityCrossReference_1_3_0());
                    					

                    }


                    }

                    // InternalMyDsl.g:401:4: (otherlv_10= 'has' | otherlv_11= 'have' )
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
                            // InternalMyDsl.g:402:5: otherlv_10= 'has'
                            {
                            otherlv_10=(Token)match(input,21,FOLLOW_10); 

                            					newLeafNode(otherlv_10, grammarAccess.getRelationAccess().getHasKeyword_1_4_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:407:5: otherlv_11= 'have'
                            {
                            otherlv_11=(Token)match(input,22,FOLLOW_10); 

                            					newLeafNode(otherlv_11, grammarAccess.getRelationAccess().getHaveKeyword_1_4_1());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:412:4: (otherlv_12= 'a' | ( (lv_manyTo_13_0= 'many' ) ) )?
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
                            // InternalMyDsl.g:413:5: otherlv_12= 'a'
                            {
                            otherlv_12=(Token)match(input,19,FOLLOW_3); 

                            					newLeafNode(otherlv_12, grammarAccess.getRelationAccess().getAKeyword_1_5_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:418:5: ( (lv_manyTo_13_0= 'many' ) )
                            {
                            // InternalMyDsl.g:418:5: ( (lv_manyTo_13_0= 'many' ) )
                            // InternalMyDsl.g:419:6: (lv_manyTo_13_0= 'many' )
                            {
                            // InternalMyDsl.g:419:6: (lv_manyTo_13_0= 'many' )
                            // InternalMyDsl.g:420:7: lv_manyTo_13_0= 'many'
                            {
                            lv_manyTo_13_0=(Token)match(input,20,FOLLOW_3); 

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

                    // InternalMyDsl.g:433:4: ( (otherlv_14= RULE_ID ) )
                    // InternalMyDsl.g:434:5: (otherlv_14= RULE_ID )
                    {
                    // InternalMyDsl.g:434:5: (otherlv_14= RULE_ID )
                    // InternalMyDsl.g:435:6: otherlv_14= RULE_ID
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000021002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000180010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000600000L});

}