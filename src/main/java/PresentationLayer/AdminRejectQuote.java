package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.Exceptions.LoginSampleException;
import FunctionLayer.Tables.UserProposition;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * AdminRejectQuote will delete a customer quote using a user proposition id
 *
 * @author Alexander Pihl, Mick Larsen, Morten Rahbek, Per Kringelbach, Jean-Poul Leth-Møller
 */
public class AdminRejectQuote extends Command {
    // Initialize variable to be able to parse a String to an int
    private int qID = 0;

    /**
     * Delete user proposition and refresh adminpage.jsp
     *
     * @param request request for Http Servlet
     * @param response response for Http Servlet
     * @return adminpage
     * @throws LoginSampleException LoginSampleException
     */
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        // Initializing session variable with current session
        HttpSession session = request.getSession();


        // Initializing List with UserProposition object
        List<UserProposition> userProposition = (List<UserProposition>) session.getAttribute("userProposition");


        // Getting parameter of current user proposition id
        String quoteID = request.getParameter("quoteID");


        // Check if quoteID is not empty and parse it to an int
        if(!quoteID.isEmpty()) {
            qID = Integer.parseInt(quoteID);
        }


        // Deleting a quote with parameter quoteID
        LogicFacade.deleteQuote(qID);


        // Singleton for initializing an instance of UserProposition
        // if List is empty
        if ( userProposition == null ) {
            userProposition = LogicFacade.getAllUserPropositions();
        } else {
            userProposition = (List<UserProposition>) session.getAttribute("userProposition");
        }


        // Attribute to use on jsp site
        request.setAttribute("userProposition", userProposition);


        // Return value for FrontController
        return "adminpage";
    }
}
