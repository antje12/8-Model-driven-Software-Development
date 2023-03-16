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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'string'", "'number'", "'a'", "'has'", "'have'", "'system'", "'entity'", "'attribute'", "'as'", "'require'", "'=='", "'relation'", "'is'", "'many'"
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
    public static final int T__23=23;
    public static final int T__24=24;
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


    // $ANTLR start "entryRuleRequire"
    // InternalMyDsl.g:128:1: entryRuleRequire : ruleRequire EOF ;
    public final void entryRuleRequire() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleRequire EOF )
            // InternalMyDsl.g:130:1: ruleRequire EOF
            {
             before(grammarAccess.getRequireRule()); 
            pushFollow(FOLLOW_1);
            ruleRequire();

            state._fsp--;

             after(grammarAccess.getRequireRule()); 
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
    // $ANTLR end "entryRuleRequire"


    // $ANTLR start "ruleRequire"
    // InternalMyDsl.g:137:1: ruleRequire : ( ( rule__Require__Group__0 ) ) ;
    public final void ruleRequire() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Require__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Require__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Require__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Require__Group__0 )
            {
             before(grammarAccess.getRequireAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Require__Group__0 )
            // InternalMyDsl.g:144:4: rule__Require__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Require__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequireAccess().getGroup()); 

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
    // $ANTLR end "ruleRequire"


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:153:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleType EOF )
            // InternalMyDsl.g:155:1: ruleType EOF
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
    // InternalMyDsl.g:162:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Type__Alternatives ) )
            // InternalMyDsl.g:168:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:169:3: ( rule__Type__Alternatives )
            // InternalMyDsl.g:169:4: rule__Type__Alternatives
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
    // InternalMyDsl.g:178:1: entryRuleRelation : ruleRelation EOF ;
    public final void entryRuleRelation() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleRelation EOF )
            // InternalMyDsl.g:180:1: ruleRelation EOF
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
    // InternalMyDsl.g:187:1: ruleRelation : ( ( rule__Relation__Alternatives ) ) ;
    public final void ruleRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Relation__Alternatives ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Relation__Alternatives ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Relation__Alternatives ) )
            // InternalMyDsl.g:193:3: ( rule__Relation__Alternatives )
            {
             before(grammarAccess.getRelationAccess().getAlternatives()); 
            // InternalMyDsl.g:194:3: ( rule__Relation__Alternatives )
            // InternalMyDsl.g:194:4: rule__Relation__Alternatives
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
    // InternalMyDsl.g:202:1: rule__System__ElementsAlternatives_2_0 : ( ( ruleRelation ) | ( ruleEntity ) );
    public final void rule__System__ElementsAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:206:1: ( ( ruleRelation ) | ( ruleEntity ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==22) ) {
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
                    // InternalMyDsl.g:207:2: ( ruleRelation )
                    {
                    // InternalMyDsl.g:207:2: ( ruleRelation )
                    // InternalMyDsl.g:208:3: ruleRelation
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
                    // InternalMyDsl.g:213:2: ( ruleEntity )
                    {
                    // InternalMyDsl.g:213:2: ( ruleEntity )
                    // InternalMyDsl.g:214:3: ruleEntity
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


    // $ANTLR start "rule__Entity__ElementsAlternatives_2_0"
    // InternalMyDsl.g:223:1: rule__Entity__ElementsAlternatives_2_0 : ( ( ruleAttribute ) | ( ruleRequire ) );
    public final void rule__Entity__ElementsAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:227:1: ( ( ruleAttribute ) | ( ruleRequire ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:228:2: ( ruleAttribute )
                    {
                    // InternalMyDsl.g:228:2: ( ruleAttribute )
                    // InternalMyDsl.g:229:3: ruleAttribute
                    {
                     before(grammarAccess.getEntityAccess().getElementsAttributeParserRuleCall_2_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAttribute();

                    state._fsp--;

                     after(grammarAccess.getEntityAccess().getElementsAttributeParserRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:234:2: ( ruleRequire )
                    {
                    // InternalMyDsl.g:234:2: ( ruleRequire )
                    // InternalMyDsl.g:235:3: ruleRequire
                    {
                     before(grammarAccess.getEntityAccess().getElementsRequireParserRuleCall_2_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRequire();

                    state._fsp--;

                     after(grammarAccess.getEntityAccess().getElementsRequireParserRuleCall_2_0_1()); 

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
    // $ANTLR end "rule__Entity__ElementsAlternatives_2_0"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalMyDsl.g:244:1: rule__Type__Alternatives : ( ( 'string' ) | ( 'number' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:248:1: ( ( 'string' ) | ( 'number' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:249:2: ( 'string' )
                    {
                    // InternalMyDsl.g:249:2: ( 'string' )
                    // InternalMyDsl.g:250:3: 'string'
                    {
                     before(grammarAccess.getTypeAccess().getStringKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getStringKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:255:2: ( 'number' )
                    {
                    // InternalMyDsl.g:255:2: ( 'number' )
                    // InternalMyDsl.g:256:3: 'number'
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
    // InternalMyDsl.g:265:1: rule__Relation__Alternatives : ( ( ( rule__Relation__Group_0__0 ) ) | ( ( rule__Relation__Group_1__0 ) ) );
    public final void rule__Relation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:269:1: ( ( ( rule__Relation__Group_0__0 ) ) | ( ( rule__Relation__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==13||LA4_1==24) ) {
                    alt4=2;
                }
                else if ( (LA4_1==RULE_ID) ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3==23) ) {
                        alt4=1;
                    }
                    else if ( ((LA4_3>=14 && LA4_3<=15)) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:270:2: ( ( rule__Relation__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:270:2: ( ( rule__Relation__Group_0__0 ) )
                    // InternalMyDsl.g:271:3: ( rule__Relation__Group_0__0 )
                    {
                     before(grammarAccess.getRelationAccess().getGroup_0()); 
                    // InternalMyDsl.g:272:3: ( rule__Relation__Group_0__0 )
                    // InternalMyDsl.g:272:4: rule__Relation__Group_0__0
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
                    // InternalMyDsl.g:276:2: ( ( rule__Relation__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:276:2: ( ( rule__Relation__Group_1__0 ) )
                    // InternalMyDsl.g:277:3: ( rule__Relation__Group_1__0 )
                    {
                     before(grammarAccess.getRelationAccess().getGroup_1()); 
                    // InternalMyDsl.g:278:3: ( rule__Relation__Group_1__0 )
                    // InternalMyDsl.g:278:4: rule__Relation__Group_1__0
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
    // InternalMyDsl.g:286:1: rule__Relation__Alternatives_1_2 : ( ( 'a' ) | ( ( rule__Relation__ManyFromAssignment_1_2_1 ) ) );
    public final void rule__Relation__Alternatives_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:290:1: ( ( 'a' ) | ( ( rule__Relation__ManyFromAssignment_1_2_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==24) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:291:2: ( 'a' )
                    {
                    // InternalMyDsl.g:291:2: ( 'a' )
                    // InternalMyDsl.g:292:3: 'a'
                    {
                     before(grammarAccess.getRelationAccess().getAKeyword_1_2_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getRelationAccess().getAKeyword_1_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:297:2: ( ( rule__Relation__ManyFromAssignment_1_2_1 ) )
                    {
                    // InternalMyDsl.g:297:2: ( ( rule__Relation__ManyFromAssignment_1_2_1 ) )
                    // InternalMyDsl.g:298:3: ( rule__Relation__ManyFromAssignment_1_2_1 )
                    {
                     before(grammarAccess.getRelationAccess().getManyFromAssignment_1_2_1()); 
                    // InternalMyDsl.g:299:3: ( rule__Relation__ManyFromAssignment_1_2_1 )
                    // InternalMyDsl.g:299:4: rule__Relation__ManyFromAssignment_1_2_1
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
    // InternalMyDsl.g:307:1: rule__Relation__Alternatives_1_4 : ( ( 'has' ) | ( 'have' ) );
    public final void rule__Relation__Alternatives_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:311:1: ( ( 'has' ) | ( 'have' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:312:2: ( 'has' )
                    {
                    // InternalMyDsl.g:312:2: ( 'has' )
                    // InternalMyDsl.g:313:3: 'has'
                    {
                     before(grammarAccess.getRelationAccess().getHasKeyword_1_4_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getRelationAccess().getHasKeyword_1_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:318:2: ( 'have' )
                    {
                    // InternalMyDsl.g:318:2: ( 'have' )
                    // InternalMyDsl.g:319:3: 'have'
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
    // InternalMyDsl.g:328:1: rule__Relation__Alternatives_1_5 : ( ( 'a' ) | ( ( rule__Relation__ManyToAssignment_1_5_1 ) ) );
    public final void rule__Relation__Alternatives_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:332:1: ( ( 'a' ) | ( ( rule__Relation__ManyToAssignment_1_5_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            else if ( (LA7_0==24) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:333:2: ( 'a' )
                    {
                    // InternalMyDsl.g:333:2: ( 'a' )
                    // InternalMyDsl.g:334:3: 'a'
                    {
                     before(grammarAccess.getRelationAccess().getAKeyword_1_5_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getRelationAccess().getAKeyword_1_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:339:2: ( ( rule__Relation__ManyToAssignment_1_5_1 ) )
                    {
                    // InternalMyDsl.g:339:2: ( ( rule__Relation__ManyToAssignment_1_5_1 ) )
                    // InternalMyDsl.g:340:3: ( rule__Relation__ManyToAssignment_1_5_1 )
                    {
                     before(grammarAccess.getRelationAccess().getManyToAssignment_1_5_1()); 
                    // InternalMyDsl.g:341:3: ( rule__Relation__ManyToAssignment_1_5_1 )
                    // InternalMyDsl.g:341:4: rule__Relation__ManyToAssignment_1_5_1
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
    // InternalMyDsl.g:349:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:353:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // InternalMyDsl.g:354:2: rule__System__Group__0__Impl rule__System__Group__1
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
    // InternalMyDsl.g:361:1: rule__System__Group__0__Impl : ( 'system' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:365:1: ( ( 'system' ) )
            // InternalMyDsl.g:366:1: ( 'system' )
            {
            // InternalMyDsl.g:366:1: ( 'system' )
            // InternalMyDsl.g:367:2: 'system'
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
    // InternalMyDsl.g:376:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:380:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // InternalMyDsl.g:381:2: rule__System__Group__1__Impl rule__System__Group__2
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
    // InternalMyDsl.g:388:1: rule__System__Group__1__Impl : ( ( rule__System__NameAssignment_1 ) ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:392:1: ( ( ( rule__System__NameAssignment_1 ) ) )
            // InternalMyDsl.g:393:1: ( ( rule__System__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:393:1: ( ( rule__System__NameAssignment_1 ) )
            // InternalMyDsl.g:394:2: ( rule__System__NameAssignment_1 )
            {
             before(grammarAccess.getSystemAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:395:2: ( rule__System__NameAssignment_1 )
            // InternalMyDsl.g:395:3: rule__System__NameAssignment_1
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
    // InternalMyDsl.g:403:1: rule__System__Group__2 : rule__System__Group__2__Impl ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:407:1: ( rule__System__Group__2__Impl )
            // InternalMyDsl.g:408:2: rule__System__Group__2__Impl
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
    // InternalMyDsl.g:414:1: rule__System__Group__2__Impl : ( ( ( rule__System__ElementsAssignment_2 ) ) ( ( rule__System__ElementsAssignment_2 )* ) ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:418:1: ( ( ( ( rule__System__ElementsAssignment_2 ) ) ( ( rule__System__ElementsAssignment_2 )* ) ) )
            // InternalMyDsl.g:419:1: ( ( ( rule__System__ElementsAssignment_2 ) ) ( ( rule__System__ElementsAssignment_2 )* ) )
            {
            // InternalMyDsl.g:419:1: ( ( ( rule__System__ElementsAssignment_2 ) ) ( ( rule__System__ElementsAssignment_2 )* ) )
            // InternalMyDsl.g:420:2: ( ( rule__System__ElementsAssignment_2 ) ) ( ( rule__System__ElementsAssignment_2 )* )
            {
            // InternalMyDsl.g:420:2: ( ( rule__System__ElementsAssignment_2 ) )
            // InternalMyDsl.g:421:3: ( rule__System__ElementsAssignment_2 )
            {
             before(grammarAccess.getSystemAccess().getElementsAssignment_2()); 
            // InternalMyDsl.g:422:3: ( rule__System__ElementsAssignment_2 )
            // InternalMyDsl.g:422:4: rule__System__ElementsAssignment_2
            {
            pushFollow(FOLLOW_5);
            rule__System__ElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getElementsAssignment_2()); 

            }

            // InternalMyDsl.g:425:2: ( ( rule__System__ElementsAssignment_2 )* )
            // InternalMyDsl.g:426:3: ( rule__System__ElementsAssignment_2 )*
            {
             before(grammarAccess.getSystemAccess().getElementsAssignment_2()); 
            // InternalMyDsl.g:427:3: ( rule__System__ElementsAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17||LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:427:4: rule__System__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__System__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalMyDsl.g:437:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalMyDsl.g:442:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
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
    // InternalMyDsl.g:449:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:453:1: ( ( 'entity' ) )
            // InternalMyDsl.g:454:1: ( 'entity' )
            {
            // InternalMyDsl.g:454:1: ( 'entity' )
            // InternalMyDsl.g:455:2: 'entity'
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
    // InternalMyDsl.g:464:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:468:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalMyDsl.g:469:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
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
    // InternalMyDsl.g:476:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:480:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalMyDsl.g:481:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:481:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalMyDsl.g:482:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:483:2: ( rule__Entity__NameAssignment_1 )
            // InternalMyDsl.g:483:3: rule__Entity__NameAssignment_1
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
    // InternalMyDsl.g:491:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:495:1: ( rule__Entity__Group__2__Impl )
            // InternalMyDsl.g:496:2: rule__Entity__Group__2__Impl
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
    // InternalMyDsl.g:502:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__ElementsAssignment_2 )* ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:506:1: ( ( ( rule__Entity__ElementsAssignment_2 )* ) )
            // InternalMyDsl.g:507:1: ( ( rule__Entity__ElementsAssignment_2 )* )
            {
            // InternalMyDsl.g:507:1: ( ( rule__Entity__ElementsAssignment_2 )* )
            // InternalMyDsl.g:508:2: ( rule__Entity__ElementsAssignment_2 )*
            {
             before(grammarAccess.getEntityAccess().getElementsAssignment_2()); 
            // InternalMyDsl.g:509:2: ( rule__Entity__ElementsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18||LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:509:3: rule__Entity__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Entity__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getElementsAssignment_2()); 

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
    // InternalMyDsl.g:518:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:522:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalMyDsl.g:523:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalMyDsl.g:530:1: rule__Attribute__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:534:1: ( ( 'attribute' ) )
            // InternalMyDsl.g:535:1: ( 'attribute' )
            {
            // InternalMyDsl.g:535:1: ( 'attribute' )
            // InternalMyDsl.g:536:2: 'attribute'
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
    // InternalMyDsl.g:545:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:549:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalMyDsl.g:550:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalMyDsl.g:557:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:561:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalMyDsl.g:562:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:562:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalMyDsl.g:563:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:564:2: ( rule__Attribute__NameAssignment_1 )
            // InternalMyDsl.g:564:3: rule__Attribute__NameAssignment_1
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
    // InternalMyDsl.g:572:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:576:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalMyDsl.g:577:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
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
    // InternalMyDsl.g:584:1: rule__Attribute__Group__2__Impl : ( 'as' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:588:1: ( ( 'as' ) )
            // InternalMyDsl.g:589:1: ( 'as' )
            {
            // InternalMyDsl.g:589:1: ( 'as' )
            // InternalMyDsl.g:590:2: 'as'
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
    // InternalMyDsl.g:599:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:603:1: ( rule__Attribute__Group__3__Impl )
            // InternalMyDsl.g:604:2: rule__Attribute__Group__3__Impl
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
    // InternalMyDsl.g:610:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__TypeAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:614:1: ( ( ( rule__Attribute__TypeAssignment_3 ) ) )
            // InternalMyDsl.g:615:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            {
            // InternalMyDsl.g:615:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            // InternalMyDsl.g:616:2: ( rule__Attribute__TypeAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 
            // InternalMyDsl.g:617:2: ( rule__Attribute__TypeAssignment_3 )
            // InternalMyDsl.g:617:3: rule__Attribute__TypeAssignment_3
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


    // $ANTLR start "rule__Require__Group__0"
    // InternalMyDsl.g:626:1: rule__Require__Group__0 : rule__Require__Group__0__Impl rule__Require__Group__1 ;
    public final void rule__Require__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:630:1: ( rule__Require__Group__0__Impl rule__Require__Group__1 )
            // InternalMyDsl.g:631:2: rule__Require__Group__0__Impl rule__Require__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Require__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Require__Group__1();

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
    // $ANTLR end "rule__Require__Group__0"


    // $ANTLR start "rule__Require__Group__0__Impl"
    // InternalMyDsl.g:638:1: rule__Require__Group__0__Impl : ( 'require' ) ;
    public final void rule__Require__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:642:1: ( ( 'require' ) )
            // InternalMyDsl.g:643:1: ( 'require' )
            {
            // InternalMyDsl.g:643:1: ( 'require' )
            // InternalMyDsl.g:644:2: 'require'
            {
             before(grammarAccess.getRequireAccess().getRequireKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRequireAccess().getRequireKeyword_0()); 

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
    // $ANTLR end "rule__Require__Group__0__Impl"


    // $ANTLR start "rule__Require__Group__1"
    // InternalMyDsl.g:653:1: rule__Require__Group__1 : rule__Require__Group__1__Impl rule__Require__Group__2 ;
    public final void rule__Require__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:657:1: ( rule__Require__Group__1__Impl rule__Require__Group__2 )
            // InternalMyDsl.g:658:2: rule__Require__Group__1__Impl rule__Require__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Require__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Require__Group__2();

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
    // $ANTLR end "rule__Require__Group__1"


    // $ANTLR start "rule__Require__Group__1__Impl"
    // InternalMyDsl.g:665:1: rule__Require__Group__1__Impl : ( ( rule__Require__VarRefAssignment_1 ) ) ;
    public final void rule__Require__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:669:1: ( ( ( rule__Require__VarRefAssignment_1 ) ) )
            // InternalMyDsl.g:670:1: ( ( rule__Require__VarRefAssignment_1 ) )
            {
            // InternalMyDsl.g:670:1: ( ( rule__Require__VarRefAssignment_1 ) )
            // InternalMyDsl.g:671:2: ( rule__Require__VarRefAssignment_1 )
            {
             before(grammarAccess.getRequireAccess().getVarRefAssignment_1()); 
            // InternalMyDsl.g:672:2: ( rule__Require__VarRefAssignment_1 )
            // InternalMyDsl.g:672:3: rule__Require__VarRefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Require__VarRefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRequireAccess().getVarRefAssignment_1()); 

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
    // $ANTLR end "rule__Require__Group__1__Impl"


    // $ANTLR start "rule__Require__Group__2"
    // InternalMyDsl.g:680:1: rule__Require__Group__2 : rule__Require__Group__2__Impl rule__Require__Group__3 ;
    public final void rule__Require__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:684:1: ( rule__Require__Group__2__Impl rule__Require__Group__3 )
            // InternalMyDsl.g:685:2: rule__Require__Group__2__Impl rule__Require__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Require__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Require__Group__3();

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
    // $ANTLR end "rule__Require__Group__2"


    // $ANTLR start "rule__Require__Group__2__Impl"
    // InternalMyDsl.g:692:1: rule__Require__Group__2__Impl : ( '==' ) ;
    public final void rule__Require__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:696:1: ( ( '==' ) )
            // InternalMyDsl.g:697:1: ( '==' )
            {
            // InternalMyDsl.g:697:1: ( '==' )
            // InternalMyDsl.g:698:2: '=='
            {
             before(grammarAccess.getRequireAccess().getEqualsSignEqualsSignKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRequireAccess().getEqualsSignEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__Require__Group__2__Impl"


    // $ANTLR start "rule__Require__Group__3"
    // InternalMyDsl.g:707:1: rule__Require__Group__3 : rule__Require__Group__3__Impl ;
    public final void rule__Require__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:711:1: ( rule__Require__Group__3__Impl )
            // InternalMyDsl.g:712:2: rule__Require__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Require__Group__3__Impl();

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
    // $ANTLR end "rule__Require__Group__3"


    // $ANTLR start "rule__Require__Group__3__Impl"
    // InternalMyDsl.g:718:1: rule__Require__Group__3__Impl : ( ( rule__Require__ExpAssignment_3 ) ) ;
    public final void rule__Require__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:722:1: ( ( ( rule__Require__ExpAssignment_3 ) ) )
            // InternalMyDsl.g:723:1: ( ( rule__Require__ExpAssignment_3 ) )
            {
            // InternalMyDsl.g:723:1: ( ( rule__Require__ExpAssignment_3 ) )
            // InternalMyDsl.g:724:2: ( rule__Require__ExpAssignment_3 )
            {
             before(grammarAccess.getRequireAccess().getExpAssignment_3()); 
            // InternalMyDsl.g:725:2: ( rule__Require__ExpAssignment_3 )
            // InternalMyDsl.g:725:3: rule__Require__ExpAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Require__ExpAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRequireAccess().getExpAssignment_3()); 

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
    // $ANTLR end "rule__Require__Group__3__Impl"


    // $ANTLR start "rule__Relation__Group_0__0"
    // InternalMyDsl.g:734:1: rule__Relation__Group_0__0 : rule__Relation__Group_0__0__Impl rule__Relation__Group_0__1 ;
    public final void rule__Relation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:738:1: ( rule__Relation__Group_0__0__Impl rule__Relation__Group_0__1 )
            // InternalMyDsl.g:739:2: rule__Relation__Group_0__0__Impl rule__Relation__Group_0__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:746:1: rule__Relation__Group_0__0__Impl : ( () ) ;
    public final void rule__Relation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:750:1: ( ( () ) )
            // InternalMyDsl.g:751:1: ( () )
            {
            // InternalMyDsl.g:751:1: ( () )
            // InternalMyDsl.g:752:2: ()
            {
             before(grammarAccess.getRelationAccess().getInheritanceAction_0_0()); 
            // InternalMyDsl.g:753:2: ()
            // InternalMyDsl.g:753:3: 
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
    // InternalMyDsl.g:761:1: rule__Relation__Group_0__1 : rule__Relation__Group_0__1__Impl rule__Relation__Group_0__2 ;
    public final void rule__Relation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:765:1: ( rule__Relation__Group_0__1__Impl rule__Relation__Group_0__2 )
            // InternalMyDsl.g:766:2: rule__Relation__Group_0__1__Impl rule__Relation__Group_0__2
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
    // InternalMyDsl.g:773:1: rule__Relation__Group_0__1__Impl : ( 'relation' ) ;
    public final void rule__Relation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:777:1: ( ( 'relation' ) )
            // InternalMyDsl.g:778:1: ( 'relation' )
            {
            // InternalMyDsl.g:778:1: ( 'relation' )
            // InternalMyDsl.g:779:2: 'relation'
            {
             before(grammarAccess.getRelationAccess().getRelationKeyword_0_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:788:1: rule__Relation__Group_0__2 : rule__Relation__Group_0__2__Impl rule__Relation__Group_0__3 ;
    public final void rule__Relation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:792:1: ( rule__Relation__Group_0__2__Impl rule__Relation__Group_0__3 )
            // InternalMyDsl.g:793:2: rule__Relation__Group_0__2__Impl rule__Relation__Group_0__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:800:1: rule__Relation__Group_0__2__Impl : ( ( rule__Relation__BaseEntityAssignment_0_2 ) ) ;
    public final void rule__Relation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:804:1: ( ( ( rule__Relation__BaseEntityAssignment_0_2 ) ) )
            // InternalMyDsl.g:805:1: ( ( rule__Relation__BaseEntityAssignment_0_2 ) )
            {
            // InternalMyDsl.g:805:1: ( ( rule__Relation__BaseEntityAssignment_0_2 ) )
            // InternalMyDsl.g:806:2: ( rule__Relation__BaseEntityAssignment_0_2 )
            {
             before(grammarAccess.getRelationAccess().getBaseEntityAssignment_0_2()); 
            // InternalMyDsl.g:807:2: ( rule__Relation__BaseEntityAssignment_0_2 )
            // InternalMyDsl.g:807:3: rule__Relation__BaseEntityAssignment_0_2
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
    // InternalMyDsl.g:815:1: rule__Relation__Group_0__3 : rule__Relation__Group_0__3__Impl rule__Relation__Group_0__4 ;
    public final void rule__Relation__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:819:1: ( rule__Relation__Group_0__3__Impl rule__Relation__Group_0__4 )
            // InternalMyDsl.g:820:2: rule__Relation__Group_0__3__Impl rule__Relation__Group_0__4
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
    // InternalMyDsl.g:827:1: rule__Relation__Group_0__3__Impl : ( 'is' ) ;
    public final void rule__Relation__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:831:1: ( ( 'is' ) )
            // InternalMyDsl.g:832:1: ( 'is' )
            {
            // InternalMyDsl.g:832:1: ( 'is' )
            // InternalMyDsl.g:833:2: 'is'
            {
             before(grammarAccess.getRelationAccess().getIsKeyword_0_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMyDsl.g:842:1: rule__Relation__Group_0__4 : rule__Relation__Group_0__4__Impl ;
    public final void rule__Relation__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:846:1: ( rule__Relation__Group_0__4__Impl )
            // InternalMyDsl.g:847:2: rule__Relation__Group_0__4__Impl
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
    // InternalMyDsl.g:853:1: rule__Relation__Group_0__4__Impl : ( ( rule__Relation__SuperEntityAssignment_0_4 ) ) ;
    public final void rule__Relation__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:857:1: ( ( ( rule__Relation__SuperEntityAssignment_0_4 ) ) )
            // InternalMyDsl.g:858:1: ( ( rule__Relation__SuperEntityAssignment_0_4 ) )
            {
            // InternalMyDsl.g:858:1: ( ( rule__Relation__SuperEntityAssignment_0_4 ) )
            // InternalMyDsl.g:859:2: ( rule__Relation__SuperEntityAssignment_0_4 )
            {
             before(grammarAccess.getRelationAccess().getSuperEntityAssignment_0_4()); 
            // InternalMyDsl.g:860:2: ( rule__Relation__SuperEntityAssignment_0_4 )
            // InternalMyDsl.g:860:3: rule__Relation__SuperEntityAssignment_0_4
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
    // InternalMyDsl.g:869:1: rule__Relation__Group_1__0 : rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1 ;
    public final void rule__Relation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:873:1: ( rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1 )
            // InternalMyDsl.g:874:2: rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:881:1: rule__Relation__Group_1__0__Impl : ( () ) ;
    public final void rule__Relation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:885:1: ( ( () ) )
            // InternalMyDsl.g:886:1: ( () )
            {
            // InternalMyDsl.g:886:1: ( () )
            // InternalMyDsl.g:887:2: ()
            {
             before(grammarAccess.getRelationAccess().getAssociationAction_1_0()); 
            // InternalMyDsl.g:888:2: ()
            // InternalMyDsl.g:888:3: 
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
    // InternalMyDsl.g:896:1: rule__Relation__Group_1__1 : rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2 ;
    public final void rule__Relation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:900:1: ( rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2 )
            // InternalMyDsl.g:901:2: rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:908:1: rule__Relation__Group_1__1__Impl : ( 'relation' ) ;
    public final void rule__Relation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:912:1: ( ( 'relation' ) )
            // InternalMyDsl.g:913:1: ( 'relation' )
            {
            // InternalMyDsl.g:913:1: ( 'relation' )
            // InternalMyDsl.g:914:2: 'relation'
            {
             before(grammarAccess.getRelationAccess().getRelationKeyword_1_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:923:1: rule__Relation__Group_1__2 : rule__Relation__Group_1__2__Impl rule__Relation__Group_1__3 ;
    public final void rule__Relation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:927:1: ( rule__Relation__Group_1__2__Impl rule__Relation__Group_1__3 )
            // InternalMyDsl.g:928:2: rule__Relation__Group_1__2__Impl rule__Relation__Group_1__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:935:1: rule__Relation__Group_1__2__Impl : ( ( rule__Relation__Alternatives_1_2 )? ) ;
    public final void rule__Relation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:939:1: ( ( ( rule__Relation__Alternatives_1_2 )? ) )
            // InternalMyDsl.g:940:1: ( ( rule__Relation__Alternatives_1_2 )? )
            {
            // InternalMyDsl.g:940:1: ( ( rule__Relation__Alternatives_1_2 )? )
            // InternalMyDsl.g:941:2: ( rule__Relation__Alternatives_1_2 )?
            {
             before(grammarAccess.getRelationAccess().getAlternatives_1_2()); 
            // InternalMyDsl.g:942:2: ( rule__Relation__Alternatives_1_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13||LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:942:3: rule__Relation__Alternatives_1_2
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
    // InternalMyDsl.g:950:1: rule__Relation__Group_1__3 : rule__Relation__Group_1__3__Impl rule__Relation__Group_1__4 ;
    public final void rule__Relation__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:954:1: ( rule__Relation__Group_1__3__Impl rule__Relation__Group_1__4 )
            // InternalMyDsl.g:955:2: rule__Relation__Group_1__3__Impl rule__Relation__Group_1__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:962:1: rule__Relation__Group_1__3__Impl : ( ( rule__Relation__FromAssignment_1_3 ) ) ;
    public final void rule__Relation__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:966:1: ( ( ( rule__Relation__FromAssignment_1_3 ) ) )
            // InternalMyDsl.g:967:1: ( ( rule__Relation__FromAssignment_1_3 ) )
            {
            // InternalMyDsl.g:967:1: ( ( rule__Relation__FromAssignment_1_3 ) )
            // InternalMyDsl.g:968:2: ( rule__Relation__FromAssignment_1_3 )
            {
             before(grammarAccess.getRelationAccess().getFromAssignment_1_3()); 
            // InternalMyDsl.g:969:2: ( rule__Relation__FromAssignment_1_3 )
            // InternalMyDsl.g:969:3: rule__Relation__FromAssignment_1_3
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
    // InternalMyDsl.g:977:1: rule__Relation__Group_1__4 : rule__Relation__Group_1__4__Impl rule__Relation__Group_1__5 ;
    public final void rule__Relation__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:981:1: ( rule__Relation__Group_1__4__Impl rule__Relation__Group_1__5 )
            // InternalMyDsl.g:982:2: rule__Relation__Group_1__4__Impl rule__Relation__Group_1__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:989:1: rule__Relation__Group_1__4__Impl : ( ( rule__Relation__Alternatives_1_4 ) ) ;
    public final void rule__Relation__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:993:1: ( ( ( rule__Relation__Alternatives_1_4 ) ) )
            // InternalMyDsl.g:994:1: ( ( rule__Relation__Alternatives_1_4 ) )
            {
            // InternalMyDsl.g:994:1: ( ( rule__Relation__Alternatives_1_4 ) )
            // InternalMyDsl.g:995:2: ( rule__Relation__Alternatives_1_4 )
            {
             before(grammarAccess.getRelationAccess().getAlternatives_1_4()); 
            // InternalMyDsl.g:996:2: ( rule__Relation__Alternatives_1_4 )
            // InternalMyDsl.g:996:3: rule__Relation__Alternatives_1_4
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
    // InternalMyDsl.g:1004:1: rule__Relation__Group_1__5 : rule__Relation__Group_1__5__Impl rule__Relation__Group_1__6 ;
    public final void rule__Relation__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1008:1: ( rule__Relation__Group_1__5__Impl rule__Relation__Group_1__6 )
            // InternalMyDsl.g:1009:2: rule__Relation__Group_1__5__Impl rule__Relation__Group_1__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:1016:1: rule__Relation__Group_1__5__Impl : ( ( rule__Relation__Alternatives_1_5 )? ) ;
    public final void rule__Relation__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1020:1: ( ( ( rule__Relation__Alternatives_1_5 )? ) )
            // InternalMyDsl.g:1021:1: ( ( rule__Relation__Alternatives_1_5 )? )
            {
            // InternalMyDsl.g:1021:1: ( ( rule__Relation__Alternatives_1_5 )? )
            // InternalMyDsl.g:1022:2: ( rule__Relation__Alternatives_1_5 )?
            {
             before(grammarAccess.getRelationAccess().getAlternatives_1_5()); 
            // InternalMyDsl.g:1023:2: ( rule__Relation__Alternatives_1_5 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==13||LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1023:3: rule__Relation__Alternatives_1_5
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
    // InternalMyDsl.g:1031:1: rule__Relation__Group_1__6 : rule__Relation__Group_1__6__Impl ;
    public final void rule__Relation__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1035:1: ( rule__Relation__Group_1__6__Impl )
            // InternalMyDsl.g:1036:2: rule__Relation__Group_1__6__Impl
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
    // InternalMyDsl.g:1042:1: rule__Relation__Group_1__6__Impl : ( ( rule__Relation__ToAssignment_1_6 ) ) ;
    public final void rule__Relation__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1046:1: ( ( ( rule__Relation__ToAssignment_1_6 ) ) )
            // InternalMyDsl.g:1047:1: ( ( rule__Relation__ToAssignment_1_6 ) )
            {
            // InternalMyDsl.g:1047:1: ( ( rule__Relation__ToAssignment_1_6 ) )
            // InternalMyDsl.g:1048:2: ( rule__Relation__ToAssignment_1_6 )
            {
             before(grammarAccess.getRelationAccess().getToAssignment_1_6()); 
            // InternalMyDsl.g:1049:2: ( rule__Relation__ToAssignment_1_6 )
            // InternalMyDsl.g:1049:3: rule__Relation__ToAssignment_1_6
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
    // InternalMyDsl.g:1058:1: rule__System__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__System__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1062:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1063:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1063:2: ( RULE_ID )
            // InternalMyDsl.g:1064:3: RULE_ID
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
    // InternalMyDsl.g:1073:1: rule__System__ElementsAssignment_2 : ( ( rule__System__ElementsAlternatives_2_0 ) ) ;
    public final void rule__System__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1077:1: ( ( ( rule__System__ElementsAlternatives_2_0 ) ) )
            // InternalMyDsl.g:1078:2: ( ( rule__System__ElementsAlternatives_2_0 ) )
            {
            // InternalMyDsl.g:1078:2: ( ( rule__System__ElementsAlternatives_2_0 ) )
            // InternalMyDsl.g:1079:3: ( rule__System__ElementsAlternatives_2_0 )
            {
             before(grammarAccess.getSystemAccess().getElementsAlternatives_2_0()); 
            // InternalMyDsl.g:1080:3: ( rule__System__ElementsAlternatives_2_0 )
            // InternalMyDsl.g:1080:4: rule__System__ElementsAlternatives_2_0
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
    // InternalMyDsl.g:1088:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1092:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1093:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1093:2: ( RULE_ID )
            // InternalMyDsl.g:1094:3: RULE_ID
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


    // $ANTLR start "rule__Entity__ElementsAssignment_2"
    // InternalMyDsl.g:1103:1: rule__Entity__ElementsAssignment_2 : ( ( rule__Entity__ElementsAlternatives_2_0 ) ) ;
    public final void rule__Entity__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1107:1: ( ( ( rule__Entity__ElementsAlternatives_2_0 ) ) )
            // InternalMyDsl.g:1108:2: ( ( rule__Entity__ElementsAlternatives_2_0 ) )
            {
            // InternalMyDsl.g:1108:2: ( ( rule__Entity__ElementsAlternatives_2_0 ) )
            // InternalMyDsl.g:1109:3: ( rule__Entity__ElementsAlternatives_2_0 )
            {
             before(grammarAccess.getEntityAccess().getElementsAlternatives_2_0()); 
            // InternalMyDsl.g:1110:3: ( rule__Entity__ElementsAlternatives_2_0 )
            // InternalMyDsl.g:1110:4: rule__Entity__ElementsAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__ElementsAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getElementsAlternatives_2_0()); 

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
    // $ANTLR end "rule__Entity__ElementsAssignment_2"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalMyDsl.g:1118:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1122:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1123:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1123:2: ( RULE_ID )
            // InternalMyDsl.g:1124:3: RULE_ID
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
    // InternalMyDsl.g:1133:1: rule__Attribute__TypeAssignment_3 : ( ruleType ) ;
    public final void rule__Attribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1137:1: ( ( ruleType ) )
            // InternalMyDsl.g:1138:2: ( ruleType )
            {
            // InternalMyDsl.g:1138:2: ( ruleType )
            // InternalMyDsl.g:1139:3: ruleType
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


    // $ANTLR start "rule__Require__VarRefAssignment_1"
    // InternalMyDsl.g:1148:1: rule__Require__VarRefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Require__VarRefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1152:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:1153:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:1153:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:1154:3: ( RULE_ID )
            {
             before(grammarAccess.getRequireAccess().getVarRefAttributeCrossReference_1_0()); 
            // InternalMyDsl.g:1155:3: ( RULE_ID )
            // InternalMyDsl.g:1156:4: RULE_ID
            {
             before(grammarAccess.getRequireAccess().getVarRefAttributeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRequireAccess().getVarRefAttributeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRequireAccess().getVarRefAttributeCrossReference_1_0()); 

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
    // $ANTLR end "rule__Require__VarRefAssignment_1"


    // $ANTLR start "rule__Require__ExpAssignment_3"
    // InternalMyDsl.g:1167:1: rule__Require__ExpAssignment_3 : ( RULE_INT ) ;
    public final void rule__Require__ExpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1171:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1172:2: ( RULE_INT )
            {
            // InternalMyDsl.g:1172:2: ( RULE_INT )
            // InternalMyDsl.g:1173:3: RULE_INT
            {
             before(grammarAccess.getRequireAccess().getExpINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRequireAccess().getExpINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Require__ExpAssignment_3"


    // $ANTLR start "rule__Relation__BaseEntityAssignment_0_2"
    // InternalMyDsl.g:1182:1: rule__Relation__BaseEntityAssignment_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__BaseEntityAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1186:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:1187:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:1187:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:1188:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getBaseEntityEntityCrossReference_0_2_0()); 
            // InternalMyDsl.g:1189:3: ( RULE_ID )
            // InternalMyDsl.g:1190:4: RULE_ID
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
    // InternalMyDsl.g:1201:1: rule__Relation__SuperEntityAssignment_0_4 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__SuperEntityAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1205:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:1206:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:1206:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:1207:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getSuperEntityEntityCrossReference_0_4_0()); 
            // InternalMyDsl.g:1208:3: ( RULE_ID )
            // InternalMyDsl.g:1209:4: RULE_ID
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
    // InternalMyDsl.g:1220:1: rule__Relation__ManyFromAssignment_1_2_1 : ( ( 'many' ) ) ;
    public final void rule__Relation__ManyFromAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1224:1: ( ( ( 'many' ) ) )
            // InternalMyDsl.g:1225:2: ( ( 'many' ) )
            {
            // InternalMyDsl.g:1225:2: ( ( 'many' ) )
            // InternalMyDsl.g:1226:3: ( 'many' )
            {
             before(grammarAccess.getRelationAccess().getManyFromManyKeyword_1_2_1_0()); 
            // InternalMyDsl.g:1227:3: ( 'many' )
            // InternalMyDsl.g:1228:4: 'many'
            {
             before(grammarAccess.getRelationAccess().getManyFromManyKeyword_1_2_1_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:1239:1: rule__Relation__FromAssignment_1_3 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__FromAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1243:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:1244:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:1244:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:1245:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getFromEntityCrossReference_1_3_0()); 
            // InternalMyDsl.g:1246:3: ( RULE_ID )
            // InternalMyDsl.g:1247:4: RULE_ID
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
    // InternalMyDsl.g:1258:1: rule__Relation__ManyToAssignment_1_5_1 : ( ( 'many' ) ) ;
    public final void rule__Relation__ManyToAssignment_1_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1262:1: ( ( ( 'many' ) ) )
            // InternalMyDsl.g:1263:2: ( ( 'many' ) )
            {
            // InternalMyDsl.g:1263:2: ( ( 'many' ) )
            // InternalMyDsl.g:1264:3: ( 'many' )
            {
             before(grammarAccess.getRelationAccess().getManyToManyKeyword_1_5_1_0()); 
            // InternalMyDsl.g:1265:3: ( 'many' )
            // InternalMyDsl.g:1266:4: 'many'
            {
             before(grammarAccess.getRelationAccess().getManyToManyKeyword_1_5_1_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:1277:1: rule__Relation__ToAssignment_1_6 : ( ( RULE_ID ) ) ;
    public final void rule__Relation__ToAssignment_1_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1281:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:1282:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:1282:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:1283:3: ( RULE_ID )
            {
             before(grammarAccess.getRelationAccess().getToEntityCrossReference_1_6_0()); 
            // InternalMyDsl.g:1284:3: ( RULE_ID )
            // InternalMyDsl.g:1285:4: RULE_ID
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000420002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000140002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001002010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000000C000L});

}