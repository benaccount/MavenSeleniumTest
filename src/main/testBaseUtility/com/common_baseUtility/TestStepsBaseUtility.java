//package com.common_baseUtility;
//
//
//
//
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.Date;
//import java.util.Properties;
//
//import com.frameworkUtility.PropertyFileReader;
//
//import static com.jayway.restassured.RestAssured.baseURI;
//
//
//
//public class TestStepsBaseUtility {
//
//    public static String uriBase;
//    private String pathRest;
//    public String dateValue;
//    public String nameBuild;
//    public static final Date date = new Date();
//    public static String pathResources;
//    private String propertiesFileProfile = "profile_przemek";
//
//
//    public TestStepsBaseUtility() {
//        if (uriBase == null) {
//            initializeProperties();
//        }
//    }
//
//    private void initializeProperties() {
//        Properties defaultProps = new Properties();
//        Properties userProps = new Properties(defaultProps);
//        ClassLoader loader = Thread.currentThread().getContextClassLoader();
//
//        InputStream defaultStream = loader.getResourceAsStream(propertiesFileProfile+".properties");
//        try {
//            defaultProps.load(defaultStream);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        pathResources = defaultProps.getProperty("mainRest.pathResources");
//        uriBase = defaultProps.getProperty("propertiesFileProfile.uriBase");
//        pathRest = defaultProps.getProperty("mainRest.pathRest");
//        baseURI = uriBase;
//        baseURI = uriBase;
//      
//    }
//    
//    public String createTargetUri(String requestTypeParam) {
//        String environment = System.getProperty("environment", "dev");
//        String baseUriParam = environment + ".api.base.uri";
//        //logger.warn("baseUriParam = " + baseUriParam);
//        String baseUri = PropertyFileReader.getProperty(baseUriParam);
//        return baseUri + PropertyFileReader.getProperty(requestTypeParam);
//    }
//    
//}
//
//
