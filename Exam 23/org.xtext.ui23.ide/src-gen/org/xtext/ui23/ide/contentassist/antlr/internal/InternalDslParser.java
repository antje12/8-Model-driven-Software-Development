package org.xtext.ui23.ide.contentassist.antlr.internal;

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
import org.xtext.ui23.services.DslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'row'", "'column'", "'boolean'", "'string'", "'number'", "'&&'", "'||'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'title'", "'function'", "'('", "')'", "':'", "','", "'form'", "'{'", "'}'", "'label'", "'input'", "'button'", "'&'", "'!'", "'#'"
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

    	public void setGrammarAccess(DslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleUI23"
    // InternalDsl.g:53:1: entryRuleUI23 : ruleUI23 EOF ;
    public final void entryRuleUI23() throws RecognitionException {
        try {
            // InternalDsl.g:54:1: ( ruleUI23 EOF )
            // InternalDsl.g:55:1: ruleUI23 EOF
            {
             before(grammarAccess.getUI23Rule()); 
            pushFollow(FOLLOW_1);
            ruleUI23();

            state._fsp--;

             after(grammarAccess.getUI23Rule()); 
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
    // $ANTLR end "entryRuleUI23"


    // $ANTLR start "ruleUI23"
    // InternalDsl.g:62:1: ruleUI23 : ( ( rule__UI23__Group__0 ) ) ;
    public final void ruleUI23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:66:2: ( ( ( rule__UI23__Group__0 ) ) )
            // InternalDsl.g:67:2: ( ( rule__UI23__Group__0 ) )
            {
            // InternalDsl.g:67:2: ( ( rule__UI23__Group__0 ) )
            // InternalDsl.g:68:3: ( rule__UI23__Group__0 )
            {
             before(grammarAccess.getUI23Access().getGroup()); 
            // InternalDsl.g:69:3: ( rule__UI23__Group__0 )
            // InternalDsl.g:69:4: rule__UI23__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UI23__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUI23Access().getGroup()); 

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
    // $ANTLR end "ruleUI23"


    // $ANTLR start "entryRuleFunction"
    // InternalDsl.g:78:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalDsl.g:79:1: ( ruleFunction EOF )
            // InternalDsl.g:80:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalDsl.g:87:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:91:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalDsl.g:92:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalDsl.g:92:2: ( ( rule__Function__Group__0 ) )
            // InternalDsl.g:93:3: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // InternalDsl.g:94:3: ( rule__Function__Group__0 )
            // InternalDsl.g:94:4: rule__Function__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleForm"
    // InternalDsl.g:103:1: entryRuleForm : ruleForm EOF ;
    public final void entryRuleForm() throws RecognitionException {
        try {
            // InternalDsl.g:104:1: ( ruleForm EOF )
            // InternalDsl.g:105:1: ruleForm EOF
            {
             before(grammarAccess.getFormRule()); 
            pushFollow(FOLLOW_1);
            ruleForm();

            state._fsp--;

             after(grammarAccess.getFormRule()); 
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
    // $ANTLR end "entryRuleForm"


    // $ANTLR start "ruleForm"
    // InternalDsl.g:112:1: ruleForm : ( ( rule__Form__Group__0 ) ) ;
    public final void ruleForm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:116:2: ( ( ( rule__Form__Group__0 ) ) )
            // InternalDsl.g:117:2: ( ( rule__Form__Group__0 ) )
            {
            // InternalDsl.g:117:2: ( ( rule__Form__Group__0 ) )
            // InternalDsl.g:118:3: ( rule__Form__Group__0 )
            {
             before(grammarAccess.getFormAccess().getGroup()); 
            // InternalDsl.g:119:3: ( rule__Form__Group__0 )
            // InternalDsl.g:119:4: rule__Form__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Form__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormAccess().getGroup()); 

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
    // $ANTLR end "ruleForm"


    // $ANTLR start "entryRuleLayout"
    // InternalDsl.g:128:1: entryRuleLayout : ruleLayout EOF ;
    public final void entryRuleLayout() throws RecognitionException {
        try {
            // InternalDsl.g:129:1: ( ruleLayout EOF )
            // InternalDsl.g:130:1: ruleLayout EOF
            {
             before(grammarAccess.getLayoutRule()); 
            pushFollow(FOLLOW_1);
            ruleLayout();

            state._fsp--;

             after(grammarAccess.getLayoutRule()); 
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
    // $ANTLR end "entryRuleLayout"


    // $ANTLR start "ruleLayout"
    // InternalDsl.g:137:1: ruleLayout : ( ( rule__Layout__Group__0 ) ) ;
    public final void ruleLayout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:141:2: ( ( ( rule__Layout__Group__0 ) ) )
            // InternalDsl.g:142:2: ( ( rule__Layout__Group__0 ) )
            {
            // InternalDsl.g:142:2: ( ( rule__Layout__Group__0 ) )
            // InternalDsl.g:143:3: ( rule__Layout__Group__0 )
            {
             before(grammarAccess.getLayoutAccess().getGroup()); 
            // InternalDsl.g:144:3: ( rule__Layout__Group__0 )
            // InternalDsl.g:144:4: rule__Layout__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Layout__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLayoutAccess().getGroup()); 

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
    // $ANTLR end "ruleLayout"


    // $ANTLR start "entryRuleComponent"
    // InternalDsl.g:153:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalDsl.g:154:1: ( ruleComponent EOF )
            // InternalDsl.g:155:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalDsl.g:162:1: ruleComponent : ( ( rule__Component__Alternatives ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:166:2: ( ( ( rule__Component__Alternatives ) ) )
            // InternalDsl.g:167:2: ( ( rule__Component__Alternatives ) )
            {
            // InternalDsl.g:167:2: ( ( rule__Component__Alternatives ) )
            // InternalDsl.g:168:3: ( rule__Component__Alternatives )
            {
             before(grammarAccess.getComponentAccess().getAlternatives()); 
            // InternalDsl.g:169:3: ( rule__Component__Alternatives )
            // InternalDsl.g:169:4: rule__Component__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Component__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getAlternatives()); 

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleElement"
    // InternalDsl.g:178:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalDsl.g:179:1: ( ruleElement EOF )
            // InternalDsl.g:180:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalDsl.g:187:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:191:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalDsl.g:192:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalDsl.g:192:2: ( ( rule__Element__Alternatives ) )
            // InternalDsl.g:193:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalDsl.g:194:3: ( rule__Element__Alternatives )
            // InternalDsl.g:194:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleLabel"
    // InternalDsl.g:203:1: entryRuleLabel : ruleLabel EOF ;
    public final void entryRuleLabel() throws RecognitionException {
        try {
            // InternalDsl.g:204:1: ( ruleLabel EOF )
            // InternalDsl.g:205:1: ruleLabel EOF
            {
             before(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_1);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getLabelRule()); 
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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // InternalDsl.g:212:1: ruleLabel : ( ( rule__Label__Group__0 ) ) ;
    public final void ruleLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:216:2: ( ( ( rule__Label__Group__0 ) ) )
            // InternalDsl.g:217:2: ( ( rule__Label__Group__0 ) )
            {
            // InternalDsl.g:217:2: ( ( rule__Label__Group__0 ) )
            // InternalDsl.g:218:3: ( rule__Label__Group__0 )
            {
             before(grammarAccess.getLabelAccess().getGroup()); 
            // InternalDsl.g:219:3: ( rule__Label__Group__0 )
            // InternalDsl.g:219:4: rule__Label__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Label__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getGroup()); 

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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleInputText"
    // InternalDsl.g:228:1: entryRuleInputText : ruleInputText EOF ;
    public final void entryRuleInputText() throws RecognitionException {
        try {
            // InternalDsl.g:229:1: ( ruleInputText EOF )
            // InternalDsl.g:230:1: ruleInputText EOF
            {
             before(grammarAccess.getInputTextRule()); 
            pushFollow(FOLLOW_1);
            ruleInputText();

            state._fsp--;

             after(grammarAccess.getInputTextRule()); 
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
    // $ANTLR end "entryRuleInputText"


    // $ANTLR start "ruleInputText"
    // InternalDsl.g:237:1: ruleInputText : ( ( rule__InputText__Group__0 ) ) ;
    public final void ruleInputText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:241:2: ( ( ( rule__InputText__Group__0 ) ) )
            // InternalDsl.g:242:2: ( ( rule__InputText__Group__0 ) )
            {
            // InternalDsl.g:242:2: ( ( rule__InputText__Group__0 ) )
            // InternalDsl.g:243:3: ( rule__InputText__Group__0 )
            {
             before(grammarAccess.getInputTextAccess().getGroup()); 
            // InternalDsl.g:244:3: ( rule__InputText__Group__0 )
            // InternalDsl.g:244:4: rule__InputText__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InputText__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputTextAccess().getGroup()); 

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
    // $ANTLR end "ruleInputText"


    // $ANTLR start "entryRuleButton"
    // InternalDsl.g:253:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // InternalDsl.g:254:1: ( ruleButton EOF )
            // InternalDsl.g:255:1: ruleButton EOF
            {
             before(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            ruleButton();

            state._fsp--;

             after(grammarAccess.getButtonRule()); 
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
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalDsl.g:262:1: ruleButton : ( ( rule__Button__Group__0 ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:266:2: ( ( ( rule__Button__Group__0 ) ) )
            // InternalDsl.g:267:2: ( ( rule__Button__Group__0 ) )
            {
            // InternalDsl.g:267:2: ( ( rule__Button__Group__0 ) )
            // InternalDsl.g:268:3: ( rule__Button__Group__0 )
            {
             before(grammarAccess.getButtonAccess().getGroup()); 
            // InternalDsl.g:269:3: ( rule__Button__Group__0 )
            // InternalDsl.g:269:4: rule__Button__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Button__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getGroup()); 

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
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleFormUse"
    // InternalDsl.g:278:1: entryRuleFormUse : ruleFormUse EOF ;
    public final void entryRuleFormUse() throws RecognitionException {
        try {
            // InternalDsl.g:279:1: ( ruleFormUse EOF )
            // InternalDsl.g:280:1: ruleFormUse EOF
            {
             before(grammarAccess.getFormUseRule()); 
            pushFollow(FOLLOW_1);
            ruleFormUse();

            state._fsp--;

             after(grammarAccess.getFormUseRule()); 
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
    // $ANTLR end "entryRuleFormUse"


    // $ANTLR start "ruleFormUse"
    // InternalDsl.g:287:1: ruleFormUse : ( ( rule__FormUse__Group__0 ) ) ;
    public final void ruleFormUse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:291:2: ( ( ( rule__FormUse__Group__0 ) ) )
            // InternalDsl.g:292:2: ( ( rule__FormUse__Group__0 ) )
            {
            // InternalDsl.g:292:2: ( ( rule__FormUse__Group__0 ) )
            // InternalDsl.g:293:3: ( rule__FormUse__Group__0 )
            {
             before(grammarAccess.getFormUseAccess().getGroup()); 
            // InternalDsl.g:294:3: ( rule__FormUse__Group__0 )
            // InternalDsl.g:294:4: rule__FormUse__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FormUse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormUseAccess().getGroup()); 

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
    // $ANTLR end "ruleFormUse"


    // $ANTLR start "entryRuleParameter"
    // InternalDsl.g:303:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalDsl.g:304:1: ( ruleParameter EOF )
            // InternalDsl.g:305:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalDsl.g:312:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:316:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalDsl.g:317:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalDsl.g:317:2: ( ( rule__Parameter__Group__0 ) )
            // InternalDsl.g:318:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalDsl.g:319:3: ( rule__Parameter__Group__0 )
            // InternalDsl.g:319:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleType"
    // InternalDsl.g:328:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalDsl.g:329:1: ( ruleType EOF )
            // InternalDsl.g:330:1: ruleType EOF
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
    // InternalDsl.g:337:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:341:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalDsl.g:342:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalDsl.g:342:2: ( ( rule__Type__Alternatives ) )
            // InternalDsl.g:343:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalDsl.g:344:3: ( rule__Type__Alternatives )
            // InternalDsl.g:344:4: rule__Type__Alternatives
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


    // $ANTLR start "entryRuleExp"
    // InternalDsl.g:353:1: entryRuleExp : ruleExp EOF ;
    public final void entryRuleExp() throws RecognitionException {
        try {
            // InternalDsl.g:354:1: ( ruleExp EOF )
            // InternalDsl.g:355:1: ruleExp EOF
            {
             before(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExpRule()); 
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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalDsl.g:362:1: ruleExp : ( ruleBoolean ) ;
    public final void ruleExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:366:2: ( ( ruleBoolean ) )
            // InternalDsl.g:367:2: ( ruleBoolean )
            {
            // InternalDsl.g:367:2: ( ruleBoolean )
            // InternalDsl.g:368:3: ruleBoolean
            {
             before(grammarAccess.getExpAccess().getBooleanParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getExpAccess().getBooleanParserRuleCall()); 

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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleBoolean"
    // InternalDsl.g:378:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // InternalDsl.g:379:1: ( ruleBoolean EOF )
            // InternalDsl.g:380:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanRule()); 
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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalDsl.g:387:1: ruleBoolean : ( ( rule__Boolean__Group__0 ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:391:2: ( ( ( rule__Boolean__Group__0 ) ) )
            // InternalDsl.g:392:2: ( ( rule__Boolean__Group__0 ) )
            {
            // InternalDsl.g:392:2: ( ( rule__Boolean__Group__0 ) )
            // InternalDsl.g:393:3: ( rule__Boolean__Group__0 )
            {
             before(grammarAccess.getBooleanAccess().getGroup()); 
            // InternalDsl.g:394:3: ( rule__Boolean__Group__0 )
            // InternalDsl.g:394:4: rule__Boolean__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getGroup()); 

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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleEqual"
    // InternalDsl.g:403:1: entryRuleEqual : ruleEqual EOF ;
    public final void entryRuleEqual() throws RecognitionException {
        try {
            // InternalDsl.g:404:1: ( ruleEqual EOF )
            // InternalDsl.g:405:1: ruleEqual EOF
            {
             before(grammarAccess.getEqualRule()); 
            pushFollow(FOLLOW_1);
            ruleEqual();

            state._fsp--;

             after(grammarAccess.getEqualRule()); 
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
    // $ANTLR end "entryRuleEqual"


    // $ANTLR start "ruleEqual"
    // InternalDsl.g:412:1: ruleEqual : ( ( rule__Equal__Group__0 ) ) ;
    public final void ruleEqual() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:416:2: ( ( ( rule__Equal__Group__0 ) ) )
            // InternalDsl.g:417:2: ( ( rule__Equal__Group__0 ) )
            {
            // InternalDsl.g:417:2: ( ( rule__Equal__Group__0 ) )
            // InternalDsl.g:418:3: ( rule__Equal__Group__0 )
            {
             before(grammarAccess.getEqualAccess().getGroup()); 
            // InternalDsl.g:419:3: ( rule__Equal__Group__0 )
            // InternalDsl.g:419:4: rule__Equal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Equal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualAccess().getGroup()); 

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
    // $ANTLR end "ruleEqual"


    // $ANTLR start "entryRuleCompare"
    // InternalDsl.g:428:1: entryRuleCompare : ruleCompare EOF ;
    public final void entryRuleCompare() throws RecognitionException {
        try {
            // InternalDsl.g:429:1: ( ruleCompare EOF )
            // InternalDsl.g:430:1: ruleCompare EOF
            {
             before(grammarAccess.getCompareRule()); 
            pushFollow(FOLLOW_1);
            ruleCompare();

            state._fsp--;

             after(grammarAccess.getCompareRule()); 
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
    // $ANTLR end "entryRuleCompare"


    // $ANTLR start "ruleCompare"
    // InternalDsl.g:437:1: ruleCompare : ( ( rule__Compare__Group__0 ) ) ;
    public final void ruleCompare() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:441:2: ( ( ( rule__Compare__Group__0 ) ) )
            // InternalDsl.g:442:2: ( ( rule__Compare__Group__0 ) )
            {
            // InternalDsl.g:442:2: ( ( rule__Compare__Group__0 ) )
            // InternalDsl.g:443:3: ( rule__Compare__Group__0 )
            {
             before(grammarAccess.getCompareAccess().getGroup()); 
            // InternalDsl.g:444:3: ( rule__Compare__Group__0 )
            // InternalDsl.g:444:4: rule__Compare__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Compare__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompareAccess().getGroup()); 

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
    // $ANTLR end "ruleCompare"


    // $ANTLR start "entryRuleConcat"
    // InternalDsl.g:453:1: entryRuleConcat : ruleConcat EOF ;
    public final void entryRuleConcat() throws RecognitionException {
        try {
            // InternalDsl.g:454:1: ( ruleConcat EOF )
            // InternalDsl.g:455:1: ruleConcat EOF
            {
             before(grammarAccess.getConcatRule()); 
            pushFollow(FOLLOW_1);
            ruleConcat();

            state._fsp--;

             after(grammarAccess.getConcatRule()); 
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
    // $ANTLR end "entryRuleConcat"


    // $ANTLR start "ruleConcat"
    // InternalDsl.g:462:1: ruleConcat : ( ( rule__Concat__Group__0 ) ) ;
    public final void ruleConcat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:466:2: ( ( ( rule__Concat__Group__0 ) ) )
            // InternalDsl.g:467:2: ( ( rule__Concat__Group__0 ) )
            {
            // InternalDsl.g:467:2: ( ( rule__Concat__Group__0 ) )
            // InternalDsl.g:468:3: ( rule__Concat__Group__0 )
            {
             before(grammarAccess.getConcatAccess().getGroup()); 
            // InternalDsl.g:469:3: ( rule__Concat__Group__0 )
            // InternalDsl.g:469:4: rule__Concat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Concat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConcatAccess().getGroup()); 

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
    // $ANTLR end "ruleConcat"


    // $ANTLR start "entryRulePlusMinus"
    // InternalDsl.g:478:1: entryRulePlusMinus : rulePlusMinus EOF ;
    public final void entryRulePlusMinus() throws RecognitionException {
        try {
            // InternalDsl.g:479:1: ( rulePlusMinus EOF )
            // InternalDsl.g:480:1: rulePlusMinus EOF
            {
             before(grammarAccess.getPlusMinusRule()); 
            pushFollow(FOLLOW_1);
            rulePlusMinus();

            state._fsp--;

             after(grammarAccess.getPlusMinusRule()); 
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
    // $ANTLR end "entryRulePlusMinus"


    // $ANTLR start "rulePlusMinus"
    // InternalDsl.g:487:1: rulePlusMinus : ( ( rule__PlusMinus__Group__0 ) ) ;
    public final void rulePlusMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:491:2: ( ( ( rule__PlusMinus__Group__0 ) ) )
            // InternalDsl.g:492:2: ( ( rule__PlusMinus__Group__0 ) )
            {
            // InternalDsl.g:492:2: ( ( rule__PlusMinus__Group__0 ) )
            // InternalDsl.g:493:3: ( rule__PlusMinus__Group__0 )
            {
             before(grammarAccess.getPlusMinusAccess().getGroup()); 
            // InternalDsl.g:494:3: ( rule__PlusMinus__Group__0 )
            // InternalDsl.g:494:4: rule__PlusMinus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlusMinusAccess().getGroup()); 

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
    // $ANTLR end "rulePlusMinus"


    // $ANTLR start "entryRuleMultDiv"
    // InternalDsl.g:503:1: entryRuleMultDiv : ruleMultDiv EOF ;
    public final void entryRuleMultDiv() throws RecognitionException {
        try {
            // InternalDsl.g:504:1: ( ruleMultDiv EOF )
            // InternalDsl.g:505:1: ruleMultDiv EOF
            {
             before(grammarAccess.getMultDivRule()); 
            pushFollow(FOLLOW_1);
            ruleMultDiv();

            state._fsp--;

             after(grammarAccess.getMultDivRule()); 
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
    // $ANTLR end "entryRuleMultDiv"


    // $ANTLR start "ruleMultDiv"
    // InternalDsl.g:512:1: ruleMultDiv : ( ( rule__MultDiv__Group__0 ) ) ;
    public final void ruleMultDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:516:2: ( ( ( rule__MultDiv__Group__0 ) ) )
            // InternalDsl.g:517:2: ( ( rule__MultDiv__Group__0 ) )
            {
            // InternalDsl.g:517:2: ( ( rule__MultDiv__Group__0 ) )
            // InternalDsl.g:518:3: ( rule__MultDiv__Group__0 )
            {
             before(grammarAccess.getMultDivAccess().getGroup()); 
            // InternalDsl.g:519:3: ( rule__MultDiv__Group__0 )
            // InternalDsl.g:519:4: rule__MultDiv__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultDiv__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultDivAccess().getGroup()); 

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
    // $ANTLR end "ruleMultDiv"


    // $ANTLR start "entryRulePrimitive"
    // InternalDsl.g:528:1: entryRulePrimitive : rulePrimitive EOF ;
    public final void entryRulePrimitive() throws RecognitionException {
        try {
            // InternalDsl.g:529:1: ( rulePrimitive EOF )
            // InternalDsl.g:530:1: rulePrimitive EOF
            {
             before(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getPrimitiveRule()); 
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
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // InternalDsl.g:537:1: rulePrimitive : ( ( rule__Primitive__Alternatives ) ) ;
    public final void rulePrimitive() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:541:2: ( ( ( rule__Primitive__Alternatives ) ) )
            // InternalDsl.g:542:2: ( ( rule__Primitive__Alternatives ) )
            {
            // InternalDsl.g:542:2: ( ( rule__Primitive__Alternatives ) )
            // InternalDsl.g:543:3: ( rule__Primitive__Alternatives )
            {
             before(grammarAccess.getPrimitiveAccess().getAlternatives()); 
            // InternalDsl.g:544:3: ( rule__Primitive__Alternatives )
            // InternalDsl.g:544:4: rule__Primitive__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primitive__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "rule__Layout__AxisAlternatives_1_0"
    // InternalDsl.g:552:1: rule__Layout__AxisAlternatives_1_0 : ( ( 'row' ) | ( 'column' ) );
    public final void rule__Layout__AxisAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:556:1: ( ( 'row' ) | ( 'column' ) )
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
                    // InternalDsl.g:557:2: ( 'row' )
                    {
                    // InternalDsl.g:557:2: ( 'row' )
                    // InternalDsl.g:558:3: 'row'
                    {
                     before(grammarAccess.getLayoutAccess().getAxisRowKeyword_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getLayoutAccess().getAxisRowKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:563:2: ( 'column' )
                    {
                    // InternalDsl.g:563:2: ( 'column' )
                    // InternalDsl.g:564:3: 'column'
                    {
                     before(grammarAccess.getLayoutAccess().getAxisColumnKeyword_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getLayoutAccess().getAxisColumnKeyword_1_0_1()); 

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
    // $ANTLR end "rule__Layout__AxisAlternatives_1_0"


    // $ANTLR start "rule__Component__Alternatives"
    // InternalDsl.g:573:1: rule__Component__Alternatives : ( ( ruleLayout ) | ( ruleElement ) | ( ruleFormUse ) );
    public final void rule__Component__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:577:1: ( ( ruleLayout ) | ( ruleElement ) | ( ruleFormUse ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
            case 12:
                {
                alt2=1;
                }
                break;
            case 37:
            case 38:
            case 39:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDsl.g:578:2: ( ruleLayout )
                    {
                    // InternalDsl.g:578:2: ( ruleLayout )
                    // InternalDsl.g:579:3: ruleLayout
                    {
                     before(grammarAccess.getComponentAccess().getLayoutParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLayout();

                    state._fsp--;

                     after(grammarAccess.getComponentAccess().getLayoutParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:584:2: ( ruleElement )
                    {
                    // InternalDsl.g:584:2: ( ruleElement )
                    // InternalDsl.g:585:3: ruleElement
                    {
                     before(grammarAccess.getComponentAccess().getElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleElement();

                    state._fsp--;

                     after(grammarAccess.getComponentAccess().getElementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:590:2: ( ruleFormUse )
                    {
                    // InternalDsl.g:590:2: ( ruleFormUse )
                    // InternalDsl.g:591:3: ruleFormUse
                    {
                     before(grammarAccess.getComponentAccess().getFormUseParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFormUse();

                    state._fsp--;

                     after(grammarAccess.getComponentAccess().getFormUseParserRuleCall_2()); 

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
    // $ANTLR end "rule__Component__Alternatives"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalDsl.g:600:1: rule__Element__Alternatives : ( ( ruleLabel ) | ( ruleInputText ) | ( ruleButton ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:604:1: ( ( ruleLabel ) | ( ruleInputText ) | ( ruleButton ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt3=1;
                }
                break;
            case 38:
                {
                alt3=2;
                }
                break;
            case 39:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDsl.g:605:2: ( ruleLabel )
                    {
                    // InternalDsl.g:605:2: ( ruleLabel )
                    // InternalDsl.g:606:3: ruleLabel
                    {
                     before(grammarAccess.getElementAccess().getLabelParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLabel();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getLabelParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:611:2: ( ruleInputText )
                    {
                    // InternalDsl.g:611:2: ( ruleInputText )
                    // InternalDsl.g:612:3: ruleInputText
                    {
                     before(grammarAccess.getElementAccess().getInputTextParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInputText();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getInputTextParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:617:2: ( ruleButton )
                    {
                    // InternalDsl.g:617:2: ( ruleButton )
                    // InternalDsl.g:618:3: ruleButton
                    {
                     before(grammarAccess.getElementAccess().getButtonParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleButton();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getButtonParserRuleCall_2()); 

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
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalDsl.g:627:1: rule__Type__Alternatives : ( ( 'boolean' ) | ( 'string' ) | ( 'number' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:631:1: ( ( 'boolean' ) | ( 'string' ) | ( 'number' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDsl.g:632:2: ( 'boolean' )
                    {
                    // InternalDsl.g:632:2: ( 'boolean' )
                    // InternalDsl.g:633:3: 'boolean'
                    {
                     before(grammarAccess.getTypeAccess().getBooleanKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getBooleanKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:638:2: ( 'string' )
                    {
                    // InternalDsl.g:638:2: ( 'string' )
                    // InternalDsl.g:639:3: 'string'
                    {
                     before(grammarAccess.getTypeAccess().getStringKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getStringKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:644:2: ( 'number' )
                    {
                    // InternalDsl.g:644:2: ( 'number' )
                    // InternalDsl.g:645:3: 'number'
                    {
                     before(grammarAccess.getTypeAccess().getNumberKeyword_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getTypeAccess().getNumberKeyword_2()); 

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


    // $ANTLR start "rule__Boolean__OpAlternatives_1_1_0"
    // InternalDsl.g:654:1: rule__Boolean__OpAlternatives_1_1_0 : ( ( '&&' ) | ( '||' ) );
    public final void rule__Boolean__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:658:1: ( ( '&&' ) | ( '||' ) )
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
                    // InternalDsl.g:659:2: ( '&&' )
                    {
                    // InternalDsl.g:659:2: ( '&&' )
                    // InternalDsl.g:660:3: '&&'
                    {
                     before(grammarAccess.getBooleanAccess().getOpAmpersandAmpersandKeyword_1_1_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getOpAmpersandAmpersandKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:665:2: ( '||' )
                    {
                    // InternalDsl.g:665:2: ( '||' )
                    // InternalDsl.g:666:3: '||'
                    {
                     before(grammarAccess.getBooleanAccess().getOpVerticalLineVerticalLineKeyword_1_1_0_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getOpVerticalLineVerticalLineKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__Boolean__OpAlternatives_1_1_0"


    // $ANTLR start "rule__Equal__OpAlternatives_1_1_0"
    // InternalDsl.g:675:1: rule__Equal__OpAlternatives_1_1_0 : ( ( '==' ) | ( '!=' ) );
    public final void rule__Equal__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:679:1: ( ( '==' ) | ( '!=' ) )
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
                    // InternalDsl.g:680:2: ( '==' )
                    {
                    // InternalDsl.g:680:2: ( '==' )
                    // InternalDsl.g:681:3: '=='
                    {
                     before(grammarAccess.getEqualAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getEqualAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:686:2: ( '!=' )
                    {
                    // InternalDsl.g:686:2: ( '!=' )
                    // InternalDsl.g:687:3: '!='
                    {
                     before(grammarAccess.getEqualAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getEqualAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__Equal__OpAlternatives_1_1_0"


    // $ANTLR start "rule__Compare__OpAlternatives_1_1_0"
    // InternalDsl.g:696:1: rule__Compare__OpAlternatives_1_1_0 : ( ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) );
    public final void rule__Compare__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:700:1: ( ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt7=1;
                }
                break;
            case 21:
                {
                alt7=2;
                }
                break;
            case 22:
                {
                alt7=3;
                }
                break;
            case 23:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDsl.g:701:2: ( '<' )
                    {
                    // InternalDsl.g:701:2: ( '<' )
                    // InternalDsl.g:702:3: '<'
                    {
                     before(grammarAccess.getCompareAccess().getOpLessThanSignKeyword_1_1_0_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getCompareAccess().getOpLessThanSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:707:2: ( '>' )
                    {
                    // InternalDsl.g:707:2: ( '>' )
                    // InternalDsl.g:708:3: '>'
                    {
                     before(grammarAccess.getCompareAccess().getOpGreaterThanSignKeyword_1_1_0_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getCompareAccess().getOpGreaterThanSignKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:713:2: ( '<=' )
                    {
                    // InternalDsl.g:713:2: ( '<=' )
                    // InternalDsl.g:714:3: '<='
                    {
                     before(grammarAccess.getCompareAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_2()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getCompareAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:719:2: ( '>=' )
                    {
                    // InternalDsl.g:719:2: ( '>=' )
                    // InternalDsl.g:720:3: '>='
                    {
                     before(grammarAccess.getCompareAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_3()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getCompareAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_3()); 

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
    // $ANTLR end "rule__Compare__OpAlternatives_1_1_0"


    // $ANTLR start "rule__PlusMinus__OpAlternatives_1_1_0"
    // InternalDsl.g:729:1: rule__PlusMinus__OpAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__PlusMinus__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:733:1: ( ( '+' ) | ( '-' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            else if ( (LA8_0==25) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDsl.g:734:2: ( '+' )
                    {
                    // InternalDsl.g:734:2: ( '+' )
                    // InternalDsl.g:735:3: '+'
                    {
                     before(grammarAccess.getPlusMinusAccess().getOpPlusSignKeyword_1_1_0_0()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getPlusMinusAccess().getOpPlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:740:2: ( '-' )
                    {
                    // InternalDsl.g:740:2: ( '-' )
                    // InternalDsl.g:741:3: '-'
                    {
                     before(grammarAccess.getPlusMinusAccess().getOpHyphenMinusKeyword_1_1_0_1()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getPlusMinusAccess().getOpHyphenMinusKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__PlusMinus__OpAlternatives_1_1_0"


    // $ANTLR start "rule__MultDiv__OpAlternatives_1_1_0"
    // InternalDsl.g:750:1: rule__MultDiv__OpAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__MultDiv__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:754:1: ( ( '*' ) | ( '/' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            else if ( (LA9_0==27) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDsl.g:755:2: ( '*' )
                    {
                    // InternalDsl.g:755:2: ( '*' )
                    // InternalDsl.g:756:3: '*'
                    {
                     before(grammarAccess.getMultDivAccess().getOpAsteriskKeyword_1_1_0_0()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getMultDivAccess().getOpAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:761:2: ( '/' )
                    {
                    // InternalDsl.g:761:2: ( '/' )
                    // InternalDsl.g:762:3: '/'
                    {
                     before(grammarAccess.getMultDivAccess().getOpSolidusKeyword_1_1_0_1()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getMultDivAccess().getOpSolidusKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__MultDiv__OpAlternatives_1_1_0"


    // $ANTLR start "rule__Primitive__Alternatives"
    // InternalDsl.g:771:1: rule__Primitive__Alternatives : ( ( ( rule__Primitive__Group_0__0 ) ) | ( ( rule__Primitive__Group_1__0 ) ) | ( ( rule__Primitive__Group_2__0 ) ) | ( ( rule__Primitive__Group_3__0 ) ) | ( ( rule__Primitive__Group_4__0 ) ) | ( ( rule__Primitive__Group_5__0 ) ) | ( ( rule__Primitive__Group_6__0 ) ) | ( ( rule__Primitive__Group_7__0 ) ) );
    public final void rule__Primitive__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:775:1: ( ( ( rule__Primitive__Group_0__0 ) ) | ( ( rule__Primitive__Group_1__0 ) ) | ( ( rule__Primitive__Group_2__0 ) ) | ( ( rule__Primitive__Group_3__0 ) ) | ( ( rule__Primitive__Group_4__0 ) ) | ( ( rule__Primitive__Group_5__0 ) ) | ( ( rule__Primitive__Group_6__0 ) ) | ( ( rule__Primitive__Group_7__0 ) ) )
            int alt10=8;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalDsl.g:776:2: ( ( rule__Primitive__Group_0__0 ) )
                    {
                    // InternalDsl.g:776:2: ( ( rule__Primitive__Group_0__0 ) )
                    // InternalDsl.g:777:3: ( rule__Primitive__Group_0__0 )
                    {
                     before(grammarAccess.getPrimitiveAccess().getGroup_0()); 
                    // InternalDsl.g:778:3: ( rule__Primitive__Group_0__0 )
                    // InternalDsl.g:778:4: rule__Primitive__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primitive__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDsl.g:782:2: ( ( rule__Primitive__Group_1__0 ) )
                    {
                    // InternalDsl.g:782:2: ( ( rule__Primitive__Group_1__0 ) )
                    // InternalDsl.g:783:3: ( rule__Primitive__Group_1__0 )
                    {
                     before(grammarAccess.getPrimitiveAccess().getGroup_1()); 
                    // InternalDsl.g:784:3: ( rule__Primitive__Group_1__0 )
                    // InternalDsl.g:784:4: rule__Primitive__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primitive__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDsl.g:788:2: ( ( rule__Primitive__Group_2__0 ) )
                    {
                    // InternalDsl.g:788:2: ( ( rule__Primitive__Group_2__0 ) )
                    // InternalDsl.g:789:3: ( rule__Primitive__Group_2__0 )
                    {
                     before(grammarAccess.getPrimitiveAccess().getGroup_2()); 
                    // InternalDsl.g:790:3: ( rule__Primitive__Group_2__0 )
                    // InternalDsl.g:790:4: rule__Primitive__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primitive__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDsl.g:794:2: ( ( rule__Primitive__Group_3__0 ) )
                    {
                    // InternalDsl.g:794:2: ( ( rule__Primitive__Group_3__0 ) )
                    // InternalDsl.g:795:3: ( rule__Primitive__Group_3__0 )
                    {
                     before(grammarAccess.getPrimitiveAccess().getGroup_3()); 
                    // InternalDsl.g:796:3: ( rule__Primitive__Group_3__0 )
                    // InternalDsl.g:796:4: rule__Primitive__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primitive__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDsl.g:800:2: ( ( rule__Primitive__Group_4__0 ) )
                    {
                    // InternalDsl.g:800:2: ( ( rule__Primitive__Group_4__0 ) )
                    // InternalDsl.g:801:3: ( rule__Primitive__Group_4__0 )
                    {
                     before(grammarAccess.getPrimitiveAccess().getGroup_4()); 
                    // InternalDsl.g:802:3: ( rule__Primitive__Group_4__0 )
                    // InternalDsl.g:802:4: rule__Primitive__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primitive__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDsl.g:806:2: ( ( rule__Primitive__Group_5__0 ) )
                    {
                    // InternalDsl.g:806:2: ( ( rule__Primitive__Group_5__0 ) )
                    // InternalDsl.g:807:3: ( rule__Primitive__Group_5__0 )
                    {
                     before(grammarAccess.getPrimitiveAccess().getGroup_5()); 
                    // InternalDsl.g:808:3: ( rule__Primitive__Group_5__0 )
                    // InternalDsl.g:808:4: rule__Primitive__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primitive__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDsl.g:812:2: ( ( rule__Primitive__Group_6__0 ) )
                    {
                    // InternalDsl.g:812:2: ( ( rule__Primitive__Group_6__0 ) )
                    // InternalDsl.g:813:3: ( rule__Primitive__Group_6__0 )
                    {
                     before(grammarAccess.getPrimitiveAccess().getGroup_6()); 
                    // InternalDsl.g:814:3: ( rule__Primitive__Group_6__0 )
                    // InternalDsl.g:814:4: rule__Primitive__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primitive__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveAccess().getGroup_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDsl.g:818:2: ( ( rule__Primitive__Group_7__0 ) )
                    {
                    // InternalDsl.g:818:2: ( ( rule__Primitive__Group_7__0 ) )
                    // InternalDsl.g:819:3: ( rule__Primitive__Group_7__0 )
                    {
                     before(grammarAccess.getPrimitiveAccess().getGroup_7()); 
                    // InternalDsl.g:820:3: ( rule__Primitive__Group_7__0 )
                    // InternalDsl.g:820:4: rule__Primitive__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primitive__Group_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Primitive__Alternatives"


    // $ANTLR start "rule__UI23__Group__0"
    // InternalDsl.g:828:1: rule__UI23__Group__0 : rule__UI23__Group__0__Impl rule__UI23__Group__1 ;
    public final void rule__UI23__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:832:1: ( rule__UI23__Group__0__Impl rule__UI23__Group__1 )
            // InternalDsl.g:833:2: rule__UI23__Group__0__Impl rule__UI23__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__UI23__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UI23__Group__1();

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
    // $ANTLR end "rule__UI23__Group__0"


    // $ANTLR start "rule__UI23__Group__0__Impl"
    // InternalDsl.g:840:1: rule__UI23__Group__0__Impl : ( 'title' ) ;
    public final void rule__UI23__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:844:1: ( ( 'title' ) )
            // InternalDsl.g:845:1: ( 'title' )
            {
            // InternalDsl.g:845:1: ( 'title' )
            // InternalDsl.g:846:2: 'title'
            {
             before(grammarAccess.getUI23Access().getTitleKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getUI23Access().getTitleKeyword_0()); 

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
    // $ANTLR end "rule__UI23__Group__0__Impl"


    // $ANTLR start "rule__UI23__Group__1"
    // InternalDsl.g:855:1: rule__UI23__Group__1 : rule__UI23__Group__1__Impl rule__UI23__Group__2 ;
    public final void rule__UI23__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:859:1: ( rule__UI23__Group__1__Impl rule__UI23__Group__2 )
            // InternalDsl.g:860:2: rule__UI23__Group__1__Impl rule__UI23__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__UI23__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UI23__Group__2();

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
    // $ANTLR end "rule__UI23__Group__1"


    // $ANTLR start "rule__UI23__Group__1__Impl"
    // InternalDsl.g:867:1: rule__UI23__Group__1__Impl : ( ( rule__UI23__NameAssignment_1 ) ) ;
    public final void rule__UI23__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:871:1: ( ( ( rule__UI23__NameAssignment_1 ) ) )
            // InternalDsl.g:872:1: ( ( rule__UI23__NameAssignment_1 ) )
            {
            // InternalDsl.g:872:1: ( ( rule__UI23__NameAssignment_1 ) )
            // InternalDsl.g:873:2: ( rule__UI23__NameAssignment_1 )
            {
             before(grammarAccess.getUI23Access().getNameAssignment_1()); 
            // InternalDsl.g:874:2: ( rule__UI23__NameAssignment_1 )
            // InternalDsl.g:874:3: rule__UI23__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UI23__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUI23Access().getNameAssignment_1()); 

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
    // $ANTLR end "rule__UI23__Group__1__Impl"


    // $ANTLR start "rule__UI23__Group__2"
    // InternalDsl.g:882:1: rule__UI23__Group__2 : rule__UI23__Group__2__Impl rule__UI23__Group__3 ;
    public final void rule__UI23__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:886:1: ( rule__UI23__Group__2__Impl rule__UI23__Group__3 )
            // InternalDsl.g:887:2: rule__UI23__Group__2__Impl rule__UI23__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__UI23__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UI23__Group__3();

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
    // $ANTLR end "rule__UI23__Group__2"


    // $ANTLR start "rule__UI23__Group__2__Impl"
    // InternalDsl.g:894:1: rule__UI23__Group__2__Impl : ( ( rule__UI23__FunctionsAssignment_2 )* ) ;
    public final void rule__UI23__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:898:1: ( ( ( rule__UI23__FunctionsAssignment_2 )* ) )
            // InternalDsl.g:899:1: ( ( rule__UI23__FunctionsAssignment_2 )* )
            {
            // InternalDsl.g:899:1: ( ( rule__UI23__FunctionsAssignment_2 )* )
            // InternalDsl.g:900:2: ( rule__UI23__FunctionsAssignment_2 )*
            {
             before(grammarAccess.getUI23Access().getFunctionsAssignment_2()); 
            // InternalDsl.g:901:2: ( rule__UI23__FunctionsAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==29) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDsl.g:901:3: rule__UI23__FunctionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__UI23__FunctionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getUI23Access().getFunctionsAssignment_2()); 

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
    // $ANTLR end "rule__UI23__Group__2__Impl"


    // $ANTLR start "rule__UI23__Group__3"
    // InternalDsl.g:909:1: rule__UI23__Group__3 : rule__UI23__Group__3__Impl ;
    public final void rule__UI23__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:913:1: ( rule__UI23__Group__3__Impl )
            // InternalDsl.g:914:2: rule__UI23__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UI23__Group__3__Impl();

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
    // $ANTLR end "rule__UI23__Group__3"


    // $ANTLR start "rule__UI23__Group__3__Impl"
    // InternalDsl.g:920:1: rule__UI23__Group__3__Impl : ( ( rule__UI23__FormsAssignment_3 )* ) ;
    public final void rule__UI23__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:924:1: ( ( ( rule__UI23__FormsAssignment_3 )* ) )
            // InternalDsl.g:925:1: ( ( rule__UI23__FormsAssignment_3 )* )
            {
            // InternalDsl.g:925:1: ( ( rule__UI23__FormsAssignment_3 )* )
            // InternalDsl.g:926:2: ( rule__UI23__FormsAssignment_3 )*
            {
             before(grammarAccess.getUI23Access().getFormsAssignment_3()); 
            // InternalDsl.g:927:2: ( rule__UI23__FormsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==34) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDsl.g:927:3: rule__UI23__FormsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__UI23__FormsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getUI23Access().getFormsAssignment_3()); 

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
    // $ANTLR end "rule__UI23__Group__3__Impl"


    // $ANTLR start "rule__Function__Group__0"
    // InternalDsl.g:936:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:940:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalDsl.g:941:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Function__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__1();

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
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // InternalDsl.g:948:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:952:1: ( ( 'function' ) )
            // InternalDsl.g:953:1: ( 'function' )
            {
            // InternalDsl.g:953:1: ( 'function' )
            // InternalDsl.g:954:2: 'function'
            {
             before(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 

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
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // InternalDsl.g:963:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:967:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalDsl.g:968:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Function__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__2();

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
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // InternalDsl.g:975:1: rule__Function__Group__1__Impl : ( ( rule__Function__NameAssignment_1 ) ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:979:1: ( ( ( rule__Function__NameAssignment_1 ) ) )
            // InternalDsl.g:980:1: ( ( rule__Function__NameAssignment_1 ) )
            {
            // InternalDsl.g:980:1: ( ( rule__Function__NameAssignment_1 ) )
            // InternalDsl.g:981:2: ( rule__Function__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_1()); 
            // InternalDsl.g:982:2: ( rule__Function__NameAssignment_1 )
            // InternalDsl.g:982:3: rule__Function__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // InternalDsl.g:990:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:994:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalDsl.g:995:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Function__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__3();

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
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // InternalDsl.g:1002:1: rule__Function__Group__2__Impl : ( '(' ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1006:1: ( ( '(' ) )
            // InternalDsl.g:1007:1: ( '(' )
            {
            // InternalDsl.g:1007:1: ( '(' )
            // InternalDsl.g:1008:2: '('
            {
             before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__3"
    // InternalDsl.g:1017:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1021:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // InternalDsl.g:1022:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Function__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__4();

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
    // $ANTLR end "rule__Function__Group__3"


    // $ANTLR start "rule__Function__Group__3__Impl"
    // InternalDsl.g:1029:1: rule__Function__Group__3__Impl : ( ( rule__Function__Group_3__0 )? ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1033:1: ( ( ( rule__Function__Group_3__0 )? ) )
            // InternalDsl.g:1034:1: ( ( rule__Function__Group_3__0 )? )
            {
            // InternalDsl.g:1034:1: ( ( rule__Function__Group_3__0 )? )
            // InternalDsl.g:1035:2: ( rule__Function__Group_3__0 )?
            {
             before(grammarAccess.getFunctionAccess().getGroup_3()); 
            // InternalDsl.g:1036:2: ( rule__Function__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=13 && LA13_0<=15)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDsl.g:1036:3: rule__Function__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Function__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Function__Group__3__Impl"


    // $ANTLR start "rule__Function__Group__4"
    // InternalDsl.g:1044:1: rule__Function__Group__4 : rule__Function__Group__4__Impl rule__Function__Group__5 ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1048:1: ( rule__Function__Group__4__Impl rule__Function__Group__5 )
            // InternalDsl.g:1049:2: rule__Function__Group__4__Impl rule__Function__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Function__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__5();

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
    // $ANTLR end "rule__Function__Group__4"


    // $ANTLR start "rule__Function__Group__4__Impl"
    // InternalDsl.g:1056:1: rule__Function__Group__4__Impl : ( ')' ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1060:1: ( ( ')' ) )
            // InternalDsl.g:1061:1: ( ')' )
            {
            // InternalDsl.g:1061:1: ( ')' )
            // InternalDsl.g:1062:2: ')'
            {
             before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Function__Group__4__Impl"


    // $ANTLR start "rule__Function__Group__5"
    // InternalDsl.g:1071:1: rule__Function__Group__5 : rule__Function__Group__5__Impl rule__Function__Group__6 ;
    public final void rule__Function__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1075:1: ( rule__Function__Group__5__Impl rule__Function__Group__6 )
            // InternalDsl.g:1076:2: rule__Function__Group__5__Impl rule__Function__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Function__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__6();

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
    // $ANTLR end "rule__Function__Group__5"


    // $ANTLR start "rule__Function__Group__5__Impl"
    // InternalDsl.g:1083:1: rule__Function__Group__5__Impl : ( ':' ) ;
    public final void rule__Function__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1087:1: ( ( ':' ) )
            // InternalDsl.g:1088:1: ( ':' )
            {
            // InternalDsl.g:1088:1: ( ':' )
            // InternalDsl.g:1089:2: ':'
            {
             before(grammarAccess.getFunctionAccess().getColonKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getColonKeyword_5()); 

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
    // $ANTLR end "rule__Function__Group__5__Impl"


    // $ANTLR start "rule__Function__Group__6"
    // InternalDsl.g:1098:1: rule__Function__Group__6 : rule__Function__Group__6__Impl ;
    public final void rule__Function__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1102:1: ( rule__Function__Group__6__Impl )
            // InternalDsl.g:1103:2: rule__Function__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__6__Impl();

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
    // $ANTLR end "rule__Function__Group__6"


    // $ANTLR start "rule__Function__Group__6__Impl"
    // InternalDsl.g:1109:1: rule__Function__Group__6__Impl : ( ( rule__Function__ReturnTypeAssignment_6 ) ) ;
    public final void rule__Function__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1113:1: ( ( ( rule__Function__ReturnTypeAssignment_6 ) ) )
            // InternalDsl.g:1114:1: ( ( rule__Function__ReturnTypeAssignment_6 ) )
            {
            // InternalDsl.g:1114:1: ( ( rule__Function__ReturnTypeAssignment_6 ) )
            // InternalDsl.g:1115:2: ( rule__Function__ReturnTypeAssignment_6 )
            {
             before(grammarAccess.getFunctionAccess().getReturnTypeAssignment_6()); 
            // InternalDsl.g:1116:2: ( rule__Function__ReturnTypeAssignment_6 )
            // InternalDsl.g:1116:3: rule__Function__ReturnTypeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Function__ReturnTypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getReturnTypeAssignment_6()); 

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
    // $ANTLR end "rule__Function__Group__6__Impl"


    // $ANTLR start "rule__Function__Group_3__0"
    // InternalDsl.g:1125:1: rule__Function__Group_3__0 : rule__Function__Group_3__0__Impl rule__Function__Group_3__1 ;
    public final void rule__Function__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1129:1: ( rule__Function__Group_3__0__Impl rule__Function__Group_3__1 )
            // InternalDsl.g:1130:2: rule__Function__Group_3__0__Impl rule__Function__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Function__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_3__1();

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
    // $ANTLR end "rule__Function__Group_3__0"


    // $ANTLR start "rule__Function__Group_3__0__Impl"
    // InternalDsl.g:1137:1: rule__Function__Group_3__0__Impl : ( ( rule__Function__TypesAssignment_3_0 ) ) ;
    public final void rule__Function__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1141:1: ( ( ( rule__Function__TypesAssignment_3_0 ) ) )
            // InternalDsl.g:1142:1: ( ( rule__Function__TypesAssignment_3_0 ) )
            {
            // InternalDsl.g:1142:1: ( ( rule__Function__TypesAssignment_3_0 ) )
            // InternalDsl.g:1143:2: ( rule__Function__TypesAssignment_3_0 )
            {
             before(grammarAccess.getFunctionAccess().getTypesAssignment_3_0()); 
            // InternalDsl.g:1144:2: ( rule__Function__TypesAssignment_3_0 )
            // InternalDsl.g:1144:3: rule__Function__TypesAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Function__TypesAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getTypesAssignment_3_0()); 

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
    // $ANTLR end "rule__Function__Group_3__0__Impl"


    // $ANTLR start "rule__Function__Group_3__1"
    // InternalDsl.g:1152:1: rule__Function__Group_3__1 : rule__Function__Group_3__1__Impl ;
    public final void rule__Function__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1156:1: ( rule__Function__Group_3__1__Impl )
            // InternalDsl.g:1157:2: rule__Function__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group_3__1__Impl();

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
    // $ANTLR end "rule__Function__Group_3__1"


    // $ANTLR start "rule__Function__Group_3__1__Impl"
    // InternalDsl.g:1163:1: rule__Function__Group_3__1__Impl : ( ( rule__Function__Group_3_1__0 )* ) ;
    public final void rule__Function__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1167:1: ( ( ( rule__Function__Group_3_1__0 )* ) )
            // InternalDsl.g:1168:1: ( ( rule__Function__Group_3_1__0 )* )
            {
            // InternalDsl.g:1168:1: ( ( rule__Function__Group_3_1__0 )* )
            // InternalDsl.g:1169:2: ( rule__Function__Group_3_1__0 )*
            {
             before(grammarAccess.getFunctionAccess().getGroup_3_1()); 
            // InternalDsl.g:1170:2: ( rule__Function__Group_3_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==33) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDsl.g:1170:3: rule__Function__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Function__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__Function__Group_3__1__Impl"


    // $ANTLR start "rule__Function__Group_3_1__0"
    // InternalDsl.g:1179:1: rule__Function__Group_3_1__0 : rule__Function__Group_3_1__0__Impl rule__Function__Group_3_1__1 ;
    public final void rule__Function__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1183:1: ( rule__Function__Group_3_1__0__Impl rule__Function__Group_3_1__1 )
            // InternalDsl.g:1184:2: rule__Function__Group_3_1__0__Impl rule__Function__Group_3_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Function__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_3_1__1();

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
    // $ANTLR end "rule__Function__Group_3_1__0"


    // $ANTLR start "rule__Function__Group_3_1__0__Impl"
    // InternalDsl.g:1191:1: rule__Function__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Function__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1195:1: ( ( ',' ) )
            // InternalDsl.g:1196:1: ( ',' )
            {
            // InternalDsl.g:1196:1: ( ',' )
            // InternalDsl.g:1197:2: ','
            {
             before(grammarAccess.getFunctionAccess().getCommaKeyword_3_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getCommaKeyword_3_1_0()); 

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
    // $ANTLR end "rule__Function__Group_3_1__0__Impl"


    // $ANTLR start "rule__Function__Group_3_1__1"
    // InternalDsl.g:1206:1: rule__Function__Group_3_1__1 : rule__Function__Group_3_1__1__Impl ;
    public final void rule__Function__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1210:1: ( rule__Function__Group_3_1__1__Impl )
            // InternalDsl.g:1211:2: rule__Function__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__Function__Group_3_1__1"


    // $ANTLR start "rule__Function__Group_3_1__1__Impl"
    // InternalDsl.g:1217:1: rule__Function__Group_3_1__1__Impl : ( ( rule__Function__TypesAssignment_3_1_1 ) ) ;
    public final void rule__Function__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1221:1: ( ( ( rule__Function__TypesAssignment_3_1_1 ) ) )
            // InternalDsl.g:1222:1: ( ( rule__Function__TypesAssignment_3_1_1 ) )
            {
            // InternalDsl.g:1222:1: ( ( rule__Function__TypesAssignment_3_1_1 ) )
            // InternalDsl.g:1223:2: ( rule__Function__TypesAssignment_3_1_1 )
            {
             before(grammarAccess.getFunctionAccess().getTypesAssignment_3_1_1()); 
            // InternalDsl.g:1224:2: ( rule__Function__TypesAssignment_3_1_1 )
            // InternalDsl.g:1224:3: rule__Function__TypesAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__TypesAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getTypesAssignment_3_1_1()); 

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
    // $ANTLR end "rule__Function__Group_3_1__1__Impl"


    // $ANTLR start "rule__Form__Group__0"
    // InternalDsl.g:1233:1: rule__Form__Group__0 : rule__Form__Group__0__Impl rule__Form__Group__1 ;
    public final void rule__Form__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1237:1: ( rule__Form__Group__0__Impl rule__Form__Group__1 )
            // InternalDsl.g:1238:2: rule__Form__Group__0__Impl rule__Form__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Form__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group__1();

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
    // $ANTLR end "rule__Form__Group__0"


    // $ANTLR start "rule__Form__Group__0__Impl"
    // InternalDsl.g:1245:1: rule__Form__Group__0__Impl : ( 'form' ) ;
    public final void rule__Form__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1249:1: ( ( 'form' ) )
            // InternalDsl.g:1250:1: ( 'form' )
            {
            // InternalDsl.g:1250:1: ( 'form' )
            // InternalDsl.g:1251:2: 'form'
            {
             before(grammarAccess.getFormAccess().getFormKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFormAccess().getFormKeyword_0()); 

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
    // $ANTLR end "rule__Form__Group__0__Impl"


    // $ANTLR start "rule__Form__Group__1"
    // InternalDsl.g:1260:1: rule__Form__Group__1 : rule__Form__Group__1__Impl rule__Form__Group__2 ;
    public final void rule__Form__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1264:1: ( rule__Form__Group__1__Impl rule__Form__Group__2 )
            // InternalDsl.g:1265:2: rule__Form__Group__1__Impl rule__Form__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Form__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group__2();

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
    // $ANTLR end "rule__Form__Group__1"


    // $ANTLR start "rule__Form__Group__1__Impl"
    // InternalDsl.g:1272:1: rule__Form__Group__1__Impl : ( ( rule__Form__NameAssignment_1 ) ) ;
    public final void rule__Form__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1276:1: ( ( ( rule__Form__NameAssignment_1 ) ) )
            // InternalDsl.g:1277:1: ( ( rule__Form__NameAssignment_1 ) )
            {
            // InternalDsl.g:1277:1: ( ( rule__Form__NameAssignment_1 ) )
            // InternalDsl.g:1278:2: ( rule__Form__NameAssignment_1 )
            {
             before(grammarAccess.getFormAccess().getNameAssignment_1()); 
            // InternalDsl.g:1279:2: ( rule__Form__NameAssignment_1 )
            // InternalDsl.g:1279:3: rule__Form__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Form__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFormAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Form__Group__1__Impl"


    // $ANTLR start "rule__Form__Group__2"
    // InternalDsl.g:1287:1: rule__Form__Group__2 : rule__Form__Group__2__Impl rule__Form__Group__3 ;
    public final void rule__Form__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1291:1: ( rule__Form__Group__2__Impl rule__Form__Group__3 )
            // InternalDsl.g:1292:2: rule__Form__Group__2__Impl rule__Form__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Form__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group__3();

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
    // $ANTLR end "rule__Form__Group__2"


    // $ANTLR start "rule__Form__Group__2__Impl"
    // InternalDsl.g:1299:1: rule__Form__Group__2__Impl : ( ( rule__Form__Group_2__0 )? ) ;
    public final void rule__Form__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1303:1: ( ( ( rule__Form__Group_2__0 )? ) )
            // InternalDsl.g:1304:1: ( ( rule__Form__Group_2__0 )? )
            {
            // InternalDsl.g:1304:1: ( ( rule__Form__Group_2__0 )? )
            // InternalDsl.g:1305:2: ( rule__Form__Group_2__0 )?
            {
             before(grammarAccess.getFormAccess().getGroup_2()); 
            // InternalDsl.g:1306:2: ( rule__Form__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDsl.g:1306:3: rule__Form__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Form__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Form__Group__2__Impl"


    // $ANTLR start "rule__Form__Group__3"
    // InternalDsl.g:1314:1: rule__Form__Group__3 : rule__Form__Group__3__Impl rule__Form__Group__4 ;
    public final void rule__Form__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1318:1: ( rule__Form__Group__3__Impl rule__Form__Group__4 )
            // InternalDsl.g:1319:2: rule__Form__Group__3__Impl rule__Form__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Form__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group__4();

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
    // $ANTLR end "rule__Form__Group__3"


    // $ANTLR start "rule__Form__Group__3__Impl"
    // InternalDsl.g:1326:1: rule__Form__Group__3__Impl : ( '{' ) ;
    public final void rule__Form__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1330:1: ( ( '{' ) )
            // InternalDsl.g:1331:1: ( '{' )
            {
            // InternalDsl.g:1331:1: ( '{' )
            // InternalDsl.g:1332:2: '{'
            {
             before(grammarAccess.getFormAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getFormAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Form__Group__3__Impl"


    // $ANTLR start "rule__Form__Group__4"
    // InternalDsl.g:1341:1: rule__Form__Group__4 : rule__Form__Group__4__Impl rule__Form__Group__5 ;
    public final void rule__Form__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1345:1: ( rule__Form__Group__4__Impl rule__Form__Group__5 )
            // InternalDsl.g:1346:2: rule__Form__Group__4__Impl rule__Form__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Form__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group__5();

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
    // $ANTLR end "rule__Form__Group__4"


    // $ANTLR start "rule__Form__Group__4__Impl"
    // InternalDsl.g:1353:1: rule__Form__Group__4__Impl : ( ( rule__Form__LayoutAssignment_4 ) ) ;
    public final void rule__Form__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1357:1: ( ( ( rule__Form__LayoutAssignment_4 ) ) )
            // InternalDsl.g:1358:1: ( ( rule__Form__LayoutAssignment_4 ) )
            {
            // InternalDsl.g:1358:1: ( ( rule__Form__LayoutAssignment_4 ) )
            // InternalDsl.g:1359:2: ( rule__Form__LayoutAssignment_4 )
            {
             before(grammarAccess.getFormAccess().getLayoutAssignment_4()); 
            // InternalDsl.g:1360:2: ( rule__Form__LayoutAssignment_4 )
            // InternalDsl.g:1360:3: rule__Form__LayoutAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Form__LayoutAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFormAccess().getLayoutAssignment_4()); 

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
    // $ANTLR end "rule__Form__Group__4__Impl"


    // $ANTLR start "rule__Form__Group__5"
    // InternalDsl.g:1368:1: rule__Form__Group__5 : rule__Form__Group__5__Impl ;
    public final void rule__Form__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1372:1: ( rule__Form__Group__5__Impl )
            // InternalDsl.g:1373:2: rule__Form__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Form__Group__5__Impl();

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
    // $ANTLR end "rule__Form__Group__5"


    // $ANTLR start "rule__Form__Group__5__Impl"
    // InternalDsl.g:1379:1: rule__Form__Group__5__Impl : ( '}' ) ;
    public final void rule__Form__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1383:1: ( ( '}' ) )
            // InternalDsl.g:1384:1: ( '}' )
            {
            // InternalDsl.g:1384:1: ( '}' )
            // InternalDsl.g:1385:2: '}'
            {
             before(grammarAccess.getFormAccess().getRightCurlyBracketKeyword_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getFormAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Form__Group__5__Impl"


    // $ANTLR start "rule__Form__Group_2__0"
    // InternalDsl.g:1395:1: rule__Form__Group_2__0 : rule__Form__Group_2__0__Impl rule__Form__Group_2__1 ;
    public final void rule__Form__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1399:1: ( rule__Form__Group_2__0__Impl rule__Form__Group_2__1 )
            // InternalDsl.g:1400:2: rule__Form__Group_2__0__Impl rule__Form__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__Form__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group_2__1();

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
    // $ANTLR end "rule__Form__Group_2__0"


    // $ANTLR start "rule__Form__Group_2__0__Impl"
    // InternalDsl.g:1407:1: rule__Form__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Form__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1411:1: ( ( '(' ) )
            // InternalDsl.g:1412:1: ( '(' )
            {
            // InternalDsl.g:1412:1: ( '(' )
            // InternalDsl.g:1413:2: '('
            {
             before(grammarAccess.getFormAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFormAccess().getLeftParenthesisKeyword_2_0()); 

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
    // $ANTLR end "rule__Form__Group_2__0__Impl"


    // $ANTLR start "rule__Form__Group_2__1"
    // InternalDsl.g:1422:1: rule__Form__Group_2__1 : rule__Form__Group_2__1__Impl rule__Form__Group_2__2 ;
    public final void rule__Form__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1426:1: ( rule__Form__Group_2__1__Impl rule__Form__Group_2__2 )
            // InternalDsl.g:1427:2: rule__Form__Group_2__1__Impl rule__Form__Group_2__2
            {
            pushFollow(FOLLOW_16);
            rule__Form__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group_2__2();

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
    // $ANTLR end "rule__Form__Group_2__1"


    // $ANTLR start "rule__Form__Group_2__1__Impl"
    // InternalDsl.g:1434:1: rule__Form__Group_2__1__Impl : ( ( rule__Form__Group_2_1__0 )? ) ;
    public final void rule__Form__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1438:1: ( ( ( rule__Form__Group_2_1__0 )? ) )
            // InternalDsl.g:1439:1: ( ( rule__Form__Group_2_1__0 )? )
            {
            // InternalDsl.g:1439:1: ( ( rule__Form__Group_2_1__0 )? )
            // InternalDsl.g:1440:2: ( rule__Form__Group_2_1__0 )?
            {
             before(grammarAccess.getFormAccess().getGroup_2_1()); 
            // InternalDsl.g:1441:2: ( rule__Form__Group_2_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDsl.g:1441:3: rule__Form__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Form__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Form__Group_2__1__Impl"


    // $ANTLR start "rule__Form__Group_2__2"
    // InternalDsl.g:1449:1: rule__Form__Group_2__2 : rule__Form__Group_2__2__Impl ;
    public final void rule__Form__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1453:1: ( rule__Form__Group_2__2__Impl )
            // InternalDsl.g:1454:2: rule__Form__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Form__Group_2__2__Impl();

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
    // $ANTLR end "rule__Form__Group_2__2"


    // $ANTLR start "rule__Form__Group_2__2__Impl"
    // InternalDsl.g:1460:1: rule__Form__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Form__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1464:1: ( ( ')' ) )
            // InternalDsl.g:1465:1: ( ')' )
            {
            // InternalDsl.g:1465:1: ( ')' )
            // InternalDsl.g:1466:2: ')'
            {
             before(grammarAccess.getFormAccess().getRightParenthesisKeyword_2_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFormAccess().getRightParenthesisKeyword_2_2()); 

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
    // $ANTLR end "rule__Form__Group_2__2__Impl"


    // $ANTLR start "rule__Form__Group_2_1__0"
    // InternalDsl.g:1476:1: rule__Form__Group_2_1__0 : rule__Form__Group_2_1__0__Impl rule__Form__Group_2_1__1 ;
    public final void rule__Form__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1480:1: ( rule__Form__Group_2_1__0__Impl rule__Form__Group_2_1__1 )
            // InternalDsl.g:1481:2: rule__Form__Group_2_1__0__Impl rule__Form__Group_2_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Form__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group_2_1__1();

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
    // $ANTLR end "rule__Form__Group_2_1__0"


    // $ANTLR start "rule__Form__Group_2_1__0__Impl"
    // InternalDsl.g:1488:1: rule__Form__Group_2_1__0__Impl : ( ( rule__Form__ParametersAssignment_2_1_0 ) ) ;
    public final void rule__Form__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1492:1: ( ( ( rule__Form__ParametersAssignment_2_1_0 ) ) )
            // InternalDsl.g:1493:1: ( ( rule__Form__ParametersAssignment_2_1_0 ) )
            {
            // InternalDsl.g:1493:1: ( ( rule__Form__ParametersAssignment_2_1_0 ) )
            // InternalDsl.g:1494:2: ( rule__Form__ParametersAssignment_2_1_0 )
            {
             before(grammarAccess.getFormAccess().getParametersAssignment_2_1_0()); 
            // InternalDsl.g:1495:2: ( rule__Form__ParametersAssignment_2_1_0 )
            // InternalDsl.g:1495:3: rule__Form__ParametersAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Form__ParametersAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFormAccess().getParametersAssignment_2_1_0()); 

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
    // $ANTLR end "rule__Form__Group_2_1__0__Impl"


    // $ANTLR start "rule__Form__Group_2_1__1"
    // InternalDsl.g:1503:1: rule__Form__Group_2_1__1 : rule__Form__Group_2_1__1__Impl ;
    public final void rule__Form__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1507:1: ( rule__Form__Group_2_1__1__Impl )
            // InternalDsl.g:1508:2: rule__Form__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Form__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__Form__Group_2_1__1"


    // $ANTLR start "rule__Form__Group_2_1__1__Impl"
    // InternalDsl.g:1514:1: rule__Form__Group_2_1__1__Impl : ( ( rule__Form__Group_2_1_1__0 )* ) ;
    public final void rule__Form__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1518:1: ( ( ( rule__Form__Group_2_1_1__0 )* ) )
            // InternalDsl.g:1519:1: ( ( rule__Form__Group_2_1_1__0 )* )
            {
            // InternalDsl.g:1519:1: ( ( rule__Form__Group_2_1_1__0 )* )
            // InternalDsl.g:1520:2: ( rule__Form__Group_2_1_1__0 )*
            {
             before(grammarAccess.getFormAccess().getGroup_2_1_1()); 
            // InternalDsl.g:1521:2: ( rule__Form__Group_2_1_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==33) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDsl.g:1521:3: rule__Form__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Form__Group_2_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getFormAccess().getGroup_2_1_1()); 

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
    // $ANTLR end "rule__Form__Group_2_1__1__Impl"


    // $ANTLR start "rule__Form__Group_2_1_1__0"
    // InternalDsl.g:1530:1: rule__Form__Group_2_1_1__0 : rule__Form__Group_2_1_1__0__Impl rule__Form__Group_2_1_1__1 ;
    public final void rule__Form__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1534:1: ( rule__Form__Group_2_1_1__0__Impl rule__Form__Group_2_1_1__1 )
            // InternalDsl.g:1535:2: rule__Form__Group_2_1_1__0__Impl rule__Form__Group_2_1_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Form__Group_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Form__Group_2_1_1__1();

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
    // $ANTLR end "rule__Form__Group_2_1_1__0"


    // $ANTLR start "rule__Form__Group_2_1_1__0__Impl"
    // InternalDsl.g:1542:1: rule__Form__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__Form__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1546:1: ( ( ',' ) )
            // InternalDsl.g:1547:1: ( ',' )
            {
            // InternalDsl.g:1547:1: ( ',' )
            // InternalDsl.g:1548:2: ','
            {
             before(grammarAccess.getFormAccess().getCommaKeyword_2_1_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFormAccess().getCommaKeyword_2_1_1_0()); 

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
    // $ANTLR end "rule__Form__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__Form__Group_2_1_1__1"
    // InternalDsl.g:1557:1: rule__Form__Group_2_1_1__1 : rule__Form__Group_2_1_1__1__Impl ;
    public final void rule__Form__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1561:1: ( rule__Form__Group_2_1_1__1__Impl )
            // InternalDsl.g:1562:2: rule__Form__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Form__Group_2_1_1__1__Impl();

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
    // $ANTLR end "rule__Form__Group_2_1_1__1"


    // $ANTLR start "rule__Form__Group_2_1_1__1__Impl"
    // InternalDsl.g:1568:1: rule__Form__Group_2_1_1__1__Impl : ( ( rule__Form__ParametersAssignment_2_1_1_1 ) ) ;
    public final void rule__Form__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1572:1: ( ( ( rule__Form__ParametersAssignment_2_1_1_1 ) ) )
            // InternalDsl.g:1573:1: ( ( rule__Form__ParametersAssignment_2_1_1_1 ) )
            {
            // InternalDsl.g:1573:1: ( ( rule__Form__ParametersAssignment_2_1_1_1 ) )
            // InternalDsl.g:1574:2: ( rule__Form__ParametersAssignment_2_1_1_1 )
            {
             before(grammarAccess.getFormAccess().getParametersAssignment_2_1_1_1()); 
            // InternalDsl.g:1575:2: ( rule__Form__ParametersAssignment_2_1_1_1 )
            // InternalDsl.g:1575:3: rule__Form__ParametersAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Form__ParametersAssignment_2_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFormAccess().getParametersAssignment_2_1_1_1()); 

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
    // $ANTLR end "rule__Form__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__Layout__Group__0"
    // InternalDsl.g:1584:1: rule__Layout__Group__0 : rule__Layout__Group__0__Impl rule__Layout__Group__1 ;
    public final void rule__Layout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1588:1: ( rule__Layout__Group__0__Impl rule__Layout__Group__1 )
            // InternalDsl.g:1589:2: rule__Layout__Group__0__Impl rule__Layout__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Layout__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layout__Group__1();

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
    // $ANTLR end "rule__Layout__Group__0"


    // $ANTLR start "rule__Layout__Group__0__Impl"
    // InternalDsl.g:1596:1: rule__Layout__Group__0__Impl : ( () ) ;
    public final void rule__Layout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1600:1: ( ( () ) )
            // InternalDsl.g:1601:1: ( () )
            {
            // InternalDsl.g:1601:1: ( () )
            // InternalDsl.g:1602:2: ()
            {
             before(grammarAccess.getLayoutAccess().getLayoutAction_0()); 
            // InternalDsl.g:1603:2: ()
            // InternalDsl.g:1603:3: 
            {
            }

             after(grammarAccess.getLayoutAccess().getLayoutAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Group__0__Impl"


    // $ANTLR start "rule__Layout__Group__1"
    // InternalDsl.g:1611:1: rule__Layout__Group__1 : rule__Layout__Group__1__Impl rule__Layout__Group__2 ;
    public final void rule__Layout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1615:1: ( rule__Layout__Group__1__Impl rule__Layout__Group__2 )
            // InternalDsl.g:1616:2: rule__Layout__Group__1__Impl rule__Layout__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Layout__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layout__Group__2();

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
    // $ANTLR end "rule__Layout__Group__1"


    // $ANTLR start "rule__Layout__Group__1__Impl"
    // InternalDsl.g:1623:1: rule__Layout__Group__1__Impl : ( ( rule__Layout__AxisAssignment_1 ) ) ;
    public final void rule__Layout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1627:1: ( ( ( rule__Layout__AxisAssignment_1 ) ) )
            // InternalDsl.g:1628:1: ( ( rule__Layout__AxisAssignment_1 ) )
            {
            // InternalDsl.g:1628:1: ( ( rule__Layout__AxisAssignment_1 ) )
            // InternalDsl.g:1629:2: ( rule__Layout__AxisAssignment_1 )
            {
             before(grammarAccess.getLayoutAccess().getAxisAssignment_1()); 
            // InternalDsl.g:1630:2: ( rule__Layout__AxisAssignment_1 )
            // InternalDsl.g:1630:3: rule__Layout__AxisAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Layout__AxisAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLayoutAccess().getAxisAssignment_1()); 

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
    // $ANTLR end "rule__Layout__Group__1__Impl"


    // $ANTLR start "rule__Layout__Group__2"
    // InternalDsl.g:1638:1: rule__Layout__Group__2 : rule__Layout__Group__2__Impl rule__Layout__Group__3 ;
    public final void rule__Layout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1642:1: ( rule__Layout__Group__2__Impl rule__Layout__Group__3 )
            // InternalDsl.g:1643:2: rule__Layout__Group__2__Impl rule__Layout__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Layout__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layout__Group__3();

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
    // $ANTLR end "rule__Layout__Group__2"


    // $ANTLR start "rule__Layout__Group__2__Impl"
    // InternalDsl.g:1650:1: rule__Layout__Group__2__Impl : ( '{' ) ;
    public final void rule__Layout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1654:1: ( ( '{' ) )
            // InternalDsl.g:1655:1: ( '{' )
            {
            // InternalDsl.g:1655:1: ( '{' )
            // InternalDsl.g:1656:2: '{'
            {
             before(grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Layout__Group__2__Impl"


    // $ANTLR start "rule__Layout__Group__3"
    // InternalDsl.g:1665:1: rule__Layout__Group__3 : rule__Layout__Group__3__Impl rule__Layout__Group__4 ;
    public final void rule__Layout__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1669:1: ( rule__Layout__Group__3__Impl rule__Layout__Group__4 )
            // InternalDsl.g:1670:2: rule__Layout__Group__3__Impl rule__Layout__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Layout__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Layout__Group__4();

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
    // $ANTLR end "rule__Layout__Group__3"


    // $ANTLR start "rule__Layout__Group__3__Impl"
    // InternalDsl.g:1677:1: rule__Layout__Group__3__Impl : ( ( rule__Layout__ComponentsAssignment_3 )* ) ;
    public final void rule__Layout__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1681:1: ( ( ( rule__Layout__ComponentsAssignment_3 )* ) )
            // InternalDsl.g:1682:1: ( ( rule__Layout__ComponentsAssignment_3 )* )
            {
            // InternalDsl.g:1682:1: ( ( rule__Layout__ComponentsAssignment_3 )* )
            // InternalDsl.g:1683:2: ( rule__Layout__ComponentsAssignment_3 )*
            {
             before(grammarAccess.getLayoutAccess().getComponentsAssignment_3()); 
            // InternalDsl.g:1684:2: ( rule__Layout__ComponentsAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||(LA18_0>=11 && LA18_0<=12)||(LA18_0>=37 && LA18_0<=39)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDsl.g:1684:3: rule__Layout__ComponentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Layout__ComponentsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getLayoutAccess().getComponentsAssignment_3()); 

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
    // $ANTLR end "rule__Layout__Group__3__Impl"


    // $ANTLR start "rule__Layout__Group__4"
    // InternalDsl.g:1692:1: rule__Layout__Group__4 : rule__Layout__Group__4__Impl ;
    public final void rule__Layout__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1696:1: ( rule__Layout__Group__4__Impl )
            // InternalDsl.g:1697:2: rule__Layout__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Layout__Group__4__Impl();

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
    // $ANTLR end "rule__Layout__Group__4"


    // $ANTLR start "rule__Layout__Group__4__Impl"
    // InternalDsl.g:1703:1: rule__Layout__Group__4__Impl : ( '}' ) ;
    public final void rule__Layout__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1707:1: ( ( '}' ) )
            // InternalDsl.g:1708:1: ( '}' )
            {
            // InternalDsl.g:1708:1: ( '}' )
            // InternalDsl.g:1709:2: '}'
            {
             before(grammarAccess.getLayoutAccess().getRightCurlyBracketKeyword_4()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getLayoutAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Layout__Group__4__Impl"


    // $ANTLR start "rule__Label__Group__0"
    // InternalDsl.g:1719:1: rule__Label__Group__0 : rule__Label__Group__0__Impl rule__Label__Group__1 ;
    public final void rule__Label__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1723:1: ( rule__Label__Group__0__Impl rule__Label__Group__1 )
            // InternalDsl.g:1724:2: rule__Label__Group__0__Impl rule__Label__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Label__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Label__Group__1();

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
    // $ANTLR end "rule__Label__Group__0"


    // $ANTLR start "rule__Label__Group__0__Impl"
    // InternalDsl.g:1731:1: rule__Label__Group__0__Impl : ( 'label' ) ;
    public final void rule__Label__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1735:1: ( ( 'label' ) )
            // InternalDsl.g:1736:1: ( 'label' )
            {
            // InternalDsl.g:1736:1: ( 'label' )
            // InternalDsl.g:1737:2: 'label'
            {
             before(grammarAccess.getLabelAccess().getLabelKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getLabelKeyword_0()); 

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
    // $ANTLR end "rule__Label__Group__0__Impl"


    // $ANTLR start "rule__Label__Group__1"
    // InternalDsl.g:1746:1: rule__Label__Group__1 : rule__Label__Group__1__Impl rule__Label__Group__2 ;
    public final void rule__Label__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1750:1: ( rule__Label__Group__1__Impl rule__Label__Group__2 )
            // InternalDsl.g:1751:2: rule__Label__Group__1__Impl rule__Label__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Label__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Label__Group__2();

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
    // $ANTLR end "rule__Label__Group__1"


    // $ANTLR start "rule__Label__Group__1__Impl"
    // InternalDsl.g:1758:1: rule__Label__Group__1__Impl : ( ':' ) ;
    public final void rule__Label__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1762:1: ( ( ':' ) )
            // InternalDsl.g:1763:1: ( ':' )
            {
            // InternalDsl.g:1763:1: ( ':' )
            // InternalDsl.g:1764:2: ':'
            {
             before(grammarAccess.getLabelAccess().getColonKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLabelAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Label__Group__1__Impl"


    // $ANTLR start "rule__Label__Group__2"
    // InternalDsl.g:1773:1: rule__Label__Group__2 : rule__Label__Group__2__Impl ;
    public final void rule__Label__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1777:1: ( rule__Label__Group__2__Impl )
            // InternalDsl.g:1778:2: rule__Label__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Label__Group__2__Impl();

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
    // $ANTLR end "rule__Label__Group__2"


    // $ANTLR start "rule__Label__Group__2__Impl"
    // InternalDsl.g:1784:1: rule__Label__Group__2__Impl : ( ( rule__Label__ExpAssignment_2 ) ) ;
    public final void rule__Label__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1788:1: ( ( ( rule__Label__ExpAssignment_2 ) ) )
            // InternalDsl.g:1789:1: ( ( rule__Label__ExpAssignment_2 ) )
            {
            // InternalDsl.g:1789:1: ( ( rule__Label__ExpAssignment_2 ) )
            // InternalDsl.g:1790:2: ( rule__Label__ExpAssignment_2 )
            {
             before(grammarAccess.getLabelAccess().getExpAssignment_2()); 
            // InternalDsl.g:1791:2: ( rule__Label__ExpAssignment_2 )
            // InternalDsl.g:1791:3: rule__Label__ExpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Label__ExpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getExpAssignment_2()); 

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
    // $ANTLR end "rule__Label__Group__2__Impl"


    // $ANTLR start "rule__InputText__Group__0"
    // InternalDsl.g:1800:1: rule__InputText__Group__0 : rule__InputText__Group__0__Impl rule__InputText__Group__1 ;
    public final void rule__InputText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1804:1: ( rule__InputText__Group__0__Impl rule__InputText__Group__1 )
            // InternalDsl.g:1805:2: rule__InputText__Group__0__Impl rule__InputText__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__InputText__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputText__Group__1();

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
    // $ANTLR end "rule__InputText__Group__0"


    // $ANTLR start "rule__InputText__Group__0__Impl"
    // InternalDsl.g:1812:1: rule__InputText__Group__0__Impl : ( 'input' ) ;
    public final void rule__InputText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1816:1: ( ( 'input' ) )
            // InternalDsl.g:1817:1: ( 'input' )
            {
            // InternalDsl.g:1817:1: ( 'input' )
            // InternalDsl.g:1818:2: 'input'
            {
             before(grammarAccess.getInputTextAccess().getInputKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getInputTextAccess().getInputKeyword_0()); 

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
    // $ANTLR end "rule__InputText__Group__0__Impl"


    // $ANTLR start "rule__InputText__Group__1"
    // InternalDsl.g:1827:1: rule__InputText__Group__1 : rule__InputText__Group__1__Impl rule__InputText__Group__2 ;
    public final void rule__InputText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1831:1: ( rule__InputText__Group__1__Impl rule__InputText__Group__2 )
            // InternalDsl.g:1832:2: rule__InputText__Group__1__Impl rule__InputText__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__InputText__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputText__Group__2();

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
    // $ANTLR end "rule__InputText__Group__1"


    // $ANTLR start "rule__InputText__Group__1__Impl"
    // InternalDsl.g:1839:1: rule__InputText__Group__1__Impl : ( ( rule__InputText__NameAssignment_1 ) ) ;
    public final void rule__InputText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1843:1: ( ( ( rule__InputText__NameAssignment_1 ) ) )
            // InternalDsl.g:1844:1: ( ( rule__InputText__NameAssignment_1 ) )
            {
            // InternalDsl.g:1844:1: ( ( rule__InputText__NameAssignment_1 ) )
            // InternalDsl.g:1845:2: ( rule__InputText__NameAssignment_1 )
            {
             before(grammarAccess.getInputTextAccess().getNameAssignment_1()); 
            // InternalDsl.g:1846:2: ( rule__InputText__NameAssignment_1 )
            // InternalDsl.g:1846:3: rule__InputText__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InputText__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInputTextAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__InputText__Group__1__Impl"


    // $ANTLR start "rule__InputText__Group__2"
    // InternalDsl.g:1854:1: rule__InputText__Group__2 : rule__InputText__Group__2__Impl rule__InputText__Group__3 ;
    public final void rule__InputText__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1858:1: ( rule__InputText__Group__2__Impl rule__InputText__Group__3 )
            // InternalDsl.g:1859:2: rule__InputText__Group__2__Impl rule__InputText__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__InputText__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputText__Group__3();

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
    // $ANTLR end "rule__InputText__Group__2"


    // $ANTLR start "rule__InputText__Group__2__Impl"
    // InternalDsl.g:1866:1: rule__InputText__Group__2__Impl : ( ':' ) ;
    public final void rule__InputText__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1870:1: ( ( ':' ) )
            // InternalDsl.g:1871:1: ( ':' )
            {
            // InternalDsl.g:1871:1: ( ':' )
            // InternalDsl.g:1872:2: ':'
            {
             before(grammarAccess.getInputTextAccess().getColonKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getInputTextAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__InputText__Group__2__Impl"


    // $ANTLR start "rule__InputText__Group__3"
    // InternalDsl.g:1881:1: rule__InputText__Group__3 : rule__InputText__Group__3__Impl ;
    public final void rule__InputText__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1885:1: ( rule__InputText__Group__3__Impl )
            // InternalDsl.g:1886:2: rule__InputText__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputText__Group__3__Impl();

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
    // $ANTLR end "rule__InputText__Group__3"


    // $ANTLR start "rule__InputText__Group__3__Impl"
    // InternalDsl.g:1892:1: rule__InputText__Group__3__Impl : ( ( rule__InputText__ExpAssignment_3 ) ) ;
    public final void rule__InputText__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1896:1: ( ( ( rule__InputText__ExpAssignment_3 ) ) )
            // InternalDsl.g:1897:1: ( ( rule__InputText__ExpAssignment_3 ) )
            {
            // InternalDsl.g:1897:1: ( ( rule__InputText__ExpAssignment_3 ) )
            // InternalDsl.g:1898:2: ( rule__InputText__ExpAssignment_3 )
            {
             before(grammarAccess.getInputTextAccess().getExpAssignment_3()); 
            // InternalDsl.g:1899:2: ( rule__InputText__ExpAssignment_3 )
            // InternalDsl.g:1899:3: rule__InputText__ExpAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__InputText__ExpAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInputTextAccess().getExpAssignment_3()); 

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
    // $ANTLR end "rule__InputText__Group__3__Impl"


    // $ANTLR start "rule__Button__Group__0"
    // InternalDsl.g:1908:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1912:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // InternalDsl.g:1913:2: rule__Button__Group__0__Impl rule__Button__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Button__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__1();

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
    // $ANTLR end "rule__Button__Group__0"


    // $ANTLR start "rule__Button__Group__0__Impl"
    // InternalDsl.g:1920:1: rule__Button__Group__0__Impl : ( 'button' ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1924:1: ( ( 'button' ) )
            // InternalDsl.g:1925:1: ( 'button' )
            {
            // InternalDsl.g:1925:1: ( 'button' )
            // InternalDsl.g:1926:2: 'button'
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getButtonKeyword_0()); 

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
    // $ANTLR end "rule__Button__Group__0__Impl"


    // $ANTLR start "rule__Button__Group__1"
    // InternalDsl.g:1935:1: rule__Button__Group__1 : rule__Button__Group__1__Impl rule__Button__Group__2 ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1939:1: ( rule__Button__Group__1__Impl rule__Button__Group__2 )
            // InternalDsl.g:1940:2: rule__Button__Group__1__Impl rule__Button__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Button__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__2();

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
    // $ANTLR end "rule__Button__Group__1"


    // $ANTLR start "rule__Button__Group__1__Impl"
    // InternalDsl.g:1947:1: rule__Button__Group__1__Impl : ( ( rule__Button__ValidateAssignment_1 )? ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1951:1: ( ( ( rule__Button__ValidateAssignment_1 )? ) )
            // InternalDsl.g:1952:1: ( ( rule__Button__ValidateAssignment_1 )? )
            {
            // InternalDsl.g:1952:1: ( ( rule__Button__ValidateAssignment_1 )? )
            // InternalDsl.g:1953:2: ( rule__Button__ValidateAssignment_1 )?
            {
             before(grammarAccess.getButtonAccess().getValidateAssignment_1()); 
            // InternalDsl.g:1954:2: ( rule__Button__ValidateAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDsl.g:1954:3: rule__Button__ValidateAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Button__ValidateAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getButtonAccess().getValidateAssignment_1()); 

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
    // $ANTLR end "rule__Button__Group__1__Impl"


    // $ANTLR start "rule__Button__Group__2"
    // InternalDsl.g:1962:1: rule__Button__Group__2 : rule__Button__Group__2__Impl rule__Button__Group__3 ;
    public final void rule__Button__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1966:1: ( rule__Button__Group__2__Impl rule__Button__Group__3 )
            // InternalDsl.g:1967:2: rule__Button__Group__2__Impl rule__Button__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Button__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__3();

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
    // $ANTLR end "rule__Button__Group__2"


    // $ANTLR start "rule__Button__Group__2__Impl"
    // InternalDsl.g:1974:1: rule__Button__Group__2__Impl : ( ( rule__Button__NameAssignment_2 ) ) ;
    public final void rule__Button__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1978:1: ( ( ( rule__Button__NameAssignment_2 ) ) )
            // InternalDsl.g:1979:1: ( ( rule__Button__NameAssignment_2 ) )
            {
            // InternalDsl.g:1979:1: ( ( rule__Button__NameAssignment_2 ) )
            // InternalDsl.g:1980:2: ( rule__Button__NameAssignment_2 )
            {
             before(grammarAccess.getButtonAccess().getNameAssignment_2()); 
            // InternalDsl.g:1981:2: ( rule__Button__NameAssignment_2 )
            // InternalDsl.g:1981:3: rule__Button__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Button__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Button__Group__2__Impl"


    // $ANTLR start "rule__Button__Group__3"
    // InternalDsl.g:1989:1: rule__Button__Group__3 : rule__Button__Group__3__Impl rule__Button__Group__4 ;
    public final void rule__Button__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:1993:1: ( rule__Button__Group__3__Impl rule__Button__Group__4 )
            // InternalDsl.g:1994:2: rule__Button__Group__3__Impl rule__Button__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Button__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__4();

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
    // $ANTLR end "rule__Button__Group__3"


    // $ANTLR start "rule__Button__Group__3__Impl"
    // InternalDsl.g:2001:1: rule__Button__Group__3__Impl : ( ':' ) ;
    public final void rule__Button__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2005:1: ( ( ':' ) )
            // InternalDsl.g:2006:1: ( ':' )
            {
            // InternalDsl.g:2006:1: ( ':' )
            // InternalDsl.g:2007:2: ':'
            {
             before(grammarAccess.getButtonAccess().getColonKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__Button__Group__3__Impl"


    // $ANTLR start "rule__Button__Group__4"
    // InternalDsl.g:2016:1: rule__Button__Group__4 : rule__Button__Group__4__Impl ;
    public final void rule__Button__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2020:1: ( rule__Button__Group__4__Impl )
            // InternalDsl.g:2021:2: rule__Button__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Button__Group__4__Impl();

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
    // $ANTLR end "rule__Button__Group__4"


    // $ANTLR start "rule__Button__Group__4__Impl"
    // InternalDsl.g:2027:1: rule__Button__Group__4__Impl : ( ( rule__Button__ExpAssignment_4 ) ) ;
    public final void rule__Button__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2031:1: ( ( ( rule__Button__ExpAssignment_4 ) ) )
            // InternalDsl.g:2032:1: ( ( rule__Button__ExpAssignment_4 ) )
            {
            // InternalDsl.g:2032:1: ( ( rule__Button__ExpAssignment_4 ) )
            // InternalDsl.g:2033:2: ( rule__Button__ExpAssignment_4 )
            {
             before(grammarAccess.getButtonAccess().getExpAssignment_4()); 
            // InternalDsl.g:2034:2: ( rule__Button__ExpAssignment_4 )
            // InternalDsl.g:2034:3: rule__Button__ExpAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Button__ExpAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getExpAssignment_4()); 

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
    // $ANTLR end "rule__Button__Group__4__Impl"


    // $ANTLR start "rule__FormUse__Group__0"
    // InternalDsl.g:2043:1: rule__FormUse__Group__0 : rule__FormUse__Group__0__Impl rule__FormUse__Group__1 ;
    public final void rule__FormUse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2047:1: ( rule__FormUse__Group__0__Impl rule__FormUse__Group__1 )
            // InternalDsl.g:2048:2: rule__FormUse__Group__0__Impl rule__FormUse__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__FormUse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormUse__Group__1();

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
    // $ANTLR end "rule__FormUse__Group__0"


    // $ANTLR start "rule__FormUse__Group__0__Impl"
    // InternalDsl.g:2055:1: rule__FormUse__Group__0__Impl : ( ( rule__FormUse__FormAssignment_0 ) ) ;
    public final void rule__FormUse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2059:1: ( ( ( rule__FormUse__FormAssignment_0 ) ) )
            // InternalDsl.g:2060:1: ( ( rule__FormUse__FormAssignment_0 ) )
            {
            // InternalDsl.g:2060:1: ( ( rule__FormUse__FormAssignment_0 ) )
            // InternalDsl.g:2061:2: ( rule__FormUse__FormAssignment_0 )
            {
             before(grammarAccess.getFormUseAccess().getFormAssignment_0()); 
            // InternalDsl.g:2062:2: ( rule__FormUse__FormAssignment_0 )
            // InternalDsl.g:2062:3: rule__FormUse__FormAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FormUse__FormAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFormUseAccess().getFormAssignment_0()); 

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
    // $ANTLR end "rule__FormUse__Group__0__Impl"


    // $ANTLR start "rule__FormUse__Group__1"
    // InternalDsl.g:2070:1: rule__FormUse__Group__1 : rule__FormUse__Group__1__Impl rule__FormUse__Group__2 ;
    public final void rule__FormUse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2074:1: ( rule__FormUse__Group__1__Impl rule__FormUse__Group__2 )
            // InternalDsl.g:2075:2: rule__FormUse__Group__1__Impl rule__FormUse__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__FormUse__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormUse__Group__2();

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
    // $ANTLR end "rule__FormUse__Group__1"


    // $ANTLR start "rule__FormUse__Group__1__Impl"
    // InternalDsl.g:2082:1: rule__FormUse__Group__1__Impl : ( '(' ) ;
    public final void rule__FormUse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2086:1: ( ( '(' ) )
            // InternalDsl.g:2087:1: ( '(' )
            {
            // InternalDsl.g:2087:1: ( '(' )
            // InternalDsl.g:2088:2: '('
            {
             before(grammarAccess.getFormUseAccess().getLeftParenthesisKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFormUseAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__FormUse__Group__1__Impl"


    // $ANTLR start "rule__FormUse__Group__2"
    // InternalDsl.g:2097:1: rule__FormUse__Group__2 : rule__FormUse__Group__2__Impl rule__FormUse__Group__3 ;
    public final void rule__FormUse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2101:1: ( rule__FormUse__Group__2__Impl rule__FormUse__Group__3 )
            // InternalDsl.g:2102:2: rule__FormUse__Group__2__Impl rule__FormUse__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__FormUse__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormUse__Group__3();

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
    // $ANTLR end "rule__FormUse__Group__2"


    // $ANTLR start "rule__FormUse__Group__2__Impl"
    // InternalDsl.g:2109:1: rule__FormUse__Group__2__Impl : ( ( rule__FormUse__Group_2__0 )? ) ;
    public final void rule__FormUse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2113:1: ( ( ( rule__FormUse__Group_2__0 )? ) )
            // InternalDsl.g:2114:1: ( ( rule__FormUse__Group_2__0 )? )
            {
            // InternalDsl.g:2114:1: ( ( rule__FormUse__Group_2__0 )? )
            // InternalDsl.g:2115:2: ( rule__FormUse__Group_2__0 )?
            {
             before(grammarAccess.getFormUseAccess().getGroup_2()); 
            // InternalDsl.g:2116:2: ( rule__FormUse__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_STRING)||(LA20_0>=13 && LA20_0<=15)||LA20_0==30||(LA20_0>=41 && LA20_0<=42)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDsl.g:2116:3: rule__FormUse__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FormUse__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormUseAccess().getGroup_2()); 

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
    // $ANTLR end "rule__FormUse__Group__2__Impl"


    // $ANTLR start "rule__FormUse__Group__3"
    // InternalDsl.g:2124:1: rule__FormUse__Group__3 : rule__FormUse__Group__3__Impl ;
    public final void rule__FormUse__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2128:1: ( rule__FormUse__Group__3__Impl )
            // InternalDsl.g:2129:2: rule__FormUse__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FormUse__Group__3__Impl();

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
    // $ANTLR end "rule__FormUse__Group__3"


    // $ANTLR start "rule__FormUse__Group__3__Impl"
    // InternalDsl.g:2135:1: rule__FormUse__Group__3__Impl : ( ')' ) ;
    public final void rule__FormUse__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2139:1: ( ( ')' ) )
            // InternalDsl.g:2140:1: ( ')' )
            {
            // InternalDsl.g:2140:1: ( ')' )
            // InternalDsl.g:2141:2: ')'
            {
             before(grammarAccess.getFormUseAccess().getRightParenthesisKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFormUseAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__FormUse__Group__3__Impl"


    // $ANTLR start "rule__FormUse__Group_2__0"
    // InternalDsl.g:2151:1: rule__FormUse__Group_2__0 : rule__FormUse__Group_2__0__Impl rule__FormUse__Group_2__1 ;
    public final void rule__FormUse__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2155:1: ( rule__FormUse__Group_2__0__Impl rule__FormUse__Group_2__1 )
            // InternalDsl.g:2156:2: rule__FormUse__Group_2__0__Impl rule__FormUse__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__FormUse__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormUse__Group_2__1();

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
    // $ANTLR end "rule__FormUse__Group_2__0"


    // $ANTLR start "rule__FormUse__Group_2__0__Impl"
    // InternalDsl.g:2163:1: rule__FormUse__Group_2__0__Impl : ( ( rule__FormUse__ExpsAssignment_2_0 ) ) ;
    public final void rule__FormUse__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2167:1: ( ( ( rule__FormUse__ExpsAssignment_2_0 ) ) )
            // InternalDsl.g:2168:1: ( ( rule__FormUse__ExpsAssignment_2_0 ) )
            {
            // InternalDsl.g:2168:1: ( ( rule__FormUse__ExpsAssignment_2_0 ) )
            // InternalDsl.g:2169:2: ( rule__FormUse__ExpsAssignment_2_0 )
            {
             before(grammarAccess.getFormUseAccess().getExpsAssignment_2_0()); 
            // InternalDsl.g:2170:2: ( rule__FormUse__ExpsAssignment_2_0 )
            // InternalDsl.g:2170:3: rule__FormUse__ExpsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__FormUse__ExpsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getFormUseAccess().getExpsAssignment_2_0()); 

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
    // $ANTLR end "rule__FormUse__Group_2__0__Impl"


    // $ANTLR start "rule__FormUse__Group_2__1"
    // InternalDsl.g:2178:1: rule__FormUse__Group_2__1 : rule__FormUse__Group_2__1__Impl ;
    public final void rule__FormUse__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2182:1: ( rule__FormUse__Group_2__1__Impl )
            // InternalDsl.g:2183:2: rule__FormUse__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FormUse__Group_2__1__Impl();

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
    // $ANTLR end "rule__FormUse__Group_2__1"


    // $ANTLR start "rule__FormUse__Group_2__1__Impl"
    // InternalDsl.g:2189:1: rule__FormUse__Group_2__1__Impl : ( ( rule__FormUse__Group_2_1__0 )* ) ;
    public final void rule__FormUse__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2193:1: ( ( ( rule__FormUse__Group_2_1__0 )* ) )
            // InternalDsl.g:2194:1: ( ( rule__FormUse__Group_2_1__0 )* )
            {
            // InternalDsl.g:2194:1: ( ( rule__FormUse__Group_2_1__0 )* )
            // InternalDsl.g:2195:2: ( rule__FormUse__Group_2_1__0 )*
            {
             before(grammarAccess.getFormUseAccess().getGroup_2_1()); 
            // InternalDsl.g:2196:2: ( rule__FormUse__Group_2_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==33) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDsl.g:2196:3: rule__FormUse__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__FormUse__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getFormUseAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__FormUse__Group_2__1__Impl"


    // $ANTLR start "rule__FormUse__Group_2_1__0"
    // InternalDsl.g:2205:1: rule__FormUse__Group_2_1__0 : rule__FormUse__Group_2_1__0__Impl rule__FormUse__Group_2_1__1 ;
    public final void rule__FormUse__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2209:1: ( rule__FormUse__Group_2_1__0__Impl rule__FormUse__Group_2_1__1 )
            // InternalDsl.g:2210:2: rule__FormUse__Group_2_1__0__Impl rule__FormUse__Group_2_1__1
            {
            pushFollow(FOLLOW_20);
            rule__FormUse__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FormUse__Group_2_1__1();

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
    // $ANTLR end "rule__FormUse__Group_2_1__0"


    // $ANTLR start "rule__FormUse__Group_2_1__0__Impl"
    // InternalDsl.g:2217:1: rule__FormUse__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__FormUse__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2221:1: ( ( ',' ) )
            // InternalDsl.g:2222:1: ( ',' )
            {
            // InternalDsl.g:2222:1: ( ',' )
            // InternalDsl.g:2223:2: ','
            {
             before(grammarAccess.getFormUseAccess().getCommaKeyword_2_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFormUseAccess().getCommaKeyword_2_1_0()); 

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
    // $ANTLR end "rule__FormUse__Group_2_1__0__Impl"


    // $ANTLR start "rule__FormUse__Group_2_1__1"
    // InternalDsl.g:2232:1: rule__FormUse__Group_2_1__1 : rule__FormUse__Group_2_1__1__Impl ;
    public final void rule__FormUse__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2236:1: ( rule__FormUse__Group_2_1__1__Impl )
            // InternalDsl.g:2237:2: rule__FormUse__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FormUse__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__FormUse__Group_2_1__1"


    // $ANTLR start "rule__FormUse__Group_2_1__1__Impl"
    // InternalDsl.g:2243:1: rule__FormUse__Group_2_1__1__Impl : ( ( rule__FormUse__ExpsAssignment_2_1_1 ) ) ;
    public final void rule__FormUse__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2247:1: ( ( ( rule__FormUse__ExpsAssignment_2_1_1 ) ) )
            // InternalDsl.g:2248:1: ( ( rule__FormUse__ExpsAssignment_2_1_1 ) )
            {
            // InternalDsl.g:2248:1: ( ( rule__FormUse__ExpsAssignment_2_1_1 ) )
            // InternalDsl.g:2249:2: ( rule__FormUse__ExpsAssignment_2_1_1 )
            {
             before(grammarAccess.getFormUseAccess().getExpsAssignment_2_1_1()); 
            // InternalDsl.g:2250:2: ( rule__FormUse__ExpsAssignment_2_1_1 )
            // InternalDsl.g:2250:3: rule__FormUse__ExpsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FormUse__ExpsAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFormUseAccess().getExpsAssignment_2_1_1()); 

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
    // $ANTLR end "rule__FormUse__Group_2_1__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalDsl.g:2259:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2263:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalDsl.g:2264:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

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
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalDsl.g:2271:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2275:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // InternalDsl.g:2276:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // InternalDsl.g:2276:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // InternalDsl.g:2277:2: ( rule__Parameter__NameAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            // InternalDsl.g:2278:2: ( rule__Parameter__NameAssignment_0 )
            // InternalDsl.g:2278:3: rule__Parameter__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalDsl.g:2286:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2290:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalDsl.g:2291:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

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
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalDsl.g:2298:1: rule__Parameter__Group__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2302:1: ( ( ':' ) )
            // InternalDsl.g:2303:1: ( ':' )
            {
            // InternalDsl.g:2303:1: ( ':' )
            // InternalDsl.g:2304:2: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalDsl.g:2313:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2317:1: ( rule__Parameter__Group__2__Impl )
            // InternalDsl.g:2318:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2__Impl();

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
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalDsl.g:2324:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__TypeAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2328:1: ( ( ( rule__Parameter__TypeAssignment_2 ) ) )
            // InternalDsl.g:2329:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            {
            // InternalDsl.g:2329:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            // InternalDsl.g:2330:2: ( rule__Parameter__TypeAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_2()); 
            // InternalDsl.g:2331:2: ( rule__Parameter__TypeAssignment_2 )
            // InternalDsl.g:2331:3: rule__Parameter__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Boolean__Group__0"
    // InternalDsl.g:2340:1: rule__Boolean__Group__0 : rule__Boolean__Group__0__Impl rule__Boolean__Group__1 ;
    public final void rule__Boolean__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2344:1: ( rule__Boolean__Group__0__Impl rule__Boolean__Group__1 )
            // InternalDsl.g:2345:2: rule__Boolean__Group__0__Impl rule__Boolean__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Boolean__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Boolean__Group__1();

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
    // $ANTLR end "rule__Boolean__Group__0"


    // $ANTLR start "rule__Boolean__Group__0__Impl"
    // InternalDsl.g:2352:1: rule__Boolean__Group__0__Impl : ( ruleEqual ) ;
    public final void rule__Boolean__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2356:1: ( ( ruleEqual ) )
            // InternalDsl.g:2357:1: ( ruleEqual )
            {
            // InternalDsl.g:2357:1: ( ruleEqual )
            // InternalDsl.g:2358:2: ruleEqual
            {
             before(grammarAccess.getBooleanAccess().getEqualParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEqual();

            state._fsp--;

             after(grammarAccess.getBooleanAccess().getEqualParserRuleCall_0()); 

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
    // $ANTLR end "rule__Boolean__Group__0__Impl"


    // $ANTLR start "rule__Boolean__Group__1"
    // InternalDsl.g:2367:1: rule__Boolean__Group__1 : rule__Boolean__Group__1__Impl ;
    public final void rule__Boolean__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2371:1: ( rule__Boolean__Group__1__Impl )
            // InternalDsl.g:2372:2: rule__Boolean__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Group__1__Impl();

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
    // $ANTLR end "rule__Boolean__Group__1"


    // $ANTLR start "rule__Boolean__Group__1__Impl"
    // InternalDsl.g:2378:1: rule__Boolean__Group__1__Impl : ( ( rule__Boolean__Group_1__0 )* ) ;
    public final void rule__Boolean__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2382:1: ( ( ( rule__Boolean__Group_1__0 )* ) )
            // InternalDsl.g:2383:1: ( ( rule__Boolean__Group_1__0 )* )
            {
            // InternalDsl.g:2383:1: ( ( rule__Boolean__Group_1__0 )* )
            // InternalDsl.g:2384:2: ( rule__Boolean__Group_1__0 )*
            {
             before(grammarAccess.getBooleanAccess().getGroup_1()); 
            // InternalDsl.g:2385:2: ( rule__Boolean__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=16 && LA22_0<=17)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDsl.g:2385:3: rule__Boolean__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Boolean__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getBooleanAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Boolean__Group__1__Impl"


    // $ANTLR start "rule__Boolean__Group_1__0"
    // InternalDsl.g:2394:1: rule__Boolean__Group_1__0 : rule__Boolean__Group_1__0__Impl rule__Boolean__Group_1__1 ;
    public final void rule__Boolean__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2398:1: ( rule__Boolean__Group_1__0__Impl rule__Boolean__Group_1__1 )
            // InternalDsl.g:2399:2: rule__Boolean__Group_1__0__Impl rule__Boolean__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__Boolean__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Boolean__Group_1__1();

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
    // $ANTLR end "rule__Boolean__Group_1__0"


    // $ANTLR start "rule__Boolean__Group_1__0__Impl"
    // InternalDsl.g:2406:1: rule__Boolean__Group_1__0__Impl : ( () ) ;
    public final void rule__Boolean__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2410:1: ( ( () ) )
            // InternalDsl.g:2411:1: ( () )
            {
            // InternalDsl.g:2411:1: ( () )
            // InternalDsl.g:2412:2: ()
            {
             before(grammarAccess.getBooleanAccess().getBooleanLeftAction_1_0()); 
            // InternalDsl.g:2413:2: ()
            // InternalDsl.g:2413:3: 
            {
            }

             after(grammarAccess.getBooleanAccess().getBooleanLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Group_1__0__Impl"


    // $ANTLR start "rule__Boolean__Group_1__1"
    // InternalDsl.g:2421:1: rule__Boolean__Group_1__1 : rule__Boolean__Group_1__1__Impl rule__Boolean__Group_1__2 ;
    public final void rule__Boolean__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2425:1: ( rule__Boolean__Group_1__1__Impl rule__Boolean__Group_1__2 )
            // InternalDsl.g:2426:2: rule__Boolean__Group_1__1__Impl rule__Boolean__Group_1__2
            {
            pushFollow(FOLLOW_20);
            rule__Boolean__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Boolean__Group_1__2();

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
    // $ANTLR end "rule__Boolean__Group_1__1"


    // $ANTLR start "rule__Boolean__Group_1__1__Impl"
    // InternalDsl.g:2433:1: rule__Boolean__Group_1__1__Impl : ( ( rule__Boolean__OpAssignment_1_1 ) ) ;
    public final void rule__Boolean__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2437:1: ( ( ( rule__Boolean__OpAssignment_1_1 ) ) )
            // InternalDsl.g:2438:1: ( ( rule__Boolean__OpAssignment_1_1 ) )
            {
            // InternalDsl.g:2438:1: ( ( rule__Boolean__OpAssignment_1_1 ) )
            // InternalDsl.g:2439:2: ( rule__Boolean__OpAssignment_1_1 )
            {
             before(grammarAccess.getBooleanAccess().getOpAssignment_1_1()); 
            // InternalDsl.g:2440:2: ( rule__Boolean__OpAssignment_1_1 )
            // InternalDsl.g:2440:3: rule__Boolean__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getOpAssignment_1_1()); 

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
    // $ANTLR end "rule__Boolean__Group_1__1__Impl"


    // $ANTLR start "rule__Boolean__Group_1__2"
    // InternalDsl.g:2448:1: rule__Boolean__Group_1__2 : rule__Boolean__Group_1__2__Impl ;
    public final void rule__Boolean__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2452:1: ( rule__Boolean__Group_1__2__Impl )
            // InternalDsl.g:2453:2: rule__Boolean__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Group_1__2__Impl();

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
    // $ANTLR end "rule__Boolean__Group_1__2"


    // $ANTLR start "rule__Boolean__Group_1__2__Impl"
    // InternalDsl.g:2459:1: rule__Boolean__Group_1__2__Impl : ( ( rule__Boolean__RightAssignment_1_2 ) ) ;
    public final void rule__Boolean__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2463:1: ( ( ( rule__Boolean__RightAssignment_1_2 ) ) )
            // InternalDsl.g:2464:1: ( ( rule__Boolean__RightAssignment_1_2 ) )
            {
            // InternalDsl.g:2464:1: ( ( rule__Boolean__RightAssignment_1_2 ) )
            // InternalDsl.g:2465:2: ( rule__Boolean__RightAssignment_1_2 )
            {
             before(grammarAccess.getBooleanAccess().getRightAssignment_1_2()); 
            // InternalDsl.g:2466:2: ( rule__Boolean__RightAssignment_1_2 )
            // InternalDsl.g:2466:3: rule__Boolean__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Boolean__Group_1__2__Impl"


    // $ANTLR start "rule__Equal__Group__0"
    // InternalDsl.g:2475:1: rule__Equal__Group__0 : rule__Equal__Group__0__Impl rule__Equal__Group__1 ;
    public final void rule__Equal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2479:1: ( rule__Equal__Group__0__Impl rule__Equal__Group__1 )
            // InternalDsl.g:2480:2: rule__Equal__Group__0__Impl rule__Equal__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Equal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equal__Group__1();

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
    // $ANTLR end "rule__Equal__Group__0"


    // $ANTLR start "rule__Equal__Group__0__Impl"
    // InternalDsl.g:2487:1: rule__Equal__Group__0__Impl : ( ruleCompare ) ;
    public final void rule__Equal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2491:1: ( ( ruleCompare ) )
            // InternalDsl.g:2492:1: ( ruleCompare )
            {
            // InternalDsl.g:2492:1: ( ruleCompare )
            // InternalDsl.g:2493:2: ruleCompare
            {
             before(grammarAccess.getEqualAccess().getCompareParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleCompare();

            state._fsp--;

             after(grammarAccess.getEqualAccess().getCompareParserRuleCall_0()); 

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
    // $ANTLR end "rule__Equal__Group__0__Impl"


    // $ANTLR start "rule__Equal__Group__1"
    // InternalDsl.g:2502:1: rule__Equal__Group__1 : rule__Equal__Group__1__Impl ;
    public final void rule__Equal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2506:1: ( rule__Equal__Group__1__Impl )
            // InternalDsl.g:2507:2: rule__Equal__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equal__Group__1__Impl();

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
    // $ANTLR end "rule__Equal__Group__1"


    // $ANTLR start "rule__Equal__Group__1__Impl"
    // InternalDsl.g:2513:1: rule__Equal__Group__1__Impl : ( ( rule__Equal__Group_1__0 )* ) ;
    public final void rule__Equal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2517:1: ( ( ( rule__Equal__Group_1__0 )* ) )
            // InternalDsl.g:2518:1: ( ( rule__Equal__Group_1__0 )* )
            {
            // InternalDsl.g:2518:1: ( ( rule__Equal__Group_1__0 )* )
            // InternalDsl.g:2519:2: ( rule__Equal__Group_1__0 )*
            {
             before(grammarAccess.getEqualAccess().getGroup_1()); 
            // InternalDsl.g:2520:2: ( rule__Equal__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=18 && LA23_0<=19)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalDsl.g:2520:3: rule__Equal__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__Equal__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getEqualAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Equal__Group__1__Impl"


    // $ANTLR start "rule__Equal__Group_1__0"
    // InternalDsl.g:2529:1: rule__Equal__Group_1__0 : rule__Equal__Group_1__0__Impl rule__Equal__Group_1__1 ;
    public final void rule__Equal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2533:1: ( rule__Equal__Group_1__0__Impl rule__Equal__Group_1__1 )
            // InternalDsl.g:2534:2: rule__Equal__Group_1__0__Impl rule__Equal__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__Equal__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equal__Group_1__1();

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
    // $ANTLR end "rule__Equal__Group_1__0"


    // $ANTLR start "rule__Equal__Group_1__0__Impl"
    // InternalDsl.g:2541:1: rule__Equal__Group_1__0__Impl : ( () ) ;
    public final void rule__Equal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2545:1: ( ( () ) )
            // InternalDsl.g:2546:1: ( () )
            {
            // InternalDsl.g:2546:1: ( () )
            // InternalDsl.g:2547:2: ()
            {
             before(grammarAccess.getEqualAccess().getEqualLeftAction_1_0()); 
            // InternalDsl.g:2548:2: ()
            // InternalDsl.g:2548:3: 
            {
            }

             after(grammarAccess.getEqualAccess().getEqualLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equal__Group_1__0__Impl"


    // $ANTLR start "rule__Equal__Group_1__1"
    // InternalDsl.g:2556:1: rule__Equal__Group_1__1 : rule__Equal__Group_1__1__Impl rule__Equal__Group_1__2 ;
    public final void rule__Equal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2560:1: ( rule__Equal__Group_1__1__Impl rule__Equal__Group_1__2 )
            // InternalDsl.g:2561:2: rule__Equal__Group_1__1__Impl rule__Equal__Group_1__2
            {
            pushFollow(FOLLOW_20);
            rule__Equal__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equal__Group_1__2();

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
    // $ANTLR end "rule__Equal__Group_1__1"


    // $ANTLR start "rule__Equal__Group_1__1__Impl"
    // InternalDsl.g:2568:1: rule__Equal__Group_1__1__Impl : ( ( rule__Equal__OpAssignment_1_1 ) ) ;
    public final void rule__Equal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2572:1: ( ( ( rule__Equal__OpAssignment_1_1 ) ) )
            // InternalDsl.g:2573:1: ( ( rule__Equal__OpAssignment_1_1 ) )
            {
            // InternalDsl.g:2573:1: ( ( rule__Equal__OpAssignment_1_1 ) )
            // InternalDsl.g:2574:2: ( rule__Equal__OpAssignment_1_1 )
            {
             before(grammarAccess.getEqualAccess().getOpAssignment_1_1()); 
            // InternalDsl.g:2575:2: ( rule__Equal__OpAssignment_1_1 )
            // InternalDsl.g:2575:3: rule__Equal__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Equal__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEqualAccess().getOpAssignment_1_1()); 

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
    // $ANTLR end "rule__Equal__Group_1__1__Impl"


    // $ANTLR start "rule__Equal__Group_1__2"
    // InternalDsl.g:2583:1: rule__Equal__Group_1__2 : rule__Equal__Group_1__2__Impl ;
    public final void rule__Equal__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2587:1: ( rule__Equal__Group_1__2__Impl )
            // InternalDsl.g:2588:2: rule__Equal__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equal__Group_1__2__Impl();

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
    // $ANTLR end "rule__Equal__Group_1__2"


    // $ANTLR start "rule__Equal__Group_1__2__Impl"
    // InternalDsl.g:2594:1: rule__Equal__Group_1__2__Impl : ( ( rule__Equal__RightAssignment_1_2 ) ) ;
    public final void rule__Equal__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2598:1: ( ( ( rule__Equal__RightAssignment_1_2 ) ) )
            // InternalDsl.g:2599:1: ( ( rule__Equal__RightAssignment_1_2 ) )
            {
            // InternalDsl.g:2599:1: ( ( rule__Equal__RightAssignment_1_2 ) )
            // InternalDsl.g:2600:2: ( rule__Equal__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualAccess().getRightAssignment_1_2()); 
            // InternalDsl.g:2601:2: ( rule__Equal__RightAssignment_1_2 )
            // InternalDsl.g:2601:3: rule__Equal__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Equal__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEqualAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Equal__Group_1__2__Impl"


    // $ANTLR start "rule__Compare__Group__0"
    // InternalDsl.g:2610:1: rule__Compare__Group__0 : rule__Compare__Group__0__Impl rule__Compare__Group__1 ;
    public final void rule__Compare__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2614:1: ( rule__Compare__Group__0__Impl rule__Compare__Group__1 )
            // InternalDsl.g:2615:2: rule__Compare__Group__0__Impl rule__Compare__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Compare__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compare__Group__1();

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
    // $ANTLR end "rule__Compare__Group__0"


    // $ANTLR start "rule__Compare__Group__0__Impl"
    // InternalDsl.g:2622:1: rule__Compare__Group__0__Impl : ( ruleConcat ) ;
    public final void rule__Compare__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2626:1: ( ( ruleConcat ) )
            // InternalDsl.g:2627:1: ( ruleConcat )
            {
            // InternalDsl.g:2627:1: ( ruleConcat )
            // InternalDsl.g:2628:2: ruleConcat
            {
             before(grammarAccess.getCompareAccess().getConcatParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleConcat();

            state._fsp--;

             after(grammarAccess.getCompareAccess().getConcatParserRuleCall_0()); 

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
    // $ANTLR end "rule__Compare__Group__0__Impl"


    // $ANTLR start "rule__Compare__Group__1"
    // InternalDsl.g:2637:1: rule__Compare__Group__1 : rule__Compare__Group__1__Impl ;
    public final void rule__Compare__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2641:1: ( rule__Compare__Group__1__Impl )
            // InternalDsl.g:2642:2: rule__Compare__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compare__Group__1__Impl();

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
    // $ANTLR end "rule__Compare__Group__1"


    // $ANTLR start "rule__Compare__Group__1__Impl"
    // InternalDsl.g:2648:1: rule__Compare__Group__1__Impl : ( ( rule__Compare__Group_1__0 )* ) ;
    public final void rule__Compare__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2652:1: ( ( ( rule__Compare__Group_1__0 )* ) )
            // InternalDsl.g:2653:1: ( ( rule__Compare__Group_1__0 )* )
            {
            // InternalDsl.g:2653:1: ( ( rule__Compare__Group_1__0 )* )
            // InternalDsl.g:2654:2: ( rule__Compare__Group_1__0 )*
            {
             before(grammarAccess.getCompareAccess().getGroup_1()); 
            // InternalDsl.g:2655:2: ( rule__Compare__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=20 && LA24_0<=23)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalDsl.g:2655:3: rule__Compare__Group_1__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Compare__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getCompareAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Compare__Group__1__Impl"


    // $ANTLR start "rule__Compare__Group_1__0"
    // InternalDsl.g:2664:1: rule__Compare__Group_1__0 : rule__Compare__Group_1__0__Impl rule__Compare__Group_1__1 ;
    public final void rule__Compare__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2668:1: ( rule__Compare__Group_1__0__Impl rule__Compare__Group_1__1 )
            // InternalDsl.g:2669:2: rule__Compare__Group_1__0__Impl rule__Compare__Group_1__1
            {
            pushFollow(FOLLOW_27);
            rule__Compare__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compare__Group_1__1();

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
    // $ANTLR end "rule__Compare__Group_1__0"


    // $ANTLR start "rule__Compare__Group_1__0__Impl"
    // InternalDsl.g:2676:1: rule__Compare__Group_1__0__Impl : ( () ) ;
    public final void rule__Compare__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2680:1: ( ( () ) )
            // InternalDsl.g:2681:1: ( () )
            {
            // InternalDsl.g:2681:1: ( () )
            // InternalDsl.g:2682:2: ()
            {
             before(grammarAccess.getCompareAccess().getCompareLeftAction_1_0()); 
            // InternalDsl.g:2683:2: ()
            // InternalDsl.g:2683:3: 
            {
            }

             after(grammarAccess.getCompareAccess().getCompareLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1__0__Impl"


    // $ANTLR start "rule__Compare__Group_1__1"
    // InternalDsl.g:2691:1: rule__Compare__Group_1__1 : rule__Compare__Group_1__1__Impl rule__Compare__Group_1__2 ;
    public final void rule__Compare__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2695:1: ( rule__Compare__Group_1__1__Impl rule__Compare__Group_1__2 )
            // InternalDsl.g:2696:2: rule__Compare__Group_1__1__Impl rule__Compare__Group_1__2
            {
            pushFollow(FOLLOW_20);
            rule__Compare__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Compare__Group_1__2();

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
    // $ANTLR end "rule__Compare__Group_1__1"


    // $ANTLR start "rule__Compare__Group_1__1__Impl"
    // InternalDsl.g:2703:1: rule__Compare__Group_1__1__Impl : ( ( rule__Compare__OpAssignment_1_1 ) ) ;
    public final void rule__Compare__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2707:1: ( ( ( rule__Compare__OpAssignment_1_1 ) ) )
            // InternalDsl.g:2708:1: ( ( rule__Compare__OpAssignment_1_1 ) )
            {
            // InternalDsl.g:2708:1: ( ( rule__Compare__OpAssignment_1_1 ) )
            // InternalDsl.g:2709:2: ( rule__Compare__OpAssignment_1_1 )
            {
             before(grammarAccess.getCompareAccess().getOpAssignment_1_1()); 
            // InternalDsl.g:2710:2: ( rule__Compare__OpAssignment_1_1 )
            // InternalDsl.g:2710:3: rule__Compare__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Compare__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCompareAccess().getOpAssignment_1_1()); 

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
    // $ANTLR end "rule__Compare__Group_1__1__Impl"


    // $ANTLR start "rule__Compare__Group_1__2"
    // InternalDsl.g:2718:1: rule__Compare__Group_1__2 : rule__Compare__Group_1__2__Impl ;
    public final void rule__Compare__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2722:1: ( rule__Compare__Group_1__2__Impl )
            // InternalDsl.g:2723:2: rule__Compare__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Compare__Group_1__2__Impl();

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
    // $ANTLR end "rule__Compare__Group_1__2"


    // $ANTLR start "rule__Compare__Group_1__2__Impl"
    // InternalDsl.g:2729:1: rule__Compare__Group_1__2__Impl : ( ( rule__Compare__RightAssignment_1_2 ) ) ;
    public final void rule__Compare__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2733:1: ( ( ( rule__Compare__RightAssignment_1_2 ) ) )
            // InternalDsl.g:2734:1: ( ( rule__Compare__RightAssignment_1_2 ) )
            {
            // InternalDsl.g:2734:1: ( ( rule__Compare__RightAssignment_1_2 ) )
            // InternalDsl.g:2735:2: ( rule__Compare__RightAssignment_1_2 )
            {
             before(grammarAccess.getCompareAccess().getRightAssignment_1_2()); 
            // InternalDsl.g:2736:2: ( rule__Compare__RightAssignment_1_2 )
            // InternalDsl.g:2736:3: rule__Compare__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Compare__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getCompareAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Compare__Group_1__2__Impl"


    // $ANTLR start "rule__Concat__Group__0"
    // InternalDsl.g:2745:1: rule__Concat__Group__0 : rule__Concat__Group__0__Impl rule__Concat__Group__1 ;
    public final void rule__Concat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2749:1: ( rule__Concat__Group__0__Impl rule__Concat__Group__1 )
            // InternalDsl.g:2750:2: rule__Concat__Group__0__Impl rule__Concat__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Concat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concat__Group__1();

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
    // $ANTLR end "rule__Concat__Group__0"


    // $ANTLR start "rule__Concat__Group__0__Impl"
    // InternalDsl.g:2757:1: rule__Concat__Group__0__Impl : ( rulePlusMinus ) ;
    public final void rule__Concat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2761:1: ( ( rulePlusMinus ) )
            // InternalDsl.g:2762:1: ( rulePlusMinus )
            {
            // InternalDsl.g:2762:1: ( rulePlusMinus )
            // InternalDsl.g:2763:2: rulePlusMinus
            {
             before(grammarAccess.getConcatAccess().getPlusMinusParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePlusMinus();

            state._fsp--;

             after(grammarAccess.getConcatAccess().getPlusMinusParserRuleCall_0()); 

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
    // $ANTLR end "rule__Concat__Group__0__Impl"


    // $ANTLR start "rule__Concat__Group__1"
    // InternalDsl.g:2772:1: rule__Concat__Group__1 : rule__Concat__Group__1__Impl ;
    public final void rule__Concat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2776:1: ( rule__Concat__Group__1__Impl )
            // InternalDsl.g:2777:2: rule__Concat__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Concat__Group__1__Impl();

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
    // $ANTLR end "rule__Concat__Group__1"


    // $ANTLR start "rule__Concat__Group__1__Impl"
    // InternalDsl.g:2783:1: rule__Concat__Group__1__Impl : ( ( rule__Concat__Group_1__0 )* ) ;
    public final void rule__Concat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2787:1: ( ( ( rule__Concat__Group_1__0 )* ) )
            // InternalDsl.g:2788:1: ( ( rule__Concat__Group_1__0 )* )
            {
            // InternalDsl.g:2788:1: ( ( rule__Concat__Group_1__0 )* )
            // InternalDsl.g:2789:2: ( rule__Concat__Group_1__0 )*
            {
             before(grammarAccess.getConcatAccess().getGroup_1()); 
            // InternalDsl.g:2790:2: ( rule__Concat__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==40) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalDsl.g:2790:3: rule__Concat__Group_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Concat__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getConcatAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Concat__Group__1__Impl"


    // $ANTLR start "rule__Concat__Group_1__0"
    // InternalDsl.g:2799:1: rule__Concat__Group_1__0 : rule__Concat__Group_1__0__Impl rule__Concat__Group_1__1 ;
    public final void rule__Concat__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2803:1: ( rule__Concat__Group_1__0__Impl rule__Concat__Group_1__1 )
            // InternalDsl.g:2804:2: rule__Concat__Group_1__0__Impl rule__Concat__Group_1__1
            {
            pushFollow(FOLLOW_29);
            rule__Concat__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concat__Group_1__1();

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
    // $ANTLR end "rule__Concat__Group_1__0"


    // $ANTLR start "rule__Concat__Group_1__0__Impl"
    // InternalDsl.g:2811:1: rule__Concat__Group_1__0__Impl : ( () ) ;
    public final void rule__Concat__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2815:1: ( ( () ) )
            // InternalDsl.g:2816:1: ( () )
            {
            // InternalDsl.g:2816:1: ( () )
            // InternalDsl.g:2817:2: ()
            {
             before(grammarAccess.getConcatAccess().getConcatLeftAction_1_0()); 
            // InternalDsl.g:2818:2: ()
            // InternalDsl.g:2818:3: 
            {
            }

             after(grammarAccess.getConcatAccess().getConcatLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concat__Group_1__0__Impl"


    // $ANTLR start "rule__Concat__Group_1__1"
    // InternalDsl.g:2826:1: rule__Concat__Group_1__1 : rule__Concat__Group_1__1__Impl rule__Concat__Group_1__2 ;
    public final void rule__Concat__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2830:1: ( rule__Concat__Group_1__1__Impl rule__Concat__Group_1__2 )
            // InternalDsl.g:2831:2: rule__Concat__Group_1__1__Impl rule__Concat__Group_1__2
            {
            pushFollow(FOLLOW_20);
            rule__Concat__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Concat__Group_1__2();

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
    // $ANTLR end "rule__Concat__Group_1__1"


    // $ANTLR start "rule__Concat__Group_1__1__Impl"
    // InternalDsl.g:2838:1: rule__Concat__Group_1__1__Impl : ( '&' ) ;
    public final void rule__Concat__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2842:1: ( ( '&' ) )
            // InternalDsl.g:2843:1: ( '&' )
            {
            // InternalDsl.g:2843:1: ( '&' )
            // InternalDsl.g:2844:2: '&'
            {
             before(grammarAccess.getConcatAccess().getAmpersandKeyword_1_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getConcatAccess().getAmpersandKeyword_1_1()); 

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
    // $ANTLR end "rule__Concat__Group_1__1__Impl"


    // $ANTLR start "rule__Concat__Group_1__2"
    // InternalDsl.g:2853:1: rule__Concat__Group_1__2 : rule__Concat__Group_1__2__Impl ;
    public final void rule__Concat__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2857:1: ( rule__Concat__Group_1__2__Impl )
            // InternalDsl.g:2858:2: rule__Concat__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Concat__Group_1__2__Impl();

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
    // $ANTLR end "rule__Concat__Group_1__2"


    // $ANTLR start "rule__Concat__Group_1__2__Impl"
    // InternalDsl.g:2864:1: rule__Concat__Group_1__2__Impl : ( ( rule__Concat__RightAssignment_1_2 ) ) ;
    public final void rule__Concat__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2868:1: ( ( ( rule__Concat__RightAssignment_1_2 ) ) )
            // InternalDsl.g:2869:1: ( ( rule__Concat__RightAssignment_1_2 ) )
            {
            // InternalDsl.g:2869:1: ( ( rule__Concat__RightAssignment_1_2 ) )
            // InternalDsl.g:2870:2: ( rule__Concat__RightAssignment_1_2 )
            {
             before(grammarAccess.getConcatAccess().getRightAssignment_1_2()); 
            // InternalDsl.g:2871:2: ( rule__Concat__RightAssignment_1_2 )
            // InternalDsl.g:2871:3: rule__Concat__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Concat__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getConcatAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Concat__Group_1__2__Impl"


    // $ANTLR start "rule__PlusMinus__Group__0"
    // InternalDsl.g:2880:1: rule__PlusMinus__Group__0 : rule__PlusMinus__Group__0__Impl rule__PlusMinus__Group__1 ;
    public final void rule__PlusMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2884:1: ( rule__PlusMinus__Group__0__Impl rule__PlusMinus__Group__1 )
            // InternalDsl.g:2885:2: rule__PlusMinus__Group__0__Impl rule__PlusMinus__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__PlusMinus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group__1();

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
    // $ANTLR end "rule__PlusMinus__Group__0"


    // $ANTLR start "rule__PlusMinus__Group__0__Impl"
    // InternalDsl.g:2892:1: rule__PlusMinus__Group__0__Impl : ( ruleMultDiv ) ;
    public final void rule__PlusMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2896:1: ( ( ruleMultDiv ) )
            // InternalDsl.g:2897:1: ( ruleMultDiv )
            {
            // InternalDsl.g:2897:1: ( ruleMultDiv )
            // InternalDsl.g:2898:2: ruleMultDiv
            {
             before(grammarAccess.getPlusMinusAccess().getMultDivParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultDiv();

            state._fsp--;

             after(grammarAccess.getPlusMinusAccess().getMultDivParserRuleCall_0()); 

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
    // $ANTLR end "rule__PlusMinus__Group__0__Impl"


    // $ANTLR start "rule__PlusMinus__Group__1"
    // InternalDsl.g:2907:1: rule__PlusMinus__Group__1 : rule__PlusMinus__Group__1__Impl ;
    public final void rule__PlusMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2911:1: ( rule__PlusMinus__Group__1__Impl )
            // InternalDsl.g:2912:2: rule__PlusMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group__1__Impl();

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
    // $ANTLR end "rule__PlusMinus__Group__1"


    // $ANTLR start "rule__PlusMinus__Group__1__Impl"
    // InternalDsl.g:2918:1: rule__PlusMinus__Group__1__Impl : ( ( rule__PlusMinus__Group_1__0 )* ) ;
    public final void rule__PlusMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2922:1: ( ( ( rule__PlusMinus__Group_1__0 )* ) )
            // InternalDsl.g:2923:1: ( ( rule__PlusMinus__Group_1__0 )* )
            {
            // InternalDsl.g:2923:1: ( ( rule__PlusMinus__Group_1__0 )* )
            // InternalDsl.g:2924:2: ( rule__PlusMinus__Group_1__0 )*
            {
             before(grammarAccess.getPlusMinusAccess().getGroup_1()); 
            // InternalDsl.g:2925:2: ( rule__PlusMinus__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=24 && LA26_0<=25)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalDsl.g:2925:3: rule__PlusMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__PlusMinus__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getPlusMinusAccess().getGroup_1()); 

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
    // $ANTLR end "rule__PlusMinus__Group__1__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1__0"
    // InternalDsl.g:2934:1: rule__PlusMinus__Group_1__0 : rule__PlusMinus__Group_1__0__Impl rule__PlusMinus__Group_1__1 ;
    public final void rule__PlusMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2938:1: ( rule__PlusMinus__Group_1__0__Impl rule__PlusMinus__Group_1__1 )
            // InternalDsl.g:2939:2: rule__PlusMinus__Group_1__0__Impl rule__PlusMinus__Group_1__1
            {
            pushFollow(FOLLOW_31);
            rule__PlusMinus__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1__1();

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
    // $ANTLR end "rule__PlusMinus__Group_1__0"


    // $ANTLR start "rule__PlusMinus__Group_1__0__Impl"
    // InternalDsl.g:2946:1: rule__PlusMinus__Group_1__0__Impl : ( () ) ;
    public final void rule__PlusMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2950:1: ( ( () ) )
            // InternalDsl.g:2951:1: ( () )
            {
            // InternalDsl.g:2951:1: ( () )
            // InternalDsl.g:2952:2: ()
            {
             before(grammarAccess.getPlusMinusAccess().getPlusMinusLeftAction_1_0()); 
            // InternalDsl.g:2953:2: ()
            // InternalDsl.g:2953:3: 
            {
            }

             after(grammarAccess.getPlusMinusAccess().getPlusMinusLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusMinus__Group_1__0__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1__1"
    // InternalDsl.g:2961:1: rule__PlusMinus__Group_1__1 : rule__PlusMinus__Group_1__1__Impl rule__PlusMinus__Group_1__2 ;
    public final void rule__PlusMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2965:1: ( rule__PlusMinus__Group_1__1__Impl rule__PlusMinus__Group_1__2 )
            // InternalDsl.g:2966:2: rule__PlusMinus__Group_1__1__Impl rule__PlusMinus__Group_1__2
            {
            pushFollow(FOLLOW_20);
            rule__PlusMinus__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1__2();

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
    // $ANTLR end "rule__PlusMinus__Group_1__1"


    // $ANTLR start "rule__PlusMinus__Group_1__1__Impl"
    // InternalDsl.g:2973:1: rule__PlusMinus__Group_1__1__Impl : ( ( rule__PlusMinus__OpAssignment_1_1 ) ) ;
    public final void rule__PlusMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2977:1: ( ( ( rule__PlusMinus__OpAssignment_1_1 ) ) )
            // InternalDsl.g:2978:1: ( ( rule__PlusMinus__OpAssignment_1_1 ) )
            {
            // InternalDsl.g:2978:1: ( ( rule__PlusMinus__OpAssignment_1_1 ) )
            // InternalDsl.g:2979:2: ( rule__PlusMinus__OpAssignment_1_1 )
            {
             before(grammarAccess.getPlusMinusAccess().getOpAssignment_1_1()); 
            // InternalDsl.g:2980:2: ( rule__PlusMinus__OpAssignment_1_1 )
            // InternalDsl.g:2980:3: rule__PlusMinus__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPlusMinusAccess().getOpAssignment_1_1()); 

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
    // $ANTLR end "rule__PlusMinus__Group_1__1__Impl"


    // $ANTLR start "rule__PlusMinus__Group_1__2"
    // InternalDsl.g:2988:1: rule__PlusMinus__Group_1__2 : rule__PlusMinus__Group_1__2__Impl ;
    public final void rule__PlusMinus__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:2992:1: ( rule__PlusMinus__Group_1__2__Impl )
            // InternalDsl.g:2993:2: rule__PlusMinus__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__Group_1__2__Impl();

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
    // $ANTLR end "rule__PlusMinus__Group_1__2"


    // $ANTLR start "rule__PlusMinus__Group_1__2__Impl"
    // InternalDsl.g:2999:1: rule__PlusMinus__Group_1__2__Impl : ( ( rule__PlusMinus__RightAssignment_1_2 ) ) ;
    public final void rule__PlusMinus__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3003:1: ( ( ( rule__PlusMinus__RightAssignment_1_2 ) ) )
            // InternalDsl.g:3004:1: ( ( rule__PlusMinus__RightAssignment_1_2 ) )
            {
            // InternalDsl.g:3004:1: ( ( rule__PlusMinus__RightAssignment_1_2 ) )
            // InternalDsl.g:3005:2: ( rule__PlusMinus__RightAssignment_1_2 )
            {
             before(grammarAccess.getPlusMinusAccess().getRightAssignment_1_2()); 
            // InternalDsl.g:3006:2: ( rule__PlusMinus__RightAssignment_1_2 )
            // InternalDsl.g:3006:3: rule__PlusMinus__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPlusMinusAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__PlusMinus__Group_1__2__Impl"


    // $ANTLR start "rule__MultDiv__Group__0"
    // InternalDsl.g:3015:1: rule__MultDiv__Group__0 : rule__MultDiv__Group__0__Impl rule__MultDiv__Group__1 ;
    public final void rule__MultDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3019:1: ( rule__MultDiv__Group__0__Impl rule__MultDiv__Group__1 )
            // InternalDsl.g:3020:2: rule__MultDiv__Group__0__Impl rule__MultDiv__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__MultDiv__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultDiv__Group__1();

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
    // $ANTLR end "rule__MultDiv__Group__0"


    // $ANTLR start "rule__MultDiv__Group__0__Impl"
    // InternalDsl.g:3027:1: rule__MultDiv__Group__0__Impl : ( rulePrimitive ) ;
    public final void rule__MultDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3031:1: ( ( rulePrimitive ) )
            // InternalDsl.g:3032:1: ( rulePrimitive )
            {
            // InternalDsl.g:3032:1: ( rulePrimitive )
            // InternalDsl.g:3033:2: rulePrimitive
            {
             before(grammarAccess.getMultDivAccess().getPrimitiveParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getMultDivAccess().getPrimitiveParserRuleCall_0()); 

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
    // $ANTLR end "rule__MultDiv__Group__0__Impl"


    // $ANTLR start "rule__MultDiv__Group__1"
    // InternalDsl.g:3042:1: rule__MultDiv__Group__1 : rule__MultDiv__Group__1__Impl ;
    public final void rule__MultDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3046:1: ( rule__MultDiv__Group__1__Impl )
            // InternalDsl.g:3047:2: rule__MultDiv__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultDiv__Group__1__Impl();

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
    // $ANTLR end "rule__MultDiv__Group__1"


    // $ANTLR start "rule__MultDiv__Group__1__Impl"
    // InternalDsl.g:3053:1: rule__MultDiv__Group__1__Impl : ( ( rule__MultDiv__Group_1__0 )* ) ;
    public final void rule__MultDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3057:1: ( ( ( rule__MultDiv__Group_1__0 )* ) )
            // InternalDsl.g:3058:1: ( ( rule__MultDiv__Group_1__0 )* )
            {
            // InternalDsl.g:3058:1: ( ( rule__MultDiv__Group_1__0 )* )
            // InternalDsl.g:3059:2: ( rule__MultDiv__Group_1__0 )*
            {
             before(grammarAccess.getMultDivAccess().getGroup_1()); 
            // InternalDsl.g:3060:2: ( rule__MultDiv__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=26 && LA27_0<=27)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalDsl.g:3060:3: rule__MultDiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__MultDiv__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getMultDivAccess().getGroup_1()); 

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
    // $ANTLR end "rule__MultDiv__Group__1__Impl"


    // $ANTLR start "rule__MultDiv__Group_1__0"
    // InternalDsl.g:3069:1: rule__MultDiv__Group_1__0 : rule__MultDiv__Group_1__0__Impl rule__MultDiv__Group_1__1 ;
    public final void rule__MultDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3073:1: ( rule__MultDiv__Group_1__0__Impl rule__MultDiv__Group_1__1 )
            // InternalDsl.g:3074:2: rule__MultDiv__Group_1__0__Impl rule__MultDiv__Group_1__1
            {
            pushFollow(FOLLOW_33);
            rule__MultDiv__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultDiv__Group_1__1();

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
    // $ANTLR end "rule__MultDiv__Group_1__0"


    // $ANTLR start "rule__MultDiv__Group_1__0__Impl"
    // InternalDsl.g:3081:1: rule__MultDiv__Group_1__0__Impl : ( () ) ;
    public final void rule__MultDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3085:1: ( ( () ) )
            // InternalDsl.g:3086:1: ( () )
            {
            // InternalDsl.g:3086:1: ( () )
            // InternalDsl.g:3087:2: ()
            {
             before(grammarAccess.getMultDivAccess().getMultDivLeftAction_1_0()); 
            // InternalDsl.g:3088:2: ()
            // InternalDsl.g:3088:3: 
            {
            }

             after(grammarAccess.getMultDivAccess().getMultDivLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultDiv__Group_1__0__Impl"


    // $ANTLR start "rule__MultDiv__Group_1__1"
    // InternalDsl.g:3096:1: rule__MultDiv__Group_1__1 : rule__MultDiv__Group_1__1__Impl rule__MultDiv__Group_1__2 ;
    public final void rule__MultDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3100:1: ( rule__MultDiv__Group_1__1__Impl rule__MultDiv__Group_1__2 )
            // InternalDsl.g:3101:2: rule__MultDiv__Group_1__1__Impl rule__MultDiv__Group_1__2
            {
            pushFollow(FOLLOW_20);
            rule__MultDiv__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultDiv__Group_1__2();

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
    // $ANTLR end "rule__MultDiv__Group_1__1"


    // $ANTLR start "rule__MultDiv__Group_1__1__Impl"
    // InternalDsl.g:3108:1: rule__MultDiv__Group_1__1__Impl : ( ( rule__MultDiv__OpAssignment_1_1 ) ) ;
    public final void rule__MultDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3112:1: ( ( ( rule__MultDiv__OpAssignment_1_1 ) ) )
            // InternalDsl.g:3113:1: ( ( rule__MultDiv__OpAssignment_1_1 ) )
            {
            // InternalDsl.g:3113:1: ( ( rule__MultDiv__OpAssignment_1_1 ) )
            // InternalDsl.g:3114:2: ( rule__MultDiv__OpAssignment_1_1 )
            {
             before(grammarAccess.getMultDivAccess().getOpAssignment_1_1()); 
            // InternalDsl.g:3115:2: ( rule__MultDiv__OpAssignment_1_1 )
            // InternalDsl.g:3115:3: rule__MultDiv__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MultDiv__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultDivAccess().getOpAssignment_1_1()); 

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
    // $ANTLR end "rule__MultDiv__Group_1__1__Impl"


    // $ANTLR start "rule__MultDiv__Group_1__2"
    // InternalDsl.g:3123:1: rule__MultDiv__Group_1__2 : rule__MultDiv__Group_1__2__Impl ;
    public final void rule__MultDiv__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3127:1: ( rule__MultDiv__Group_1__2__Impl )
            // InternalDsl.g:3128:2: rule__MultDiv__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultDiv__Group_1__2__Impl();

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
    // $ANTLR end "rule__MultDiv__Group_1__2"


    // $ANTLR start "rule__MultDiv__Group_1__2__Impl"
    // InternalDsl.g:3134:1: rule__MultDiv__Group_1__2__Impl : ( ( rule__MultDiv__RightAssignment_1_2 ) ) ;
    public final void rule__MultDiv__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3138:1: ( ( ( rule__MultDiv__RightAssignment_1_2 ) ) )
            // InternalDsl.g:3139:1: ( ( rule__MultDiv__RightAssignment_1_2 ) )
            {
            // InternalDsl.g:3139:1: ( ( rule__MultDiv__RightAssignment_1_2 ) )
            // InternalDsl.g:3140:2: ( rule__MultDiv__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultDivAccess().getRightAssignment_1_2()); 
            // InternalDsl.g:3141:2: ( rule__MultDiv__RightAssignment_1_2 )
            // InternalDsl.g:3141:3: rule__MultDiv__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MultDiv__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultDivAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__MultDiv__Group_1__2__Impl"


    // $ANTLR start "rule__Primitive__Group_0__0"
    // InternalDsl.g:3150:1: rule__Primitive__Group_0__0 : rule__Primitive__Group_0__0__Impl rule__Primitive__Group_0__1 ;
    public final void rule__Primitive__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3154:1: ( rule__Primitive__Group_0__0__Impl rule__Primitive__Group_0__1 )
            // InternalDsl.g:3155:2: rule__Primitive__Group_0__0__Impl rule__Primitive__Group_0__1
            {
            pushFollow(FOLLOW_35);
            rule__Primitive__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primitive__Group_0__1();

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
    // $ANTLR end "rule__Primitive__Group_0__0"


    // $ANTLR start "rule__Primitive__Group_0__0__Impl"
    // InternalDsl.g:3162:1: rule__Primitive__Group_0__0__Impl : ( () ) ;
    public final void rule__Primitive__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3166:1: ( ( () ) )
            // InternalDsl.g:3167:1: ( () )
            {
            // InternalDsl.g:3167:1: ( () )
            // InternalDsl.g:3168:2: ()
            {
             before(grammarAccess.getPrimitiveAccess().getIntConstantAction_0_0()); 
            // InternalDsl.g:3169:2: ()
            // InternalDsl.g:3169:3: 
            {
            }

             after(grammarAccess.getPrimitiveAccess().getIntConstantAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group_0__0__Impl"


    // $ANTLR start "rule__Primitive__Group_0__1"
    // InternalDsl.g:3177:1: rule__Primitive__Group_0__1 : rule__Primitive__Group_0__1__Impl ;
    public final void rule__Primitive__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3181:1: ( rule__Primitive__Group_0__1__Impl )
            // InternalDsl.g:3182:2: rule__Primitive__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primitive__Group_0__1__Impl();

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
    // $ANTLR end "rule__Primitive__Group_0__1"


    // $ANTLR start "rule__Primitive__Group_0__1__Impl"
    // InternalDsl.g:3188:1: rule__Primitive__Group_0__1__Impl : ( ( rule__Primitive__ValueAssignment_0_1 ) ) ;
    public final void rule__Primitive__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3192:1: ( ( ( rule__Primitive__ValueAssignment_0_1 ) ) )
            // InternalDsl.g:3193:1: ( ( rule__Primitive__ValueAssignment_0_1 ) )
            {
            // InternalDsl.g:3193:1: ( ( rule__Primitive__ValueAssignment_0_1 ) )
            // InternalDsl.g:3194:2: ( rule__Primitive__ValueAssignment_0_1 )
            {
             before(grammarAccess.getPrimitiveAccess().getValueAssignment_0_1()); 
            // InternalDsl.g:3195:2: ( rule__Primitive__ValueAssignment_0_1 )
            // InternalDsl.g:3195:3: rule__Primitive__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Primitive__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveAccess().getValueAssignment_0_1()); 

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
    // $ANTLR end "rule__Primitive__Group_0__1__Impl"


    // $ANTLR start "rule__Primitive__Group_1__0"
    // InternalDsl.g:3204:1: rule__Primitive__Group_1__0 : rule__Primitive__Group_1__0__Impl rule__Primitive__Group_1__1 ;
    public final void rule__Primitive__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3208:1: ( rule__Primitive__Group_1__0__Impl rule__Primitive__Group_1__1 )
            // InternalDsl.g:3209:2: rule__Primitive__Group_1__0__Impl rule__Primitive__Group_1__1
            {
            pushFollow(FOLLOW_36);
            rule__Primitive__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primitive__Group_1__1();

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
    // $ANTLR end "rule__Primitive__Group_1__0"


    // $ANTLR start "rule__Primitive__Group_1__0__Impl"
    // InternalDsl.g:3216:1: rule__Primitive__Group_1__0__Impl : ( () ) ;
    public final void rule__Primitive__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3220:1: ( ( () ) )
            // InternalDsl.g:3221:1: ( () )
            {
            // InternalDsl.g:3221:1: ( () )
            // InternalDsl.g:3222:2: ()
            {
             before(grammarAccess.getPrimitiveAccess().getStringConstantAction_1_0()); 
            // InternalDsl.g:3223:2: ()
            // InternalDsl.g:3223:3: 
            {
            }

             after(grammarAccess.getPrimitiveAccess().getStringConstantAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group_1__0__Impl"


    // $ANTLR start "rule__Primitive__Group_1__1"
    // InternalDsl.g:3231:1: rule__Primitive__Group_1__1 : rule__Primitive__Group_1__1__Impl ;
    public final void rule__Primitive__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3235:1: ( rule__Primitive__Group_1__1__Impl )
            // InternalDsl.g:3236:2: rule__Primitive__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primitive__Group_1__1__Impl();

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
    // $ANTLR end "rule__Primitive__Group_1__1"


    // $ANTLR start "rule__Primitive__Group_1__1__Impl"
    // InternalDsl.g:3242:1: rule__Primitive__Group_1__1__Impl : ( ( rule__Primitive__ValueAssignment_1_1 ) ) ;
    public final void rule__Primitive__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3246:1: ( ( ( rule__Primitive__ValueAssignment_1_1 ) ) )
            // InternalDsl.g:3247:1: ( ( rule__Primitive__ValueAssignment_1_1 ) )
            {
            // InternalDsl.g:3247:1: ( ( rule__Primitive__ValueAssignment_1_1 ) )
            // InternalDsl.g:3248:2: ( rule__Primitive__ValueAssignment_1_1 )
            {
             before(grammarAccess.getPrimitiveAccess().getValueAssignment_1_1()); 
            // InternalDsl.g:3249:2: ( rule__Primitive__ValueAssignment_1_1 )
            // InternalDsl.g:3249:3: rule__Primitive__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Primitive__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveAccess().getValueAssignment_1_1()); 

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
    // $ANTLR end "rule__Primitive__Group_1__1__Impl"


    // $ANTLR start "rule__Primitive__Group_2__0"
    // InternalDsl.g:3258:1: rule__Primitive__Group_2__0 : rule__Primitive__Group_2__0__Impl rule__Primitive__Group_2__1 ;
    public final void rule__Primitive__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3262:1: ( rule__Primitive__Group_2__0__Impl rule__Primitive__Group_2__1 )
            // InternalDsl.g:3263:2: rule__Primitive__Group_2__0__Impl rule__Primitive__Group_2__1
            {
            pushFollow(FOLLOW_37);
            rule__Primitive__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primitive__Group_2__1();

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
    // $ANTLR end "rule__Primitive__Group_2__0"


    // $ANTLR start "rule__Primitive__Group_2__0__Impl"
    // InternalDsl.g:3270:1: rule__Primitive__Group_2__0__Impl : ( () ) ;
    public final void rule__Primitive__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3274:1: ( ( () ) )
            // InternalDsl.g:3275:1: ( () )
            {
            // InternalDsl.g:3275:1: ( () )
            // InternalDsl.g:3276:2: ()
            {
             before(grammarAccess.getPrimitiveAccess().getNotAction_2_0()); 
            // InternalDsl.g:3277:2: ()
            // InternalDsl.g:3277:3: 
            {
            }

             after(grammarAccess.getPrimitiveAccess().getNotAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group_2__0__Impl"


    // $ANTLR start "rule__Primitive__Group_2__1"
    // InternalDsl.g:3285:1: rule__Primitive__Group_2__1 : rule__Primitive__Group_2__1__Impl rule__Primitive__Group_2__2 ;
    public final void rule__Primitive__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3289:1: ( rule__Primitive__Group_2__1__Impl rule__Primitive__Group_2__2 )
            // InternalDsl.g:3290:2: rule__Primitive__Group_2__1__Impl rule__Primitive__Group_2__2
            {
            pushFollow(FOLLOW_20);
            rule__Primitive__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primitive__Group_2__2();

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
    // $ANTLR end "rule__Primitive__Group_2__1"


    // $ANTLR start "rule__Primitive__Group_2__1__Impl"
    // InternalDsl.g:3297:1: rule__Primitive__Group_2__1__Impl : ( '!' ) ;
    public final void rule__Primitive__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3301:1: ( ( '!' ) )
            // InternalDsl.g:3302:1: ( '!' )
            {
            // InternalDsl.g:3302:1: ( '!' )
            // InternalDsl.g:3303:2: '!'
            {
             before(grammarAccess.getPrimitiveAccess().getExclamationMarkKeyword_2_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPrimitiveAccess().getExclamationMarkKeyword_2_1()); 

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
    // $ANTLR end "rule__Primitive__Group_2__1__Impl"


    // $ANTLR start "rule__Primitive__Group_2__2"
    // InternalDsl.g:3312:1: rule__Primitive__Group_2__2 : rule__Primitive__Group_2__2__Impl ;
    public final void rule__Primitive__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3316:1: ( rule__Primitive__Group_2__2__Impl )
            // InternalDsl.g:3317:2: rule__Primitive__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primitive__Group_2__2__Impl();

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
    // $ANTLR end "rule__Primitive__Group_2__2"


    // $ANTLR start "rule__Primitive__Group_2__2__Impl"
    // InternalDsl.g:3323:1: rule__Primitive__Group_2__2__Impl : ( ( rule__Primitive__ExpAssignment_2_2 ) ) ;
    public final void rule__Primitive__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3327:1: ( ( ( rule__Primitive__ExpAssignment_2_2 ) ) )
            // InternalDsl.g:3328:1: ( ( rule__Primitive__ExpAssignment_2_2 ) )
            {
            // InternalDsl.g:3328:1: ( ( rule__Primitive__ExpAssignment_2_2 ) )
            // InternalDsl.g:3329:2: ( rule__Primitive__ExpAssignment_2_2 )
            {
             before(grammarAccess.getPrimitiveAccess().getExpAssignment_2_2()); 
            // InternalDsl.g:3330:2: ( rule__Primitive__ExpAssignment_2_2 )
            // InternalDsl.g:3330:3: rule__Primitive__ExpAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Primitive__ExpAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveAccess().getExpAssignment_2_2()); 

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
    // $ANTLR end "rule__Primitive__Group_2__2__Impl"


    // $ANTLR start "rule__Primitive__Group_3__0"
    // InternalDsl.g:3339:1: rule__Primitive__Group_3__0 : rule__Primitive__Group_3__0__Impl rule__Primitive__Group_3__1 ;
    public final void rule__Primitive__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3343:1: ( rule__Primitive__Group_3__0__Impl rule__Primitive__Group_3__1 )
            // InternalDsl.g:3344:2: rule__Primitive__Group_3__0__Impl rule__Primitive__Group_3__1
            {
            pushFollow(FOLLOW_38);
            rule__Primitive__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primitive__Group_3__1();

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
    // $ANTLR end "rule__Primitive__Group_3__0"


    // $ANTLR start "rule__Primitive__Group_3__0__Impl"
    // InternalDsl.g:3351:1: rule__Primitive__Group_3__0__Impl : ( () ) ;
    public final void rule__Primitive__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3355:1: ( ( () ) )
            // InternalDsl.g:3356:1: ( () )
            {
            // InternalDsl.g:3356:1: ( () )
            // InternalDsl.g:3357:2: ()
            {
             before(grammarAccess.getPrimitiveAccess().getLengthAction_3_0()); 
            // InternalDsl.g:3358:2: ()
            // InternalDsl.g:3358:3: 
            {
            }

             after(grammarAccess.getPrimitiveAccess().getLengthAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group_3__0__Impl"


    // $ANTLR start "rule__Primitive__Group_3__1"
    // InternalDsl.g:3366:1: rule__Primitive__Group_3__1 : rule__Primitive__Group_3__1__Impl rule__Primitive__Group_3__2 ;
    public final void rule__Primitive__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3370:1: ( rule__Primitive__Group_3__1__Impl rule__Primitive__Group_3__2 )
            // InternalDsl.g:3371:2: rule__Primitive__Group_3__1__Impl rule__Primitive__Group_3__2
            {
            pushFollow(FOLLOW_20);
            rule__Primitive__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primitive__Group_3__2();

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
    // $ANTLR end "rule__Primitive__Group_3__1"


    // $ANTLR start "rule__Primitive__Group_3__1__Impl"
    // InternalDsl.g:3378:1: rule__Primitive__Group_3__1__Impl : ( '#' ) ;
    public final void rule__Primitive__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3382:1: ( ( '#' ) )
            // InternalDsl.g:3383:1: ( '#' )
            {
            // InternalDsl.g:3383:1: ( '#' )
            // InternalDsl.g:3384:2: '#'
            {
             before(grammarAccess.getPrimitiveAccess().getNumberSignKeyword_3_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getPrimitiveAccess().getNumberSignKeyword_3_1()); 

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
    // $ANTLR end "rule__Primitive__Group_3__1__Impl"


    // $ANTLR start "rule__Primitive__Group_3__2"
    // InternalDsl.g:3393:1: rule__Primitive__Group_3__2 : rule__Primitive__Group_3__2__Impl ;
    public final void rule__Primitive__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3397:1: ( rule__Primitive__Group_3__2__Impl )
            // InternalDsl.g:3398:2: rule__Primitive__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primitive__Group_3__2__Impl();

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
    // $ANTLR end "rule__Primitive__Group_3__2"


    // $ANTLR start "rule__Primitive__Group_3__2__Impl"
    // InternalDsl.g:3404:1: rule__Primitive__Group_3__2__Impl : ( ( rule__Primitive__ExpAssignment_3_2 ) ) ;
    public final void rule__Primitive__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3408:1: ( ( ( rule__Primitive__ExpAssignment_3_2 ) ) )
            // InternalDsl.g:3409:1: ( ( rule__Primitive__ExpAssignment_3_2 ) )
            {
            // InternalDsl.g:3409:1: ( ( rule__Primitive__ExpAssignment_3_2 ) )
            // InternalDsl.g:3410:2: ( rule__Primitive__ExpAssignment_3_2 )
            {
             before(grammarAccess.getPrimitiveAccess().getExpAssignment_3_2()); 
            // InternalDsl.g:3411:2: ( rule__Primitive__ExpAssignment_3_2 )
            // InternalDsl.g:3411:3: rule__Primitive__ExpAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Primitive__ExpAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveAccess().getExpAssignment_3_2()); 

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
    // $ANTLR end "rule__Primitive__Group_3__2__Impl"


    // $ANTLR start "rule__Primitive__Group_4__0"
    // InternalDsl.g:3420:1: rule__Primitive__Group_4__0 : rule__Primitive__Group_4__0__Impl rule__Primitive__Group_4__1 ;
    public final void rule__Primitive__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3424:1: ( rule__Primitive__Group_4__0__Impl rule__Primitive__Group_4__1 )
            // InternalDsl.g:3425:2: rule__Primitive__Group_4__0__Impl rule__Primitive__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__Primitive__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primitive__Group_4__1();

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
    // $ANTLR end "rule__Primitive__Group_4__0"


    // $ANTLR start "rule__Primitive__Group_4__0__Impl"
    // InternalDsl.g:3432:1: rule__Primitive__Group_4__0__Impl : ( () ) ;
    public final void rule__Primitive__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3436:1: ( ( () ) )
            // InternalDsl.g:3437:1: ( () )
            {
            // InternalDsl.g:3437:1: ( () )
            // InternalDsl.g:3438:2: ()
            {
             before(grammarAccess.getPrimitiveAccess().getTypeConstantAction_4_0()); 
            // InternalDsl.g:3439:2: ()
            // InternalDsl.g:3439:3: 
            {
            }

             after(grammarAccess.getPrimitiveAccess().getTypeConstantAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group_4__0__Impl"


    // $ANTLR start "rule__Primitive__Group_4__1"
    // InternalDsl.g:3447:1: rule__Primitive__Group_4__1 : rule__Primitive__Group_4__1__Impl ;
    public final void rule__Primitive__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3451:1: ( rule__Primitive__Group_4__1__Impl )
            // InternalDsl.g:3452:2: rule__Primitive__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primitive__Group_4__1__Impl();

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
    // $ANTLR end "rule__Primitive__Group_4__1"


    // $ANTLR start "rule__Primitive__Group_4__1__Impl"
    // InternalDsl.g:3458:1: rule__Primitive__Group_4__1__Impl : ( ( rule__Primitive__TypeAssignment_4_1 ) ) ;
    public final void rule__Primitive__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3462:1: ( ( ( rule__Primitive__TypeAssignment_4_1 ) ) )
            // InternalDsl.g:3463:1: ( ( rule__Primitive__TypeAssignment_4_1 ) )
            {
            // InternalDsl.g:3463:1: ( ( rule__Primitive__TypeAssignment_4_1 ) )
            // InternalDsl.g:3464:2: ( rule__Primitive__TypeAssignment_4_1 )
            {
             before(grammarAccess.getPrimitiveAccess().getTypeAssignment_4_1()); 
            // InternalDsl.g:3465:2: ( rule__Primitive__TypeAssignment_4_1 )
            // InternalDsl.g:3465:3: rule__Primitive__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Primitive__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveAccess().getTypeAssignment_4_1()); 

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
    // $ANTLR end "rule__Primitive__Group_4__1__Impl"


    // $ANTLR start "rule__Primitive__Group_5__0"
    // InternalDsl.g:3474:1: rule__Primitive__Group_5__0 : rule__Primitive__Group_5__0__Impl rule__Primitive__Group_5__1 ;
    public final void rule__Primitive__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3478:1: ( rule__Primitive__Group_5__0__Impl rule__Primitive__Group_5__1 )
            // InternalDsl.g:3479:2: rule__Primitive__Group_5__0__Impl rule__Primitive__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Primitive__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primitive__Group_5__1();

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
    // $ANTLR end "rule__Primitive__Group_5__0"


    // $ANTLR start "rule__Primitive__Group_5__0__Impl"
    // InternalDsl.g:3486:1: rule__Primitive__Group_5__0__Impl : ( () ) ;
    public final void rule__Primitive__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3490:1: ( ( () ) )
            // InternalDsl.g:3491:1: ( () )
            {
            // InternalDsl.g:3491:1: ( () )
            // InternalDsl.g:3492:2: ()
            {
             before(grammarAccess.getPrimitiveAccess().getVarRefAction_5_0()); 
            // InternalDsl.g:3493:2: ()
            // InternalDsl.g:3493:3: 
            {
            }

             after(grammarAccess.getPrimitiveAccess().getVarRefAction_5_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group_5__0__Impl"


    // $ANTLR start "rule__Primitive__Group_5__1"
    // InternalDsl.g:3501:1: rule__Primitive__Group_5__1 : rule__Primitive__Group_5__1__Impl ;
    public final void rule__Primitive__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3505:1: ( rule__Primitive__Group_5__1__Impl )
            // InternalDsl.g:3506:2: rule__Primitive__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primitive__Group_5__1__Impl();

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
    // $ANTLR end "rule__Primitive__Group_5__1"


    // $ANTLR start "rule__Primitive__Group_5__1__Impl"
    // InternalDsl.g:3512:1: rule__Primitive__Group_5__1__Impl : ( ( rule__Primitive__RefAssignment_5_1 ) ) ;
    public final void rule__Primitive__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3516:1: ( ( ( rule__Primitive__RefAssignment_5_1 ) ) )
            // InternalDsl.g:3517:1: ( ( rule__Primitive__RefAssignment_5_1 ) )
            {
            // InternalDsl.g:3517:1: ( ( rule__Primitive__RefAssignment_5_1 ) )
            // InternalDsl.g:3518:2: ( rule__Primitive__RefAssignment_5_1 )
            {
             before(grammarAccess.getPrimitiveAccess().getRefAssignment_5_1()); 
            // InternalDsl.g:3519:2: ( rule__Primitive__RefAssignment_5_1 )
            // InternalDsl.g:3519:3: rule__Primitive__RefAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Primitive__RefAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveAccess().getRefAssignment_5_1()); 

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
    // $ANTLR end "rule__Primitive__Group_5__1__Impl"


    // $ANTLR start "rule__Primitive__Group_6__0"
    // InternalDsl.g:3528:1: rule__Primitive__Group_6__0 : rule__Primitive__Group_6__0__Impl rule__Primitive__Group_6__1 ;
    public final void rule__Primitive__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3532:1: ( rule__Primitive__Group_6__0__Impl rule__Primitive__Group_6__1 )
            // InternalDsl.g:3533:2: rule__Primitive__Group_6__0__Impl rule__Primitive__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__Primitive__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primitive__Group_6__1();

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
    // $ANTLR end "rule__Primitive__Group_6__0"


    // $ANTLR start "rule__Primitive__Group_6__0__Impl"
    // InternalDsl.g:3540:1: rule__Primitive__Group_6__0__Impl : ( () ) ;
    public final void rule__Primitive__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3544:1: ( ( () ) )
            // InternalDsl.g:3545:1: ( () )
            {
            // InternalDsl.g:3545:1: ( () )
            // InternalDsl.g:3546:2: ()
            {
             before(grammarAccess.getPrimitiveAccess().getFuncCallAction_6_0()); 
            // InternalDsl.g:3547:2: ()
            // InternalDsl.g:3547:3: 
            {
            }

             after(grammarAccess.getPrimitiveAccess().getFuncCallAction_6_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group_6__0__Impl"


    // $ANTLR start "rule__Primitive__Group_6__1"
    // InternalDsl.g:3555:1: rule__Primitive__Group_6__1 : rule__Primitive__Group_6__1__Impl rule__Primitive__Group_6__2 ;
    public final void rule__Primitive__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3559:1: ( rule__Primitive__Group_6__1__Impl rule__Primitive__Group_6__2 )
            // InternalDsl.g:3560:2: rule__Primitive__Group_6__1__Impl rule__Primitive__Group_6__2
            {
            pushFollow(FOLLOW_7);
            rule__Primitive__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primitive__Group_6__2();

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
    // $ANTLR end "rule__Primitive__Group_6__1"


    // $ANTLR start "rule__Primitive__Group_6__1__Impl"
    // InternalDsl.g:3567:1: rule__Primitive__Group_6__1__Impl : ( ( rule__Primitive__RefAssignment_6_1 ) ) ;
    public final void rule__Primitive__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3571:1: ( ( ( rule__Primitive__RefAssignment_6_1 ) ) )
            // InternalDsl.g:3572:1: ( ( rule__Primitive__RefAssignment_6_1 ) )
            {
            // InternalDsl.g:3572:1: ( ( rule__Primitive__RefAssignment_6_1 ) )
            // InternalDsl.g:3573:2: ( rule__Primitive__RefAssignment_6_1 )
            {
             before(grammarAccess.getPrimitiveAccess().getRefAssignment_6_1()); 
            // InternalDsl.g:3574:2: ( rule__Primitive__RefAssignment_6_1 )
            // InternalDsl.g:3574:3: rule__Primitive__RefAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Primitive__RefAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveAccess().getRefAssignment_6_1()); 

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
    // $ANTLR end "rule__Primitive__Group_6__1__Impl"


    // $ANTLR start "rule__Primitive__Group_6__2"
    // InternalDsl.g:3582:1: rule__Primitive__Group_6__2 : rule__Primitive__Group_6__2__Impl rule__Primitive__Group_6__3 ;
    public final void rule__Primitive__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3586:1: ( rule__Primitive__Group_6__2__Impl rule__Primitive__Group_6__3 )
            // InternalDsl.g:3587:2: rule__Primitive__Group_6__2__Impl rule__Primitive__Group_6__3
            {
            pushFollow(FOLLOW_22);
            rule__Primitive__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primitive__Group_6__3();

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
    // $ANTLR end "rule__Primitive__Group_6__2"


    // $ANTLR start "rule__Primitive__Group_6__2__Impl"
    // InternalDsl.g:3594:1: rule__Primitive__Group_6__2__Impl : ( '(' ) ;
    public final void rule__Primitive__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3598:1: ( ( '(' ) )
            // InternalDsl.g:3599:1: ( '(' )
            {
            // InternalDsl.g:3599:1: ( '(' )
            // InternalDsl.g:3600:2: '('
            {
             before(grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_6_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_6_2()); 

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
    // $ANTLR end "rule__Primitive__Group_6__2__Impl"


    // $ANTLR start "rule__Primitive__Group_6__3"
    // InternalDsl.g:3609:1: rule__Primitive__Group_6__3 : rule__Primitive__Group_6__3__Impl rule__Primitive__Group_6__4 ;
    public final void rule__Primitive__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3613:1: ( rule__Primitive__Group_6__3__Impl rule__Primitive__Group_6__4 )
            // InternalDsl.g:3614:2: rule__Primitive__Group_6__3__Impl rule__Primitive__Group_6__4
            {
            pushFollow(FOLLOW_22);
            rule__Primitive__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primitive__Group_6__4();

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
    // $ANTLR end "rule__Primitive__Group_6__3"


    // $ANTLR start "rule__Primitive__Group_6__3__Impl"
    // InternalDsl.g:3621:1: rule__Primitive__Group_6__3__Impl : ( ( rule__Primitive__Group_6_3__0 )? ) ;
    public final void rule__Primitive__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3625:1: ( ( ( rule__Primitive__Group_6_3__0 )? ) )
            // InternalDsl.g:3626:1: ( ( rule__Primitive__Group_6_3__0 )? )
            {
            // InternalDsl.g:3626:1: ( ( rule__Primitive__Group_6_3__0 )? )
            // InternalDsl.g:3627:2: ( rule__Primitive__Group_6_3__0 )?
            {
             before(grammarAccess.getPrimitiveAccess().getGroup_6_3()); 
            // InternalDsl.g:3628:2: ( rule__Primitive__Group_6_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_STRING)||(LA28_0>=13 && LA28_0<=15)||LA28_0==30||(LA28_0>=41 && LA28_0<=42)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDsl.g:3628:3: rule__Primitive__Group_6_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primitive__Group_6_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrimitiveAccess().getGroup_6_3()); 

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
    // $ANTLR end "rule__Primitive__Group_6__3__Impl"


    // $ANTLR start "rule__Primitive__Group_6__4"
    // InternalDsl.g:3636:1: rule__Primitive__Group_6__4 : rule__Primitive__Group_6__4__Impl ;
    public final void rule__Primitive__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3640:1: ( rule__Primitive__Group_6__4__Impl )
            // InternalDsl.g:3641:2: rule__Primitive__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primitive__Group_6__4__Impl();

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
    // $ANTLR end "rule__Primitive__Group_6__4"


    // $ANTLR start "rule__Primitive__Group_6__4__Impl"
    // InternalDsl.g:3647:1: rule__Primitive__Group_6__4__Impl : ( ')' ) ;
    public final void rule__Primitive__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3651:1: ( ( ')' ) )
            // InternalDsl.g:3652:1: ( ')' )
            {
            // InternalDsl.g:3652:1: ( ')' )
            // InternalDsl.g:3653:2: ')'
            {
             before(grammarAccess.getPrimitiveAccess().getRightParenthesisKeyword_6_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPrimitiveAccess().getRightParenthesisKeyword_6_4()); 

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
    // $ANTLR end "rule__Primitive__Group_6__4__Impl"


    // $ANTLR start "rule__Primitive__Group_6_3__0"
    // InternalDsl.g:3663:1: rule__Primitive__Group_6_3__0 : rule__Primitive__Group_6_3__0__Impl rule__Primitive__Group_6_3__1 ;
    public final void rule__Primitive__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3667:1: ( rule__Primitive__Group_6_3__0__Impl rule__Primitive__Group_6_3__1 )
            // InternalDsl.g:3668:2: rule__Primitive__Group_6_3__0__Impl rule__Primitive__Group_6_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Primitive__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primitive__Group_6_3__1();

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
    // $ANTLR end "rule__Primitive__Group_6_3__0"


    // $ANTLR start "rule__Primitive__Group_6_3__0__Impl"
    // InternalDsl.g:3675:1: rule__Primitive__Group_6_3__0__Impl : ( ( rule__Primitive__ExpsAssignment_6_3_0 ) ) ;
    public final void rule__Primitive__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3679:1: ( ( ( rule__Primitive__ExpsAssignment_6_3_0 ) ) )
            // InternalDsl.g:3680:1: ( ( rule__Primitive__ExpsAssignment_6_3_0 ) )
            {
            // InternalDsl.g:3680:1: ( ( rule__Primitive__ExpsAssignment_6_3_0 ) )
            // InternalDsl.g:3681:2: ( rule__Primitive__ExpsAssignment_6_3_0 )
            {
             before(grammarAccess.getPrimitiveAccess().getExpsAssignment_6_3_0()); 
            // InternalDsl.g:3682:2: ( rule__Primitive__ExpsAssignment_6_3_0 )
            // InternalDsl.g:3682:3: rule__Primitive__ExpsAssignment_6_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Primitive__ExpsAssignment_6_3_0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveAccess().getExpsAssignment_6_3_0()); 

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
    // $ANTLR end "rule__Primitive__Group_6_3__0__Impl"


    // $ANTLR start "rule__Primitive__Group_6_3__1"
    // InternalDsl.g:3690:1: rule__Primitive__Group_6_3__1 : rule__Primitive__Group_6_3__1__Impl ;
    public final void rule__Primitive__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3694:1: ( rule__Primitive__Group_6_3__1__Impl )
            // InternalDsl.g:3695:2: rule__Primitive__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primitive__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__Primitive__Group_6_3__1"


    // $ANTLR start "rule__Primitive__Group_6_3__1__Impl"
    // InternalDsl.g:3701:1: rule__Primitive__Group_6_3__1__Impl : ( ( rule__Primitive__Group_6_3_1__0 )* ) ;
    public final void rule__Primitive__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3705:1: ( ( ( rule__Primitive__Group_6_3_1__0 )* ) )
            // InternalDsl.g:3706:1: ( ( rule__Primitive__Group_6_3_1__0 )* )
            {
            // InternalDsl.g:3706:1: ( ( rule__Primitive__Group_6_3_1__0 )* )
            // InternalDsl.g:3707:2: ( rule__Primitive__Group_6_3_1__0 )*
            {
             before(grammarAccess.getPrimitiveAccess().getGroup_6_3_1()); 
            // InternalDsl.g:3708:2: ( rule__Primitive__Group_6_3_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==33) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalDsl.g:3708:3: rule__Primitive__Group_6_3_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Primitive__Group_6_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getPrimitiveAccess().getGroup_6_3_1()); 

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
    // $ANTLR end "rule__Primitive__Group_6_3__1__Impl"


    // $ANTLR start "rule__Primitive__Group_6_3_1__0"
    // InternalDsl.g:3717:1: rule__Primitive__Group_6_3_1__0 : rule__Primitive__Group_6_3_1__0__Impl rule__Primitive__Group_6_3_1__1 ;
    public final void rule__Primitive__Group_6_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3721:1: ( rule__Primitive__Group_6_3_1__0__Impl rule__Primitive__Group_6_3_1__1 )
            // InternalDsl.g:3722:2: rule__Primitive__Group_6_3_1__0__Impl rule__Primitive__Group_6_3_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Primitive__Group_6_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primitive__Group_6_3_1__1();

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
    // $ANTLR end "rule__Primitive__Group_6_3_1__0"


    // $ANTLR start "rule__Primitive__Group_6_3_1__0__Impl"
    // InternalDsl.g:3729:1: rule__Primitive__Group_6_3_1__0__Impl : ( ',' ) ;
    public final void rule__Primitive__Group_6_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3733:1: ( ( ',' ) )
            // InternalDsl.g:3734:1: ( ',' )
            {
            // InternalDsl.g:3734:1: ( ',' )
            // InternalDsl.g:3735:2: ','
            {
             before(grammarAccess.getPrimitiveAccess().getCommaKeyword_6_3_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPrimitiveAccess().getCommaKeyword_6_3_1_0()); 

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
    // $ANTLR end "rule__Primitive__Group_6_3_1__0__Impl"


    // $ANTLR start "rule__Primitive__Group_6_3_1__1"
    // InternalDsl.g:3744:1: rule__Primitive__Group_6_3_1__1 : rule__Primitive__Group_6_3_1__1__Impl ;
    public final void rule__Primitive__Group_6_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3748:1: ( rule__Primitive__Group_6_3_1__1__Impl )
            // InternalDsl.g:3749:2: rule__Primitive__Group_6_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primitive__Group_6_3_1__1__Impl();

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
    // $ANTLR end "rule__Primitive__Group_6_3_1__1"


    // $ANTLR start "rule__Primitive__Group_6_3_1__1__Impl"
    // InternalDsl.g:3755:1: rule__Primitive__Group_6_3_1__1__Impl : ( ( rule__Primitive__ExpsAssignment_6_3_1_1 ) ) ;
    public final void rule__Primitive__Group_6_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3759:1: ( ( ( rule__Primitive__ExpsAssignment_6_3_1_1 ) ) )
            // InternalDsl.g:3760:1: ( ( rule__Primitive__ExpsAssignment_6_3_1_1 ) )
            {
            // InternalDsl.g:3760:1: ( ( rule__Primitive__ExpsAssignment_6_3_1_1 ) )
            // InternalDsl.g:3761:2: ( rule__Primitive__ExpsAssignment_6_3_1_1 )
            {
             before(grammarAccess.getPrimitiveAccess().getExpsAssignment_6_3_1_1()); 
            // InternalDsl.g:3762:2: ( rule__Primitive__ExpsAssignment_6_3_1_1 )
            // InternalDsl.g:3762:3: rule__Primitive__ExpsAssignment_6_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Primitive__ExpsAssignment_6_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveAccess().getExpsAssignment_6_3_1_1()); 

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
    // $ANTLR end "rule__Primitive__Group_6_3_1__1__Impl"


    // $ANTLR start "rule__Primitive__Group_7__0"
    // InternalDsl.g:3771:1: rule__Primitive__Group_7__0 : rule__Primitive__Group_7__0__Impl rule__Primitive__Group_7__1 ;
    public final void rule__Primitive__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3775:1: ( rule__Primitive__Group_7__0__Impl rule__Primitive__Group_7__1 )
            // InternalDsl.g:3776:2: rule__Primitive__Group_7__0__Impl rule__Primitive__Group_7__1
            {
            pushFollow(FOLLOW_20);
            rule__Primitive__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primitive__Group_7__1();

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
    // $ANTLR end "rule__Primitive__Group_7__0"


    // $ANTLR start "rule__Primitive__Group_7__0__Impl"
    // InternalDsl.g:3783:1: rule__Primitive__Group_7__0__Impl : ( () ) ;
    public final void rule__Primitive__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3787:1: ( ( () ) )
            // InternalDsl.g:3788:1: ( () )
            {
            // InternalDsl.g:3788:1: ( () )
            // InternalDsl.g:3789:2: ()
            {
             before(grammarAccess.getPrimitiveAccess().getParenthesisAction_7_0()); 
            // InternalDsl.g:3790:2: ()
            // InternalDsl.g:3790:3: 
            {
            }

             after(grammarAccess.getPrimitiveAccess().getParenthesisAction_7_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primitive__Group_7__0__Impl"


    // $ANTLR start "rule__Primitive__Group_7__1"
    // InternalDsl.g:3798:1: rule__Primitive__Group_7__1 : rule__Primitive__Group_7__1__Impl rule__Primitive__Group_7__2 ;
    public final void rule__Primitive__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3802:1: ( rule__Primitive__Group_7__1__Impl rule__Primitive__Group_7__2 )
            // InternalDsl.g:3803:2: rule__Primitive__Group_7__1__Impl rule__Primitive__Group_7__2
            {
            pushFollow(FOLLOW_20);
            rule__Primitive__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primitive__Group_7__2();

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
    // $ANTLR end "rule__Primitive__Group_7__1"


    // $ANTLR start "rule__Primitive__Group_7__1__Impl"
    // InternalDsl.g:3810:1: rule__Primitive__Group_7__1__Impl : ( '(' ) ;
    public final void rule__Primitive__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3814:1: ( ( '(' ) )
            // InternalDsl.g:3815:1: ( '(' )
            {
            // InternalDsl.g:3815:1: ( '(' )
            // InternalDsl.g:3816:2: '('
            {
             before(grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_7_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_7_1()); 

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
    // $ANTLR end "rule__Primitive__Group_7__1__Impl"


    // $ANTLR start "rule__Primitive__Group_7__2"
    // InternalDsl.g:3825:1: rule__Primitive__Group_7__2 : rule__Primitive__Group_7__2__Impl rule__Primitive__Group_7__3 ;
    public final void rule__Primitive__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3829:1: ( rule__Primitive__Group_7__2__Impl rule__Primitive__Group_7__3 )
            // InternalDsl.g:3830:2: rule__Primitive__Group_7__2__Impl rule__Primitive__Group_7__3
            {
            pushFollow(FOLLOW_39);
            rule__Primitive__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primitive__Group_7__3();

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
    // $ANTLR end "rule__Primitive__Group_7__2"


    // $ANTLR start "rule__Primitive__Group_7__2__Impl"
    // InternalDsl.g:3837:1: rule__Primitive__Group_7__2__Impl : ( ( rule__Primitive__ExpAssignment_7_2 ) ) ;
    public final void rule__Primitive__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3841:1: ( ( ( rule__Primitive__ExpAssignment_7_2 ) ) )
            // InternalDsl.g:3842:1: ( ( rule__Primitive__ExpAssignment_7_2 ) )
            {
            // InternalDsl.g:3842:1: ( ( rule__Primitive__ExpAssignment_7_2 ) )
            // InternalDsl.g:3843:2: ( rule__Primitive__ExpAssignment_7_2 )
            {
             before(grammarAccess.getPrimitiveAccess().getExpAssignment_7_2()); 
            // InternalDsl.g:3844:2: ( rule__Primitive__ExpAssignment_7_2 )
            // InternalDsl.g:3844:3: rule__Primitive__ExpAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Primitive__ExpAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveAccess().getExpAssignment_7_2()); 

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
    // $ANTLR end "rule__Primitive__Group_7__2__Impl"


    // $ANTLR start "rule__Primitive__Group_7__3"
    // InternalDsl.g:3852:1: rule__Primitive__Group_7__3 : rule__Primitive__Group_7__3__Impl ;
    public final void rule__Primitive__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3856:1: ( rule__Primitive__Group_7__3__Impl )
            // InternalDsl.g:3857:2: rule__Primitive__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primitive__Group_7__3__Impl();

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
    // $ANTLR end "rule__Primitive__Group_7__3"


    // $ANTLR start "rule__Primitive__Group_7__3__Impl"
    // InternalDsl.g:3863:1: rule__Primitive__Group_7__3__Impl : ( ')' ) ;
    public final void rule__Primitive__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3867:1: ( ( ')' ) )
            // InternalDsl.g:3868:1: ( ')' )
            {
            // InternalDsl.g:3868:1: ( ')' )
            // InternalDsl.g:3869:2: ')'
            {
             before(grammarAccess.getPrimitiveAccess().getRightParenthesisKeyword_7_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPrimitiveAccess().getRightParenthesisKeyword_7_3()); 

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
    // $ANTLR end "rule__Primitive__Group_7__3__Impl"


    // $ANTLR start "rule__UI23__NameAssignment_1"
    // InternalDsl.g:3879:1: rule__UI23__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__UI23__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3883:1: ( ( RULE_ID ) )
            // InternalDsl.g:3884:2: ( RULE_ID )
            {
            // InternalDsl.g:3884:2: ( RULE_ID )
            // InternalDsl.g:3885:3: RULE_ID
            {
             before(grammarAccess.getUI23Access().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUI23Access().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__UI23__NameAssignment_1"


    // $ANTLR start "rule__UI23__FunctionsAssignment_2"
    // InternalDsl.g:3894:1: rule__UI23__FunctionsAssignment_2 : ( ruleFunction ) ;
    public final void rule__UI23__FunctionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3898:1: ( ( ruleFunction ) )
            // InternalDsl.g:3899:2: ( ruleFunction )
            {
            // InternalDsl.g:3899:2: ( ruleFunction )
            // InternalDsl.g:3900:3: ruleFunction
            {
             before(grammarAccess.getUI23Access().getFunctionsFunctionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getUI23Access().getFunctionsFunctionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__UI23__FunctionsAssignment_2"


    // $ANTLR start "rule__UI23__FormsAssignment_3"
    // InternalDsl.g:3909:1: rule__UI23__FormsAssignment_3 : ( ruleForm ) ;
    public final void rule__UI23__FormsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3913:1: ( ( ruleForm ) )
            // InternalDsl.g:3914:2: ( ruleForm )
            {
            // InternalDsl.g:3914:2: ( ruleForm )
            // InternalDsl.g:3915:3: ruleForm
            {
             before(grammarAccess.getUI23Access().getFormsFormParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleForm();

            state._fsp--;

             after(grammarAccess.getUI23Access().getFormsFormParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__UI23__FormsAssignment_3"


    // $ANTLR start "rule__Function__NameAssignment_1"
    // InternalDsl.g:3924:1: rule__Function__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Function__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3928:1: ( ( RULE_ID ) )
            // InternalDsl.g:3929:2: ( RULE_ID )
            {
            // InternalDsl.g:3929:2: ( RULE_ID )
            // InternalDsl.g:3930:3: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Function__NameAssignment_1"


    // $ANTLR start "rule__Function__TypesAssignment_3_0"
    // InternalDsl.g:3939:1: rule__Function__TypesAssignment_3_0 : ( ruleType ) ;
    public final void rule__Function__TypesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3943:1: ( ( ruleType ) )
            // InternalDsl.g:3944:2: ( ruleType )
            {
            // InternalDsl.g:3944:2: ( ruleType )
            // InternalDsl.g:3945:3: ruleType
            {
             before(grammarAccess.getFunctionAccess().getTypesTypeParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getTypesTypeParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__Function__TypesAssignment_3_0"


    // $ANTLR start "rule__Function__TypesAssignment_3_1_1"
    // InternalDsl.g:3954:1: rule__Function__TypesAssignment_3_1_1 : ( ruleType ) ;
    public final void rule__Function__TypesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3958:1: ( ( ruleType ) )
            // InternalDsl.g:3959:2: ( ruleType )
            {
            // InternalDsl.g:3959:2: ( ruleType )
            // InternalDsl.g:3960:3: ruleType
            {
             before(grammarAccess.getFunctionAccess().getTypesTypeParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getTypesTypeParserRuleCall_3_1_1_0()); 

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
    // $ANTLR end "rule__Function__TypesAssignment_3_1_1"


    // $ANTLR start "rule__Function__ReturnTypeAssignment_6"
    // InternalDsl.g:3969:1: rule__Function__ReturnTypeAssignment_6 : ( ruleType ) ;
    public final void rule__Function__ReturnTypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3973:1: ( ( ruleType ) )
            // InternalDsl.g:3974:2: ( ruleType )
            {
            // InternalDsl.g:3974:2: ( ruleType )
            // InternalDsl.g:3975:3: ruleType
            {
             before(grammarAccess.getFunctionAccess().getReturnTypeTypeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getReturnTypeTypeParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Function__ReturnTypeAssignment_6"


    // $ANTLR start "rule__Form__NameAssignment_1"
    // InternalDsl.g:3984:1: rule__Form__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Form__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:3988:1: ( ( RULE_ID ) )
            // InternalDsl.g:3989:2: ( RULE_ID )
            {
            // InternalDsl.g:3989:2: ( RULE_ID )
            // InternalDsl.g:3990:3: RULE_ID
            {
             before(grammarAccess.getFormAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFormAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Form__NameAssignment_1"


    // $ANTLR start "rule__Form__ParametersAssignment_2_1_0"
    // InternalDsl.g:3999:1: rule__Form__ParametersAssignment_2_1_0 : ( ruleParameter ) ;
    public final void rule__Form__ParametersAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4003:1: ( ( ruleParameter ) )
            // InternalDsl.g:4004:2: ( ruleParameter )
            {
            // InternalDsl.g:4004:2: ( ruleParameter )
            // InternalDsl.g:4005:3: ruleParameter
            {
             before(grammarAccess.getFormAccess().getParametersParameterParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getFormAccess().getParametersParameterParserRuleCall_2_1_0_0()); 

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
    // $ANTLR end "rule__Form__ParametersAssignment_2_1_0"


    // $ANTLR start "rule__Form__ParametersAssignment_2_1_1_1"
    // InternalDsl.g:4014:1: rule__Form__ParametersAssignment_2_1_1_1 : ( ruleParameter ) ;
    public final void rule__Form__ParametersAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4018:1: ( ( ruleParameter ) )
            // InternalDsl.g:4019:2: ( ruleParameter )
            {
            // InternalDsl.g:4019:2: ( ruleParameter )
            // InternalDsl.g:4020:3: ruleParameter
            {
             before(grammarAccess.getFormAccess().getParametersParameterParserRuleCall_2_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getFormAccess().getParametersParameterParserRuleCall_2_1_1_1_0()); 

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
    // $ANTLR end "rule__Form__ParametersAssignment_2_1_1_1"


    // $ANTLR start "rule__Form__LayoutAssignment_4"
    // InternalDsl.g:4029:1: rule__Form__LayoutAssignment_4 : ( ruleLayout ) ;
    public final void rule__Form__LayoutAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4033:1: ( ( ruleLayout ) )
            // InternalDsl.g:4034:2: ( ruleLayout )
            {
            // InternalDsl.g:4034:2: ( ruleLayout )
            // InternalDsl.g:4035:3: ruleLayout
            {
             before(grammarAccess.getFormAccess().getLayoutLayoutParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLayout();

            state._fsp--;

             after(grammarAccess.getFormAccess().getLayoutLayoutParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Form__LayoutAssignment_4"


    // $ANTLR start "rule__Layout__AxisAssignment_1"
    // InternalDsl.g:4044:1: rule__Layout__AxisAssignment_1 : ( ( rule__Layout__AxisAlternatives_1_0 ) ) ;
    public final void rule__Layout__AxisAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4048:1: ( ( ( rule__Layout__AxisAlternatives_1_0 ) ) )
            // InternalDsl.g:4049:2: ( ( rule__Layout__AxisAlternatives_1_0 ) )
            {
            // InternalDsl.g:4049:2: ( ( rule__Layout__AxisAlternatives_1_0 ) )
            // InternalDsl.g:4050:3: ( rule__Layout__AxisAlternatives_1_0 )
            {
             before(grammarAccess.getLayoutAccess().getAxisAlternatives_1_0()); 
            // InternalDsl.g:4051:3: ( rule__Layout__AxisAlternatives_1_0 )
            // InternalDsl.g:4051:4: rule__Layout__AxisAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Layout__AxisAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getLayoutAccess().getAxisAlternatives_1_0()); 

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
    // $ANTLR end "rule__Layout__AxisAssignment_1"


    // $ANTLR start "rule__Layout__ComponentsAssignment_3"
    // InternalDsl.g:4059:1: rule__Layout__ComponentsAssignment_3 : ( ruleComponent ) ;
    public final void rule__Layout__ComponentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4063:1: ( ( ruleComponent ) )
            // InternalDsl.g:4064:2: ( ruleComponent )
            {
            // InternalDsl.g:4064:2: ( ruleComponent )
            // InternalDsl.g:4065:3: ruleComponent
            {
             before(grammarAccess.getLayoutAccess().getComponentsComponentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getLayoutAccess().getComponentsComponentParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Layout__ComponentsAssignment_3"


    // $ANTLR start "rule__Label__ExpAssignment_2"
    // InternalDsl.g:4074:1: rule__Label__ExpAssignment_2 : ( ruleExp ) ;
    public final void rule__Label__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4078:1: ( ( ruleExp ) )
            // InternalDsl.g:4079:2: ( ruleExp )
            {
            // InternalDsl.g:4079:2: ( ruleExp )
            // InternalDsl.g:4080:3: ruleExp
            {
             before(grammarAccess.getLabelAccess().getExpExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getLabelAccess().getExpExpParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Label__ExpAssignment_2"


    // $ANTLR start "rule__InputText__NameAssignment_1"
    // InternalDsl.g:4089:1: rule__InputText__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InputText__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4093:1: ( ( RULE_ID ) )
            // InternalDsl.g:4094:2: ( RULE_ID )
            {
            // InternalDsl.g:4094:2: ( RULE_ID )
            // InternalDsl.g:4095:3: RULE_ID
            {
             before(grammarAccess.getInputTextAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInputTextAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__InputText__NameAssignment_1"


    // $ANTLR start "rule__InputText__ExpAssignment_3"
    // InternalDsl.g:4104:1: rule__InputText__ExpAssignment_3 : ( ruleExp ) ;
    public final void rule__InputText__ExpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4108:1: ( ( ruleExp ) )
            // InternalDsl.g:4109:2: ( ruleExp )
            {
            // InternalDsl.g:4109:2: ( ruleExp )
            // InternalDsl.g:4110:3: ruleExp
            {
             before(grammarAccess.getInputTextAccess().getExpExpParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getInputTextAccess().getExpExpParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__InputText__ExpAssignment_3"


    // $ANTLR start "rule__Button__ValidateAssignment_1"
    // InternalDsl.g:4119:1: rule__Button__ValidateAssignment_1 : ( ( '*' ) ) ;
    public final void rule__Button__ValidateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4123:1: ( ( ( '*' ) ) )
            // InternalDsl.g:4124:2: ( ( '*' ) )
            {
            // InternalDsl.g:4124:2: ( ( '*' ) )
            // InternalDsl.g:4125:3: ( '*' )
            {
             before(grammarAccess.getButtonAccess().getValidateAsteriskKeyword_1_0()); 
            // InternalDsl.g:4126:3: ( '*' )
            // InternalDsl.g:4127:4: '*'
            {
             before(grammarAccess.getButtonAccess().getValidateAsteriskKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getValidateAsteriskKeyword_1_0()); 

            }

             after(grammarAccess.getButtonAccess().getValidateAsteriskKeyword_1_0()); 

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
    // $ANTLR end "rule__Button__ValidateAssignment_1"


    // $ANTLR start "rule__Button__NameAssignment_2"
    // InternalDsl.g:4138:1: rule__Button__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Button__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4142:1: ( ( RULE_ID ) )
            // InternalDsl.g:4143:2: ( RULE_ID )
            {
            // InternalDsl.g:4143:2: ( RULE_ID )
            // InternalDsl.g:4144:3: RULE_ID
            {
             before(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Button__NameAssignment_2"


    // $ANTLR start "rule__Button__ExpAssignment_4"
    // InternalDsl.g:4153:1: rule__Button__ExpAssignment_4 : ( ruleExp ) ;
    public final void rule__Button__ExpAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4157:1: ( ( ruleExp ) )
            // InternalDsl.g:4158:2: ( ruleExp )
            {
            // InternalDsl.g:4158:2: ( ruleExp )
            // InternalDsl.g:4159:3: ruleExp
            {
             before(grammarAccess.getButtonAccess().getExpExpParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getButtonAccess().getExpExpParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Button__ExpAssignment_4"


    // $ANTLR start "rule__FormUse__FormAssignment_0"
    // InternalDsl.g:4168:1: rule__FormUse__FormAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FormUse__FormAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4172:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:4173:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:4173:2: ( ( RULE_ID ) )
            // InternalDsl.g:4174:3: ( RULE_ID )
            {
             before(grammarAccess.getFormUseAccess().getFormFormCrossReference_0_0()); 
            // InternalDsl.g:4175:3: ( RULE_ID )
            // InternalDsl.g:4176:4: RULE_ID
            {
             before(grammarAccess.getFormUseAccess().getFormFormIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFormUseAccess().getFormFormIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getFormUseAccess().getFormFormCrossReference_0_0()); 

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
    // $ANTLR end "rule__FormUse__FormAssignment_0"


    // $ANTLR start "rule__FormUse__ExpsAssignment_2_0"
    // InternalDsl.g:4187:1: rule__FormUse__ExpsAssignment_2_0 : ( ruleExp ) ;
    public final void rule__FormUse__ExpsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4191:1: ( ( ruleExp ) )
            // InternalDsl.g:4192:2: ( ruleExp )
            {
            // InternalDsl.g:4192:2: ( ruleExp )
            // InternalDsl.g:4193:3: ruleExp
            {
             before(grammarAccess.getFormUseAccess().getExpsExpParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getFormUseAccess().getExpsExpParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__FormUse__ExpsAssignment_2_0"


    // $ANTLR start "rule__FormUse__ExpsAssignment_2_1_1"
    // InternalDsl.g:4202:1: rule__FormUse__ExpsAssignment_2_1_1 : ( ruleExp ) ;
    public final void rule__FormUse__ExpsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4206:1: ( ( ruleExp ) )
            // InternalDsl.g:4207:2: ( ruleExp )
            {
            // InternalDsl.g:4207:2: ( ruleExp )
            // InternalDsl.g:4208:3: ruleExp
            {
             before(grammarAccess.getFormUseAccess().getExpsExpParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getFormUseAccess().getExpsExpParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__FormUse__ExpsAssignment_2_1_1"


    // $ANTLR start "rule__Parameter__NameAssignment_0"
    // InternalDsl.g:4217:1: rule__Parameter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4221:1: ( ( RULE_ID ) )
            // InternalDsl.g:4222:2: ( RULE_ID )
            {
            // InternalDsl.g:4222:2: ( RULE_ID )
            // InternalDsl.g:4223:3: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Parameter__NameAssignment_0"


    // $ANTLR start "rule__Parameter__TypeAssignment_2"
    // InternalDsl.g:4232:1: rule__Parameter__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Parameter__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4236:1: ( ( ruleType ) )
            // InternalDsl.g:4237:2: ( ruleType )
            {
            // InternalDsl.g:4237:2: ( ruleType )
            // InternalDsl.g:4238:3: ruleType
            {
             before(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Parameter__TypeAssignment_2"


    // $ANTLR start "rule__Boolean__OpAssignment_1_1"
    // InternalDsl.g:4247:1: rule__Boolean__OpAssignment_1_1 : ( ( rule__Boolean__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Boolean__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4251:1: ( ( ( rule__Boolean__OpAlternatives_1_1_0 ) ) )
            // InternalDsl.g:4252:2: ( ( rule__Boolean__OpAlternatives_1_1_0 ) )
            {
            // InternalDsl.g:4252:2: ( ( rule__Boolean__OpAlternatives_1_1_0 ) )
            // InternalDsl.g:4253:3: ( rule__Boolean__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getBooleanAccess().getOpAlternatives_1_1_0()); 
            // InternalDsl.g:4254:3: ( rule__Boolean__OpAlternatives_1_1_0 )
            // InternalDsl.g:4254:4: rule__Boolean__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getOpAlternatives_1_1_0()); 

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
    // $ANTLR end "rule__Boolean__OpAssignment_1_1"


    // $ANTLR start "rule__Boolean__RightAssignment_1_2"
    // InternalDsl.g:4262:1: rule__Boolean__RightAssignment_1_2 : ( ruleEqual ) ;
    public final void rule__Boolean__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4266:1: ( ( ruleEqual ) )
            // InternalDsl.g:4267:2: ( ruleEqual )
            {
            // InternalDsl.g:4267:2: ( ruleEqual )
            // InternalDsl.g:4268:3: ruleEqual
            {
             before(grammarAccess.getBooleanAccess().getRightEqualParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEqual();

            state._fsp--;

             after(grammarAccess.getBooleanAccess().getRightEqualParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Boolean__RightAssignment_1_2"


    // $ANTLR start "rule__Equal__OpAssignment_1_1"
    // InternalDsl.g:4277:1: rule__Equal__OpAssignment_1_1 : ( ( rule__Equal__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Equal__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4281:1: ( ( ( rule__Equal__OpAlternatives_1_1_0 ) ) )
            // InternalDsl.g:4282:2: ( ( rule__Equal__OpAlternatives_1_1_0 ) )
            {
            // InternalDsl.g:4282:2: ( ( rule__Equal__OpAlternatives_1_1_0 ) )
            // InternalDsl.g:4283:3: ( rule__Equal__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getEqualAccess().getOpAlternatives_1_1_0()); 
            // InternalDsl.g:4284:3: ( rule__Equal__OpAlternatives_1_1_0 )
            // InternalDsl.g:4284:4: rule__Equal__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Equal__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEqualAccess().getOpAlternatives_1_1_0()); 

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
    // $ANTLR end "rule__Equal__OpAssignment_1_1"


    // $ANTLR start "rule__Equal__RightAssignment_1_2"
    // InternalDsl.g:4292:1: rule__Equal__RightAssignment_1_2 : ( ruleCompare ) ;
    public final void rule__Equal__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4296:1: ( ( ruleCompare ) )
            // InternalDsl.g:4297:2: ( ruleCompare )
            {
            // InternalDsl.g:4297:2: ( ruleCompare )
            // InternalDsl.g:4298:3: ruleCompare
            {
             before(grammarAccess.getEqualAccess().getRightCompareParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCompare();

            state._fsp--;

             after(grammarAccess.getEqualAccess().getRightCompareParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Equal__RightAssignment_1_2"


    // $ANTLR start "rule__Compare__OpAssignment_1_1"
    // InternalDsl.g:4307:1: rule__Compare__OpAssignment_1_1 : ( ( rule__Compare__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Compare__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4311:1: ( ( ( rule__Compare__OpAlternatives_1_1_0 ) ) )
            // InternalDsl.g:4312:2: ( ( rule__Compare__OpAlternatives_1_1_0 ) )
            {
            // InternalDsl.g:4312:2: ( ( rule__Compare__OpAlternatives_1_1_0 ) )
            // InternalDsl.g:4313:3: ( rule__Compare__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getCompareAccess().getOpAlternatives_1_1_0()); 
            // InternalDsl.g:4314:3: ( rule__Compare__OpAlternatives_1_1_0 )
            // InternalDsl.g:4314:4: rule__Compare__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Compare__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCompareAccess().getOpAlternatives_1_1_0()); 

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
    // $ANTLR end "rule__Compare__OpAssignment_1_1"


    // $ANTLR start "rule__Compare__RightAssignment_1_2"
    // InternalDsl.g:4322:1: rule__Compare__RightAssignment_1_2 : ( ruleConcat ) ;
    public final void rule__Compare__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4326:1: ( ( ruleConcat ) )
            // InternalDsl.g:4327:2: ( ruleConcat )
            {
            // InternalDsl.g:4327:2: ( ruleConcat )
            // InternalDsl.g:4328:3: ruleConcat
            {
             before(grammarAccess.getCompareAccess().getRightConcatParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConcat();

            state._fsp--;

             after(grammarAccess.getCompareAccess().getRightConcatParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Compare__RightAssignment_1_2"


    // $ANTLR start "rule__Concat__RightAssignment_1_2"
    // InternalDsl.g:4337:1: rule__Concat__RightAssignment_1_2 : ( rulePlusMinus ) ;
    public final void rule__Concat__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4341:1: ( ( rulePlusMinus ) )
            // InternalDsl.g:4342:2: ( rulePlusMinus )
            {
            // InternalDsl.g:4342:2: ( rulePlusMinus )
            // InternalDsl.g:4343:3: rulePlusMinus
            {
             before(grammarAccess.getConcatAccess().getRightPlusMinusParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePlusMinus();

            state._fsp--;

             after(grammarAccess.getConcatAccess().getRightPlusMinusParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Concat__RightAssignment_1_2"


    // $ANTLR start "rule__PlusMinus__OpAssignment_1_1"
    // InternalDsl.g:4352:1: rule__PlusMinus__OpAssignment_1_1 : ( ( rule__PlusMinus__OpAlternatives_1_1_0 ) ) ;
    public final void rule__PlusMinus__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4356:1: ( ( ( rule__PlusMinus__OpAlternatives_1_1_0 ) ) )
            // InternalDsl.g:4357:2: ( ( rule__PlusMinus__OpAlternatives_1_1_0 ) )
            {
            // InternalDsl.g:4357:2: ( ( rule__PlusMinus__OpAlternatives_1_1_0 ) )
            // InternalDsl.g:4358:3: ( rule__PlusMinus__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getPlusMinusAccess().getOpAlternatives_1_1_0()); 
            // InternalDsl.g:4359:3: ( rule__PlusMinus__OpAlternatives_1_1_0 )
            // InternalDsl.g:4359:4: rule__PlusMinus__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__PlusMinus__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPlusMinusAccess().getOpAlternatives_1_1_0()); 

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
    // $ANTLR end "rule__PlusMinus__OpAssignment_1_1"


    // $ANTLR start "rule__PlusMinus__RightAssignment_1_2"
    // InternalDsl.g:4367:1: rule__PlusMinus__RightAssignment_1_2 : ( ruleMultDiv ) ;
    public final void rule__PlusMinus__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4371:1: ( ( ruleMultDiv ) )
            // InternalDsl.g:4372:2: ( ruleMultDiv )
            {
            // InternalDsl.g:4372:2: ( ruleMultDiv )
            // InternalDsl.g:4373:3: ruleMultDiv
            {
             before(grammarAccess.getPlusMinusAccess().getRightMultDivParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultDiv();

            state._fsp--;

             after(grammarAccess.getPlusMinusAccess().getRightMultDivParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__PlusMinus__RightAssignment_1_2"


    // $ANTLR start "rule__MultDiv__OpAssignment_1_1"
    // InternalDsl.g:4382:1: rule__MultDiv__OpAssignment_1_1 : ( ( rule__MultDiv__OpAlternatives_1_1_0 ) ) ;
    public final void rule__MultDiv__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4386:1: ( ( ( rule__MultDiv__OpAlternatives_1_1_0 ) ) )
            // InternalDsl.g:4387:2: ( ( rule__MultDiv__OpAlternatives_1_1_0 ) )
            {
            // InternalDsl.g:4387:2: ( ( rule__MultDiv__OpAlternatives_1_1_0 ) )
            // InternalDsl.g:4388:3: ( rule__MultDiv__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultDivAccess().getOpAlternatives_1_1_0()); 
            // InternalDsl.g:4389:3: ( rule__MultDiv__OpAlternatives_1_1_0 )
            // InternalDsl.g:4389:4: rule__MultDiv__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MultDiv__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultDivAccess().getOpAlternatives_1_1_0()); 

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
    // $ANTLR end "rule__MultDiv__OpAssignment_1_1"


    // $ANTLR start "rule__MultDiv__RightAssignment_1_2"
    // InternalDsl.g:4397:1: rule__MultDiv__RightAssignment_1_2 : ( rulePrimitive ) ;
    public final void rule__MultDiv__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4401:1: ( ( rulePrimitive ) )
            // InternalDsl.g:4402:2: ( rulePrimitive )
            {
            // InternalDsl.g:4402:2: ( rulePrimitive )
            // InternalDsl.g:4403:3: rulePrimitive
            {
             before(grammarAccess.getMultDivAccess().getRightPrimitiveParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getMultDivAccess().getRightPrimitiveParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__MultDiv__RightAssignment_1_2"


    // $ANTLR start "rule__Primitive__ValueAssignment_0_1"
    // InternalDsl.g:4412:1: rule__Primitive__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Primitive__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4416:1: ( ( RULE_INT ) )
            // InternalDsl.g:4417:2: ( RULE_INT )
            {
            // InternalDsl.g:4417:2: ( RULE_INT )
            // InternalDsl.g:4418:3: RULE_INT
            {
             before(grammarAccess.getPrimitiveAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPrimitiveAccess().getValueINTTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Primitive__ValueAssignment_0_1"


    // $ANTLR start "rule__Primitive__ValueAssignment_1_1"
    // InternalDsl.g:4427:1: rule__Primitive__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Primitive__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4431:1: ( ( RULE_STRING ) )
            // InternalDsl.g:4432:2: ( RULE_STRING )
            {
            // InternalDsl.g:4432:2: ( RULE_STRING )
            // InternalDsl.g:4433:3: RULE_STRING
            {
             before(grammarAccess.getPrimitiveAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPrimitiveAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Primitive__ValueAssignment_1_1"


    // $ANTLR start "rule__Primitive__ExpAssignment_2_2"
    // InternalDsl.g:4442:1: rule__Primitive__ExpAssignment_2_2 : ( rulePrimitive ) ;
    public final void rule__Primitive__ExpAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4446:1: ( ( rulePrimitive ) )
            // InternalDsl.g:4447:2: ( rulePrimitive )
            {
            // InternalDsl.g:4447:2: ( rulePrimitive )
            // InternalDsl.g:4448:3: rulePrimitive
            {
             before(grammarAccess.getPrimitiveAccess().getExpPrimitiveParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getPrimitiveAccess().getExpPrimitiveParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__Primitive__ExpAssignment_2_2"


    // $ANTLR start "rule__Primitive__ExpAssignment_3_2"
    // InternalDsl.g:4457:1: rule__Primitive__ExpAssignment_3_2 : ( rulePrimitive ) ;
    public final void rule__Primitive__ExpAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4461:1: ( ( rulePrimitive ) )
            // InternalDsl.g:4462:2: ( rulePrimitive )
            {
            // InternalDsl.g:4462:2: ( rulePrimitive )
            // InternalDsl.g:4463:3: rulePrimitive
            {
             before(grammarAccess.getPrimitiveAccess().getExpPrimitiveParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitive();

            state._fsp--;

             after(grammarAccess.getPrimitiveAccess().getExpPrimitiveParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Primitive__ExpAssignment_3_2"


    // $ANTLR start "rule__Primitive__TypeAssignment_4_1"
    // InternalDsl.g:4472:1: rule__Primitive__TypeAssignment_4_1 : ( ruleType ) ;
    public final void rule__Primitive__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4476:1: ( ( ruleType ) )
            // InternalDsl.g:4477:2: ( ruleType )
            {
            // InternalDsl.g:4477:2: ( ruleType )
            // InternalDsl.g:4478:3: ruleType
            {
             before(grammarAccess.getPrimitiveAccess().getTypeTypeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPrimitiveAccess().getTypeTypeParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Primitive__TypeAssignment_4_1"


    // $ANTLR start "rule__Primitive__RefAssignment_5_1"
    // InternalDsl.g:4487:1: rule__Primitive__RefAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Primitive__RefAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4491:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:4492:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:4492:2: ( ( RULE_ID ) )
            // InternalDsl.g:4493:3: ( RULE_ID )
            {
             before(grammarAccess.getPrimitiveAccess().getRefCrossRefCrossReference_5_1_0()); 
            // InternalDsl.g:4494:3: ( RULE_ID )
            // InternalDsl.g:4495:4: RULE_ID
            {
             before(grammarAccess.getPrimitiveAccess().getRefCrossRefIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimitiveAccess().getRefCrossRefIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getPrimitiveAccess().getRefCrossRefCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__Primitive__RefAssignment_5_1"


    // $ANTLR start "rule__Primitive__RefAssignment_6_1"
    // InternalDsl.g:4506:1: rule__Primitive__RefAssignment_6_1 : ( ( RULE_ID ) ) ;
    public final void rule__Primitive__RefAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4510:1: ( ( ( RULE_ID ) ) )
            // InternalDsl.g:4511:2: ( ( RULE_ID ) )
            {
            // InternalDsl.g:4511:2: ( ( RULE_ID ) )
            // InternalDsl.g:4512:3: ( RULE_ID )
            {
             before(grammarAccess.getPrimitiveAccess().getRefFunctionCrossReference_6_1_0()); 
            // InternalDsl.g:4513:3: ( RULE_ID )
            // InternalDsl.g:4514:4: RULE_ID
            {
             before(grammarAccess.getPrimitiveAccess().getRefFunctionIDTerminalRuleCall_6_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimitiveAccess().getRefFunctionIDTerminalRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getPrimitiveAccess().getRefFunctionCrossReference_6_1_0()); 

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
    // $ANTLR end "rule__Primitive__RefAssignment_6_1"


    // $ANTLR start "rule__Primitive__ExpsAssignment_6_3_0"
    // InternalDsl.g:4525:1: rule__Primitive__ExpsAssignment_6_3_0 : ( ruleExp ) ;
    public final void rule__Primitive__ExpsAssignment_6_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4529:1: ( ( ruleExp ) )
            // InternalDsl.g:4530:2: ( ruleExp )
            {
            // InternalDsl.g:4530:2: ( ruleExp )
            // InternalDsl.g:4531:3: ruleExp
            {
             before(grammarAccess.getPrimitiveAccess().getExpsExpParserRuleCall_6_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getPrimitiveAccess().getExpsExpParserRuleCall_6_3_0_0()); 

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
    // $ANTLR end "rule__Primitive__ExpsAssignment_6_3_0"


    // $ANTLR start "rule__Primitive__ExpsAssignment_6_3_1_1"
    // InternalDsl.g:4540:1: rule__Primitive__ExpsAssignment_6_3_1_1 : ( ruleExp ) ;
    public final void rule__Primitive__ExpsAssignment_6_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4544:1: ( ( ruleExp ) )
            // InternalDsl.g:4545:2: ( ruleExp )
            {
            // InternalDsl.g:4545:2: ( ruleExp )
            // InternalDsl.g:4546:3: ruleExp
            {
             before(grammarAccess.getPrimitiveAccess().getExpsExpParserRuleCall_6_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getPrimitiveAccess().getExpsExpParserRuleCall_6_3_1_1_0()); 

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
    // $ANTLR end "rule__Primitive__ExpsAssignment_6_3_1_1"


    // $ANTLR start "rule__Primitive__ExpAssignment_7_2"
    // InternalDsl.g:4555:1: rule__Primitive__ExpAssignment_7_2 : ( ruleExp ) ;
    public final void rule__Primitive__ExpAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDsl.g:4559:1: ( ( ruleExp ) )
            // InternalDsl.g:4560:2: ( ruleExp )
            {
            // InternalDsl.g:4560:2: ( ruleExp )
            // InternalDsl.g:4561:3: ruleExp
            {
             before(grammarAccess.getPrimitiveAccess().getExpExpParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getPrimitiveAccess().getExpExpParserRuleCall_7_2_0()); 

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
    // $ANTLR end "rule__Primitive__ExpAssignment_7_2"

    // Delegated rules


    protected DFA10 dfa10 = new DFA10(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\6\uffff\1\10\3\uffff";
    static final String dfa_3s = "\1\4\5\uffff\1\4\3\uffff";
    static final String dfa_4s = "\1\52\5\uffff\1\50\3\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\10\1\6\1\7";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\6\1\1\1\2\6\uffff\3\5\16\uffff\1\7\12\uffff\1\3\1\4",
            "",
            "",
            "",
            "",
            "",
            "\1\10\6\uffff\2\10\3\uffff\14\10\2\uffff\1\11\1\10\1\uffff\1\10\2\uffff\5\10",
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

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "771:1: rule__Primitive__Alternatives : ( ( ( rule__Primitive__Group_0__0 ) ) | ( ( rule__Primitive__Group_1__0 ) ) | ( ( rule__Primitive__Group_2__0 ) ) | ( ( rule__Primitive__Group_3__0 ) ) | ( ( rule__Primitive__Group_4__0 ) ) | ( ( rule__Primitive__Group_5__0 ) ) | ( ( rule__Primitive__Group_6__0 ) ) | ( ( rule__Primitive__Group_7__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000420000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000008000E000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000840000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000F000001810L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000E000001812L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000006004000E070L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000600C000E070L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000F00002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000080000000L});

}