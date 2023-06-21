set ECLIPSE_HOME=%1
set SGR_XSD_RESOURCE=%2

%ECLIPSE_HOME%\eclipse -console -noSplash -data ..\ -application org.eclipse.xsd.ecore.importer.XSD2GenModel %SGR_XSD_RESOURCE%  InterfaceFactory/emfEI4Modbus/model/emfEI4Modbus.genmodel -modelProject /emfEI4Modbus src -modelPluginId emfEI4Modbus
if %ERRORLEVEL% neq 0 exit %ERRORLEVEL%

%ECLIPSE_HOME%\eclipse -console -noSplash -data ..\ -application org.eclipse.emf.codegen.ecore.Generator -forceOverwrite InterfaceFactory/emfEI4Modbus/model/emfEI4Modbus.genmodel InterfaceFactory/emfEI4Modbus
exit %ERRORLEVEL%
