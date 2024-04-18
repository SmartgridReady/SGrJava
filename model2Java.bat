set ECLIPSE_HOME=%1
set SGR_XSD_RESOURCE=%2

%ECLIPSE_HOME%\eclipse -console -noSplash -data ..\ -application org.eclipse.xsd.ecore.importer.XSD2GenModel %SGR_XSD_RESOURCE%  InterfaceFactory/emfEI4Modbus/model/emfEI4Modbus.genmodel -modelProject /emfEI4Modbus src/main/java -modelPluginId emfEI4Modbus
if %ERRORLEVEL% neq 0 exit %ERRORLEVEL%

@echo off
	
powershell -Command "(Get-Content '.\InterfaceFactory\emfEI4Modbus\model\emfEI4Modbus.genmodel') -replace 'EmptyValue/_', 'EmptyValue/_0' | Set-Content 'model.tmp'"	
move /y model.tmp .\InterfaceFactory\emfEI4Modbus\model\emfEI4Modbus.genmodel

powershell -Command "(Get-Content '.\InterfaceFactory\emfEI4Modbus\model\v0.ecore') -replace '\"_\"', '\"_0\"' | Set-Content 'v0.tmp'"	
move /y v0.tmp .\InterfaceFactory\emfEI4Modbus\model\v0.ecore

echo "EmptyValue replacement complete."

%ECLIPSE_HOME%\eclipse -console -noSplash -data ..\ -application org.eclipse.emf.codegen.ecore.Generator -forceOverwrite InterfaceFactory/emfEI4Modbus/model/emfEI4Modbus.genmodel InterfaceFactory/emfEI4Modbus
exit %ERRORLEVEL%
