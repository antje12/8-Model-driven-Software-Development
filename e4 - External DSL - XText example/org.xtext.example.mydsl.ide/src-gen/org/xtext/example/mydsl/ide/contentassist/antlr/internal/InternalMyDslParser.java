package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'string'", "'number'", "'a'", "'has'", "'have'", "'system'", "'entity'", "'attribute'", "'as'", "'relation'", "'is'", "'many'"
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleSystem"
    // InternalMyDsl.g:53:1: entryRuleSystem : ruleSystem EOF ;
    public final void entryRuleSystem() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleSystem EOF )
            // InternalMyDsl.g:55:1: ruleSystem EOF
            {
             before(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getSystemRule()); 
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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalMyDsl.g:62:1: ruleSystem : ( ( rule__System__Group__0 ) ) ;
    public final void ruleSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__System__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__System__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__System__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__System__Group__0 )
            {
             before(grammarAccess.getSystemAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__System__Group__0 )
            // InternalMyDsl.g:69:4: rule__System__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__System__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getGroup()); 

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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleEntity"
    // InternalMyDsl.g:78:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleEntity EOF )
            // InternalMyDsl.g:80:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalMyDsl.g:87:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Entity__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Entity__Group__0 )
            // InternalMyDsl.g:94:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // InternalMyDsl.g:103:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleAttribute EOF )
            // InternalMyDsl.g:105:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalMyDsl.g:112:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Attribute__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Attribute__Group__0 )
            // InternalMyDsl.g:119:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:128:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleType EOF )
            // InternalMyDsl.g:130:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:137:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Type__Alternatives ) )
            // InternalMyDsl.g:143:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:144:3: ( rule__Type__Alternatives )
            // InternalMyDsl.g:144:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleRelation"
    // InternalMyDsl.g:153:1: entryRuleRelation : ruleRelation EOF ;
    public final void entryRuleRelation() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleRelation EOF )
            // InternalMyDsl.g:155:1: ruleRelation EOF
            {
             before(grammarAccess.getRelationRule()); 
            pushFollow(FOLLOW_1);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getRelationRule()); 
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
    // $ANTLR end "entryRuleRelation"


    // $ANTLR start "ruleRelation"
    // InternalMyDsl.g:162:1: ruleRelation : ( ( rule__Relation__Alternatives ) ) ;
    public final void ruleRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Relation__Alternatives ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Relation__Alternatives ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Relation__Alternatives ) )
            // InternalMyDsl.g:168:3: ( rule__Relation__Alternatives )
            {
             before(grammarAccess.getRelationAccess().getAlternatives()); 
            // InternalMyDsl.g:169:3: ( rule__Relation__Alternatives )
            // InternalMyDsl.g:169:4: rule__Relation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRelation"


    // $ANTLR start "rule__System__ElementsAlternatives_2_0"
    // InternalMyDsl.g:177:1: rule__System__ElementsAlternatives_2_0 : ( ( ruleRelation ) | ( ruleEntity ) );
    public final void rule__System__ElementsAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:181:1: ( ( ruleRelation ) | ( ruleEntity ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==20) ) {
                alt1=1;
            }
            else if ( (LA1_0==17) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:182:2: ( ruleRelation )
                    {
                    // InternalMyDsl.g:182:2: ( ruleRelation )
                    // InternalMyDsl.g:183:3: ruleRelation
                    {
                     before(grammarAccess.getSystemAccess().getElementsRelationParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRelation();

                    state._fsp--;

                     after(grammarAccess.getSystemAccess().getElementsRelationParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:188:2: ( ruleEntity )
                    {
                    // InternalMyDsl.g:188:2: ( ruleEntity )
                    // InternalMyDsl.g:189:3: ruleEntity
                    {
                     before(grammarAccess.getSystemAccess().getElementsEntityParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getSystemAccess().getElementsEntityParserRuleCall_2_0_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__System__ElementsAlternatives_2_0"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalMyDsl.g:198:1: rule__Type__Alternatives : ( ( 'string' ) | ( 'number' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:202:1: ( ( 'string' ) | ( 'number' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:203:2: ( 'string' )
                    {
                    // InternalMyDsl.g:203:2: ( 'string' )
                    // InternalMyDsl.g:204:3: 'string'
                    {
                     before(grammarAccess.getTypeAccess().getStringKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getStringKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:209:2: ( 'number' )
                    {
                    // InternalMyDsl.g:209:2: ( 'number' )
                    // InternalMyDsl.g:210:3: 'number'
                    {
                     before(grammarAccess.getTypeAccess().getNumberKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getNumberKeyword_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Relation__Alternatives"
    // InternalMyDsl.g:219:1: rule__Relation__Alternatives : ( ( ( rule__Relation__Group_0__0 ) ) | ( ( rule__Relation__Group_1__0 ) ) );
    public final void rule__Relation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:223:1: ( ( ( rule__Relation__Group_0__0 ) ) | ( ( rule__Relation__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==13||LA3_1==22) ) {
                    alt3=2;
                }
                else if ( (LA3_1==RULE_ID) ) {
                    int LA3_3 = input.LA(3);

                    if ( (LA3_3==21) ) {
                        alt3=1;
                    }
                    else if ( ((LA3_3>=14 && LA3_3<=15)) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:224:2: ( ( rule__Relation__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:224:2: ( ( rule__Relation__Group_0__0 ) )
                    // InternalMyDsl.g:225:3: ( rule__Relation__Group_0__0 )
                    {
                     before(grammarAccess.getRelationAccess().getGroup_0()); 
                    // InternalMyDsl.g:226:3: ( rule__Relation__Group_0__0 )
                    // InternalMyDsl.g:226:4: rule__Relation__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relation__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:230:2: ( ( rule__Relation__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:230:2: ( ( rule__Relation__Group_1__0 ) )
                    // InternalMyDsl.g:231:3: ( rule__Relation__Group_1__0 )
                    {
                     before(grammarAccess.getRelationAccess().getGroup_1()); 
                    // InternalMyDsl.g:232:3: ( rule__Relation__Group_1__0 )
                    // InternalMyDsl.g:232:4: rule__Relation__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relation__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationAccess().getGroup_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Relation__Alternatives"


    // $ANTLR start "rule__Relation__Alternatives_1_2"
    // InternalMyDsl.g:240:1: rule__Relation__Alternatives_1_2 : ( ( 'a' ) | ( ( rule__Relation__ManyFromAssignment_1_2_1 ) ) );
    public final void rule__Relation__Alternatives_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:244:1: ( ( 'a' ) | ( ( rule__Relation__ManyFromAssignment_1_2_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==22) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:245:2: ( 'a' )
                    {
                    // InternalMyDsl.g:245:2: ( 'a' )
                    // InternalMyDsl.g:246:3: 'a'
                    {
                     before(grammarAccess.getRelationAccess().getAKeyword_1_2_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getRelationAccess().getAKeyword_1_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:251:2: ( ( rule__Relation__ManyFromAssignment_1_2_1 ) )
                    {
                    // InternalMyDsl.g:251:2: ( ( rule__Relation__ManyFromAssignment_1_2_1 ) )
                    // InternalMyDsl.g:252:3: ( rule__Relation__ManyFromAssignment_1_2_1 )
                    {
                     before(grammarAccess.getRelationAccess().getManyFromAssignment_1_2_1()); 
                    // InternalMyDsl.g:253:3: ( rule__Relation__ManyFromAssignment_1_2_1 )
                    // InternalMyDsl.g:253:4: rule__Relation__ManyFromAssignment_1_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relation__ManyFromAssignment_1_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationAccess().getManyFromAssignment_1_2_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Relation__Alternatives_1_2"


    // $ANTLR start "rule__Relation__Alternatives_1_4"
    // InternalMyDsl.g:261:1: rule__Relation__Alternatives_1_4 : ( ( 'has' ) | ( 'have' ) );
    public final void rule__Relation__Alternatives_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:265:1: ( ( 'has' ) | ( 'have' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:266:2: ( 'has' )
                    {
                    // InternalMyDsl.g:266:2: ( 'has' )
                    // InternalMyDsl.g:267:3: 'has'
                    {
                     before(grammarAccess.getRelationAccess().getHasKeyword_1_4_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getRelationAccess().getHasKeyword_1_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:272:2: ( 'have' )
                    {
                    // InternalMyDsl.g:272:2: ( 'have' )
                    // InternalMyDsl.g:273:3: 'have'
                    {
                     before(grammarAccess.getRelationAccess().getHaveKeyword_1_4_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getRelationAccess().getHaveKeyword_1_4_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Relation__Alternatives_1_4"


    // $ANTLR start "rule__Relation__Alternatives_1_5"
    // InternalMyDsl.g:282:1: rule__Relation__Alternatives_1_5 : ( ( 'a' ) | ( ( rule__Relation__ManyToAssignment_1_5_1 ) ) );
    public final void rule__Relation__Alternatives_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:286:1: ( ( 'a' ) | ( ( rule__Relation__ManyToAssignment_1_5_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
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
                    // InternalMyDsl.g:287:2: ( 'a' )
                    {
                    // InternalMyDsl.g:287:2: ( 'a' )
                    // InternalMyDsl.g:288:3: 'a'
                    {
                     before(grammarAccess.getRelationAccess().getAKeyword_1_5_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getRelationAccess().getAKeyword_1_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:293:2: ( ( rule__Relation__ManyToAssignment_1_5_1 ) )
                    {
                    // InternalMyDsl.g:293:2: ( ( rule__Relation__ManyToAssignment_1_5_1 ) )
                    // InternalMyDsl.g:294:3: ( rule__Relation__ManyToAssignment_1_5_1 )
                    {
                     before(grammarAccess.getRelationAccess().getManyToAssignment_1_5_1()); 
                    // InternalMyDsl.g:295:3: ( rule__Relation__ManyToAssignment_1_5_1 )
                    // InternalMyDsl.g:295:4: rule__Relation__ManyToAssignment_1_5_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relation__ManyToAssignment_1_5_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationAccess().getManyToAssignment_1_5_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Relation__Alternatives_1_5"


    // $ANTLR start "rule__System__Group__0"
    // InternalMyDsl.g:303:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:307:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // InternalMyDsl.g:308:2: rule__System__Group__0__Impl rule__System__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__System__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__1();

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
    // $ANTLR end "rule__System__Group__0"


    // $ANTLR start "rule__System__Group__0__Impl"
    // InternalMyDsl.g:315:1: rule__System__Group__0__Impl : ( 'system' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:319:1: ( ( 'system' ) )
            // InternalMyDsl.g:320:1: ( 'system' )
            {
            // InternalMyDsl.g:320:1: ( 'system' )
            // InternalMyDsl.g:321:2: 'system'
            {
             before(grammarAccess.getSystemAccess().getSystemKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getSystemKeyword_0()); 

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
    // $ANTLR end "rule__System__Group__0__Impl"


    // $ANTLR start "rule__System__Group__1"
    // InternalMyDsl.g:330:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:334:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // InternalMyDsl.g:335:2: rule__System__Group__1__Impl rule__System__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__System__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__2();

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
    // $ANTLR end "rule__System__Group__1"


    // $ANTLR start "rule__System__Group__1__Impl"
    // InternalMyDsl.g:342:1: rule__System__Group__1__Impl : ( ( rule__System__NameAssignment_1 ) ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:346:1: ( ( ( rule__System__NameAssignment_1 ) ) )
            // InternalMyDsl.g:347:1: ( ( rule__System__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:347:1: ( ( rule__System__NameAssignment_1 ) )
            // InternalMyDsl.g:348:2: ( rule__System__NameAssignment_1 )
            {
             before(grammarAccess.getSystemAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:349:2: ( rule__System__NameAssignment_1 )
            // InternalMyDsl.g:349:3: rule__System__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__System__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__System__Group__1__Impl"


    // $ANTLR start "rule__System__Group__2"
    // InternalMyDsl.g:357:1: rule__System__Group__2 : rule__System__Group__2__Impl ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:361:1: ( rule__System__Group__2__Impl )
            // InternalMyDsl.g:362:2: rule__System__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group__2__Impl();

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
    // $ANTLR end "rule__System__Group__2"


    // $ANTLR start "rule__System__Group__2__Impl"
    // InternalMyDsl.g:368:1: rule__System__Group__2__Impl : ( ( ( rule__System__ElementsAssignment_2 ) ) ( ( rule__System__ElementsAssignment_2 )* ) ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:372:1: ( ( ( ( rule__System__ElementsAssignment_2 ) ) ( ( rule__System__ElementsAssignment_2 )* ) ) )
            // InternalMyDsl.g:373:1: ( ( ( rule__System__ElementsAssignment_2 ) ) ( ( rule__System__ElementsAssignment_2 )* ) )
            {
            // InternalMyDsl.g:373:1: ( ( ( rule__System__ElementsAssignment_2 ) ) ( ( rule__System__ElementsAssignment_2 )* ) )
            // InternalMyDsl.g:374:2: ( ( rule__System__ElementsAssignment_2 ) ) ( ( rule__System__ElementsAssignment_2 )* )
            {
            // InternalMyDsl.g:374:2: ( ( rule__System__ElementsAssignment_2 ) )
            // InternalMyDsl.g:375:3: ( rule__System__ElementsAssignment_2 )
            {
             before(grammarAccess.getSystemAccess().getElementsAssignment_2()); 
            // InternalMyDsl.g:376:3: ( rule__System__ElementsAssignment_2 )
            // InternalMyDsl.g:376:4: rule__System__ElementsAssignment_2
            {
            pushFollow(FOLLOW_5);
            rule__System__ElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getElementsAssignment_2()); 

            }

            // InternalMyDsl.g:379:2: ( ( rule__System__ElementsAssignment_2 )* )
            // InternalMyDsl.g:380:3: ( rule__System__ElementsAssignment_2 )*
            {
             before(grammarAccess.getSystemAccess().getElementsAssignment_2()); 
            // InternalMyDsl.g:381:3: ( rule__System__ElementsAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17||LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:381:4: rule__System__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__System__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getElementsAssignment_2()); 

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
    // $ANTLR end "rule__System__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalMyDsl.g:391:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:395:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalMyDsl.g:396:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalMyDsl.g:403:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:407:1: ( ( 'entity' ) )
            // InternalMyDsl.g:408:1: ( 'entity' )
            {
            // InternalMyDsl.g:408:1: ( 'entity' )
            // InternalMyDsl.g:409:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

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
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalMyDsl.g:418:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:422:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalMyDsl.g:423:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalMyDsl.g:430:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:434:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalMyDsl.g:435:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:435:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalMyDsl.g:436:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:437:2: ( rule__Entity__NameAssignment_1 )
            // InternalMyDsl.g:437:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalMyDsl.g:445:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:449:1: ( rule__Entity__Group__2__Impl )
            // InternalMyDsl.g:450:2: rule__Entity__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__2__Impl();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalMyDsl.g:456:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__AttributesAssignment_2 )* ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:460:1: ( ( ( rule__Entity__AttributesAssignment_2 )* ) )
            // InternalMyDsl.g:461:1: ( ( rule__Entity__AttributesAssignment_2 )* )
            {
            // InternalMyDsl.g:461:1: ( ( rule__Entity__AttributesAssignment_2 )* )
            // InternalMyDsl.g:462:2: ( rule__Entity__AttributesAssignment_2 )*
            {
             before(grammarAccess.getEntityAccess().getAttributesAssignment_2()); 
            // InternalMyDsl.g:463:2: ( rule__Entity__AttributesAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:463:3: rule__Entity__AttributesAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Entity__AttributesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAttributesAssignment_2()); 

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
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalMyDsl.g:472:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:476:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalMyDsl.g:477:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalMyDsl.g:484:1: rule__Attribute__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:488:1: ( ( 'attribute' ) )
            // InternalMyDsl.g:489:1: ( 'attribute' )
            {
            // InternalMyDsl.g:489:1: ( 'attribute' )
            // InternalMyDsl.g:490:2: 'attribute'
            {
             before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 

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
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalMyDsl.g:499:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:503:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalMyDsl.g:504:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalMyDsl.g:511:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:515:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalMyDsl.g:516:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:516:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalMyDsl.g:517:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:518:2: ( rule__Attribute__NameAssignment_1 )
            // InternalMyDsl.g:518:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalMyDsl.g:526:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:530:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalMyDsl.g:531:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalMyDsl.g:538:1: rule__Attribute__Group__2__Impl : ( 'as' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:542:1: ( ( 'as' ) )
            // InternalMyDsl.g:543:1: ( 'as' )
            {
            // InternalMyDsl.g:543:1: ( 'as' )
            // InternalMyDsl.g:544:2: 'as'
            {
             before(grammarAccess.getAttributeAccess().getAsKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAsKeyword_2()); 

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
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalMyDsl.g:553:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:557:1: ( rule__Attribute__Group__3__Impl )
            // InternalMyDsl.g:558:2: rule__Attribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3__Impl();

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
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalMyDsl.g:564:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__TypeAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:568:1: ( ( ( rule__Attribute__TypeAssignment_3 ) ) )
            // InternalMyDsl.g:569:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            {
            // InternalMyDsl.g:569:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            // InternalMyDsl.g:570:2: ( rule__Attribute__TypeAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 
            // InternalMyDsl.g:571:2: ( rule__Attribute__TypeAssignment_3 )
            // InternalMyDsl.g:571:3: rule__Attribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Relation__Group_0__0"
    // InternalMyDsl.g:580:1: rule__Relation__Group_0__0 : rule__Relation__Group_0__0__Impl rule__Relation__Group_0__1 ;
    public final void rule__Relation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:584:1: ( rule__Relation__Group_0__0__Impl rule__Relation__Group_0__1 )
            // InternalMyDsl.g:585:2: rule__Relation__Group_0__0__Impl rule__Relation__Group_0__1
            {
            pushFollow(FOLLOW_10);
            rule__Relation__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group_0__1();

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
    // $ANTLR end "rule__Relation__Group_0__0"


    // $ANTLR start "rule__Relation__Group_0__0__Impl"
    // InternalMyDsl.g:592:1: rule__Relation__Group_0__0__Impl : ( () ) ;
    public final void rule__Relation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:596:1: ( ( () ) )
            // InternalMyDsl.g:597:1: ( () )
            {
            // InternalMyDsl.g:597:1: ( () )
            // InternalMyDsl.g:598:2: ()
            {
             before(grammarAccess.getRelationAccess().getInheritanceAction_0_0()); 
            // InternalMyDsl.g:599:2: ()
            // InternalMyDsl.g:599:3: 
            {
            }

             after(grammarAccess.getRelationAccess().getInheritanceAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_0__0__Impl"


    // $ANTLR start "rule__Relation__Group_0__1"
    // InternalMyDsl.g:607:1: rule__Relation__Group_0__1 : rule__Relation__Group_0__1__Impl rule__Relation__Group_0__2 ;
    public final void rule__Relation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:611:1: ( rule__Relation__Group_0__1__Impl rule__Relation__Group_0__2 )
            // InternalMyDsl.g:612:2: rule__Relation__Group_0__1__Impl rule__Relation__Group_0__2
            {
            pushFollow(FOLLOW_3);
            rule__Relation__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group_0__2();

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
    // $ANTLR end "rule__Relation__Group_0__1"


    // $ANTLR start "rule__Relation__Group_0__1__Impl"
    // InternalMyDsl.g:619:1: rule__Relation__Group_0__1__Impl : ( 'relation' ) ;
    public final void rule__Relation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:623:1: ( ( 'relation' ) )
            // InternalMyDsl.g:624:1: ( 'relation' )
            {
            // InternalMyDsl.g:624:1: ( 'relation' )
            // InternalMyDsl.g:625:2: 'relation'
            {
             before(grammarAccess.getRelationAccess().getRelationKeyword_0_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getRelationKeyword_0_1()); 

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
    // $ANTLR end "rule__Relation__Group_0__1__Impl"


    // $ANTLR start "rule__Relation__Group_0__2"
    // InternalMyDsl.g:634:1: rule__Relation__Group_0__2 : rule__Relation__Group_0__2__Impl rule__Relation__Group_0__3 ;
    public final void rule__Relation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:638:1: ( rule__Relation__Group_0__2__Impl rule__Relation__Group_0__3 )
            // InternalMyDsl.g:639:2: rule__Relation__Group_0__2__Impl rule__Relation__Group_0__3
            {
            pushFollow(FOLLOW_11);
            rule__Relation__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group_0__3();

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
    // $ANTLR end "rule__Relation__Group_0__2"


    // $ANTLR start "rule__Relation__Group_0__2__Impl"
    // InternalMyDsl.g:646:1: rule__Relation__Group_0__2__Impl : ( ( rule__Relation__BaseEntityAssignment_0_2 ) ) ;
    public final void rule__Relation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:650:1: ( ( ( rule__Relation__BaseEntityAssignment_0_2 ) ) )
            // InternalMyDsl.g:651:1: ( ( rule__Relation__BaseEntityAssignment_0_2 ) )
            {
            // InternalMyDsl.g:651:1: ( ( rule__Relation__BaseEntityAssignment_0_2 ) )
            // InternalMyDsl.g:652:2: ( rule__Relation__BaseEntityAssignment_0_2 )
            {
             before(grammarAccess.getRelationAccess().getBaseEntityAssignment_0_2()); 
            // InternalMyDsl.g:653:2: ( rule__Relation__BaseEntityAssignment_0_2 )
            // InternalMyDsl.g:653:3: rule__Relation__BaseEntityAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Relation__BaseEntityAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getBaseEntityAssignment_0_2()); 

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
    // $ANTLR end "rule__Relation__Group_0__2__Impl"


    // $ANTLR start "rule__Relation__Group_0__3"
    // InternalMyDsl.g:661:1: rule__Relation__Group_0__3 : rule__Relation__Group_0__3__Impl rule__Relation__Group_0__4 ;
    public final void rule__Relation__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:665:1: ( rule__Relation__Group_0__3__Impl rule__Relation__Group_0__4 )
            // InternalMyDsl.g:666:2: rule__Relation__Group_0__3__Impl rule__Relation__Group_0__4
            {
            pushFollow(FOLLOW_3);
            rule__Relation__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group_0__4();

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
    // $ANTLR end "rule__Relation__Group_0__3"


    // $ANTLR start "rule__Relation__Group_0__3__Impl"
    // InternalMyDsl.g:673:1: rule__Relation__Group_0__3__Impl : ( 'is' ) ;
    public final void rule__Relation__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:677:1: ( ( 'is' ) )
            // InternalMyDsl.g:678:1: ( 'is' )
            {
            // InternalMyDsl.g:678:1: ( 'is' )
            // InternalMyDsl.g:679:2: 'is'
            {
             before(grammarAccess.getRelationAccess().getIsKeyword_0_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getIsKeyword_0_3()); 

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
    // $ANTLR end "rule__Relation__Group_0__3__Impl"


    // $ANTLR start "rule__Relation__Group_0__4"
    // InternalMyDsl.g:688:1: rule__Relation__Group_0__4 : rule__Relation__Group_0__4__Impl ;
    public final void rule__Relation__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:692:1: ( rule__Relation__Group_0__4__Impl )
            // InternalMyDsl.g:693:2: rule__Relation__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group_0__4__Impl();

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
    // $ANTLR end "rule__Relation__Group_0__4"


    // $ANTLR start "rule__Relation__Group_0__4__Impl"
    // InternalMyDsl.g:699:1: rule__Relation__Group_0__4__Impl : ( ( rule__Relation__SuperEntityAssignment_0_4 ) ) ;
    public final void rule__Relation__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:703:1: ( ( ( rule__Relation__SuperEntityAssignment_0_4 ) ) )
            // InternalMyDsl.g:704:1: ( ( rule__Relation__SuperEntityAssignment_0_4 ) )
            {
            // InternalMyDsl.g:704:1: ( ( rule__Relation__SuperEntityAssignment_0_4 ) )
            // InternalMyDsl.g:705:2: ( rule__Relation__SuperEntityAssignment_0_4 )
            {
             before(grammarAccess.getRelationAccess().getSuperEntityAssignment_0_4()); 
            // InternalMyDsl.g:706:2: ( rule__Relation__SuperEntityAssignment_0_4 )
            // InternalMyDsl.g:706:3: rule__Relation__SuperEntityAssignment_0_4
            {
            pushFollow(FOLLOW_2);
            rule__Relation__SuperEntityAssignment_0_4();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getSuperEntityAssignment_0_4()); 

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
    // $ANTLR end "rule__Relation__Group_0__4__Impl"


    // $ANTLR start "rule__Relation__Group_1__0"
    // InternalMyDsl.g:715:1: rule__Relation__Group_1__0 : rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1 ;
    public final void rule__Relation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:719:1: ( rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1 )
            // InternalMyDsl.g:720:2: rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Relation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group_1__1();

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
    // $ANTLR end "rule__Relation__Group_1__0"


    // $ANTLR start "rule__Relation__Group_1__0__Impl"
    // InternalMyDsl.g:727:1: rule__Relation__Group_1__0__Impl : ( () ) ;
    public final void rule__Relation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:731:1: ( ( () ) )
            // InternalMyDsl.g:732:1: ( () )
            {
            // InternalMyDsl.g:732:1: ( () )
            // InternalMyDsl.g:733:2: ()
            {
             before(grammarAccess.getRelationAccess().getAssociationAction_1_0()); 
            // InternalMyDsl.g:734:2: ()
            // InternalMyDsl.g:734:3: 
            {
            }

             after(grammarAccess.getRelationAccess().getAssociationAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relation__Group_1__0__Impl"


    // $ANTLR start "rule__Relation__Group_1__1"
    // InternalMyDsl.g:742:1: rule__Relation__Group_1__1 : rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2 ;
    public final void rule__Relation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:746:1: ( rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2 )
            // InternalMyDsl.g:747:2: rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2
            {
            pushFollow(FOLLOW_12);
            rule__Relation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group_1__2();

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
    // $ANTLR end "rule__Relation__Group_1__1"


    // $ANTLR start "rule__Relation__Group_1__1__Impl"
    // InternalMyDsl.g:754:1: rule__Relation__Group_1__1__Impl : ( 'relation' ) ;
    public final void rule__Relation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:758:1: ( ( 'relation' ) )
            // InternalMyDsl.g:759:1: ( 'relation' )
            {
            // InternalMyDsl.g:759:1: ( 'relation' )
            // InternalMyDsl.g:760:2: 'relation'
            {
             before(grammarAccess.getRelationAccess().getRelationKeyword_1_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getRelationKeyword_1_1()); 

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
    // $ANTLR end "rule__Relation__Group_1__1__Impl"


    // $ANTLR start "rule__Relation__Group_1__2"
    // InternalMyDsl.g:769:1: rule__Relation__Group_1__2 : rule__Relation__Group_1__2__Impl rule__Relation__Group_1__3 ;
    public final void rule__Relation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:773:1: ( rule__Relation__Group_1__2__Impl rule__Relation__Group_1__3 )
            // InternalMyDsl.g:774:2: rule__Relation__Group_1__2__Impl rule__Relation__Group_1__3
            {
            pushFollow(FOLLOW_12);
            rule__Relation__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group_1__3();

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
    // $ANTLR end "rule__Relation__Group_1__2"


    // $ANTLR start "rule__Relation__Group_1__2__Impl"
    // InternalMyDsl.g:781:1: rule__Relation__Group_1__2__Impl : ( ( rule__Relation__Alternatives_1_2 )? ) ;
    public final void rule__Relation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:785:1: ( ( ( rule__Relation__Alternatives_1_2 )? ) )
            // InternalMyDsl.g:786:1: ( ( rule__Relation__Alternatives_1_2 )? )
            {
            // InternalMyDsl.g:786:1: ( ( rule__Relation__Alternatives_1_2 )? )
            // InternalMyDsl.g:787:2: ( rule__Relation__Alternatives_1_2 )?
            {
             before(grammarAccess.getRelationAccess().getAlternatives_1_2()); 
            // InternalMyDsl.g:788:2: ( rule__Relation__Alternatives_1_2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13||LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:788:3: rule__Relation__Alternatives_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relation__Alternatives_1_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationAccess().getAlternatives_1_2()); 

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
    // $ANTLR end "rule__Relation__Group_1__2__Impl"


    // $ANTLR start "rule__Relation__Group_1__3"
    // InternalMyDsl.g:796:1: rule__Relation__Group_1__3 : rule__Relation__Group_1__3__Impl rule__Relation__Group_1__4 ;
    public final void rule__Relation__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:800:1: ( rule__Relation__Group_1__3__Impl rule__Relation__Group_1__4 )
            // InternalMyDsl.g:801:2: rule__Relation__Group_1__3__Impl rule__Relation__Group_1__4
            {
            pushFollow(FOLLOW_13);
            rule__Relation__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group_1__4();

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
    // $ANTLR end "rule__Relation__Group_1__3"


    // $ANTLR start "rule__Relation__Group_1__3__Impl"
    // InternalMyDsl.g:808:1: rule__Relation__Group_1__3__Impl : ( ( rule__Relation__FromAssignment_1_3 ) ) ;
    public final void rule__Relation__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:812:1: ( ( ( rule__Relation__FromAssignment_1_3 ) ) )
            // InternalMyDsl.g:813:1: ( ( rule__Relation__FromAssignment_1_3 ) )
            {
            // InternalMyDsl.g:813:1: ( ( rule__Relation__FromAssignment_1_3 ) )
            // InternalMyDsl.g:814:2: ( rule__Relation__FromAssignment_1_3 )
            {
             before(grammarAccess.getRelationAccess().getFromAssignment_1_3()); 
            // InternalMyDsl.g:815:2: ( rule__Relation__FromAssignment_1_3 )
            // InternalMyDsl.g:815:3: rule__Relation__FromAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Relation__FromAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getFromAssignment_1_3()); 

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
    // $ANTLR end "rule__Relation__Group_1__3__Impl"


    // $ANTLR start "rule__Relation__Group_1__4"
    // InternalMyDsl.g:823:1: rule__Relation__Group_1__4 : rule__Relation__Group_1__4__Impl rule__Relation__Group_1__5 ;
    public final void rule__Relation__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:827:1: ( rule__Relation__Group_1__4__Impl rule__Relation__Group_1__5 )
            // InternalMyDsl.g:828:2: rule__Relation__Group_1__4__Impl rule__Relation__Group_1__5
            {
            pushFollow(FOLLOW_12);
            rule__Relation__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group_1__5();

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
    // $ANTLR end "rule__Relation__Group_1__4"


    // $ANTLR start "rule__Relation__Group_1__4__Impl"
    // InternalMyDsl.g:835:1: rule__Relation__Group_1__4__Impl : ( ( rule__Relation__Alternatives_1_4 ) ) ;
    public final void rule__Relation__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:839:1: ( ( ( rule__Relation__Alternatives_1_4 ) ) )
            // InternalMyDsl.g:840:1: ( ( rule__Relation__Alternatives_1_4 ) )
            {
            // InternalMyDsl.g:840:1: ( ( rule__Relation__Alternatives_1_4 ) )
            // InternalMyDsl.g:841:2: ( rule__Relation__Alternatives_1_4 )
            {
             before(grammarAccess.getRelationAccess().getAlternatives_1_4()); 
            // InternalMyDsl.g:842:2: ( rule__Relation__Alternatives_1_4 )
            // InternalMyDsl.g:842:3: rule__Relation__Alternatives_1_4
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Alternatives_1_4();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getAlternatives_1_4()); 

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
    // $ANTLR end "rule__Relation__Group_1__4__Impl"


    // $ANTLR start "rule__Relation__Group_1__5"
    // InternalMyDsl.g:850:1: rule__Relation__Group_1__5 : rule__Relation__Group_1__5__Impl rule__Relation__Group_1__6 ;
    public final void rule__Relation__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:854:1: ( rule__Relation__Group_1__5__Impl rule__Relation__Group_1__6 )
            // InternalMyDsl.g:855:2: rule__Relation__Group_1__5__Impl rule__Relation__Group_1__6
            {
            pushFollow(FOLLOW_12);
            rule__Relation__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relation__Group_1__6();

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
    // $ANTLR end "rule__Relation__Group_1__5"


    // $ANTLR start "rule__Relation__Group_1__5__Impl"
    // InternalMyDsl.g:862:1: rule__Relation__Group_1__5__Impl : ( ( rule__Relation__Alternatives_1_5 )? ) ;
    public final void rule__Relation__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:866:1: ( ( ( rule__Relation__Alternatives_1_5 )? ) )
            // InternalMyDsl.g:867:1: ( ( rule__Relation__Alternatives_1_5 )? )
            {
            // InternalMyDsl.g:867:1: ( ( rule__Relation__Alternatives_1_5 )? )
            // InternalMyDsl.g:868:2: ( rule__Relation__Alternatives_1_5 )?
            {
             before(grammarAccess.getRelationAccess().getAlternatives_1_5()); 
            // InternalMyDsl.g:869:2: ( rule__Relation__Alternatives_1_5 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13||LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:869:3: rule__Relation__Alternatives_1_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relation__Alternatives_1_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationAccess().getAlternatives_1_5()); 

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
    // $ANTLR end "rule__Relation__Group_1__5__Impl"


    // $ANTLR start "rule__Relation__Group_1__6"
    // InternalMyDsl.g:877:1: rule__Relation__Group_1__6 : rule__Relation__Group_1__6__Impl ;
    public final void rule__Relation__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:881:1: ( rule__Relation__Group_1__6__Impl )
            // InternalMyDsl.g:882:2: rule__Relation__Group_1__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group_1__6__Impl();

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
    // $ANTLR end "rule__Relation__Group_1__6"


    // $ANTLR start "rule__Relation__Group_1__6__Impl"
    // InternalMyDsl.g:888:1: rule__Relation__Group_1__6__Impl : ( ( rule__Relation__ToAssignment_1_6 ) ) ;
    public final void rule__Relation__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:892:1: ( ( ( rule__Relation__ToAssignment_1_6 ) ) )
            // InternalMyDsl.g:893:1: ( ( rule__Relation__ToAssignment_1_6 ) )
            {
            // InternalMyDsl.g:893:1: ( ( rule__Relation__ToAssignment_1_6 ) )
            // InternalMyDsl.g:894:2: ( rule__Relation__ToAssignment_1_6 )
            {
             before(grammarAccess.getRelationAccess().getToAssignment_1_6()); 
            // InternalMyDsl.g:895:2: ( rule__Relation__ToAssignment_1_6 )
            // InternalMyDsl.g:895:3: rule__Relation__ToAssignment_1_6
            {
            pushFollow(FOLLOW_2);
            rule__Relation__ToAssignment_1_6();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getToAssignment_1_6()); 

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
    // $ANTLR end "rule__Relation__Group_1__6__Impl"


    // $ANTLR start "rule__System__NameAssignment_1"
    // InternalMyDsl.g:904:1: rule__System__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__System__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:908:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:909:2: ( RULE_ID )
            {
            // InternalMyDsl.g:909:2: ( RULE_ID )
            // InternalMyDsl.g:910:3: RULE_ID
            {
             before(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__System__NameAssignment_1"


    // $ANTLR start "rule__System__ElementsAssignment_2"
    // InternalMyDsl.g:919:1: rule__System__ElementsAssignment_2 : ( ( rule__System__ElementsAlternatives_2_0 ) ) ;
    public final void rule__System__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:923:1: ( ( ( rule__System__ElementsAlternatives_2_0 ) ) )
            // InternalMyDsl.g:924:2: ( ( rule__System__ElementsAlternatives_2_0 ) )
            {
            // InternalMyDsl.g:924:2: ( ( rule__System__ElementsAlternatives_2_0 ) )
            // InternalMyDsl.g:925:3: ( rule__System__ElementsAlternatives_2_0 )
            {
             before(grammarAccess.getSystemAccess().getElementsAlternatives_2_0()); 
            // InternalMyDsl.g:926:3: ( rule__System__ElementsAlternatives_2_0 )
            // InternalMyDsl.g:926:4: rule__System__ElementsAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__System__ElementsAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getElementsAlternatives_2_0()); 

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
    // $ANTLR end "rule__System__ElementsAssignment_2"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalMyDsl.g:934:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:938:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:939:2: ( RULE_ID )
            {
            // InternalMyDsl.g:939:2: ( RULE_ID )
            // InternalMyDsl.g:940:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__AttributesAssignment_2"
    // InternalMyDsl.g:949:1: rule__Entity__AttributesAssignment_2 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:953:1: ( ( ruleAttribute ) )
            // InternalMyDsl.g:954:2: ( ruleAttribute )
            {
            // InternalMyDsl.g:954:2: ( ruleAttribute )
            // InternalMyDsl.g:955:3: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Entity__AttributesAssignment_2"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalMyDsl.g:964:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:968:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:969:2: ( RULE_ID )
            {
            // InternalMyDsl.g:969:2: ( RULE_ID )
            // InternalMyDsl.g:970:3: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__TypeAssignment_3"
    // InternalMyDsl.g:979:1: rule__Attribute__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__Attribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:983:1: ( ( ruleType ) )
            // InternalMyDsl.g:984:2: ( ruleType )
            {
            // InternalMyDsl.g:984:2: ( ruleType )
            // InternalMyDsl.g:985:3: ruleType
            {
             before(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeTypeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Attribute__TypeAssignment_3"


    // $ANTLR start "rule__Relation__BaseEntityAssignment_0_2"
    // InternalMyDsl.g:994:1: rule__Relation__BaseEntityAssignment_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__BaseEntityAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:998:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:999:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:999:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:1000:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getBaseEntityEntityCrossReference_0_2_0()); 
            // InternalMyDsl.g:1001:3: ( RULE_ID )
            // InternalMyDsl.g:1002:4: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getBaseEntityEntityIDTerminalRuleCall_0_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getBaseEntityEntityIDTerminalRuleCall_0_2_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getBaseEntityEntityCrossReference_0_2_0()); 

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
    // $ANTLR end "rule__Relation__BaseEntityAssignment_0_2"


    // $ANTLR start "rule__Relation__SuperEntityAssignment_0_4"
    // InternalMyDsl.g:1013:1: rule__Relation__SuperEntityAssignment_0_4 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__SuperEntityAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1017:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:1018:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:1018:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:1019:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getSuperEntityEntityCrossReference_0_4_0()); 
            // InternalMyDsl.g:1020:3: ( RULE_ID )
            // InternalMyDsl.g:1021:4: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getSuperEntityEntityIDTerminalRuleCall_0_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getSuperEntityEntityIDTerminalRuleCall_0_4_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getSuperEntityEntityCrossReference_0_4_0()); 

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
    // $ANTLR end "rule__Relation__SuperEntityAssignment_0_4"


    // $ANTLR start "rule__Relation__ManyFromAssignment_1_2_1"
    // InternalMyDsl.g:1032:1: rule__Relation__ManyFromAssignment_1_2_1 : ( ( 'many' ) ) ;
    public final void rule__Relation__ManyFromAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1036:1: ( ( ( 'many' ) ) )
            // InternalMyDsl.g:1037:2: ( ( 'many' ) )
            {
            // InternalMyDsl.g:1037:2: ( ( 'many' ) )
            // InternalMyDsl.g:1038:3: ( 'many' )
            {
             before(grammarAccess.getRelationAccess().getManyFromManyKeyword_1_2_1_0()); 
            // InternalMyDsl.g:1039:3: ( 'many' )
            // InternalMyDsl.g:1040:4: 'many'
            {
             before(grammarAccess.getRelationAccess().getManyFromManyKeyword_1_2_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getManyFromManyKeyword_1_2_1_0()); 

            }

             after(grammarAccess.getRelationAccess().getManyFromManyKeyword_1_2_1_0()); 

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
    // $ANTLR end "rule__Relation__ManyFromAssignment_1_2_1"


    // $ANTLR start "rule__Relation__FromAssignment_1_3"
    // InternalMyDsl.g:1051:1: rule__Relation__FromAssignment_1_3 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__FromAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1055:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:1056:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:1056:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:1057:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getFromEntityCrossReference_1_3_0()); 
            // InternalMyDsl.g:1058:3: ( RULE_ID )
            // InternalMyDsl.g:1059:4: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getFromEntityIDTerminalRuleCall_1_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getFromEntityIDTerminalRuleCall_1_3_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getFromEntityCrossReference_1_3_0()); 

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
    // $ANTLR end "rule__Relation__FromAssignment_1_3"


    // $ANTLR start "rule__Relation__ManyToAssignment_1_5_1"
    // InternalMyDsl.g:1070:1: rule__Relation__ManyToAssignment_1_5_1 : ( ( 'many' ) ) ;
    public final void rule__Relation__ManyToAssignment_1_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1074:1: ( ( ( 'many' ) ) )
            // InternalMyDsl.g:1075:2: ( ( 'many' ) )
            {
            // InternalMyDsl.g:1075:2: ( ( 'many' ) )
            // InternalMyDsl.g:1076:3: ( 'many' )
            {
             before(grammarAccess.getRelationAccess().getManyToManyKeyword_1_5_1_0()); 
            // InternalMyDsl.g:1077:3: ( 'many' )
            // InternalMyDsl.g:1078:4: 'many'
            {
             before(grammarAccess.getRelationAccess().getManyToManyKeyword_1_5_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getManyToManyKeyword_1_5_1_0()); 

            }

             after(grammarAccess.getRelationAccess().getManyToManyKeyword_1_5_1_0()); 

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
    // $ANTLR end "rule__Relation__ManyToAssignment_1_5_1"


    // $ANTLR start "rule__Relation__ToAssignment_1_6"
    // InternalMyDsl.g:1089:1: rule__Relation__ToAssignment_1_6 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__ToAssignment_1_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1093:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:1094:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:1094:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:1095:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getToEntityCrossReference_1_6_0()); 
            // InternalMyDsl.g:1096:3: ( RULE_ID )
            // InternalMyDsl.g:1097:4: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getToEntityIDTerminalRuleCall_1_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getToEntityIDTerminalRuleCall_1_6_0_1()); 

            }

             after(grammarAccess.getRelationAccess().getToEntityCrossReference_1_6_0()); 

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
    // $ANTLR end "rule__Relation__ToAssignment_1_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000120002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000402010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000000C000L});

}