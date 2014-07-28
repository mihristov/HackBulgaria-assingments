import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import syntaxhighlight.SyntaxHighlighter;
import syntaxhighlighter.SyntaxHighlighterParser;
import syntaxhighlighter.brush.BrushCss;
import syntaxhighlighter.brush.BrushJava;
import syntaxhighlighter.theme.ThemeRDark;

import com.nitido.utils.toaster.Example;

public class QuickCodeInspector {
    public static void main(final String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                // the SyntaxHighlighter parser
                final SyntaxHighlighterParser parser = new SyntaxHighlighterParser(new BrushJava());
                // turn HTML script on
                parser.setHtmlScript(true);
                // set HTML Script brushes
                parser.setHTMLScriptBrushes(Arrays.asList(new BrushCss(), new BrushJava()));

                // initialize the highlighter and use RDark theme
                final SyntaxHighlighter highlighter = new SyntaxHighlighter(parser, new ThemeRDark());
                // set the line number count from 10 instead of 1
                highlighter.setFirstLine(10);
                // set to highlight line 13, 27, 28, 38, 42, 43 and 53
                highlighter.setHighlightedLineList(Arrays.asList(13, 27, 28, 38, 42, 43, 53));
                try {
                    highlighter.setContent(new File(args[0]));
                } catch (final IOException ex) {
                    Logger.getLogger(Example.class.getName()).log(Level.SEVERE, null, ex);
                }

                final JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setContentPane(highlighter);
                frame.setLocationByPlatform(true);
                frame.pack();
                frame.setVisible(true);
            }
        });

    }
}
