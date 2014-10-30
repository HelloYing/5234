import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;


public class Parser {
	 HashMap<String,String> map=new HashMap<String,String>();
	public  HashMap<String, String> parse(String filename)
	{
		map.clear();
		Document doc=null;
		SAXReader reader=new SAXReader();
		try {
			doc=reader.read(new File(filename));
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		Element root=doc.getRootElement();
	    traverse(root);
	   return map;
	   
	}
	
	//recursive
	public  void traverse(Element e)
	{
		//System.out.println("traverse!!!");
		
		String name="";String value="";
	    Node node=null;
	    
	    if(e.nodeCount()==1)//leaf node
	    {
	    	 name=e.getName();
	    	 value=e.getStringValue();
	    	 if(!value.isEmpty()){
	    	 map.put(name, value);
	    	 }
	    }
	    else{
	    	//Traverse all the children nodes recursively
	    for(int i=0;i<e.nodeCount();i++)
	    {
	    	node=e.node(i);
	    	if(node instanceof Element)
	    	{
	    		traverse((Element)node);
	    	}
	    
	    }
	}
	    
	}
	
	public void printMap()
	{
		Iterator it=map.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry entry=(Map.Entry) it.next();
			String name=(String)entry.getKey();
			String value=(String) entry.getValue();
			System.out.println("name: "+name+" , value: "+value);
		}
	}
	
	
}

/*public static void main(String[] args) {
	// TODO Auto-generated method stub
	Parser p=new Parser();
	String filename="register.xml";
	String file="XMLfile/"+filename;
	p.parse(file);
	//p.printMap();
	
	
}*/