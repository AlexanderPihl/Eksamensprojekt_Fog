package PresentationLayer;

import FunctionLayer.LoginSampleException;

import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

abstract class Command {

    private static HashMap<String, Command> commands;

    private static void initCommands() {
        commands = new HashMap<>();
        commands.put( "login", new Login() );
        commands.put( "register", new Register() );
        commands.put( "carportCalcPage", new CarportCalcPage() );
        commands.put( "redirect", new Redirect() );
        commands.put( "drawing", new Drawing() );
        commands.put( "drawingFront", new DrawingFront() );
        commands.put( "carportCustomize", new CarportCustomize() );
        commands.put( "drawingSideways", new DrawingSideways() );
        commands.put( "drawingSidewaysBlueprint", new DrawingSidewaysBlueprint() );
        commands.put("midlertidigTest", new midlertidigTest());
        commands.put( "rejectQuote", new RejectQuote() );
        commands.put( "quoteView", new QuoteView() );
        commands.put( "updateQuoteUser", new UpdateQuoteUser() );
        commands.put( "updateQuoteOrder", new UpdateQuoteOrder() );
        commands.put( "adminRejectQuote", new AdminRejectQuote() );
        commands.put( "returnAdmin", new ReturnAdmin() );
        commands.put( "editItemList", new EditItemList() );
        commands.put( "adminMeasurementUnits", new AdminMeasurementUnits() );
    }

    static Command from( HttpServletRequest request ) {
        String targetName = request.getParameter( "target" );
        if ( commands == null ) {
            initCommands();
        }
        return commands.getOrDefault(targetName, new UnknownCommand() );   // unknowncommand er default.
    }

    abstract String execute( HttpServletRequest request, HttpServletResponse response )
            throws LoginSampleException;

}
