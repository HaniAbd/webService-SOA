# webService-SOA

[36011216@miage-201-004 webServicePOJO]$ cd serveur/
[36011216@miage-201-004 src]$ javac -d ../classes webservice/*.java
[36011216@miage-201-004 classes]$ wsgen -d ../generated -s ../srcGenerated -cp . -wsdl webservice.EchoTime
[36011216@miage-201-004 serveur]$ ant jar
[36011216@miage-201-004 build]$ asadmin deploy MiageWs.war 


[36011216@miage-201-004 webServicePOJO]$ cd client/
[36011216@miage-201-004 client]$ cd src/
[36011216@miage-201-004 src]$ wsimport -d ../build -s . "http://localhost:8080/MiageWs/EchoTimeService?WSDL" -p importservice
