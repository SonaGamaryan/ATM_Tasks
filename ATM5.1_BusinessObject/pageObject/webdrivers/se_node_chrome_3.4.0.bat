::Beginnig of hub batch file
set SERVER_VERSION=3.4.0
set TASK_NAME=SelenioumServerNode3
set NODE_PORT=9877
set HUB_PORT=9876
set REGISTER_IP=localhost
set CHROME_DRIVER=C:\webdrivers\chromedriver.exe
java -Dwebdriver.chrome.driver=%CHROME_DRIVER% -jar selenium-server-standalone-%SERVER_VERSION%.jar -role node -hub http://%REGISTER_IP%:%HUB_PORT%/grid/register -browser "browserName=chrome" -port %NODE_PORT% 
::End of hub batch file