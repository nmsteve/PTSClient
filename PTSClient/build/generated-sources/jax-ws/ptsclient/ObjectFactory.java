
package ptsclient;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ptsclient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ptsclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AuthenticateResponse }
     * 
     */
    public AuthenticateResponse createAuthenticateResponse() {
        return new AuthenticateResponse();
    }

    /**
     * Create an instance of {@link TeamLeader }
     * 
     */
    public TeamLeader createTeamLeader() {
        return new TeamLeader();
    }

    /**
     * Create an instance of {@link Authenticate }
     * 
     */
    public Authenticate createAuthenticate() {
        return new Authenticate();
    }

    /**
     * Create an instance of {@link GetListOftheProjects }
     * 
     */
    public GetListOftheProjects createGetListOftheProjects() {
        return new GetListOftheProjects();
    }

    /**
     * Create an instance of {@link GetListOftheProjectsResponse }
     * 
     */
    public GetListOftheProjectsResponse createGetListOftheProjectsResponse() {
        return new GetListOftheProjectsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfProject }
     * 
     */
    public ArrayOfProject createArrayOfProject() {
        return new ArrayOfProject();
    }

    /**
     * Create an instance of {@link GetListOfProjectsResponse }
     * 
     */
    public GetListOfProjectsResponse createGetListOfProjectsResponse() {
        return new GetListOfProjectsResponse();
    }

    /**
     * Create an instance of {@link GetListOfProjects }
     * 
     */
    public GetListOfProjects createGetListOfProjects() {
        return new GetListOfProjects();
    }

    /**
     * Create an instance of {@link Project }
     * 
     */
    public Project createProject() {
        return new Project();
    }

    /**
     * Create an instance of {@link ArrayOfTask }
     * 
     */
    public ArrayOfTask createArrayOfTask() {
        return new ArrayOfTask();
    }

    /**
     * Create an instance of {@link Task }
     * 
     */
    public Task createTask() {
        return new Task();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

}
