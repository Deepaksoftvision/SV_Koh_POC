/**
 * @author Gladson Antony
 * @date 27-Mar-2017
 */
package propertyFilesReader;

import ru.qatools.properties.*;


@Resource.File("./src/test/resources/Property Files/ApplicationConfig.properties")
public class ApplicationConfigReader
{

	public ApplicationConfigReader()
	{
		PropertyLoader.newInstance().populate(this);
	}

	@Property("ProjectMgrUN")
	private String username_ProjectMgr;

	@Property("ProjectMgrPASS")
	private String pasword_ProjectMgr;


	public String getUsername_ProjectMgr()
	{
		return username_ProjectMgr;
	}

	public String getPasword_ProjectMgr()
	{
		return pasword_ProjectMgr;
	}


}
