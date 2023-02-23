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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'string'", "'number'", "'a'", "'many'", "'has'", "'have'", "'system'", "'entity'", "'attribute'", "'as'", "'relation'", "'is'"
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


    // $ANTLR start "rule__Type__Alternatives"
    // InternalMyDsl.g:177:1: rule__Type__Alternatives : ( ( 'string' ) | ( 'number' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:181:1: ( ( 'string' ) | ( 'number' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
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
                    // InternalMyDsl.g:182:2: ( 'string' )
                    {
                    // InternalMyDsl.g:182:2: ( 'string' )
                    // InternalMyDsl.g:183:3: 'string'
                    {
                     before(grammarAccess.getTypeAccess().getStringKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getStringKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:188:2: ( 'number' )
                    {
                    // InternalMyDsl.g:188:2: ( 'number' )
                    // InternalMyDsl.g:189:3: 'number'
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
    // InternalMyDsl.g:198:1: rule__Relation__Alternatives : ( ( ( rule__Relation__Group_0__0 ) ) | ( ( rule__Relation__Group_1__0 ) ) );
    public final void rule__Relation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:202:1: ( ( ( rule__Relation__Group_0__0 ) ) | ( ( rule__Relation__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==22) ) {
                        alt2=1;
                    }
                    else if ( ((LA2_2>=15 && LA2_2<=16)) ) {
                        alt2=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else if ( ((LA2_1>=13 && LA2_1<=14)) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:203:2: ( ( rule__Relation__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:203:2: ( ( rule__Relation__Group_0__0 ) )
                    // InternalMyDsl.g:204:3: ( rule__Relation__Group_0__0 )
                    {
                     before(grammarAccess.getRelationAccess().getGroup_0()); 
                    // InternalMyDsl.g:205:3: ( rule__Relation__Group_0__0 )
                    // InternalMyDsl.g:205:4: rule__Relation__Group_0__0
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
                    // InternalMyDsl.g:209:2: ( ( rule__Relation__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:209:2: ( ( rule__Relation__Group_1__0 ) )
                    // InternalMyDsl.g:210:3: ( rule__Relation__Group_1__0 )
                    {
                     before(grammarAccess.getRelationAccess().getGroup_1()); 
                    // InternalMyDsl.g:211:3: ( rule__Relation__Group_1__0 )
                    // InternalMyDsl.g:211:4: rule__Relation__Group_1__0
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


    // $ANTLR start "rule__Relation__Alternatives_1_1"
    // InternalMyDsl.g:219:1: rule__Relation__Alternatives_1_1 : ( ( 'a' ) | ( 'many' ) );
    public final void rule__Relation__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:223:1: ( ( 'a' ) | ( 'many' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:224:2: ( 'a' )
                    {
                    // InternalMyDsl.g:224:2: ( 'a' )
                    // InternalMyDsl.g:225:3: 'a'
                    {
                     before(grammarAccess.getRelationAccess().getAKeyword_1_1_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getRelationAccess().getAKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:230:2: ( 'many' )
                    {
                    // InternalMyDsl.g:230:2: ( 'many' )
                    // InternalMyDsl.g:231:3: 'many'
                    {
                     before(grammarAccess.getRelationAccess().getManyKeyword_1_1_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getRelationAccess().getManyKeyword_1_1_1()); 

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
    // $ANTLR end "rule__Relation__Alternatives_1_1"


    // $ANTLR start "rule__Relation__Alternatives_1_3"
    // InternalMyDsl.g:240:1: rule__Relation__Alternatives_1_3 : ( ( 'has' ) | ( 'have' ) );
    public final void rule__Relation__Alternatives_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:244:1: ( ( 'has' ) | ( 'have' ) )
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
                    // InternalMyDsl.g:245:2: ( 'has' )
                    {
                    // InternalMyDsl.g:245:2: ( 'has' )
                    // InternalMyDsl.g:246:3: 'has'
                    {
                     before(grammarAccess.getRelationAccess().getHasKeyword_1_3_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getRelationAccess().getHasKeyword_1_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:251:2: ( 'have' )
                    {
                    // InternalMyDsl.g:251:2: ( 'have' )
                    // InternalMyDsl.g:252:3: 'have'
                    {
                     before(grammarAccess.getRelationAccess().getHaveKeyword_1_3_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getRelationAccess().getHaveKeyword_1_3_1()); 

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
    // $ANTLR end "rule__Relation__Alternatives_1_3"


    // $ANTLR start "rule__Relation__Alternatives_1_4"
    // InternalMyDsl.g:261:1: rule__Relation__Alternatives_1_4 : ( ( 'a' ) | ( 'many' ) );
    public final void rule__Relation__Alternatives_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:265:1: ( ( 'a' ) | ( 'many' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            else if ( (LA5_0==14) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:266:2: ( 'a' )
                    {
                    // InternalMyDsl.g:266:2: ( 'a' )
                    // InternalMyDsl.g:267:3: 'a'
                    {
                     before(grammarAccess.getRelationAccess().getAKeyword_1_4_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getRelationAccess().getAKeyword_1_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:272:2: ( 'many' )
                    {
                    // InternalMyDsl.g:272:2: ( 'many' )
                    // InternalMyDsl.g:273:3: 'many'
                    {
                     before(grammarAccess.getRelationAccess().getManyKeyword_1_4_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getRelationAccess().getManyKeyword_1_4_1()); 

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


    // $ANTLR start "rule__System__Group__0"
    // InternalMyDsl.g:282:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:286:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // InternalMyDsl.g:287:2: rule__System__Group__0__Impl rule__System__Group__1
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
    // InternalMyDsl.g:294:1: rule__System__Group__0__Impl : ( 'system' ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:298:1: ( ( 'system' ) )
            // InternalMyDsl.g:299:1: ( 'system' )
            {
            // InternalMyDsl.g:299:1: ( 'system' )
            // InternalMyDsl.g:300:2: 'system'
            {
             before(grammarAccess.getSystemAccess().getSystemKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyDsl.g:309:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:313:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // InternalMyDsl.g:314:2: rule__System__Group__1__Impl rule__System__Group__2
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
    // InternalMyDsl.g:321:1: rule__System__Group__1__Impl : ( ( rule__System__NameAssignment_1 ) ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:325:1: ( ( ( rule__System__NameAssignment_1 ) ) )
            // InternalMyDsl.g:326:1: ( ( rule__System__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:326:1: ( ( rule__System__NameAssignment_1 ) )
            // InternalMyDsl.g:327:2: ( rule__System__NameAssignment_1 )
            {
             before(grammarAccess.getSystemAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:328:2: ( rule__System__NameAssignment_1 )
            // InternalMyDsl.g:328:3: rule__System__NameAssignment_1
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
    // InternalMyDsl.g:336:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:340:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // InternalMyDsl.g:341:2: rule__System__Group__2__Impl rule__System__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__System__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__3();

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
    // InternalMyDsl.g:348:1: rule__System__Group__2__Impl : ( ( rule__System__EntitiesAssignment_2 )* ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:352:1: ( ( ( rule__System__EntitiesAssignment_2 )* ) )
            // InternalMyDsl.g:353:1: ( ( rule__System__EntitiesAssignment_2 )* )
            {
            // InternalMyDsl.g:353:1: ( ( rule__System__EntitiesAssignment_2 )* )
            // InternalMyDsl.g:354:2: ( rule__System__EntitiesAssignment_2 )*
            {
             before(grammarAccess.getSystemAccess().getEntitiesAssignment_2()); 
            // InternalMyDsl.g:355:2: ( rule__System__EntitiesAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:355:3: rule__System__EntitiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__System__EntitiesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getEntitiesAssignment_2()); 

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


    // $ANTLR start "rule__System__Group__3"
    // InternalMyDsl.g:363:1: rule__System__Group__3 : rule__System__Group__3__Impl ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:367:1: ( rule__System__Group__3__Impl )
            // InternalMyDsl.g:368:2: rule__System__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group__3__Impl();

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
    // $ANTLR end "rule__System__Group__3"


    // $ANTLR start "rule__System__Group__3__Impl"
    // InternalMyDsl.g:374:1: rule__System__Group__3__Impl : ( ( rule__System__RelationsAssignment_3 )* ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:378:1: ( ( ( rule__System__RelationsAssignment_3 )* ) )
            // InternalMyDsl.g:379:1: ( ( rule__System__RelationsAssignment_3 )* )
            {
            // InternalMyDsl.g:379:1: ( ( rule__System__RelationsAssignment_3 )* )
            // InternalMyDsl.g:380:2: ( rule__System__RelationsAssignment_3 )*
            {
             before(grammarAccess.getSystemAccess().getRelationsAssignment_3()); 
            // InternalMyDsl.g:381:2: ( rule__System__RelationsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:381:3: rule__System__RelationsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__System__RelationsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getRelationsAssignment_3()); 

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
    // $ANTLR end "rule__System__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalMyDsl.g:390:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:394:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalMyDsl.g:395:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
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
    // InternalMyDsl.g:402:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:406:1: ( ( 'entity' ) )
            // InternalMyDsl.g:407:1: ( 'entity' )
            {
            // InternalMyDsl.g:407:1: ( 'entity' )
            // InternalMyDsl.g:408:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:417:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:421:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalMyDsl.g:422:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalMyDsl.g:429:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:433:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalMyDsl.g:434:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:434:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalMyDsl.g:435:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:436:2: ( rule__Entity__NameAssignment_1 )
            // InternalMyDsl.g:436:3: rule__Entity__NameAssignment_1
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
    // InternalMyDsl.g:444:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:448:1: ( rule__Entity__Group__2__Impl )
            // InternalMyDsl.g:449:2: rule__Entity__Group__2__Impl
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
    // InternalMyDsl.g:455:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__AttributessAssignment_2 )* ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:459:1: ( ( ( rule__Entity__AttributessAssignment_2 )* ) )
            // InternalMyDsl.g:460:1: ( ( rule__Entity__AttributessAssignment_2 )* )
            {
            // InternalMyDsl.g:460:1: ( ( rule__Entity__AttributessAssignment_2 )* )
            // InternalMyDsl.g:461:2: ( rule__Entity__AttributessAssignment_2 )*
            {
             before(grammarAccess.getEntityAccess().getAttributessAssignment_2()); 
            // InternalMyDsl.g:462:2: ( rule__Entity__AttributessAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:462:3: rule__Entity__AttributessAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Entity__AttributessAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAttributessAssignment_2()); 

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
    // InternalMyDsl.g:471:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:475:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalMyDsl.g:476:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalMyDsl.g:483:1: rule__Attribute__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:487:1: ( ( 'attribute' ) )
            // InternalMyDsl.g:488:1: ( 'attribute' )
            {
            // InternalMyDsl.g:488:1: ( 'attribute' )
            // InternalMyDsl.g:489:2: 'attribute'
            {
             before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:498:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:502:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalMyDsl.g:503:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:510:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:514:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalMyDsl.g:515:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:515:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalMyDsl.g:516:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:517:2: ( rule__Attribute__NameAssignment_1 )
            // InternalMyDsl.g:517:3: rule__Attribute__NameAssignment_1
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
    // InternalMyDsl.g:525:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:529:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalMyDsl.g:530:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:537:1: rule__Attribute__Group__2__Impl : ( 'as' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:1: ( ( 'as' ) )
            // InternalMyDsl.g:542:1: ( 'as' )
            {
            // InternalMyDsl.g:542:1: ( 'as' )
            // InternalMyDsl.g:543:2: 'as'
            {
             before(grammarAccess.getAttributeAccess().getAsKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMyDsl.g:552:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:556:1: ( rule__Attribute__Group__3__Impl )
            // InternalMyDsl.g:557:2: rule__Attribute__Group__3__Impl
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
    // InternalMyDsl.g:563:1: rule__Attribute__Group__3__Impl : ( ruleType ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:567:1: ( ( ruleType ) )
            // InternalMyDsl.g:568:1: ( ruleType )
            {
            // InternalMyDsl.g:568:1: ( ruleType )
            // InternalMyDsl.g:569:2: ruleType
            {
             before(grammarAccess.getAttributeAccess().getTypeParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeParserRuleCall_3()); 

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
    // InternalMyDsl.g:579:1: rule__Relation__Group_0__0 : rule__Relation__Group_0__0__Impl rule__Relation__Group_0__1 ;
    public final void rule__Relation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:583:1: ( rule__Relation__Group_0__0__Impl rule__Relation__Group_0__1 )
            // InternalMyDsl.g:584:2: rule__Relation__Group_0__0__Impl rule__Relation__Group_0__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:591:1: rule__Relation__Group_0__0__Impl : ( 'relation' ) ;
    public final void rule__Relation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:595:1: ( ( 'relation' ) )
            // InternalMyDsl.g:596:1: ( 'relation' )
            {
            // InternalMyDsl.g:596:1: ( 'relation' )
            // InternalMyDsl.g:597:2: 'relation'
            {
             before(grammarAccess.getRelationAccess().getRelationKeyword_0_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getRelationKeyword_0_0()); 

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
    // $ANTLR end "rule__Relation__Group_0__0__Impl"


    // $ANTLR start "rule__Relation__Group_0__1"
    // InternalMyDsl.g:606:1: rule__Relation__Group_0__1 : rule__Relation__Group_0__1__Impl rule__Relation__Group_0__2 ;
    public final void rule__Relation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:610:1: ( rule__Relation__Group_0__1__Impl rule__Relation__Group_0__2 )
            // InternalMyDsl.g:611:2: rule__Relation__Group_0__1__Impl rule__Relation__Group_0__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:618:1: rule__Relation__Group_0__1__Impl : ( ( rule__Relation__FromAssignment_0_1 ) ) ;
    public final void rule__Relation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:622:1: ( ( ( rule__Relation__FromAssignment_0_1 ) ) )
            // InternalMyDsl.g:623:1: ( ( rule__Relation__FromAssignment_0_1 ) )
            {
            // InternalMyDsl.g:623:1: ( ( rule__Relation__FromAssignment_0_1 ) )
            // InternalMyDsl.g:624:2: ( rule__Relation__FromAssignment_0_1 )
            {
             before(grammarAccess.getRelationAccess().getFromAssignment_0_1()); 
            // InternalMyDsl.g:625:2: ( rule__Relation__FromAssignment_0_1 )
            // InternalMyDsl.g:625:3: rule__Relation__FromAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Relation__FromAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getFromAssignment_0_1()); 

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
    // InternalMyDsl.g:633:1: rule__Relation__Group_0__2 : rule__Relation__Group_0__2__Impl rule__Relation__Group_0__3 ;
    public final void rule__Relation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:637:1: ( rule__Relation__Group_0__2__Impl rule__Relation__Group_0__3 )
            // InternalMyDsl.g:638:2: rule__Relation__Group_0__2__Impl rule__Relation__Group_0__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalMyDsl.g:645:1: rule__Relation__Group_0__2__Impl : ( 'is' ) ;
    public final void rule__Relation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:649:1: ( ( 'is' ) )
            // InternalMyDsl.g:650:1: ( 'is' )
            {
            // InternalMyDsl.g:650:1: ( 'is' )
            // InternalMyDsl.g:651:2: 'is'
            {
             before(grammarAccess.getRelationAccess().getIsKeyword_0_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getIsKeyword_0_2()); 

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
    // InternalMyDsl.g:660:1: rule__Relation__Group_0__3 : rule__Relation__Group_0__3__Impl ;
    public final void rule__Relation__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:664:1: ( rule__Relation__Group_0__3__Impl )
            // InternalMyDsl.g:665:2: rule__Relation__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group_0__3__Impl();

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
    // InternalMyDsl.g:671:1: rule__Relation__Group_0__3__Impl : ( ( rule__Relation__ToAssignment_0_3 ) ) ;
    public final void rule__Relation__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:675:1: ( ( ( rule__Relation__ToAssignment_0_3 ) ) )
            // InternalMyDsl.g:676:1: ( ( rule__Relation__ToAssignment_0_3 ) )
            {
            // InternalMyDsl.g:676:1: ( ( rule__Relation__ToAssignment_0_3 ) )
            // InternalMyDsl.g:677:2: ( rule__Relation__ToAssignment_0_3 )
            {
             before(grammarAccess.getRelationAccess().getToAssignment_0_3()); 
            // InternalMyDsl.g:678:2: ( rule__Relation__ToAssignment_0_3 )
            // InternalMyDsl.g:678:3: rule__Relation__ToAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Relation__ToAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getToAssignment_0_3()); 

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


    // $ANTLR start "rule__Relation__Group_1__0"
    // InternalMyDsl.g:687:1: rule__Relation__Group_1__0 : rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1 ;
    public final void rule__Relation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:1: ( rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1 )
            // InternalMyDsl.g:692:2: rule__Relation__Group_1__0__Impl rule__Relation__Group_1__1
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
    // InternalMyDsl.g:699:1: rule__Relation__Group_1__0__Impl : ( 'relation' ) ;
    public final void rule__Relation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:703:1: ( ( 'relation' ) )
            // InternalMyDsl.g:704:1: ( 'relation' )
            {
            // InternalMyDsl.g:704:1: ( 'relation' )
            // InternalMyDsl.g:705:2: 'relation'
            {
             before(grammarAccess.getRelationAccess().getRelationKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getRelationKeyword_1_0()); 

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
    // $ANTLR end "rule__Relation__Group_1__0__Impl"


    // $ANTLR start "rule__Relation__Group_1__1"
    // InternalMyDsl.g:714:1: rule__Relation__Group_1__1 : rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2 ;
    public final void rule__Relation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:718:1: ( rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2 )
            // InternalMyDsl.g:719:2: rule__Relation__Group_1__1__Impl rule__Relation__Group_1__2
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
    // InternalMyDsl.g:726:1: rule__Relation__Group_1__1__Impl : ( ( rule__Relation__Alternatives_1_1 )? ) ;
    public final void rule__Relation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:730:1: ( ( ( rule__Relation__Alternatives_1_1 )? ) )
            // InternalMyDsl.g:731:1: ( ( rule__Relation__Alternatives_1_1 )? )
            {
            // InternalMyDsl.g:731:1: ( ( rule__Relation__Alternatives_1_1 )? )
            // InternalMyDsl.g:732:2: ( rule__Relation__Alternatives_1_1 )?
            {
             before(grammarAccess.getRelationAccess().getAlternatives_1_1()); 
            // InternalMyDsl.g:733:2: ( rule__Relation__Alternatives_1_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=13 && LA9_0<=14)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:733:3: rule__Relation__Alternatives_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relation__Alternatives_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationAccess().getAlternatives_1_1()); 

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
    // InternalMyDsl.g:741:1: rule__Relation__Group_1__2 : rule__Relation__Group_1__2__Impl rule__Relation__Group_1__3 ;
    public final void rule__Relation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:745:1: ( rule__Relation__Group_1__2__Impl rule__Relation__Group_1__3 )
            // InternalMyDsl.g:746:2: rule__Relation__Group_1__2__Impl rule__Relation__Group_1__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:753:1: rule__Relation__Group_1__2__Impl : ( ( rule__Relation__FromAssignment_1_2 ) ) ;
    public final void rule__Relation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:757:1: ( ( ( rule__Relation__FromAssignment_1_2 ) ) )
            // InternalMyDsl.g:758:1: ( ( rule__Relation__FromAssignment_1_2 ) )
            {
            // InternalMyDsl.g:758:1: ( ( rule__Relation__FromAssignment_1_2 ) )
            // InternalMyDsl.g:759:2: ( rule__Relation__FromAssignment_1_2 )
            {
             before(grammarAccess.getRelationAccess().getFromAssignment_1_2()); 
            // InternalMyDsl.g:760:2: ( rule__Relation__FromAssignment_1_2 )
            // InternalMyDsl.g:760:3: rule__Relation__FromAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Relation__FromAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getFromAssignment_1_2()); 

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
    // InternalMyDsl.g:768:1: rule__Relation__Group_1__3 : rule__Relation__Group_1__3__Impl rule__Relation__Group_1__4 ;
    public final void rule__Relation__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:772:1: ( rule__Relation__Group_1__3__Impl rule__Relation__Group_1__4 )
            // InternalMyDsl.g:773:2: rule__Relation__Group_1__3__Impl rule__Relation__Group_1__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:780:1: rule__Relation__Group_1__3__Impl : ( ( rule__Relation__Alternatives_1_3 ) ) ;
    public final void rule__Relation__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:784:1: ( ( ( rule__Relation__Alternatives_1_3 ) ) )
            // InternalMyDsl.g:785:1: ( ( rule__Relation__Alternatives_1_3 ) )
            {
            // InternalMyDsl.g:785:1: ( ( rule__Relation__Alternatives_1_3 ) )
            // InternalMyDsl.g:786:2: ( rule__Relation__Alternatives_1_3 )
            {
             before(grammarAccess.getRelationAccess().getAlternatives_1_3()); 
            // InternalMyDsl.g:787:2: ( rule__Relation__Alternatives_1_3 )
            // InternalMyDsl.g:787:3: rule__Relation__Alternatives_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Alternatives_1_3();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getAlternatives_1_3()); 

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
    // InternalMyDsl.g:795:1: rule__Relation__Group_1__4 : rule__Relation__Group_1__4__Impl rule__Relation__Group_1__5 ;
    public final void rule__Relation__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:799:1: ( rule__Relation__Group_1__4__Impl rule__Relation__Group_1__5 )
            // InternalMyDsl.g:800:2: rule__Relation__Group_1__4__Impl rule__Relation__Group_1__5
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
    // InternalMyDsl.g:807:1: rule__Relation__Group_1__4__Impl : ( ( rule__Relation__Alternatives_1_4 )? ) ;
    public final void rule__Relation__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:811:1: ( ( ( rule__Relation__Alternatives_1_4 )? ) )
            // InternalMyDsl.g:812:1: ( ( rule__Relation__Alternatives_1_4 )? )
            {
            // InternalMyDsl.g:812:1: ( ( rule__Relation__Alternatives_1_4 )? )
            // InternalMyDsl.g:813:2: ( rule__Relation__Alternatives_1_4 )?
            {
             before(grammarAccess.getRelationAccess().getAlternatives_1_4()); 
            // InternalMyDsl.g:814:2: ( rule__Relation__Alternatives_1_4 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=13 && LA10_0<=14)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:814:3: rule__Relation__Alternatives_1_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relation__Alternatives_1_4();

                    state._fsp--;


                    }
                    break;

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
    // InternalMyDsl.g:822:1: rule__Relation__Group_1__5 : rule__Relation__Group_1__5__Impl ;
    public final void rule__Relation__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:826:1: ( rule__Relation__Group_1__5__Impl )
            // InternalMyDsl.g:827:2: rule__Relation__Group_1__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relation__Group_1__5__Impl();

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
    // InternalMyDsl.g:833:1: rule__Relation__Group_1__5__Impl : ( ( rule__Relation__ToAssignment_1_5 ) ) ;
    public final void rule__Relation__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:837:1: ( ( ( rule__Relation__ToAssignment_1_5 ) ) )
            // InternalMyDsl.g:838:1: ( ( rule__Relation__ToAssignment_1_5 ) )
            {
            // InternalMyDsl.g:838:1: ( ( rule__Relation__ToAssignment_1_5 ) )
            // InternalMyDsl.g:839:2: ( rule__Relation__ToAssignment_1_5 )
            {
             before(grammarAccess.getRelationAccess().getToAssignment_1_5()); 
            // InternalMyDsl.g:840:2: ( rule__Relation__ToAssignment_1_5 )
            // InternalMyDsl.g:840:3: rule__Relation__ToAssignment_1_5
            {
            pushFollow(FOLLOW_2);
            rule__Relation__ToAssignment_1_5();

            state._fsp--;


            }

             after(grammarAccess.getRelationAccess().getToAssignment_1_5()); 

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


    // $ANTLR start "rule__System__NameAssignment_1"
    // InternalMyDsl.g:849:1: rule__System__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__System__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:853:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:854:2: ( RULE_ID )
            {
            // InternalMyDsl.g:854:2: ( RULE_ID )
            // InternalMyDsl.g:855:3: RULE_ID
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


    // $ANTLR start "rule__System__EntitiesAssignment_2"
    // InternalMyDsl.g:864:1: rule__System__EntitiesAssignment_2 : ( ruleEntity ) ;
    public final void rule__System__EntitiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:868:1: ( ( ruleEntity ) )
            // InternalMyDsl.g:869:2: ( ruleEntity )
            {
            // InternalMyDsl.g:869:2: ( ruleEntity )
            // InternalMyDsl.g:870:3: ruleEntity
            {
             before(grammarAccess.getSystemAccess().getEntitiesEntityParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getEntitiesEntityParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__System__EntitiesAssignment_2"


    // $ANTLR start "rule__System__RelationsAssignment_3"
    // InternalMyDsl.g:879:1: rule__System__RelationsAssignment_3 : ( ruleRelation ) ;
    public final void rule__System__RelationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:883:1: ( ( ruleRelation ) )
            // InternalMyDsl.g:884:2: ( ruleRelation )
            {
            // InternalMyDsl.g:884:2: ( ruleRelation )
            // InternalMyDsl.g:885:3: ruleRelation
            {
             before(grammarAccess.getSystemAccess().getRelationsRelationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRelation();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getRelationsRelationParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__System__RelationsAssignment_3"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalMyDsl.g:894:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:898:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:899:2: ( RULE_ID )
            {
            // InternalMyDsl.g:899:2: ( RULE_ID )
            // InternalMyDsl.g:900:3: RULE_ID
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


    // $ANTLR start "rule__Entity__AttributessAssignment_2"
    // InternalMyDsl.g:909:1: rule__Entity__AttributessAssignment_2 : ( ruleAttribute ) ;
    public final void rule__Entity__AttributessAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:913:1: ( ( ruleAttribute ) )
            // InternalMyDsl.g:914:2: ( ruleAttribute )
            {
            // InternalMyDsl.g:914:2: ( ruleAttribute )
            // InternalMyDsl.g:915:3: ruleAttribute
            {
             before(grammarAccess.getEntityAccess().getAttributessAttributeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttributessAttributeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Entity__AttributessAssignment_2"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalMyDsl.g:924:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:928:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:929:2: ( RULE_ID )
            {
            // InternalMyDsl.g:929:2: ( RULE_ID )
            // InternalMyDsl.g:930:3: RULE_ID
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


    // $ANTLR start "rule__Relation__FromAssignment_0_1"
    // InternalMyDsl.g:939:1: rule__Relation__FromAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Relation__FromAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:943:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:944:2: ( RULE_ID )
            {
            // InternalMyDsl.g:944:2: ( RULE_ID )
            // InternalMyDsl.g:945:3: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getFromIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getFromIDTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Relation__FromAssignment_0_1"


    // $ANTLR start "rule__Relation__ToAssignment_0_3"
    // InternalMyDsl.g:954:1: rule__Relation__ToAssignment_0_3 : ( RULE_ID ) ;
    public final void rule__Relation__ToAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:958:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:959:2: ( RULE_ID )
            {
            // InternalMyDsl.g:959:2: ( RULE_ID )
            // InternalMyDsl.g:960:3: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getToIDTerminalRuleCall_0_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getToIDTerminalRuleCall_0_3_0()); 

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
    // $ANTLR end "rule__Relation__ToAssignment_0_3"


    // $ANTLR start "rule__Relation__FromAssignment_1_2"
    // InternalMyDsl.g:969:1: rule__Relation__FromAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__Relation__FromAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:973:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:974:2: ( RULE_ID )
            {
            // InternalMyDsl.g:974:2: ( RULE_ID )
            // InternalMyDsl.g:975:3: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getFromIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getFromIDTerminalRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Relation__FromAssignment_1_2"


    // $ANTLR start "rule__Relation__ToAssignment_1_5"
    // InternalMyDsl.g:984:1: rule__Relation__ToAssignment_1_5 : ( RULE_ID ) ;
    public final void rule__Relation__ToAssignment_1_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:988:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:989:2: ( RULE_ID )
            {
            // InternalMyDsl.g:989:2: ( RULE_ID )
            // InternalMyDsl.g:990:3: RULE_ID
            {
             before(grammarAccess.getRelationAccess().getToIDTerminalRuleCall_1_5_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelationAccess().getToIDTerminalRuleCall_1_5_0()); 

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
    // $ANTLR end "rule__Relation__ToAssignment_1_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000006010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000018000L});

}