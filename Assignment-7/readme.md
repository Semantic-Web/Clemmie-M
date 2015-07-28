Assignment 7 Requirements:

See the write up on "Apps based on geonames" in the Project Topics list. Explore this link: http://www.geonames.org/export/ . 
GeoNames is offering a wide range of sophisticated web services. The list can be found 
here: http://www.geonames.org/export/ws-overview.html . Here are libraries in varous 
languages:  http://www.geonames.org/export/client-libraries.html  . Java is supported; 
Python does not seem to be. Explore any of the webservices app for an objective and write 
Java/Python code for achieving that. It does not have to be the perfect end product. Ideally, you 
should be looking at the database as RDF statements and using a tool such as Fuxi or Jena. If you 
wish to use RegEx (regular expression) for parsing, knowing the ontology format, that is OK too.

Please  use ony one of these two languages (Java or Python, if you can find somewhere else a library; 
you can actually write one based on RegEx. It is well explained in an online free book ("Think Python") by Downey).


What does my application do:

This application uses Geonames and Java to return the City, County, and State for a specific zipcode 
that is input in the application.

Steps for setting up this application:

1. Create a username from the following link http://www.geonames.org/login
2. Enter username in setUsername() in main()
3. Enable web services for your username
4. Download the GeoNames .jar http://www.geonames.org/source-code/geonames-source-1.1.12.jar
5. Download the JDOM .jar http://www.geonames.org/source-code/jdom-1.0.jar
6. Add the GeoNames and JDOM libraries to the build path of the project.

Steps to run this application:

Access the java code & execute - when prompted for Zip Code enter number & click OK. Output will be:

1: City
2: County
3: State

