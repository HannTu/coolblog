mvn clean install
catalina.bat stop
cp target/coolblog.war $CATALINA_HOME/webapps/coolblog.war
catalina.bat start