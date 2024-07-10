set ECLIPSE_HOME=%1
set SGR_XSD_RESOURCE=%2

%ECLIPSE_HOME%\eclipse -console -noSplash -data ..\ -application org.eclipse.xsd.ecore.importer.XSD2GenModel %SGR_XSD_RESOURCE%  SGrSpecification/model/SGrSpecification.genmodel -modelProject /SGrSpecification src/main/java -modelPluginId SGrSpecification
if %ERRORLEVEL% neq 0 exit %ERRORLEVEL%

@echo off
	
powershell -Command "(Get-Content '.\SGrSpecification\model\SGrSpecification.genmodel') -replace 'EmptyValue/_', 'EmptyValue/_0' | Set-Content 'model.tmp'"
move /y model.tmp .\SGrSpecification\model\SGrSpecification.genmodel

powershell -Command "(Get-Content '.\SGrSpecification\model\v0.ecore') -replace '\"_\"', '\"_0\"' | Set-Content 'v0.tmp'"
move /y v0.tmp .\SGrSpecification\model\v0.ecore

echo "EmptyValue replacement complete."

%ECLIPSE_HOME%\eclipse -console -noSplash -data ..\ -application org.eclipse.emf.codegen.ecore.Generator -forceOverwrite SGrSpecification/model/SGrSpecification.genmodel SGrSpecification
exit %ERRORLEVEL%
